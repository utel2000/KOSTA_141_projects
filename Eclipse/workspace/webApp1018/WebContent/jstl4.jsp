<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>if.jsp</title>
</head>
<body>
	<c:if test="${param.type eq 'guest'}">
		홈페이지 방문을 환영합니다.<br/>
		회원가입 바랍니다.
	</c:if>
	<c:if test="${param.type eq 'member'}">
		고객님 감사합니다.<br/>
		더 나은 서비스로 보답하겠습니다.
	</c:if>
</body>
</html>