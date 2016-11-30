<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex9.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<style>
	textstyle {
		font-size: 16pt; margin: 10px;
	}
</style>
<script>
	$(document).ready(function() {
		$('body *').addClass('textstyle');
		// 형제노드를 + next로 선택하기..
		// 하지만 좋은 방법은 아니다.
		var $ch = $('em + a + a');
		$ch.css('backgroundColor', 'yellow').each(function() {
			$(this).appendTo('.result1');
		});
		console.log("검색된 엘리멘트 갯수 : ") + $ch.length;
	});
</script>
</head>
<body>
	<em> one </em>
	<a> two </a>
	<a> three </a>
	<b> four </b>
	<a> five </a>
	<em> six </em>
	<hr>
	<span> prev + next로 검색된 엘리멘트 : </span>
	<span class="result1"></span>
</body>
</html>