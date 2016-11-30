<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>index.jsp</title>
</head>
<body>
<%
	// 세션이 등록 된 값이 없으면 로그인 화면 / 있으면 로그아웃.
	String uid = (String) session.getAttribute("uid");
	String priv = (String) session.getAttribute("priv");
	if(uid == null){
%>
		<a href = "loginForm.jsp">로그인</a>
<%
	} else { 		
		String name = (String) session.getAttribute("name");
		switch (priv){
			case "admin":		
%>
				[관리자] <%=name%>님 반갑습니다.<br />
<%
				break;
			default:
%>
				[사용자] <%=name%>님 반갑습니다.<br />
<%
		}
%>
				<a href="logout.jsp">로그아웃</a>
<%
	}
%>
</body>
</html>