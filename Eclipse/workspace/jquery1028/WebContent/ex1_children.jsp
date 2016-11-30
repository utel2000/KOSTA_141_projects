<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex1_children.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	$(function() {
		var $node1 = $('div').children().css('color', 'red');
		$('span').append($node1.size());
		// 자식 노드 중에서 1번째 노드를 찾아서 색상을 변경...
		var $nodev = $node1.eq(1);
		$nodev.css("background-color", "orange");
	});
</script>
</head>
<body>
	<div>
		<p> 1. One </p>
		<h1> 2. Two </h1>
		<h2> 3. Three </h2>
		<h3> 4. Four </h3>
		<h4> 5. Five </h4>
		<h5> 6. Six </h5>
	</div>
	<span>자식 노드 수 : </span>
</body>
</html>