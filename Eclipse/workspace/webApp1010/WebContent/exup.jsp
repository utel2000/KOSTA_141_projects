<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>exup.jsp</title>
</head>
<body>
	<% 
	String path = application.getRealPath("upfolder");
	System.out.println(path);
	// cos.jar에서 제공하는 파일 업로드 객체를 사용해서
	// 지정한 요청을 위임받는다. request인자
	// 업로드 된 파일을 path경로에 복사, path인자
	// 파일을 업로드 하기 위한 버퍼, 5*1024*1024
	// 인코딩 처리
	// new DefaultFileRenamePolicy() : 중복된 파일일 경우 이름을 자동변경.
	MultipartRequest multi = new MultipartRequest(request, path, 5*1024*1024, "euc-kr", new DefaultFileRenamePolicy());
	String name = multi.getParameter("name");
	// 	String name = request.getParameter("name");
		System.out.println("name : " + name);
	// 업로드 된 파일의 이름 얻기
	String fileName = multi.getFilesystemName("upfile");
	%><p><%= path %></p>
	<img src = "upfolder/<%= fileName %>"> 
</body>
</html>