<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>exam4.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	// trigger 이벤트 강제 발생
	$(document).ready(function() {
		// 이벤트
		$('h1').click(function(event, data1, data2) {
			$(this).html(function(index, html) {
				return html + "*";
			});
		});
		// 1초마다 함수를 실행
		var n = 0;
		var inter = setInterval(function() {
			if(n == 50) clearInterval(inter);
// 			$('h1').last().trigger('click');
			n++;
		}, 1000);
	});
</script>
</head>
<body>
	<h1>시작(수동): </h1>
	<h1>시작(자동): </h1>
</body>
</html>