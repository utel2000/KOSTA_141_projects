<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex4.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<style>
	.simpletext1{ background-color: #ff0; }
	.redtext{ color: red; }
	.largetext{ font-size: 30pt; }
	.spotlight{ color: blue; }
	.it{ font-style: italic }
</style>
<script>
	$(document).ready(function() {
		// span��� : Simple, Basic
		// addClass�� �ش� ��ҿ� ��Ÿ���� class�� �����Ѵ�.
		$('span').addClass('redtext');
		$('div').addClass('spotlight');
		// #�� ���̵�� ��Ҹ� ������ ��.
		$('#simpletext1').addClass('largetext');
		// id�� ���������� Ŭ������ �ߺ�/������ �����ϰ�, ���� �� �� �ִ� ���.
		$('.simpletext1').addClass('it');
	});
</script>
</head>
<body>
	<span id="simpletext1">Simple</span>
	<div class="simpletext1">jQuery</div>
	<span id="simpletext2">Basic</span>
	<div id="simpletext3">jQuery</div>
</body>
</html>