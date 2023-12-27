<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <!-- 테스트용  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl.jsp</title>
</head>
<body>
<!-- 자바코드 대체하기.값선언시 set 출력시 out-->
<c:set var="name" value="홍길동"></c:set>
<c:out value="${name }"></c:out>

<c:set var="age" value="10"></c:set>
<!-- if문 -->
<c:if test="${age >= 20 }">
	<p>성인입니다</p>
</c:if>
<!-- if/else문 -->
<c:choose>
	<c:when test="${age >= 20 }">
	<p>성인입니다</p>
	</c:when>
	<c:otherwise>
	<p>미성년입니다</p>
	</c:otherwise>
</c:choose>

<!-- 반복문 for(int i =0;i<10;i++){} -->
<c:forEach begin="1" end="10" step="1" var="i">
	<p>3 * ${i}= ${3*i}</p>
</c:forEach>
<!-- for(String name:names){} -->
<c:set var="names" value="Hong,Hwang,Kim"></c:set>
<c:forEach items="${names}" var="n">
	<p>${n}</p>
</c:forEach>
</body>
</html>