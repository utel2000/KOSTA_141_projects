<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>mJoinForm.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	$(function() {
		// jQuery ��� �����ڸ� ����ؼ� btn_idChk�� Ŭ�� �̺�Ʈ�� �����Ͽ�
		// id�� id�� text�� ���� �޾ƿ��� ����
		$('#btn_idChk').click(function() {
			var idv = $('#id').val();
			console.log("id��: " + idv);
			// target�� ajax�� ����� �ٷ� ����
			$('#target').load('mJoinChk?id=' + idv);
		});
	});
</script>
</head>
<body>
	<div id="wrap">
		<h2>SpringFramework����� jQuery�� ����� ���̵� �ߺ�ȭ�� �� ���� ����!</h2>
		<form action="mJoinAdd" method="post">
			<p>���̵�: <input type="text" name="id" id="id">
				<input type="button" value="�ߺ�Ȯ��" id="btn_idChk">
			</p>
			<p id="target"></p>
			<p>��й�ȣ: <input type="password" name="pwd" id="pwd"></p>
			<p>�̸�: <input type="text" name="name" id="name"></p>
			<p><input type="submit" value="join"></p>
		</form>
	</div>
</body>
</html>