<%@page import="dao.SBoardDao"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="vo.SBoardVO"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- update.jsp -->
<%
	request.setCharacterEncoding("euc-kr");
	String path = application.getRealPath("img");
	System.out.println(path);

	MultipartRequest multi =
			new MultipartRequest(request, path, 5*1024*1024,
					"euc-kr",
					new DefaultFileRenamePolicy());
	
	// ������ ���۵Ǿ�� �Ķ���� ���� ó���� �� VO�� ����.
	// (num, sub, writer, pwd, cont, reip)
	SBoardVO vo = new SBoardVO();
	vo.setNum(Integer.parseInt(multi.getParameter("num")));
	vo.setSub(multi.getParameter("sub"));
	vo.setWriter(multi.getParameter("writer"));
	vo.setPwd(multi.getParameter("pwd"));
	vo.setCont(multi.getParameter("cont"));
	vo.setReip(multi.getParameter("reip"));
	String imgName = multi.getFilesystemName("upfile");
	String oriName = multi.getParameter("orifn");
	vo.setImg(imgName);
	out.println("UpFN : "+imgName);
	if(imgName != null) {// ���� ���� ���
		vo.setImg(imgName);
	}else { // ���� ���� �ʾ��� ��� ���� �̹��� �̸��� ������
		vo.setImg(oriName);
	}
	
	System.out.println("�̹��� : "+vo.getImg());
	System.out.println("���� : "+vo.getSub());

		SBoardDao.getDao().update(vo);
		response.sendRedirect("detail.jsp?num="+vo.getNum());
%>