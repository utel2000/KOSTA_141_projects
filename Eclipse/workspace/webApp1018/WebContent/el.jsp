<%@page import="java.util.HashMap"%>
<%@page import="vo.Customer"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	Customer cust = new Customer();
	cust.setName("ȫ�浿");
	cust.setEmail("hong.nate.com");
	cust.setPhone("011-1234-5678");
	
	request.setAttribute("customer", cust);
	
	HashMap<String, String> map = new HashMap<>();
	map.put("name", "�ҳ�Ÿ");
	map.put("maker", "�����ڵ���");
	
	request.setAttribute("car", map);
%>

<html>
	<head>
		<meta http-equiv="content-Type" content="text/html; charset=UTF-8">
		<title>JSP PAGE</title>
	</head>
	<body>
		<ul>
			<li>��  �� : ${customer.name}</li>
			<li>��  �� : ${customer.email}</li>
			<li>��  ȭ : ${customer.phone}</li>
		</ul>
		<ul>
			<li>��  �� : ${car.name}</li>
			<li>������ : ${car.maker}</li>
		</ul>
	</body>
</html>