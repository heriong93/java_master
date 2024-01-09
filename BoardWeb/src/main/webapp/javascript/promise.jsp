<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>promise.jsp</title>
</head>
<body>
<div id="show"></div>
	<script>
	let show= document.getElementById('show'); //id값으로 요소를 선택 
	let cnt = 0;
	let interval = setInterval(()=> { //타이머 메서드 setInterval
		const today = new Date();
		let hh = today.getHours();
		let mm = today.getMinutes();
		let ss = today.getSeconds();
		cnt++;
		
		if(cnt >= 20){
			clearInterval(interval); //interval 종료 
		}
		
		show.innerHTML = hh +"시"+mm+"분"+ss+"초<br>";
	},1000);//지연시간 간격으로 함수를 실행하겠다는 의미 
	
	const promise = new Promise(function(resolve,reject){ //프로미스 객체 선언- 정상적으로 실행되었을 때 실행되는 함수 (성공했을때,실패했을때) 
		setTimeout(function(){
			resolve('Success'); //정상처리경우 success 처리하겠습니다
		},3000); //지연시간을 두고 처리를 하겠다- 라는의미 1000밀리초= 1초 
	});  //pending (초기화)-> fulfilled (정상처리 경우) -> rejected (비정상처리)
	promise.then(function(result){ //여기의 result는 
		console.log('then=> ',result);
		return 'ok';
	})
		.then(function(result){
			console.log('second then=>', result);
		})
			.catch(function(err){
				console.log('error',err);
			})
	
	</script>
</body>
</html>