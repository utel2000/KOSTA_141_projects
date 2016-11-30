<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>index.jsp</title>

</head>
<body>
	<h1>기본페이지</h1>
	<div style="border: 0px solid #ccc; margin-right: 20px; background-color: orange;">
		<div align="right">
			<%-- #session은 OGNL표기법으로 sessionScope를 의미 --%>
			<s:if test="#session.loginId == null">
				<a href="ssnchkF">회원가입</a> &nbsp;
				<a href="loginForm">로그인</a>
			</s:if>
			<s:else>
				<a href="ssnchkF">마이페이지(연습문제)</a>
				&nbsp; ${sessionScope["loginId"]}님
				<a href="logout">로그아웃</a>
			</s:else>
			&nbsp;
			<a href="#">고객센터</a>
		</div>
	</div>
</body>
</html>