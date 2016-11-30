<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// pageContext : 현재 페이지 내에서만 값의 범위 (servletConfig와 동일)
	pageContext.setAttribute("msg1", "test");
	// request : A에서 포워딩 된 B페이지에서만 값의 범위
	request.setAttribute("msg2", "test2");
	// session : A, B, C는 세션의 범위 나머지는 적용 안됨. 이렇게 구별 가능한 값의 범위.
	session.setAttribute("user1", "xman");
	// application : 모든 페이지에서 불러 올 수 있는 값.
	application.setAttribute("user2", "wow");
	RequestDispatcher rd = request.getRequestDispatcher("ex3_ScopeRes.jsp");
	rd.forward(request, response);
%>
<%-- <jsp:forward page="ex3_ScopeRes.jsp"/> --%>
<a href = "ex3_ScopeRes.jsp">이동하라고야</a>
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