<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ajax1.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	/*
		url : 통신을 원하고자 하는 URL주소를 입력합니다.(필수 입력 값)
		data : 서버로 보낼 데이터를 입력합니다.
		type : GET, POST등의 통신 방식 지정합니다.
		dataType(= data(?)) : 통신의 결과로 넘어올 데이터의 종류를 지정합니다. (text, HTML, JSON, XML 등) 
		success(data) : 통신 성공시 호출 해야하는 함수를 지정합니다.(xhr.readyStatus==4, xhr.status==200)
						매개변수로 결과로 넘어온 데이터를 받습니다.
		error : 통신 실패시 호출 해야하는 함수를 지정합니다.
		complete : 통신 성공 여부와 관계없이 통신이 끝난 후 호출 해야하는 함수를 지정합니다.
		beforeSend : 통신 전에 호출 해야하는 함수를 지정합니다.
		async : 비동기(true), 동기(false) 여부를 지정합니다.
	*/
	$(document).ready(function() {
		// Ajax초기 설정시 form타입으로 변경한다. (for POST방식)
		$.ajaxSetup({
			contentType:'application/x-www-form-urlencoded;charset=euc-kr'
		});
		
		$('#btn1').click(function() {
			var n = $('#name').val();
			var on = $('#orderNum').val();
			console.log("Name"+n);
			console.log("orderNum"+n);
			$.ajax({
				url: "ex1_server",
				type: "post",
				data: {name: n, orderNum: on},
				success: function (data, status) {
					alert(data + "," + status);
					$('#res').html(data);
				},
				error: function(e) {
					alert(e);
				}
			});
		});
	});
</script>
</head>
<body>
	<h1>주문확인!</h1>
	<input type="text" name="name" id="name" value="" /><br />
	<input type="text" name="orderNum" id="orderNum" /><br />
	<input type="button" value="확인" id="btn1" /><br />
	<div id="res">Status : </div>
</body>
</html>