<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex1_forms.jsp</title>
</head>
<body>
	<div>
		<form method="post" action="ex1_in.jsp">
			<input type="hidden" name="reip" value="<%=request.getRemoteAddr()%>">
			아 이 디 : <input type="text" name="id" id="id">
			<input type="button" value="중복확인" onclick=""><br/>
			비밀번호 : <input type="password" name="pwd"><br/>
			이    름 : <input type="text" name="name" id="name"><br/>
			이 메 일 : <input type="email" name="email"><br/>
			생년월일 : <input type="week" name="birth"><br/>
			연 락 처 : <select name="tel1">
				<option>02</option>
				<option>032</option>
				<option>031</option>
				<option>062</option>
				<option>051</option>
				<option>043</option>
			</select>-
			<input type="text" name="tel2">
			-
			<input type="text" name="tel3">
			<input type ="submit" value="send">
		</form>
	</div>
</body>
</html>