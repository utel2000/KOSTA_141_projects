<%@page import="dao.SMemoDao"%>
<%@page import="vo.SMemoVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// ���� �����̸�, DAO���� ���� �����͸� ó���ϱ� ���� ����.
	request.setCharacterEncoding("euc-kr");
	// ������ ���۵Ǿ�� �Ķ���� ���� ó���� �� VO�� ����.
	// (sub, writer, pwd, cont, reip)
	SMemoVO vo = new SMemoVO();
	vo.setTitle(request.getParameter("title"));
	vo.setWriter(request.getParameter("writer"));
	vo.setMemo(request.getParameter("memo"));
	vo.setReip(request.getParameter("reip"));
	// DAO�� ������ �� ���� �����غ���. SBoardDao.getDao() [ �̱������� ���� ]
	SMemoDao.getDao().save(vo);
	response.sendRedirect("success.jsp");
%>