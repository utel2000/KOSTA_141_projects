<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<P>
		pageContext :
		<%=pageContext.getAttribute("msg1")%></P>
	<hr>
	<p>
		request :
		<%=request.getAttribute("msg2")%></p>
	<hr>
	<p>
		session :
		<%=session.getAttribute("user1")%></p>
	<hr>
	<p>
		application :
		<%=application.getAttribute("user2")%></p>
	<hr>
</body>
</html>