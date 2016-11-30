<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!-- 선언부에서 today란 이름으로
	현재 날짜를 리턴해주는 메서드를 정의 하고
	서비스에서 호출하던지, 해서 뭐가 되었던
	현재 날짜를 출력하시오.
	h3 태그 안에, 색상을 파란색으로. -->
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
		오늘의 날짜 :
		<%=today()%></h3>
</body>
</html>