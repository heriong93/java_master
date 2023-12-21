package todo1205;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import remind6.Student;

public class BookDAO {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "dev", "dev");
			System.out.println("연결성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	
	// 연결접속 해제 
		void disconn() {
			try {
				if (conn != null)
					conn.close();
				if (psmt != null)
					psmt.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}// end of disconn
		
	// 추가
	boolean addBook(Book book) {
		getConn();
		String sql = "insert into book values(?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, book.getBookCode());
			psmt.setString(2, book.getBookTitle());
			psmt.setString(3, book.getAuthor());
			psmt.setString(4, book.getPress());
			psmt.setInt(5, book.getPrice());
			int r = psmt.executeUpdate();
			if (r == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return false;
	}// end of addBook
		// 목록

	ArrayList<Book> getBookList() {
		getConn();
		String sql = "SELECT *\r\n" + "FROM book";
		ArrayList<Book> books = new ArrayList<Book>();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setBookCode(rs.getString("book_num"));
				book.setBookTitle(rs.getString("book_name"));
				book.setAuthor(rs.getString("book_auth"));
				book.setPress(rs.getString("book_comp"));
				book.setPrice(rs.getInt("book_price"));

				books.add(book);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return books;

	}// end of getBookList
		// 단건조회

	Book getBook(String bookCode) {
		getConn();
		String sql = "SELECT *\r\n" + "FROM book\r\n" + "WHERE book_num = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookCode);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Book book = new Book();
				book.setBookCode(rs.getString("book_num"));
				book.setBookTitle(rs.getString("book_name"));
				book.setAuthor(rs.getString("book_auth"));
				book.setPress(rs.getString("book_comp"));
				book.setPrice(rs.getInt("book_price"));
				return book;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return null;
	}

	// 수정
	boolean modifyBook(String no, int price) {
		getConn();
		String sql = "UPDATE book\r\n" + "SET book_price = ?" + "WHERE book_num = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, price);
			psmt.setString(2, no);
			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return false;

	}// end of modifyBook

	

	boolean removeBook(String bookCode) {
		getConn();
		String sql = "DELETE FROM book " + "WHERE book_num =?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookCode);
			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return false;
	}
	// 삭제

}// end of class
