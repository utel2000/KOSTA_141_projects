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
		Ȩ������ �湮�� ȯ���մϴ�.<br/>
		ȸ������ �ٶ��ϴ�.
	</c:if>
	<c:if test="${param.type eq 'member'}">
		���� �����մϴ�.<br/>
		�� ���� ���񽺷� �����ϰڽ��ϴ�.
	</c:if>
</body>
</html>