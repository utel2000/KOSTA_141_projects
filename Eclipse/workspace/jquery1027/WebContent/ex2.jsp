<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex2.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	$(document).ready(function() {
		// $('요소/선택자').함수().함수().함수()
		// div와 같은 요소는 집함 요소 - javascript의 배열 취급.
		// divs[i].style.backgroundColor = 'yellow'를 캡슐화.
		$('div').css('backgroundColor', 'blue').css('color', 'white').css('width', '300px');
		console.log("size", $('div').size());
	});
</script>
</head>
<body>
	<div>TODO write content1</div>
	<div>TODO write content2</div>
	<div>TODO write content3</div>
	<div>TODO write content4</div>
	<div>TODO write content5</div>
</body>
</html>