<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>loginForm.jsp</title>
<style>
	#loginForm{text-align: center;}
	h1{color: red; align: center;}
</style>
</head>
<body>
	<div id="loginForm">
		<h1>로그인 폼</h1>
		<form method="post" action="login.jsp">
			아 이 디 : <input type="text" name="uid"><br />
			비밀번호 : <input type="password" name="pwd"><br />
			<input type="submit" value="Login">
		</form>
	</div>
</body>
</html>