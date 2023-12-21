<%@page import="common.Student"%>
<%@page import="common.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- StudentListServlet과 동일??  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>studentInfo.jsp</title>
</head>
<body>
	<%
	String str = "Hello";
	
	// 내장객체: request
	String sno = request.getParameter("sno");
	StudentDAO dao = new StudentDAO();
	Student std = dao.getStudent(sno);
	%>
	
	<table border='1'>
	<caption>학생정보</caption>
	<tr>
		<th>학생번호</th><td><%=std.getStuNum() %></td>
	</tr>
	<tr>
		<th>학생이름</th><td><%=std.getStuName() %></td>
	</tr>
	<tr>
		<th>영어점수</th><td><%=std.getEngScore() %></td>
	</tr>
	<tr>
		<th>수학점수</th><td><%=std.getMathScore() %></td>
	</tr>
	</table>
	
</body>
</html>