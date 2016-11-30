<%@page import="dao.SMemoDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- 
	connTest.jsp
	요청이 왔을 때 SBoardDao의 addDemo메서드를 호출하여
	JNDI로 연결한 context.xml을 사용해서 DataSource객체로
	Connection이 제대로 연결되는지 테스트한다.
--%>
<%
	SMemoDao dao = SMemoDao.getDao();
	dao.addDemo();
%>