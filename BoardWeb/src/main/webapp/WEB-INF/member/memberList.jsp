<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h3>회원 정보</h3>
<!-- EL (Expression Language) -->
<table class="table">
	<thead>
		<tr>
			<th>회원아이디</th>
			<th>비밀번호</th>
			<th>회원이름</th>
			<th>회원레벨</th>
		</tr>
	</thead>
	<tbody>
		<!--for(BoardVO vo : list ){  -->
		<c:forEach var="vo" items="${memberList}">
			<tr>
				<!-- 목록 보여주는 부분 -->
				<td><a href="getMember.do?id=${vo.id}">${vo.id}</a></td>
				<td>${vo.pw}</td>
				<td>${vo.name}</td>
				<td>${vo.responsibility}</td>
			</tr>
			<!-- } -->
		</c:forEach>
	</tbody>
</table>
