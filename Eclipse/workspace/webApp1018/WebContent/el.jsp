<%@page import="java.util.HashMap"%>
<%@page import="vo.Customer"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	Customer cust = new Customer();
	cust.setName("홍길동");
	cust.setEmail("hong.nate.com");
	cust.setPhone("011-1234-5678");
	
	request.setAttribute("customer", cust);
	
	HashMap<String, String> map = new HashMap<>();
	map.put("name", "소나타");
	map.put("maker", "현대자동차");
	
	request.setAttribute("car", map);
%>

<html>
	<head>
		<meta http-equiv="content-Type" content="text/html; charset=UTF-8">
		<title>JSP PAGE</title>
	</head>
	<body>
		<ul>
			<li>이  름 : ${customer.name}</li>
			<li>메  일 : ${customer.email}</li>
			<li>전  화 : ${customer.phone}</li>
		</ul>
		<ul>
			<li>차  명 : ${car.name}</li>
			<li>제조사 : ${car.maker}</li>
		</ul>
	</body>
</html>