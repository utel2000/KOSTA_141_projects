<%@page import="java.io.File"%>
<%@page import="dao.SBoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
// 	int num = Integer.parseInt(request.getParameter("num"));
// 	String imgName = SBoardDao.getDao().findDeleteImgName(num);
// 	String path = application.getRealPath("img") + "\\" + imgName;
// 	SBoardDao.getDao().delete(num);
// 	File f = new File(path);
// 	f.delete();
// 	System.out.println("�ش� ����� ������ �����߽��ϴ�.");
// 	System.out.println("Path : " + f.getAbsolutePath());
// 	response.sendRedirect("list.jsp");
	
	int num = Integer.parseInt(request.getParameter("num"));
	// ���ϼ��� ������ �ʿ��� �̹��� �̸��� ����.
	String fn = request.getParameter("fn");
	// ���� ���
	String path = application.getRealPath("img")+"/"+fn;
	// ���� ��ü�� ����
	File f = new File(path);
	if(f.exists()){
		f.delete();
	}
	SBoardDao.getDao().delete(num);
	response.sendRedirect("list.jsp");
%>