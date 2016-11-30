<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="euc-kr">
<head>
<title>WikiBee</title>
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
	padding: 0px
}
.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 70%;
	height: 366px;
	margin: auto;
}
.se {
	margin-top: 5px;
}
#mainnav {
	background-Color: #FACC2E;
	border: 0px;
}
#menu {
	background-Color: #ECBF2B;
	color: black
}
</style>

<script>
	$(document).ready(function() {
		$.ajax({
			url: "schedule",
			type: "post",
			error: function(e){
				alert(e);
			}
		});
	});
</script>

</head>
<body>
	<div id="header">
		<nav id=mainnav class="navbar navbar-inverse" style="height: 100px">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="mainpage"><img
						src="img/wikibee.png" style="width: 150px"></a>
				</div>

				<s:if test="#session.m_id==null">
					<ul class="nav navbar-nav">
						<li class="active"><a id="menu" href="loginForm"
							style="padding-top: 40px; margin-right: 5px; height: 100px">백과사전</a></li>
						<li class="active"><a id="menu" href="loginForm"
							style="padding-top: 40px; margin-right: 5px; height: 100px">지식포럼</a></li>
					</ul>
				</s:if>
				<s:else>
					<ul class="nav navbar-nav">
						<li class="active"><a id="menu" href="wikiMainForm"
							style="padding-top: 40px; margin-right: 5px; height: 100px">백과사전</a></li>
						<li class="active"><a id="menu" href="forumList"
							style="padding-top: 40px; margin-right: 5px; height: 100px">지식포럼</a></li>
					</ul>
				</s:else>

				<ul class="nav navbar-nav navbar-right">

					<!-- 로그인 전 -->
					<s:if test="#session.m_id==null">
						<li><a href="memberjoin"
							style="color: black; padding-top: 40px;"> <span
								class="glyphicon glyphicon-user"></span> Sign Up
						</a></li>
						<li><a href="loginForm"
							style="color: black; padding-top: 40px"> <span
								class="glyphicon glyphicon-log-in"></span> Login
						</a></li>
					</s:if>
					<s:else>
						<!-- 로그인 후 -->
						<s:if test="#session.m_num==1">
							<li><a href="managerList"> <span
									class="glyphicon glyphicon-user"> </span>
									${sessionScope["m_id"]}님
							</a></li>
							<li><a href="logout"> <span
									class="glyphicon glyphicon-log-in"> </span> Logout
							</a></li>
						</s:if>
						<s:else>
							<li><a href="mypage?m_id=${sessionScope['m_id']}"> <span
									class="glyphicon glyphicon-user"> </span>
									${sessionScope["m_id"]}님
							</a></li>
							<li><a href="logout"> <span
									class="glyphicon glyphicon-log-in"></span> Logout
							</a></li>
						</s:else>
					</s:else>
				</ul>
			</div>
		</nav>
	</div>