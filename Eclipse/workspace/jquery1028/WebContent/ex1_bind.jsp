<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex1_bind.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<style>
	.rev {
	 	background: orange; color: white; 
	 }
</style>
<script>
	// bind : 이벤트들을 연결
	// one : 이벤트를 한 번만 적용할 때 사용됨
	$(document).ready(function() {
 		// $('h1').one({
		$('h1').bind({
			mouseenter: function() {
				$(this).addClass('rev');
			},
			mouseleave: function() {
				$(this).removeClass('rev');
			}
		});
	});
</script>
</head>
<body>
	<h1>Hello World! 1</h1>
	<h1>Hello World! 2</h1>
	<h1>Hello World! 3</h1>
</body>
</html>