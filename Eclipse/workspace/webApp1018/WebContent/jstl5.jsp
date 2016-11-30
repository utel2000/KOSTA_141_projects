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
   			당신의 성적은 A입니다.
 	 	</c:when>
		<c:when test="${score ge 80 }">
			당신의 성적은 B입니다.
		</c:when>
		<c:when test="${score ge 70 }">
			당신의 성적은 C입니다.
		</c:when>
		<c:when test="${score ge 60 }">
			당신의 성적은 D입니다.
		</c:when>
		<c:otherwise>
			당신은 낙제입니다.
		</c:otherwise>
	</c:choose>
</body>
</html>
