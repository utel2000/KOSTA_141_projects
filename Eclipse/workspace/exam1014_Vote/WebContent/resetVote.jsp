<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	session.setAttribute("budae", 0);
	session.setAttribute("gopchang", 0);
	session.setAttribute("samgyeop", 0);
	session.setAttribute("pasta", 0);
	session.setAttribute("doenjang", 0);
	session.setAttribute("sushi", 0);
	response.sendRedirect("voteResult.jsp");
%>