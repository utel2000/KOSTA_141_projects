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
// 		System.out.println("해당 경로의 파일을 삭제했습니다.");
// 		System.out.println("Path : " + f.getAbsolutePath());
// 	}
// 	response.sendRedirect("list.jsp");

	SBoardDao.getDao().delete();
	File f = new File(application.getRealPath("img"));
 	File[] fs = f.listFiles();
 	for(File e : fs){
		System.out.println("삭제파일 : " + e);
 		e.delete();
	}
	response.sendRedirect("list.jsp");
%>