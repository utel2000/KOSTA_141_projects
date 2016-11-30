<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% // fileUpload.jsp
	response.setHeader("Access-Control-Allow-Origin", "*");
	response.setHeader("Access-Control-Allow-Headers", "X-File-Name");
	if (!"OPTIONS".equals(request.getMethod().toUpperCase())) {
		String fileName = request.getHeader("X-File-Name");
		fileName = java.net.URLDecoder.decode(fileName, "UTF-8");
		System.out.println(fileName);
		String ext = fileName.substring(fileName.lastIndexOf("."));
		String uploadFileName = fileName.substring(0, fileName.lastIndexOf("."))
				+ "_" + System.currentTimeMillis() + ext;
		System.out.println("read "+application.getRealPath("/upload"));
		File uploadDir = new File(application.getRealPath("/upload"));
		System.out.println("--" + uploadDir.getAbsolutePath());
		if(!uploadDir.exists()) {
			uploadDir.mkdir();
		}
		File uploadFile = new File(uploadDir, uploadFileName);
		BufferedInputStream bis = new BufferedInputStream(request.getInputStream());
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(uploadFile));
		int size = 0;
		while ((size = bis.read()) != -1) {
			bos.write(size);		
		}
		bos.flush();
		bos.close();
		bis.close();
		String fileUrl = application.getContextPath() + "/upload/" + uploadFileName;
		out.write("<a href='" + fileUrl + "'>" + fileName + "</a>");
	}
%>