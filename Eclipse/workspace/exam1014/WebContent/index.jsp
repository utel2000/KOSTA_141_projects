<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>index.jsp</title>
</head>
<body>
<%
	// ������ ��� �� ���� ������ �α��� ȭ�� / ������ �α׾ƿ�.
	String uid = (String) session.getAttribute("uid");
	String priv = (String) session.getAttribute("priv");
	if(uid == null){
%>
		<a href = "loginForm.jsp">�α���</a>
<%
	} else { 		
		String name = (String) session.getAttribute("name");
		switch (priv){
			case "admin":		
%>
				[������] <%=name%>�� �ݰ����ϴ�.<br />
<%
				break;
			default:
%>
				[�����] <%=name%>�� �ݰ����ϴ�.<br />
<%
		}
%>
				<a href="logout.jsp">�α׾ƿ�</a>
<%
	}
%>
</body>
</html>