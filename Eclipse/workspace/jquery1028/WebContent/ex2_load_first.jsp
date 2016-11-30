<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex2_load_first.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	$(function() {
		/*
			ex2_load_test.jsp의 p 요소만을 가져와서
			현재 페이지 div 요소 안에 넣기 위해
			아래와 같이 문법을 적용할 수 있다.
			p 외에도 , 를 사용해서
			span 요소도 가져올 수 있다.
		*/
		$('#load').click(function() {
			// $('div').load('ex2_load_test.jsp p')
			$('div').load('ex2_load_test.jsp p, span')
		})
	});
</script>
</head>
<body>
	<input type="button" value="AjaxLoad" id="load" />
	<div></div>
</body>
</html>