<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--taglib ���þ ����ؼ� core �±��� ����� �����Ѵ�. --%>
<%
	String[] movieList = { "�����Ҹ�", "Ʈ��������2", "�͹̳����� 4" };
	request.setAttribute("movieList", movieList);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title></title>
</head>
<body>
	��ȭ ����Ʈ :
	<ul>
		<c:forEach var="movie" items="${movieList}">
			<li>${movie}</li>
			<%-- 
			   items�� �迭�̳� �ݷ��� ��ü�� �����Ѵ�.
 			   var�� ����� ������ �迭�̳� �ݷ��ǿ��� ������ ��ü�� ����ȴ�.
  			 --%>
		</c:forEach>
	</ul>
</body>
</html>