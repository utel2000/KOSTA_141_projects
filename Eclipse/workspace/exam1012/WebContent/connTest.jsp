<%@page import="dao.SMemoDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- 
	connTest.jsp
	��û�� ���� �� SBoardDao�� addDemo�޼��带 ȣ���Ͽ�
	JNDI�� ������ context.xml�� ����ؼ� DataSource��ü��
	Connection�� ����� ����Ǵ��� �׽�Ʈ�Ѵ�.
--%>
<%
	SMemoDao dao = SMemoDao.getDao();
	dao.addDemo();
%>