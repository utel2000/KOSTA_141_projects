<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex3_toggle.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	// toogle - 모두 click 이벤트
	// 함수를 여러개 나열해서 입력, 함수의 순서대로 실행
	// 1. 문자열 앞에 별 추가
	// 2. 문자열 뒤에 별 추가
	// 3. 문자열의 별을 제거
	$(document).ready(function() {
		$('h1').toggle(function() {
			// 문자열 앞에 별 추가
			$(this).html(function(idx, html) {
				return '*' + html;
			});
		}, function() {
			// 문자열 뒤에 별 추가
			$(this).html(function(idx, html) {
				return html + "*";
			});
		}, function() {
			// 문자열의 별 제거
			$(this).html(function(idx, html) {
				return html.substring(1, html.length - 1);
			});
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