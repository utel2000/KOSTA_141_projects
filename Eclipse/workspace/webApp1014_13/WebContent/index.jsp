<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>index.jsp</title>
</head>
<body>
<%
	// ������ ��� �� ���� ������ �α��� ȭ�� / ������ �α׾ƿ�.
	String uid = (String) session.getAttribute("uid");
	if(uid == null){
%>
		<a href = "loginForm.jsp">�α���</a>
<%
	} else { 		
		String name = (String) session.getAttribute("name");
%>
		<%=name%>�� �ݰ�����^^
		<a href="logout.jsp">�α׾ƿ�</a>
<%
	}
%>
</body>
</html>