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
		// ������带 + next�� �����ϱ�..
		// ������ ���� ����� �ƴϴ�.
		var $ch = $('em + a + a');
		$ch.css('backgroundColor', 'yellow').each(function() {
			$(this).appendTo('.result1');
		});
		console.log("�˻��� ������Ʈ ���� : ") + $ch.length;
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
	<span> prev + next�� �˻��� ������Ʈ : </span>
	<span class="result1"></span>
</body>
</html>