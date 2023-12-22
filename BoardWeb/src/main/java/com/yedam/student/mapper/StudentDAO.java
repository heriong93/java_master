package com.yedam.student.mapper;
//저장공간:Oracle DB

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.student.vo.Student;

//추가/수정/삭제/목록/단건조회
public class StudentDAO {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url,"dev","dev");
			System.out.println("연결성공!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	//목록.
	public List<Student> getStudents() {
		getConn();
		//값을 배열로 출력해야하기 때문에 students 생성 
		List<Student> students = new ArrayList<>();
		String sql = "select * from student order by 1";
		try {
			psmt = conn.prepareStatement(sql);
			//조회는 executeQuery();
			rs = psmt.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setStuNum(rs.getString("stu_num"));
				student.setStuName(rs.getString("stu_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setMathScore(rs.getInt("math_score"));
				//배열의 빈 곳에  한 건 저장 
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;
	}//end of gettudents
	
	//추가
	public boolean addStudent(Student std) {
		getConn();
		String sql = "insert into student values(?,?,?,?)"; //순서 정하고 싶으면 student(이 안에 넣으면 됨)
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, std.getStuNum());
			psmt.setString(2, std.getStuName());
			psmt.setInt(3, std.getEngScore());
			psmt.setInt(4, std.getMathScore());
			
			int r = psmt.executeUpdate(); //db에 처리된 건수가 반환이 됨 
			if(r==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}//end of addStudent 
	
	//단건조회 
	public Student getStudent(String sno) {
		getConn();
		String sql = "SELECT * FROM student WHERE stu_num = ?";
		try {
			psmt= conn.prepareStatement(sql);
			psmt.setString(1, sno);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Student student = new Student();
				student.setStuNum(rs.getString("stu_num"));
				student.setStuName(rs.getString("stu_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setMathScore(rs.getInt("math_score"));
				return student;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null; //조회된 값이 없으면 null 값을 반환 studentApp case 3 참고 
	}//end of getStudent 
	
	//수정 
	public boolean modifyStudent(String no, int eng, int math) {
		getConn();
		String sql = "UPDATE student "
				+ 	 "SET eng_score = ?, "
				+ "        math_score = ? "
				+ "WHERE stu_num = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, eng);
			psmt.setInt(2, math);
			psmt.setString(3, no);
			int r = psmt.executeUpdate();
			if(r>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}//end of modifyStudent
	
	//삭제 
	public boolean removeStudent(String name) {
		getConn();
		String sql = "DELETE FROM student "
				+ "WHERE stu_name = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			int r = psmt.executeUpdate();
			if(r>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}//end of class 
