<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>exam4.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	// trigger �̺�Ʈ ���� �߻�
	$(document).ready(function() {
		// �̺�Ʈ
		$('h1').click(function(event, data1, data2) {
			$(this).html(function(index, html) {
				return html + "*";
			});
		});
		// 1�ʸ��� �Լ��� ����
		var n = 0;
		var inter = setInterval(function() {
			if(n == 50) clearInterval(inter);
// 			$('h1').last().trigger('click');
			n++;
		}, 1000);
	});
</script>
</head>
<body>
	<h1>����(����): </h1>
	<h1>����(�ڵ�): </h1>
</body>
</html>