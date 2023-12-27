<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<form action="login.do" method="post">
<table class="table">
<tbody>
<tr>
<th colspan ="2">로그인</th>
</tr>
    <tr>
        <th>아이디</th><td><input type="text" name="id"></td>
    </tr>
    <tr>
        <th>비밀번호</th><td><input type="password" name="pw"></td>
    </tr>
    <td colspan="2" align="center">
        <input type="submit" value="로그인" class="btn btn-primary">
        <input type="reset" value="초기화" class="btn btn-warning">
    </td>
</tbody>
</table>
</form>
