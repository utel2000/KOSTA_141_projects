<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>loginForm.jsp</title>
<script>
	function loginChk() {
		// ID, PWD�� ���� ���� ��� �Ʒ��� Form�� ���۵��� �ʴ´�.
		// < �������� >
		// ID, PWD���� �Էµ��� �ʾ��� ��� �Ʒ��� Form�� ���۵��� �ʵ���.
		var idv = document.getElementById("id");
		var pwdv = document.getElementById("pwd");
		if(idv.value === "") {
			alert("���̵� �Է��ϼ���.");
			idv.focus();
			return false;
		}
		if(pwdv.value === "") {
			alert("��й�ȣ�� �Է��ϼ���.");
			pwdv.focus();
			return false;
		}
		var f = document.logF;
		f.submit();
	}
</script>
</head>
<body>
	<div>
		<fieldset>
			<legend>�α��� ��</legend>
			<form name="logF" method="post" action="loginOk">
				<p>
					<label>�� �� ��</label>
					<input type="text" name="id" id="id" />
				</p>
				<p>
					<label>��й�ȣ</label>
					<input type="password" name="pwd" id="pwd" />
				</p>
				<p>
					<input type="button" value="   �� �� ��   " onclick="loginChk()" />
				</p>
			</form>
		</fieldset>
	</div>
</body>
</html>