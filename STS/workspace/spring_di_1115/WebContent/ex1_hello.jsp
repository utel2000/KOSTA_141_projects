<%@page import="ex1.MyProfile"%>
<%@page import="ex1.HelloInter"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>hello.jsp</title>
</head>
<body>
	<%
		// hello.xml�� �ִ� ��� bean�� Spring Container�� ����ϰ� ������ �����ϴ� �۾�.
		// ��� ���� �̱������� ���� ������!
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex1.xml");
		HelloInter myhello = ctx.getBean("greeting", HelloInter.class);
		myhello.sayHello();
		MyProfile profile = ctx.getBean("profiling", MyProfile.class);
		System.out.println(profile.myProfile());
	%>
</body>
</html>