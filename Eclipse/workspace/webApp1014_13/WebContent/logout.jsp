<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// logout을 처리하기 위한 구문
	session.removeAttribute("uid");
	session.removeAttribute("name");
	session.removeAttribute("priv");
	response.sendRedirect("index.jsp");
%>