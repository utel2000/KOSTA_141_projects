<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>gugudan.jsp</title>
</head>
<body>
	<%
		int dan = Integer.parseInt(request.getParameter("dan"));
 		int limit = Integer.parseInt(request.getParameter("limit")) / 2;
   		String dancol = request.getParameter("dancol");
	%>
	<table style="border: 1px solid">
	<% for(int i=0; i<=9; i++) { %>
		<tr>
		<% for(int j=(dan-limit); j<=(dan+limit); j++) { %>
			<% if(i == 0){ %>
				<td><%= j %>단</td>
			<% } else {%>
			<td><%= j %> x <%= i %> = <%= j*i %></td>
			<% } %>
		<% } %>
		<tr />
	<% } %>
	</table>
</body>
</html>