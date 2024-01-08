<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>covid19.jsp</title>
</head>
<body>
<div id="show">
<table class = "table">
	<thead>
	<tr>
	<th>센터id</th>
	<th>센터명</th>
	<th>연락처</th>
	<th>시도정보</th>
	</tr>
	</thead>
	<tbody id="list"></tbody>
</table>
</div>
<script> 
//perPage=284 다 보고 싶지 않으면 원하는 데이터 수 만큼 지정해줄 수 있다 
const url = 'https://api.odcloud.kr/api/15077586/v1/centers?page=1&perPage=10&serviceKey=E%2FVAI6uOXqQ94x9vNIi87y4DGcrURXEWXidR7UPQs2s4GZ3ZWPk7fFFDcZunpLnLeqCGdcMHzAZd4cHLoIuh%2Fw%3D%3D'
const fields = ['id','centerName','phoneNumber','sido'] //화면에 보여줄 항복 지정 

let tbody = document.getElementById("list");
const xhtp = new XMLHttpRequest();
xhtp.open('get',url);
xhtp.send();
xhtp.onload = function(){
	console.log(JSON.parse(xhtp.responseText));
	let result = JSON.parse(xhtp.responseText);
	//tr > td*4
	result.data.forEach(center => {
		console.log(center);
		let tr = document.createElement('tr');
		tr.addEventListener('click',function(){
		//	location.href= 'map.do?x='+center.lat+'&y='+center.lng; //같은창에서 열림
			window.open('map.do?x='+center.lat+'&y='+center.lng); //같은 창 말고 다른창으로 열림
		})
		fields.forEach(field => {
			let td= document.createElement('td');
			td.innerText = center[field];
			tr.appendChild(td);
		})
		tbody.appendChild(tr);
		})
	}
</script>
</body>
</html>