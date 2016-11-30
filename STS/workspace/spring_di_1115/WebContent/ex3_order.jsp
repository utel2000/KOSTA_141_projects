<%@page import="ex3.OrderableCook"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex3_order.jsp</title>
</head>
<body>
	<%
		String menu = request.getParameter("orderMenu");
		String res = "";
		ApplicationContext ctx = new GenericXmlApplicationContext("ex3/order.xml");
		OrderableCook oc = null;
		if(menu.equals("kor")) {
			oc = ctx.getBean("orderA", OrderableCook.class); 
		}else if(menu.equals("indo")) {
			oc = ctx.getBean("orderB", OrderableCook.class);
		}else if(menu.equals("jpn")) {
			oc = ctx.getBean("orderC", OrderableCook.class);
		}else {
			
		}
		res = oc.orderMenu();
		%>
		<p style="color: blue;">
			선택하신 메뉴 : <%=res%>
		</p>
</body>
</html>