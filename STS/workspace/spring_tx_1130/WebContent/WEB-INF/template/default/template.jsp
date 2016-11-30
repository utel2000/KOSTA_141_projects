<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>template.jsp</title>
<link rel="stylesheet" type="text/css" href="resources/css/basic.css"/>
<link rel="stylesheet" href="resources/css/style.css" type="text/css"/>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script src="resources/js/basic.js"></script>
<script src="resources/js/vote.js"></script>
</head>
<body>
	<div id="wrap">
		<tiles:insertAttribute name="header"/>
		<div id="navigation">
			<tiles:insertAttribute name="menu"/>
		</div>
		<!-- body는 개발자가 제작하고 나머진 미리 만들어둔 template -->
		<tiles:insertAttribute name="body"/>
		<tiles:insertAttribute name="footer"/>
	</div>
</body>
</html>