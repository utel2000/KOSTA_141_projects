<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<style>
* {
	border: 0px;
	padding: 0px;
}

.carousel-inner>.item>img, .carousel-inner>.item>a>img {
  	width: 70%;
	height: 366px;
	margin: auto;
}

.se {
	margin-top: 5px;
}
</style>
<script>
	$(function() {
		$('.navbar-inverse').css('background-image', 'url("http://cfile2.uf.tistory.com/image/19237B054BF68D6B0301EC")') 
	});
</script>
</head>
<body>
	<div id="header">
		<nav class="navbar navbar-inverse" >
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">WebSiteName</a>
				</div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">게시판예제 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="nBoardList">페이지처리예제</a></li>
							<li><a href="#">Page 1-2</a></li>
							<li><a href="#">Page 1-3</a></li>
						</ul></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Page 2 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Page 2-1</a></li>
							<li><a href="#">Page 2-2</a></li>
							<li><a href="#">Page 2-3</a></li>
						</ul></li>
					<li><a href="#">Page 3</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<!-- 로그인 전 -->
					<s:if test="#session.loginId==null">
						<li><a href="nBoardForm"> <span class="glyphicon glyphicon-user"></span>
								Sign Up
						</a></li>
						<li><a href="loginForm"> <span
								class="glyphicon glyphicon-log-in"></span> Login
						</a></li>
					</s:if>
					<s:else>
						<!-- 로그인 후 -->
						<li><a href="#"><span class="glyphicon glyphicon-user">
							</span> ${sessionScope["loginId"]}님</a></li>
						<li><a href="logout"> <span
								class="glyphicon glyphicon-log-in"></span> Logout
						</a></li>
					</s:else>
				</ul>
			</div>
		</nav>
	</div>