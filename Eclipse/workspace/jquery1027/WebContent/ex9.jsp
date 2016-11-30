<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex10.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<style>
	table { table-layout: auto; width: 70%; }
	td { color: blue; font-weight: bold; }
	.selectedstyle { color: red; font-size: 20pt; background: pink; font-family: fantasy;}
</style>
<script>
	$(document).ready(function() {
		// tr��� �߿��� ù��° ��Ҹ� ����
		var $first = $('tr:first');
		var $last = $('tr:last');
		$first.addClass('selectedstyle');
		$last.addClass('selectedstyle');
		console.log("���ǿ� �����ϴ� ù��° Element : " + $first.html());
		console.log("���ǿ� �����ϴ� ������ Element : " + $last.html());
		
		// Ȧ/¦
		$('tr:even').css('backgroundColor', 'red');
		$('tr:odd').css('backgroundColor', 'yellow ');
		
		// equals�� index��
		$('td:eq(3)').css('backgroundColor', 'green');
	});
</script>
</head>
<body>
	<table>
		<tr><td> one </td></tr>
		<tr><td> two </td></tr>
		<tr><td> three </td></tr>
		<tr><td> four </td></tr>
		<tr><td> five </td></tr>
	</table>
</body>
</html>