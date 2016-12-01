<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title> / 2016. 5. 23.</title>

<link rel="stylesheet" type="text/css" href="resources/css/basic.css" />
<link rel="stylesheet" href="resources/css/style.css" type="text/css" />
<script src="https://code.jquery.com/jquery-2.2.3.min.js" integrity="sha256-a23g1Nt4dtEYOj7bR+vTu7+T8VP13humZFBJNIYoEJo=" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-migrate-1.4.0.min.js" integrity="sha256-nxdiQ4FdTm28eUNNQIJz5JodTMCF5/l32g5LwfUwZUo=" crossorigin="anonymous"></script>
<script src="resources/js/basic.js"></script>
<script src="resources/js/vote.js"></script>

</head>
<body>
	<div id="wrap">
		<tiles:insertAttribute name="header"/>
		 <div id="navigation">
		 	<tiles:insertAttribute name="menu"/>
		 </div>
			<tiles:insertAttribute name="body"/>
		<tiles:insertAttribute name="footer"/>
	</div>
</body>
</html>








