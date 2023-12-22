package com.yedam.student.command;

import java.io.IOException;
import java.io.PrintWriter;

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

@WebServlet("/MyInfoServlet")  //url
public class MyInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyInfoServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");    //content 타입은 txt, html 이고 charset은 utf-8 입니다~ 라고 설정해주는 것 (안해주면 "안의 모든 내용이 같이 출력됨"
		
		//파라미터 확인. 아래가 파라미터 번호 
		//?sno=23-010&sname=홍철수&escore=80&mscore=85
		String sno = request.getParameter("sno");
		String sname = request.getParameter("sname");
		String escore = request.getParameter("escore");
		String mscore = request.getParameter("mscore");
		
		System.out.println("sno:"+sno+",sname:"+sname+",escore:"+escore+",mscore:"+mscore);
		
		//db저장
		Student std = new Student(sno,sname,Integer.parseInt(escore),Integer.parseInt(mscore));  //생성자 타입에 맞게끔 타입변환 
		StudentService dao = new StudentServiceMybatis();
		boolean done = dao.addStudent(std);
		
		
		PrintWriter out =response.getWriter();
		//out.append("Served at: ").append(request.getContextPath());
		out.println("<h3>Hi, Welcome to Servlet, 안녕하세요</h3>");    //웹에서 보일 내용 여기다 적으면 됨 
		out.println("<a href='index.html'>인덱스 이동</a>");
		if(done) {
			out.println("<script>alert('OK'); location.href='student/studentList.jsp';</script>");
		}else {
			out.println("<script>alert('Fail');location.href='index.html';</script>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
