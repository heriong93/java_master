package todo1205;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainBookExe {
	static Connection conn;

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			// 순서1
			Class.forName("oracle.jdbc.OracleDriver");
			// 순서2
			conn = DriverManager.getConnection(url, "dev", "dev");
			System.out.println("연결성공!");
			// select();
			String sql = "INSERT INTO book (book_num, book_name, book_auth, book_comp,book_price)"
					+ "VALUES (?,?,?,?.?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "23-001");
			psmt.setString(2, "자바");
			psmt.setString(3, "홍길동");
			psmt.setString(4, "오라클");
			psmt.setInt(5, 20000);
			int r = psmt.executeUpdate();
			if(r==1) {
				System.out.println("입력성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Driver 없음");
		}
	}// end of main

	public static void select() throws Exception {

		String sql = "select * from book";
		PreparedStatement psmt = conn.prepareStatement(sql);

		// 조회 =executeQuery();
		// 입력성공 시 sql 에서 조회해보면 업데이트 확인 가능함
		ResultSet rs = psmt.executeQuery();
		// while 사용 시 값이 있는 동안 계속 루핑 돌면서 실행될것임
		while (rs.next()) {
			System.out.println("도서번호:" + rs.getString("book_num") + "도서이름:" + rs.getString("book_name") + "저자명:"
					+ rs.getString("book_auth") + "출판사:" + rs.getString("book_comp") + "도서가격:"
					+ rs.getInt("book_price"));
		}
	}
}
