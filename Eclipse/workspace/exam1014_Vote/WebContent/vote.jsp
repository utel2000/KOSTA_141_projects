<%@page import="jdk.nashorn.internal.runtime.regexp.joni.Warnings"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="javax.swing.plaf.OptionPaneUI"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
pageEncoding="EUC-KR"%>
<%@include file="includeLoginSession.jsp"%>
<%@include file="includeVoteSession.jsp"%>
<%
	// log start
	StringBuffer log = new StringBuffer();
	System.out.println("<vote.jsp>");
	// log end
	
	int chkDuplication = convertToInt(session.getAttribute(id));
	
	// log start
	log.append("* chkDuplication : ").append(chkDuplication).append("\n");
	System.out.println(log);
	log.delete(0, log.length());
	// log end

	if(id == null) {
		JOptionPane.showMessageDialog(null, "�α��� ���°� �ƴմϴ�. ���������� �α��� ���ּ���.", "���̵� ����", 0);
		response.sendRedirect("voteForm.jsp");
	} else if(chkDuplication == 1) {
		JOptionPane.showMessageDialog(null, "�̹� ��ǥ�ϼ̽��ϴ�.", "�ߺ� ��ǥ ����", 0);
		response.sendRedirect("voteForm.jsp");
	} else {	
		String menu = request.getParameter("menu");
		int menuCount = convertToInt(session.getAttribute(menu)) + 1;
		
		// log start
		log.append("* menu : ").append(menu).append("\n")
		.append("* menuCount : ").append(menuCount).append("\n");
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		session.setAttribute(menu, menuCount);
		session.setAttribute(id, 1);
		response.sendRedirect("voteResult.jsp");	
	}
%>