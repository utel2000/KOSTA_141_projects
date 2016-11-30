<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="dao.SBoardDao"%>
<%@page import="vo.SBoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 서블릿 영역이며, DAO에게 폼의 데이터를 처리하기 위한 영역.
	request.setCharacterEncoding("euc-kr");
	String path = application.getRealPath("img");
	System.out.println(path);

	MultipartRequest multi =
			new MultipartRequest(request, path, 5*1024*1024,
					"euc-kr",
					new DefaultFileRenamePolicy());
	
	// 폼에서 전송되어온 파라미터 값을 처리한 후 VO에 저장.
	// (sub, writer, pwd, cont, reip, img)
	SBoardVO vo = new SBoardVO();
	vo.setSub(multi.getParameter("sub"));
	vo.setWriter(multi.getParameter("writer"));
	vo.setPwd(multi.getParameter("pwd"));
	vo.setImg(multi.getFilesystemName("upfile"));
	vo.setCont(multi.getParameter("cont"));
	vo.setReip(multi.getParameter("reip"));
	// DAO를 생성한 후 값을 전달해본다. SBoardDao.getDao() [ 싱글톤으로 생성 ]
	SBoardDao.getDao().save(vo);
	response.sendRedirect("list.jsp");
%>