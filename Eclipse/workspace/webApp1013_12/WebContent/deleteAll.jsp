<%@page import="java.io.File"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.SBoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
// 	ArrayList<String> imgName = SBoardDao.getDao().findAllImgName();
// 	SBoardDao.getDao().delete();
// 	String path = null;
// 	File f = null;
// 	for (String e : imgName) {
// 		path = application.getRealPath("img") + "\\" + e;
// 		f = new File(path);
// 		f.delete();
// 		System.out.println("�ش� ����� ������ �����߽��ϴ�.");
// 		System.out.println("Path : " + f.getAbsolutePath());
// 	}
// 	response.sendRedirect("list.jsp");

	SBoardDao.getDao().delete();
	File f = new File(application.getRealPath("img"));
 	File[] fs = f.listFiles();
 	for(File e : fs){
		System.out.println("�������� : " + e);
 		e.delete();
	}
	response.sendRedirect("list.jsp");
%>