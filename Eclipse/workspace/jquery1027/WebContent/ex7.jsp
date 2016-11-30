<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex7.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	$(document).ready(function() {
		// �ļ�(E F) 
		// ������ P ��ҿ��� �ļ� em��Ҹ� ã�Ƽ� �ֿܼ� ���� ���
		$('p em').css('backgroundColor', 'yellow').each(function() {
			// ������Ʈ�� ���� ���ϴ� �޼���
			$('.result1').append($(this).text()+"\n");
		});
		console.log("p�� �ļ� em ��� ���� : " + $('p em').length);
	
		// �ڽĿ��(E > F)
		// DIV�� �ڽĿ�ҷ� em�� �˻��ؼ� ������ ��ũ, ���� ���� ��� ��
		// �ֿܼ��� ����غ�����.
		$('div > em').css('backgroundColor', 'pink').each(function() {
			$('.result2').append($(this).text()+"\n");
		});
		console.log("div�� �ڼ� em ��� ���� : " + $('div > em').length);
	});
</script>
</head>
<body>
	<p>
		<em> one </em>
		<em> two </em>
		<span><em> three </em></span>
	</p>
	<div>
		<em> four </em>
		<span><em> five </em></span>
		<em> six </em>
	</div>
	<hr>
	<div>
		<span> �ļ� ��ҷ� �˻��� ������Ʈ (A B) : </span>
		<span class="result1"></span>
	</div>
	<div>
		<span> �ڽ� ��ҷ� �˻��� ������Ʈ (A > B) : </span>
		<span class="result2"></span>
	</div>
</body>
</html>