<%@page import="ex2.Ex2_ConstructorDemoInter"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex2_constructor.jsp</title>
</head>
<body>
	<%
		ApplicationContext ctx = new GenericXmlApplicationContext("ex2/constructorDemo.xml");
		Ex2_ConstructorDemoInter constructor1 = ctx.getBean("constructor1", Ex2_ConstructorDemoInter.class);
		constructor1.printString();
		constructor1.printNumber();
		System.out.println(constructor1.printNum_String());
	%>
	<%=constructor1.printNum_String()%>
</body>
</html>