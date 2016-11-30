<%@page import="dao.SMemoDao"%>
<%@page import="vo.SMemoVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 서블릿 영역이며, DAO에게 폼의 데이터를 처리하기 위한 영역.
	request.setCharacterEncoding("euc-kr");
	// 폼에서 전송되어온 파라미터 값을 처리한 후 VO에 저장.
	// (sub, writer, pwd, cont, reip)
	SMemoVO vo = new SMemoVO();
	vo.setTitle(request.getParameter("title"));
	vo.setWriter(request.getParameter("writer"));
	vo.setMemo(request.getParameter("memo"));
	vo.setReip(request.getParameter("reip"));
	// DAO를 생성한 후 값을 전달해본다. SBoardDao.getDao() [ 싱글톤으로 생성 ]
	SMemoDao.getDao().save(vo);
	response.sendRedirect("success.jsp");
%>