<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// pageContext : ���� ������ �������� ���� ���� (servletConfig�� ����)
	pageContext.setAttribute("msg1", "test");
	// request : A���� ������ �� B������������ ���� ����
	request.setAttribute("msg2", "test2");
	// session : A, B, C�� ������ ���� �������� ���� �ȵ�. �̷��� ���� ������ ���� ����.
	session.setAttribute("user1", "xman");
	// application : ��� ���������� �ҷ� �� �� �ִ� ��.
	application.setAttribute("user2", "wow");
	RequestDispatcher rd = request.getRequestDispatcher("ex3_ScopeRes.jsp");
	rd.forward(request, response);
%>
<%-- <jsp:forward page="ex3_ScopeRes.jsp"/> --%>
<a href = "ex3_ScopeRes.jsp">�̵��϶���</a>
<hr>
<P>pageContext : <%= pageContext.getAttribute("msg1") %></P><hr>
<p>request : <%= request.getAttribute("msg2") %></p><hr>
<p>session : <%= session.getAttribute("user1") %></p><hr>
<p>application : <%= application.getAttribute("user2") %></p><hr>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex3_scope.jsp</title>
</head>
<body>

</body>
</html>