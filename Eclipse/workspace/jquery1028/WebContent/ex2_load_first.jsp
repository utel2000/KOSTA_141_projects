<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex2_load_first.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	$(function() {
		/*
			ex2_load_test.jsp�� p ��Ҹ��� �����ͼ�
			���� ������ div ��� �ȿ� �ֱ� ����
			�Ʒ��� ���� ������ ������ �� �ִ�.
			p �ܿ��� , �� ����ؼ�
			span ��ҵ� ������ �� �ִ�.
		*/
		$('#load').click(function() {
			// $('div').load('ex2_load_test.jsp p')
			$('div').load('ex2_load_test.jsp p, span')
		})
	});
</script>
</head>
<body>
	<input type="button" value="AjaxLoad" id="load" />
	<div></div>
</body>
</html>