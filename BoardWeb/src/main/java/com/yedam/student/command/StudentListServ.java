package com.yedam.student.command;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.student.mapper.StudentDAO;
import com.yedam.student.service.StudentService;
import com.yedam.student.serviceImpl.StudentServiceImpl;
import com.yedam.student.serviceImpl.StudentServiceMybatis;
import com.yedam.student.vo.Student;

@WebServlet("/StudentList") // url 이름은 바꿔줘도 됨. 이 서블렛을 실행하기 위한 url
public class StudentListServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentListServ() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8"); 
		PrintWriter out = response.getWriter();
		//목록 페이지 
		StudentService dao = new StudentServiceMybatis();
		List<Student> list = dao.studentList();
		
		//out.print("<table border='1'>");
		String str = "<table border='1'>";
		str += "<thead><tr><th>학생번호</th><th>학생이름</th><th>영어점수</th><th>수학점수</th></tr></thead>";
		str += "<tbody>";
		for(Student std: list) {
			str += "<tr><td><a href='student/studentInfo.jsp?sno="+std.getStuNum()+"'>"+std.getStuNum()+"</a></td><td>"+std.getStuName()+"</td><td>"+std.getEngScore()+"</td><td>"+std.getMathScore()+"</td></tr>";
		}
		str += "</tbody></table>";
		
		out.print(str);
		out.println("<a href='index.html'>인덱스 이동</a>");
		out.println("<a href='student/inform.html'>등록화면</a>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
