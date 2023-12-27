<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

    <h3>등록화면</h3>
    <!-- endtype="x-www-form-urlencoded" 업로드 시 사용 multipart/form-data 이미지 업로드시 무조건 method=post로 넣어줘야함 -->
    <form action="addBoard.do" method="post" enctype="multipart/form-data">
        <table class="table">
            <tr>
                <th>제목</th>
                <td><input type="text" name="title"></td>
            </tr>
            <tr>
                <th>내용</th>
                <td><textarea name="content" cols="30" rows="10"></textarea></td>
            </tr>
            <tr>
                <th>작성자</th>
                <td><input type="text" name="writer" readonly value="${logName}"></td>
            </tr>
            <tr>
            <!-- 이미지 업로드 용 -->
            	<th>파일</th>
            	<td><input type="file" name="image"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="저장">
                    <input type="reset" value="취소">
                </td>
            </tr>
        </table>
    </form>
<jsp:include page="../layout/foot.jsp"></jsp:include>