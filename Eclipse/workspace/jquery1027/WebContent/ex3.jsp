<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex3.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	$(document).ready(function() {
		$('body *').css('color', 'red')
				.css('width', '100px')
				.css('border', '1px solid blue');
	});
</script>
</head>
<body>
	<div>
		My JQuery !
		<div>01</div>
	</div>	
	<div>
		My JQuery !
		<div>02</div>
	</div>
</body>
</html>