<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex4_unbind.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	$(document).ready(function() {
		$('h1').click(function() {
			// 출력
			$(this).html("클릭!");
			console.log("Event가 발생했습니다.");
			// 이벤트를 제거
			$(this).unbind();
		});
	});
</script>
</head>
<body>
	<h1>Hello World!</h1>
	<h1>Hello World!</h1>
	<h1>Hello World!</h1>
</body>
</html>