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
// 	System.out.println("해당 경로의 파일을 삭제했습니다.");
// 	System.out.println("Path : " + f.getAbsolutePath());
// 	response.sendRedirect("list.jsp");
	
	int num = Integer.parseInt(request.getParameter("num"));
	// 파일선택 삭제시 필요한 이미지 이름을 받음.
	String fn = request.getParameter("fn");
	// 삭제 경로
	String path = application.getRealPath("img")+"/"+fn;
	// 파일 객체로 생성
	File f = new File(path);
	if(f.exists()){
		f.delete();
	}
	SBoardDao.getDao().delete(num);
	response.sendRedirect("list.jsp");
%>