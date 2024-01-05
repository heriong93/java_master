/**
 *service.js 
 */
function makeLi(reply = {}) {
	//start 함수생성
			let li = document.createElement('li');
			let span = document.createElement('span');
			span.innerText = 'No.' + reply.replyNo + ' '; //댓글 번호
			li.appendChild(span);
			
			span = document.createElement('span');
			span.innerText = reply.reply+ ' '; //댓글 내용
			li.appendChild(span);
			
			span = document.createElement('span');
			span.innerText = reply.name+ ' '; //댓글 작성자 
			li.appendChild(span);
			
			//삭제버튼 
			let btn = document.createElement('button');
			btn.addEventListener('click',function(){
				//댓글번호 db에서 삭제 후, 화면에서도 제거해야함  
				//순서 8 -frontcontroller에서 기능 등록 후 delReplyJson 클래스파일 생성 
				let delHtp= new XMLHttpRequest();
				delHtp.open('get','delReply.do?rno='+reply.replyNo);
				delHtp.send()
				delHtp.onload = function(){
					let result = JSON.parse(delHtp.responseText)
					if(result.retCode == 'OK'){
						alert('삭제됨');
						btn.parentElement.remove();
					}else if(result.retCode == 'NG'){
						alert('처리중 에러');
					}
				}
			})
			btn.innerText = '삭제';
			li.appendChild(btn);
			//end 함수생성 
			
			return li;
			
}