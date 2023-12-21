package common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/getStudentServlet")
public class GetStudentServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ?sno=23-010&sname=홍길동 sno,sname 이라는 값을 조회하고 싶습니다~ 라는 의미 
		resp.setContentType("text/html;charset=utf-8");
		String sno = req.getParameter("sno");
		
		StudentDAO dao = new StudentDAO();
		Student std = dao.getStudent(sno);
		
		String str = "<table border='1'>";
		str += "<caption>학생정보</caption>";
		str += "<tr><th>학번</th><td>"+std.getStuNum()+"</td></tr>";
		str += "<tr><th>이름</th><td>"+std.getStuName()+"</td></tr>";
		str += "<tr><th>영어</th><td>"+std.getEngScore()+"</td></tr>";
		str += "<tr><th>수학</th><td>"+std.getMathScore()+"</td></tr>";
		str += "</table>";
		
		str += "<br><a href='modifyStudent?sno="+std.getStuNum()+"'>수정화면</a>";
		str += "<br><a href='StudentList'>목록</a>";
		
		
		
		//사용자 페이지로 출력
		resp.getWriter().print(str);
		
		//서버 실행 후 url에 파라미터 값을 넣어줘야함 "?sno=23-001"
		//http://localhost/BoardWeb/getStudentServlet?sno=23-001
	}
}
