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
			�� �� �� : <input type="text" name="id" id="id">
			<input type="button" value="�ߺ�Ȯ��" onclick=""><br/>
			��й�ȣ : <input type="password" name="pwd"><br/>
			��    �� : <input type="text" name="name" id="name"><br/>
			�� �� �� : <input type="email" name="email"><br/>
			������� : <input type="week" name="birth"><br/>
			�� �� ó : <select name="tel1">
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