<%@page import="dao.LoginDemoDao"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- login.jsp --%>

<%
	request.setCharacterEncoding("euc-kr");
	String id = request.getParameter("uid");
	String pwd = request.getParameter("pwd");
	Map<String, String> m = new HashMap<>();
	m.put("uid", id);
	m.put("pwd", pwd);
	String res = LoginDemoDao.getDao().loginProcess(m);
	String url = "";
	if(res != null){
		out.println("로그인 성공!");
		session.setAttribute("uid", id);
		session.setAttribute("name", res);
		url="index.jsp";
	}else{
		out.println("로그인 실패!");
		url="error.jsp";
	}
	response.sendRedirect(url);
%>