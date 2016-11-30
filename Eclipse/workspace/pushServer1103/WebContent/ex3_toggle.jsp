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
	// toogle - ��� click �̺�Ʈ
	// �Լ��� ������ �����ؼ� �Է�, �Լ��� ������� ����
	// 1. ���ڿ� �տ� �� �߰�
	// 2. ���ڿ� �ڿ� �� �߰�
	// 3. ���ڿ��� ���� ����
	$(document).ready(function() {
		$('h1').toggle(function() {
			// ���ڿ� �տ� �� �߰�
			$(this).html(function(idx, html) {
				return '*' + html;
			});
		}, function() {
			// ���ڿ� �ڿ� �� �߰�
			$(this).html(function(idx, html) {
				return html + "*";
			});
		}, function() {
			// ���ڿ��� �� ����
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