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
	// cos.jar���� �����ϴ� ���� ���ε� ��ü�� ����ؼ�
	// ������ ��û�� ���ӹ޴´�. request����
	// ���ε� �� ������ path��ο� ����, path����
	// ������ ���ε� �ϱ� ���� ����, 5*1024*1024
	// ���ڵ� ó��
	// new DefaultFileRenamePolicy() : �ߺ��� ������ ��� �̸��� �ڵ�����.
	MultipartRequest multi = new MultipartRequest(request, path, 5*1024*1024, "euc-kr", new DefaultFileRenamePolicy());
	String name = multi.getParameter("name");
	// 	String name = request.getParameter("name");
		System.out.println("name : " + name);
	// ���ε� �� ������ �̸� ���
	String fileName = multi.getFilesystemName("upfile");
	%><p><%= path %></p>
	<img src = "upfolder/<%= fileName %>"> 
</body>
</html>