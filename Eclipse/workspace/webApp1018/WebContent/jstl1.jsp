<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--taglib 지시어를 사용해서 core 태그의 사용을 선언한다. --%>
<%
	String[] movieList = { "워낭소리", "트랜스포머2", "터미네이터 4" };
	request.setAttribute("movieList", movieList);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title></title>
</head>
<body>
	영화 리스트 :
	<ul>
		<c:forEach var="movie" items="${movieList}">
			<li>${movie}</li>
			<%-- 
			   items는 배열이나 콜렉션 객체를 지원한다.
 			   var에 선언된 변수에 배열이나 콜렉션에서 추출한 객체가 저장된다.
  			 --%>
		</c:forEach>
	</ul>
</body>
</html>