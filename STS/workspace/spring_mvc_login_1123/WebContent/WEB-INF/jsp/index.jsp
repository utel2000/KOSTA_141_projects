<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>index.jsp</title>
</head>
<body>
	<h1>Success!</h1>
	<ul>
		<li>
			<a href="mForm">ȸ������ �� ������ �̵�</a>
		</li>
		<li>
			<a href="mList">ȸ������Ʈ �� ������ �̵�</a>
		</li>
		<c:choose>
			<c:when test="${sessionScope.uid == null}">
				<li>
					<a href="loginForm">�α��� ����</a>
				</li>
			</c:when>
			<c:otherwise>
				<li>
					${sessionScope.uid }�Թݰ�����^^ <a href="logout">�α׾ƿ�</a>
				</li>
			</c:otherwise>
		</c:choose>
		<li>
			<a href="upForm">���� ���ε� ����</a>
		</li>
	</ul>
</body>
</html>