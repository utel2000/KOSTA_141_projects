<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// logout�� ó���ϱ� ���� ����
	session.removeAttribute("uid");
	session.removeAttribute("name");
	session.removeAttribute("priv");
	response.sendRedirect("index.jsp");
%>