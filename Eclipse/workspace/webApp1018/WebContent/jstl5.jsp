<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	int score = 87;

	request.setAttribute("score", score);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title></title>
</head>
<body>
	<!-- 
		eq : ==
		gt : >
		lt : <
		ge : >=
		le = <=
	-->
	<c:choose>
		<c:when test="${score ge 90 }">
   			����� ������ A�Դϴ�.
 	 	</c:when>
		<c:when test="${score ge 80 }">
			����� ������ B�Դϴ�.
		</c:when>
		<c:when test="${score ge 70 }">
			����� ������ C�Դϴ�.
		</c:when>
		<c:when test="${score ge 60 }">
			����� ������ D�Դϴ�.
		</c:when>
		<c:otherwise>
			����� �����Դϴ�.
		</c:otherwise>
	</c:choose>
</body>
</html>
