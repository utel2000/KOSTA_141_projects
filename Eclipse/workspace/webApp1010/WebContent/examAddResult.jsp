<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>examAddResult.jsp</title>
</head>
<body>
	<%
	int num = Integer.parseInt(request.getParameter("num"));
	String col = request.getParameter("col");
	%>
	<table style="width: 300px; border: 1px solid">
	<% for(int i=0; i<num; i++){ 
		String bgColor="style='background-color:white;'";
		if(i % 2 != 0){
			bgColor = "style='background-color:"+col+";'";
		}else{
			bgColor = "style='background-color:white;'";		
		} %>
	<tr><td <%= bgColor %>><%= i %></td></tr>
	<% } %>
	</table>
	
	<table style="width: 1000px; border: 1px solid">
	<% for(int i=0; i<=9; i++) { %>
		<% if(i % 2 != 0) { %>
			<% String bgColor="style='background-color:white;'";
				if(i % 2 != 0){
					bgColor = "style='background-color:"+col+";'";
				}else{
					bgColor = "style='background-color:white;'";		
				} %>
			<tr <%= bgColor %>>
		<% } else { %>
			<tr>
		<% } %>
		<% for(int j=1; j<=9; j++) { %>
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