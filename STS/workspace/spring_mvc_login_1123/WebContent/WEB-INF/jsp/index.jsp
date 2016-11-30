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
			<a href="mForm">회원가입 폼 예제로 이동</a>
		</li>
		<li>
			<a href="mList">회원리스트 폼 예제로 이동</a>
		</li>
		<c:choose>
			<c:when test="${sessionScope.uid == null}">
				<li>
					<a href="loginForm">로그인 예제</a>
				</li>
			</c:when>
			<c:otherwise>
				<li>
					${sessionScope.uid }님반가워용^^ <a href="logout">로그아웃</a>
				</li>
			</c:otherwise>
		</c:choose>
		<li>
			<a href="upForm">파일 업로드 예제</a>
		</li>
	</ul>
</body>
</html>