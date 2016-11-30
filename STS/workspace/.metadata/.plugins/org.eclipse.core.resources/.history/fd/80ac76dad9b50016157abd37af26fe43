<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test.jsp</title>
</head>
<body>
<body>
	<h1>Test Information</h1>
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		Hi ${pageContext.request.userPrincipal.name}<br />
		<c:url var="logoutAction" value="/j_spring_security_logout" />
		<form action="${logoutAction}" method="post">
			<input type="submit" value="logout" />
		</form>
	</c:if>
</body>
</body>
</html>