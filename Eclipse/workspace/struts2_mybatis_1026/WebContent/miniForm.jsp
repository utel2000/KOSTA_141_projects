<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>miniForm.jsp</title>
</head>
<body>
	<div style="margin:0px 150px 0px 150px;">
		<fieldset>
			<legend>�Է±� �ۼ�</legend>
			<form method="post" action="mini_insert">
				<p>
					<label>�� �� �� / �� �� ��</label>
					<input type="text" name="cont" />&nbsp;
					<input type="text" name="id" />
				</p>
				<p>
					<label>��й�ȣ / �� �� ��</label>
					<input type="password" name="pwd" />&nbsp;
					<input type="email" name="email" />
				</p>
				<p>
					<input type="radio" name="icon" value="A" checked>
					<img src="icon/chu1.gif" style="width: 150px;" />&nbsp;
					<input type="radio" name="icon" value="B">
					<img src="icon/chu2.gif" style="width: 150px;" />&nbsp;
					<input type="radio" name="icon" value="C">
					<img src="icon/chu3.gif" style="width: 150px;" />&nbsp;
					<input type="radio" name="icon" value="D">
					<img src="icon/chu4.gif" style="width: 150px;" />&nbsp;
					<input type="radio" name="icon" value="E">
					<img src="icon/chu5.gif" style="width: 150px;" />&nbsp;
				</p>
				<p align="right">
					<input type="submit" value="�� �� ��" style="background-color: white; border: 1px solid #ccc;">
				</p>
			</form>
		</fieldset>
	</div>
</body>
</html>