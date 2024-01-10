<%@page import="com.yedam.book.vo.BookVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta charset="UTF-8">
<title>책</title>
</head>
<body>
	<h3>책목록</h3>
	<table class="table">
	<thead>
		<tr>
			<th>책번호</th>
			<th>책이름</th>
			<th>저자</th>
			<th>출판사</th>
			<th>가격</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="vo" items="${bookList}">
	<tr>
	<td><a href="bookList.do"></a></td>
				<td>${vo.bookCode}</td>
				<td>${vo.bookName}</td>
				<td>${vo.bookAuthor}</td>
				<td>${vo.bookPress}</td>
				<td>${vo.bookPrice}</td>
	<td>${vo.bookList}</td>
	</tr>
				
	</c:forEach>
	</tbody>
	</table>
	<script>
	
	</script>
</body>
</html>