<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- ex1_idChk.jsp --%>
<%-- �ǹ� ���� ������ �������ִ� ��. --%>
<%@ page trimDirectiveWhitespaces="true"%> 
<jsp:useBean id="vo" class="vo.MemberDemoVO"/>
<jsp:setProperty property="id" name="vo" param="id"/>
<%
	// log start
	StringBuffer log = new StringBuffer();
	System.out.println("<ex1_idChk.jsp>");
	log.append("[log] vo.getId() : ").append(vo.getId()).append("\n");
	System.out.println(log);
	log.delete(0, log.length());
	// log end

	request.setCharacterEncoding("euc-kr");
	// 	String idv = request.getParameter("id");
	int res = MemberDAO.getDao().checkId(vo.getId());
	
	// log start
	System.out.println("<ex1_idChk.jsp>");
	log.append("[log] res : ").append(res).append("\n");
	System.out.println(log);
	log.delete(0, log.length());
	// log end
	
	String msg = "";
	if (res > 0) {
		msg = "<h2 style='color: red;'>������� ���̵��Դϴ�.</h2>";
	} else {
		msg = "<h2 style = 'color: blue'>��밡���� ���̵��Դϴ�.</h2>";
	}
	
	// log start
	log.append("[log] msg : ").append(msg).append("\n");
	System.out.println(log);
	log.delete(0, log.length());
	// log end
%>
<%=msg%>