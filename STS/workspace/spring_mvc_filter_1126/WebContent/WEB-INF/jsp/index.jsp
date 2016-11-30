<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="article">
	<div id="header2">
		<h1>uri : jQuery :</h1>
		<p id="time">2016. 6. 1.</p>
	</div>
	<div id="content">
		Admin Page!
		<c:choose>
			<c:when test="${sessionScope.uid==null }">
				<a href="loginform">로그인</a>
			</c:when>
			<c:otherwise>
				<a href="../logout">로그아웃</a>
			</c:otherwise>
		</c:choose>
		<a href="admin/manage">관리자.</a>
		<a href="admin/adminPage">마이 관리자</a>
	</div>
</div>