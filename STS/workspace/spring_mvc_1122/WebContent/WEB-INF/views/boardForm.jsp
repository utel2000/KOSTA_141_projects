<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>boardForm.jsp</title>
</head>
<body>
<div>
<form method="post" action="boardIn">
제목 : <input type="text" name="subject"><br/>
작성자 : <input type="text" name="writer"><br/>
내용 : <textarea rows="10" cols="10" name="content"></textarea><br/>
<input type="hidden" name="reip" value="<%=request.getRemoteAddr() %>">
<input type="submit" value="send">
</form>
</div>
</body>
</html>