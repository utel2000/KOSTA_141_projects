<%@page import="dao.ChatDAO"%>
<%@page import="vo.ChatVO"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String u_id = URLDecoder.decode(request.getParameter("u_id"),"utf-8");
	String chat = URLDecoder.decode(request.getParameter("chat"),"utf-8");
	System.out.println("u_id : " + u_id);
	System.out.println("char : " + chat);
	ChatVO v = new ChatVO();
	v.setU_id(u_id); // 채팅 사용자.
	v.setChat(chat); // 채팅 메세지.
	v.setReip(request.getRemoteAddr()); // 아이피
	ChatDAO.getDao().insertChat(v); // myBatis에게 값 전달.
%>