<%@page import="com.yedam.board.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<style>
.pagination {
	display: inline-block;
}

.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
}

.pagination a.active {
	background-color: #4CAF50;
	color: white;
}

.pagination a:hover:not(.active) {
	background-color: #ddd;
}
</style>
<h3>상세화면</h3>

<form name="myForm" action="modifyForm.do">
	<input type="hidden" name="bno" value="${vo.boardNo}">
	<table class="table">
		<tbody>
			<tr>
				<td>글번호</td>
				<td colspan="3">${vo.boardNo}</td>
			</tr>
			<tr>
				<td>제목</td>
				<td colspan="3">${vo.title}</td>
			</tr>
			<tr>
				<td>내용</td>
				<td colspan="3">${vo.content}</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td colspan="3">${vo.writer}</td>
			</tr>
			<tr>
				<td>작성일</td>
				<td><fmt:formatDate pattern="yyyy-MM-dd"
						value="${vo.writeDate}" /></td>
				<td>조회수</td>
				<td>${vo.clickCnt}</td>
			</tr>
			<tr>
				<td>이미지</td>
				<!-- images폴더 밑에 있는 파일 이름으로 링크 걸기  -->
				<td colspan="3"><c:if test="${!empty vo.image}">
						<img width="150px" src="images/${vo.image}">
					</c:if></td>
			</tr>
			<tr>
				<td colspan="4" align="center"><c:choose>
						<c:when test="${logName eq vo.writer}">
							<input type="submit" value="수정">
							<input type="button" onclick="deleteFun()" value="삭제">
						</c:when>
						<c:otherwise>
							<input type="submit" disabled value="수정">
							<input type="button" disabled onclick="deleteFun()" value="삭제">
						</c:otherwise>
					</c:choose></td>
			</tr>
		</tbody>
	</table>
</form>
<br>
댓글내용:
<input type="text" id="content">
<button id="addReply">등록</button>
<p />
<p>댓글목록</p>
<div id="show">
	<ul id="list" style="list-style: none;"></ul>
