<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>loginForm.jsp</title>
<script>
	function loginChk() {
		// ID, PWD의 값이 없을 경우 아래의 Form이 전송되지 않는다.
		// < 연습문제 >
		// ID, PWD값이 입력되지 않았을 경우 아래의 Form이 전송되지 않도록.
		var idv = document.getElementById("id");
		var pwdv = document.getElementById("pwd");
		if(idv.value === "") {
			alert("아이디를 입력하세요.");
			idv.focus();
			return false;
		}
		if(pwdv.value === "") {
			alert("비밀번호를 입력하세요.");
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
			<legend>로그인 폼</legend>
			<form name="logF" method="post" action="loginOk">
				<p>
					<label>아 이 디</label>
					<input type="text" name="id" id="id" />
				</p>
				<p>
					<label>비밀번호</label>
					<input type="password" name="pwd" id="pwd" />
				</p>
				<p>
					<input type="button" value="   로 그 인   " onclick="loginChk()" />
				</p>
			</form>
		</fieldset>
	</div>
</body>
</html>