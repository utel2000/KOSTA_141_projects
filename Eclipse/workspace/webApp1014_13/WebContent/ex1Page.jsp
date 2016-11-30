<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex1Page.jsp</title>
<!-- include 지시어
	반복되는 jsp를 한 번 작성한 후, 반복하지 않도록 한 번만 작성해서 재사용.
	: 주요 포인트 A가 B를 포함한다.
		1. A는 B, C, D, E 등에서 반복될 jsp문
		2. A는 B에 포함된다. A와 B는 컴파일 단계에서 하나의 서블릿으로 변환. ***
-->
</head>
<body>
	<p>여기는 ex1Page.jsp</p>
	<%@include file="a.jsp" %>
</body>
</html>