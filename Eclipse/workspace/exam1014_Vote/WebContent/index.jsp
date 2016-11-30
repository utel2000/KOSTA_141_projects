<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@include file="includeLoginSession.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>index.jsp</title>
<style>
	div{text-align: center; border: 1px dotted;}
	h1{color: blue;}
</style>
</head>
<%
	// log start
	StringBuffer log = new StringBuffer();
	System.out.println("<index.jsp>");
	log.append("* id : ").append(id).append("\n")
	.append("* name : ").append(name).append("\n")
	.append("* priv : ").append(priv).append("\n");
	System.out.println(log);
	log.delete(0, log.length()); 
	// log end
%>
<body>
	<div>
		<%
			if(id == null) {
		%>
				<h1>[ ���� ���� �޴� ��ǥ����! ]</h1><br />
				<a href="loginForm.jsp">�α���</a>
				<br /><br />
		<%
			} else if(priv.equals("admin")) {
		%>
				<h1>������ <%=name%>�� ȯ���մϴ�!</h1>
				<a href="voteResult.jsp">��������</a>
				<a href="logout.jsp">�α׾ƿ�</a>
				<br /><br />
		<%
			} else {
		%>
				<h1>����� <%=name%>�� ȯ���մϴ�!</h1>
				<a href="voteForm.jsp">��������</a>
				<a href="logout.jsp">�α׾ƿ�</a>
				<br /><br />
		<%
			}
		%>
	</div>
</body>
</html>