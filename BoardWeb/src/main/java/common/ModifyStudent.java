package common;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/modifyStudent") //url은 소문자로 지정해줌 
public class ModifyStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ModifyStudent() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");   //한글처리 
		
		//조회를 위한 파라미터 활용
		String sno = request.getParameter("sno");
		
		StudentDAO dao = new StudentDAO();
		Student std = dao.getStudent(sno);
		
		String str = "<form action='updateStudent'>";  //입력된 값을 
		str += "<table border='1'><caption>학생정보</caption>";
		str += "<tr><th>학번</th><td><input type='text'"+"readonly name='sno' value='"+std.getStuNum()+"'></td></tr>";
		str += "<tr><th>이름</th><td>"+std.getStuName()+"</td></tr>";
		str += "<tr><th>영어</th><td><input type='number' name='escore'value='"+std.getEngScore()+"'></td></tr>";
		str += "<tr><th>수학</th><td><input type='number' name='mscore'value='"+std.getMathScore()+"'></td></tr>";
		str += "<tr><td><input type='submit' value='수정'></td></tr></table>";
		str += "</form>";
		response.getWriter().print(str);   //사용자페이지로 출력
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
