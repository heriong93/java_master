/**
 * member.js
 */

$(document).ready(function() {
	//회원목록 출력
	$.ajax('memberListJson.do', {
		method: 'get',
		//data: { bno: 1, rno: 2 },   //'bno=1&rno=2'
		dataType: 'json', //text, json, xml 서버의 데이터 포맷 지정
		success: function(result) { //정상적으로 정보를 가져오면 실행 할 함수.값은 result에 담긴다 
			$(result).each((idx, member) => { //javascript의 forEach와 같음
				//tr생성, td생성 
				let img = '';
				if (member.image) {
					img = $('<img />').attr({ 'src': 'images/' + member.image, 'style': 'width:100px' })
				}
				let tr = $('<tr />').append($('<td />').text(member.id),
					$('<td />').text(member.name),
					$('<td />').text(member.responsibility),
					$('<td />').html(img)
				);
				$('#list').append(tr);
			});  //forEach
		},
		error: function(err) { //정상적으로 실행되지 않았을 때 실행할 함수
			console.log(err);

		}
	})
	
	//회원등록
	$('#addBtn').on('click',function(){
		let formData = new FormData(); //multipart/form-data
		formData.append('id',$('input[name="id"]').val());
		formData.append('pw',$('input[name="pw"]').val());
		formData.append('name',$('input[name="name"]').val());
		formData.append('image',$('input[name="image"]')[0].files[0]);
		
		for(let ent of formData.entries()){
			console.log(ent);
		}
		
		//목록 자동업데이트
		$.ajax('memberAddJson.do',{
			method: 'post',
			data: formData,
			processData: false,
			contentType: false,
			dataType: 'json',
			success: function(result){
				console.log(result); //vo, retCode 둘 다 넘어올것 result의 vo에 모든 값이 담겨있음 
				let member = result.vo; //vo의 값을 member객체에 담기 
				let img = '';
				if (member.image) {
					img = $('<img />').attr({ 'src': 'images/' + member.image, 'style': 'width:100px' })
				}
				let tr = $('<tr />').append($('<td />').text(member.id),
					$('<td />').text(member.name),
					$('<td />').text(member.responsibility),
					$('<td />').html(img)
				);
				$('#list').append(tr);
				
				    
				},
			error: function(err){
				console.error(err);
			}
		})
		
		console.log(formData);
	})
});