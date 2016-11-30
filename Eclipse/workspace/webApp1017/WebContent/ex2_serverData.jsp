<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%--
	ex2_serverData.jsp
	ajax 서버측 프로그래밍 !
--%>
<%
	// log start
	StringBuffer log = new StringBuffer();
	System.out.println("<ex2_serverData.jsp>");
	// log end

	String msg = request.getParameter("msg");

	// log start
	log.append("* msg : ").append(msg).append("\n");
	System.out.println(log);
	log.delete(0, log.length());
	// log end
	
	String printM = "";
	if(msg.equals("ajax")) {	
		printM = "♥ Ajax Hello~!";
	} else {
		printM = "Hello~!";
	}
%>
<h1 style="background-color: orange;"><%=printM%></h1>
