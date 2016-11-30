<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex6.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<style>
	div{ width: 200px; height: 60px; border: 1px solid; }
	.a1 { background: orange; color: #FFFFFF; font-size: 20px; }
	.a2 { background: red; color: #FFFFFF; font-size: 22px; }
</style>
<script>
	$(document).ready(function() {
		$('div').each(function(idx) {
			if(idx % 2 == 0) {
				$(this).addClass('a1');
			} else {
				$(this).addClass('a2');
			}
		}) 
	});
</script>
</head>
<body>
<%	for(int i=0; i<10; i++) { %>
	<div id="no1"><%=i%></div>
<% } %>
</body>
</html>