</div>
<!-- 페이징 처리  -->
<div id="paging" class="pagination"></div>
<a href="boardList.do">글 목록으로</a>
<script src="js/service.js"></script>
<script>

	function deleteFun() {
		console.log(window);
		document.forms.myForm.action = "removeForm.do";
		document.forms.myForm.submit();
	}
	
	const bno = '${vo.boardNo}';
	let ul = document.querySelector('#list');
	
	
	/*document.querySelectorAll('#paging a').forEach(item => { //a 태그에 이벤트 걸어주기 <a href>
		item.addEventListener('click',(e)=>{
			e.preventDefault(); //클릭시 전체 페이지가 이동하지 않도록 이벤트 막아주기 
			//console.log(item.href);  //몇번째 페이지를 보여줄 지 보여주는
			let pageInfo = item.getAttribute("href");
			const pageAjax = new XMLHttpRequest();
			pageAjax.open('get','replyListJson.do?bno='+bno+ "&page="+pageInfo); //파라메터 페이지2
			pageAjax.send();
			pageAjax.onload = function(){
				let data = JSON.parse(pageAjax.responseText); //문자가 html포맷을 가지게 됨 json 문자열 -> 객체 
				ul.innerHTML = ''; 
				data.forEach(reply => {
					let li = makeLi(reply);
					//makeLi() 함수 -> js/service.js에 스크립트 있음
					ul.appendChild(li);
				})
			}
		})
	})
	*/
	//페이지 클릭 시 페이지의 데이터 보여주도록 (a tag 클릭하면 이벤트 발생하도록 함수 생성-pageList()로 대체함)
	let pageInfo = 1; 
	function pageList(e){ //클릭할 때마다 이벤트 발생 
		e.preventDefault(); //클릭시 전체 페이지가 이동하지 않도록 이벤트 막아주기 
		pageInfo = this.getAttribute("href");	//this->이벤트 받는 대상 = a <tag>	
		showList(pageInfo); //중복되는 기능 함수로 만들어 대체하기
		//페이지 생성하는 함수 호출
		pagingList(pageInfo); //페이지 그려질 때마다 새로 보여주는 기능
	}
	//Ajax호출- 페이지 목록 그려주는 기능 
	//순서 7 - 댓글 출력 기능 생성 
	function showList_backup(page){
		ul.innerHTML = '';
	const xhtp = new XMLHttpRequest();
	xhtp.open('get','replyListJson.do?bno='+bno+ "&page="+page); //열어주는 댓글창 페이지 
	xhtp.send();
	xhtp.onload = function(){
		let data = JSON.parse(xhtp.responseText); //문자가 html포맷을 가지게 됨 json 문자열 -> 객체 
		data.forEach(reply => {
			let li = makeLi(reply);
			//makeLi() 함수 -> js/service.js에 스크립트 있음
			ul.appendChild(li);
		})
	  }
	}//end of function showList() 
	
	//위의 내용을 promise로 대체하기 
	function showList(page){
		ul.innerHTML = '';
		fetch('replyListJson.do?bno='+bno+ "&page="+page) //get 방식이라 방식은 안적어줘도 되고 url만 기재하면 됨 
		.then(str => str.json())
		.then(result => {
			result.forEach(reply=> {
				let li = makeLi(reply);
				ul.appendChild(li);
			})
		})
		.catch(reject => console.log(reject));
	}
	showList(pageInfo);
	
	//페이지 생성 
	//페이지 계산 
	let paging = document.querySelector('#paging');
	pagingList();
	
	function pagingList(page = 1){
		paging.innerHTML = '';
		let pagingAjax = new XMLHttpRequest();
		pagingAjax.open('get','pagingListJson.do?bno='+bno+"&page="+page);
		pagingAjax.send();
		pagingAjax.onload= function(){
			let result = JSON.parse(pagingAjax.responseText);
			//이전
			//보여지는 페이지 이전의 페이지   -> '이전' 6 7
			if(result.prev){
				let aTag = document.createElement('a');
				aTag.href = result.startPage -1;
				aTag.innerText = '이전';
				aTag.addEventListener('click',pageList);
				paging.appendChild(aTag);
			}
			//페이지 목록 
			for(let p = result.startPage; p <= result.lastPage;p++){
				let aTag = document.createElement('a');
				if(p == page){
					aTag.setAttribute('class','active');
				}
				aTag.href = p;
				aTag.innerText = p;
				aTag.addEventListener('click',pageList);
				paging.appendChild(aTag);
			}
			//다음
			//보여지는 페이지 이후의 페이지 1 2 3 4 5 '다음'<--  
			if(result.next){
				let aTag = document.createElement('a');
				aTag.href = result.lastPage +1;
				aTag.innerText = '다음';
				aTag.addEventListener('click',pageList);
				paging.appendChild(aTag);
				
			}
		}
	}//end of pagingList
	
	//등록버튼 클릭 이벤트 생성 
	let addbtn = document.querySelector('#addReply');
	addbtn.addEventListener('click',function(){
		let reply = document.querySelector('#content').value;
		let replyer= '${logId}';   //loginControl.java에 나온 값  
		
		//아래 내용 fetch 함수로 변경 
		fetch('AddReplyJson.do',{  //url.object 
			method: 'post', //post type일 경우 headers, body 필요 
			headers: {
				'Content-Type': 'application/x-www-form-urlencoded'
			},
			body: 'reply='+reply+'&replyer='+replyer+'&bno='+bno //addAjax.send(에 들어가는것이 body)
		})
		.then(str => str.json())
		.then(result => {
			console.log(result)
		if(result.retCode == 'OK'){
			alert('등록됨');
			pageInfo= 1;
			showList(pageInfo);
			pagingList();
			
			document.querySelector('#content').value = '';
		}else if(result.retCode == 'NG'){
			alert('처리 중 에러');
		}
		})
		.catch(err => console.error(err));
	})
		
	/*	const addAjax = new XMLHttpRequest();
		//frontcontroller 에 AddReplyJson.do 만들기 
		addAjax.open('post','AddReplyJson.do');
		addAjax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
		addAjax.send('reply='+reply+'&replyer='+replyer+'&bno='+bno);
		addAjax.onload = function(){
			
			let result = JSON.parse(addAjax.responseText);
			if(result.retCode == 'OK'){
				alert('등록됨');
				pageInfo= 1;
				//let reply= result.vo;
				//let li = makeLi(reply);
				//makeLi() 함수 -> js/service.js에 스크립트 있음
				//ul.appendChild(li); 
				showList(pageInfo);
				pagingList();
				document.querySelector('#content').value = '';
			}else if(result.retCode == 'NG'){
				alert('처리 중 에러');
			}
		}//end of onload */
</script>
<jsp:include page="../layout/foot.jsp"></jsp:include>