<%@page import="dao.SBoardDao"%>
<%@page import="vo.SBoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// ���� �����̸�, DAO���� ���� �����͸� ó���ϱ� ���� ����.
	request.setCharacterEncoding("euc-kr");
	// ������ ���۵Ǿ�� �Ķ���� ���� ó���� �� VO�� ����.
	// (sub, writer, pwd, cont, reip)
	SBoardVO vo = new SBoardVO();
	vo.setSub(request.getParameter("sub"));
	vo.setWriter(request.getParameter("writer"));
	vo.setPwd(request.getParameter("pwd"));
	vo.setCont(request.getParameter("cont"));
	vo.setReip(request.getParameter("reip"));
	// DAO�� ������ �� ���� �����غ���. SBoardDao.getDao() [ �̱������� ���� ]
	SBoardDao.getDao().save(vo);
	response.sendRedirect("success.jsp");
%>