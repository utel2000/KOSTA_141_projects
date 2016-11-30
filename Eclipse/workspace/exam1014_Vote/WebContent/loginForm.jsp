<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>loginForm.jsp</title>
<style>
	div{text-align: center; border: 1px solid;}
</style>
</head>
<body>
	<div>
		<p>[ 관리자 / 회원 로그인 ]</p>
		<form method="post" action="login.jsp">
			아 이 디 : <input type="text" name="id"><br />
			비밀번호 : <input type="password" name="pwd"><br />
			<input type="submit" value="확인"><br />
		</form>
		<br />
	</div>
</body>
</html>
