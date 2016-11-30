<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>employee.jsp</title>
</head>
<body>
	<h1>Employee Information</h1>
	<p>
		Employee ID: ${id}<br />
		Employee Name: ${name}<br />
	</p>
	<!-- pageContext.request.userPrincipal은 SpringSecurity가 가지고있는 허용된
	접근에 대한 정보. -->
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		Hi ${pageContext.request.userPrincipal.name}<br />
		<c:url var="logoutAction" value="/j_spring_security_logout" />
		<form action="${logoutAction}" method="post">
			<input type="submit" value="logout" />
		</form>
	</c:if>
</body>
</html>