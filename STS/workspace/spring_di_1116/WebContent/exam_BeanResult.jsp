<%@page import="service.LogFactory"%>
<%@page import="exam.ExamBeanInter"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>exam_BeanResult.jsp</title>
</head>
<body>
	<%
		String choice = request.getParameter("choice");
		LogFactory.getLogFactory().getLogHeader("exam_BeanResult.jsp");
		LogFactory.getLogFactory().getLog("choice", choice);
		ApplicationContext ctx = new GenericXmlApplicationContext("exam/examBean.xml");
		ExamBeanInter ebi = ctx.getBean("exam", ExamBeanInter.class);
		ebi.callExecuteBean(choice);
	%>
	<%=ebi.getMessageBean()%>
</body>
</html>