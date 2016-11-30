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
	
	// 폼에서 전송되어온 파라미터 값을 처리한 후 VO에 저장.
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
	if(imgName != null) {// 갱신 했을 경우
		vo.setImg(imgName);
	}else { // 갱신 하지 않았을 경우 기존 이미지 이름을 가져감
		vo.setImg(oriName);
	}
	
	System.out.println("이미지 : "+vo.getImg());
	System.out.println("제목 : "+vo.getSub());

		SBoardDao.getDao().update(vo);
		response.sendRedirect("detail.jsp?num="+vo.getNum());
%>