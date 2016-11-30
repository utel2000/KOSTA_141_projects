<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex2_hover.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	// 첫번째 매개변수 - mouseenter
	// 두번째 매개변수 - mouseleave
	$(document).ready(function() {
		$('h1').hover(
			function() {
				$(this).css({
					'background': 'red',
					'color': 'white'
				})
			},
			function() {
				$(this).css({
					'background': 'white',
					'color': 'black'
				});
  			}
		);
	});
</script>
</head>
<body>
	<h1>Hello World!</h1>
	<h1>Hello World!</h1>
	<h1>Hello World!</h1>
</body>
</html>