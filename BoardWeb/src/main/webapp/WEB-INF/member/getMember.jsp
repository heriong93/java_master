<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<h3>회원 상세화면</h3>

<form name="myForm" action="getMember.do">
	<input type="hidden" name="id" value="${vo.id}">
	<table class="table">
		<tbody>
			<tr>
				<td>아이디</td>
				<td colspan="3">${vo.id}</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td colspan="3">${vo.pw}</td>
			</tr>
			<tr>
				<td>회원이름</td>
				<td colspan="3">${vo.name}</td>
			</tr>
			<tr>
				<td>회원레벨</td>
				<td colspan="3">${vo.responsibility}</td>
			</tr>
			
			<tr>
				<td colspan="4" align="center">
							<input type="submit" value="수정">
							<input type="button" onclick="deleteFun()" value="삭제">
						</td>
			</tr>
		</tbody>
	</table>
</form>
<br>
<a href="boardList.do">글 목록으로</a>
<script>
	function deleteFun() {
		console.log(window);
		document.forms.myForm.action = "removeForm.do";
		document.forms.myForm.submit();
	}
</script>
