<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex2Check.jsp</title>
</head>
<body>
	<%	
	request.setCharacterEncoding("euc-kr");
	String[] fruits = request.getParameterValues("fruit");
	String[] test = request.getParameterValues("test");
	for(String e : fruits) {
		%>
	<p><%= e %></p>
	<% } %>
</body>
</html>