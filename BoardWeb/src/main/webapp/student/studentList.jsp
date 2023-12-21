<%@page import="common.Student"%>
<%@page import="java.util.List"%>
<%@page import="common.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>studentList.jsp</title>
</head>
<body>
	<caption>바뀐값이 적용이 됩니다</caption> <!-- visual studio code로 변경한 것  -->
<table border ='1'>
	<thead>
		<tr><th>학번</th><th>이름</th><th>영어</th><th>수학</th></tr>
	</thead>
	<tbody>
<%  //<% 안에는 java 포맷을 입력
	StudentDAO dao = new StudentDAO();
	List<Student> list = dao.getStudents();
	
	for(Student std : list){
%>
	<tr>
		<td><%=std.getStuNum() %></td>    <!-- 변수의 값을 읽어오겠습니다 =std.getStuNum() -->
		<td><%=std.getStuName() %></td>    
		<td><%=std.getEngScore() %></td>  
		<td><%=std.getMathScore() %></td>    
	</tr>
<%
	}

%>		
	
	</tbody>


</table>

</body>
</html>