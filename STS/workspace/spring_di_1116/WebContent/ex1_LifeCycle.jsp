<%@page import="ex1.LifeCheckable"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>lifeCycle.jsp</title>
</head>
<body>
	<%
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/life.xml");
		LifeCheckable lc = ctx.getBean("life1", LifeCheckable.class);
		lc.execute();
	%>
</body>
</html>