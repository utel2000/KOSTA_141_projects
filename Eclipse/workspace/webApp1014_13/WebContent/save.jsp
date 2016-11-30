<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="dao.SBoardDao"%>
<%@page import="vo.SBoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// ���� �����̸�, DAO���� ���� �����͸� ó���ϱ� ���� ����.
	request.setCharacterEncoding("euc-kr");
	String path = application.getRealPath("img");
	System.out.println(path);

	MultipartRequest multi =
			new MultipartRequest(request, path, 5*1024*1024,
					"euc-kr",
					new DefaultFileRenamePolicy());
	
	// ������ ���۵Ǿ�� �Ķ���� ���� ó���� �� VO�� ����.
	// (sub, writer, pwd, cont, reip, img)
	SBoardVO vo = new SBoardVO();
	vo.setSub(multi.getParameter("sub"));
	vo.setWriter(multi.getParameter("writer"));
	vo.setPwd(multi.getParameter("pwd"));
	vo.setImg(multi.getFilesystemName("upfile"));
	vo.setCont(multi.getParameter("cont"));
	vo.setReip(multi.getParameter("reip"));
	// DAO�� ������ �� ���� �����غ���. SBoardDao.getDao() [ �̱������� ���� ]
	SBoardDao.getDao().save(vo);
	response.sendRedirect("list.jsp");
%>