<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>exam1_2.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	$(function() {
		var n1v = parseInt($('#n1').val());
		var n2v = parseInt($('#n2').val());
		var n3v = n1v + n2v;
		$('#plus').click(function() {
			$('#n3').val(n3v);
		});
	});
</script>
</head>
<body>
	<div>
		<input type="text" name="n1" id="n1" />
		<input type="button" name="plus" id="plus" value="+" />
		<input type="text" name="n2" id="n2" />
		 =
		<input type="text" name="n3" id="n3" />
	</div>
</body>
</html>