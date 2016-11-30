<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex1_click.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<style>
	#wrap { 
		width: 300px; margin: auto;
	}
	#target {
		width: 200px; background: orange;
	}
</style>
<script>
	$(function() {
		// click�ȿ� fn�� �Լ� �ȿ����� ���� ������ �͸� �Լ��� ���� : �ݹ��Լ�.
		$('#btn').click(function() {
			var msg = $('#msg').val();
			console.log(msg);
			// target�� ���� �����ϴµ�
			// ������ ���, �۾����� ���.
			$('#target').css({'background': 'blue',
								'color': 'white',
								'height': '30px'}).html(msg);
		});
	});
</script>
</head>
<body>
	<div id="wrap">
		<input type="text" name="msg" id="msg" /><br />
		<div id="target"></div>
		<input type="button" value="click" id="btn" />
	</div>
</body>
</html>