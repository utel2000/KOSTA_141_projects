<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!-- ����ο��� today�� �̸�����
	���� ��¥�� �������ִ� �޼��带 ���� �ϰ�
	���񽺿��� ȣ���ϴ���, �ؼ� ���� �Ǿ���
	���� ��¥�� ����Ͻÿ�.
	h3 �±� �ȿ�, ������ �Ķ�������. -->
<%!
	private String today() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>examToday.jsp</title>
<style>
h3 {
	color: blue
}
</style>
</head>
<body>
	<h3>
		������ ��¥ :
		<%=today()%></h3>
</body>
</html>