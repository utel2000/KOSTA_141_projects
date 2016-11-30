<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- ex1_in.jsp --%>
<%
	request.setCharacterEncoding("euc-kr");
%>
<%-- MemberDemoVO vo = new MemberDemoVO(); 와 동일. --%>
<jsp:useBean id="vo" class="vo.MemberDemoVO"/>
<%-- 
	파라미터의 모든 값을 vo에 저장한다. 
	단, 반드시 vo변수명과 parameter명이 같아야만 한다.
--%>
<jsp:setProperty property="*" name="vo"/>
<%
	StringBuffer tel = new StringBuffer();
	tel.append(request.getParameter("tel1")).append("-")
	.append(request.getParameter("tel2")).append("-")
	.append(request.getParameter("tel3"));
	vo.setTel(tel.toString());
	MemberDAO.getDao().addMember(vo);
%>

<%-- 아래처럼 하면 의미가 없으므로 단순 참고용으로 알기만 해라. --%>
<%-- vo.setXX(request.getParameter("xx"); 와 동일 --%>
<%-- <jsp:setProperty property="id" name="vo" param="id"/> --%>
<%-- <jsp:setProperty property="pwd" name="vo" param="pwd"/> --%>
<%-- <jsp:setProperty property="name" name="vo" param="name"/> --%>
<%-- <jsp:setProperty property="email" name="vo" param="email"/> --%>
<%-- <jsp:setProperty property="birth" name="vo" param="birth"/> --%>
<%-- <jsp:setProperty property="mdate" name="vo" param="week"/> --%>
<%-- <jsp:setProperty property="tel" name="vo" param="tel"/> --%>
<!-- <h2> -->
<%-- 	<jsp:getProperty property="id" name="vo"/> --%>
<%-- 	<jsp:getProperty property="pwd" name="vo"/> --%>
<%-- 	<jsp:getProperty property="name" name="vo"/> --%>
<%-- 	<jsp:getProperty property="email" name="vo"/> --%>
<%-- 	<jsp:getProperty property="birth" name="vo"/> --%>
<%-- 	<jsp:getProperty property="mdate" name="vo"/> --%>
<%-- 	<jsp:getProperty property="tel" name="vo"/> --%>
<!-- </h2> -->