<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>promise2.jsp</title>
</head>
<body>
	<script>
		fetch('data.json',{ //url, option객체 
			method: 'post',
			mode: 'cors',
			headers: {
				'Content-type':'application/x-www-form-urlencoded'
			},
			body: 'x=120&y=200' //key=value&key=value형식  
		})
		.then(result =>{
			console.log(result);
			return result.json(); //문자열 => 객체로 변환시켜주는 json()
		})
		.then(json => {
			console.log(json);
		})
		.catch(error=> {
			console.log(error);
		})
		
	</script>
</body>
</html>