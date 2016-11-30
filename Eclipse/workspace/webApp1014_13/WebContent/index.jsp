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
	// 세션이 등록 된 값이 없으면 로그인 화면 / 있으면 로그아웃.
	String uid = (String) session.getAttribute("uid");
	if(uid == null){
%>
		<a href = "loginForm.jsp">로그인</a>
<%
	} else { 		
		String name = (String) session.getAttribute("name");
%>
		<%=name%>님 반가워요^^
		<a href="logout.jsp">로그아웃</a>
<%
	}
%>
</body>
</html>