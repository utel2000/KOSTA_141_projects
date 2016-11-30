<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>gugudan.jsp</title>
</head>
<body>
	<c:forEach var="gugu" items="${gugudan}">
		<td>${gugu}</td>
		<br>
	</c:forEach>
</body>
</html>