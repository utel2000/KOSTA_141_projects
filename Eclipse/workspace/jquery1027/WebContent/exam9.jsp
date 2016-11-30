<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>exam9.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<style>
</style>
<script>
	// 연습문제1) 홀수, 짝수냐에 따라서 div의 배경색을 변경 - exam1안에 있는 div만
	$(document).ready(function() {
		$('#exam1 div:even').css('background-color', 'pink')
		$('#exam1 div:odd').css('background-color', 'yellow')
	});
	// 연습문제2) 0 - 빨강, 1 - 주황, 무지개 색으로 표현하기.
	$(document).ready(function() {
		var rainbow = new Array('red', 'orange', 'yellow', 'green', 'blue', 'navy', 'purple');
		$('#exam2 div').each(function(idx) {
			$(this).css('background-color', rainbow[idx]);
		});
	});	
</script>
</head>
<body>
	<div id="exam1">
	<% for(int i=0; i<10; i++) { %>
		<div><%= i %></div>			
	<% } %>
	</div>
	<br />
	<div id="exam2">
	<% for(int i=0; i<7; i++) { %>
		<div><%= i %></div>			
	<% } %>
	</div>
</body>
</html>