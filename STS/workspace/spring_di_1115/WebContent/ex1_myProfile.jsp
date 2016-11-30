<%@page import="ex1.MyProfile"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>myProfile.jsp</title>
</head>
<body>
	<%
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/profile.xml");
		MyProfile profile = ctx.getBean("profileBean", MyProfile.class);
	%>
	<%=profile.myProfile()%>
</body>
</html>