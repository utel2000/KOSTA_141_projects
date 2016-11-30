<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>form.jsp</title>
</head>
<body>
	<div id="wrap">
		<form method="post" action="formadd">
			제  목 : <input type="text" name="sub"><br/>
			작성자 : <input type="text" name="writer"><br/>
			내  용 : <textarea rows="20" cols="10" name="cont"></textarea><br/>
			<input type="submit" value="send">
		</form>
	</div>
</body>
</html>