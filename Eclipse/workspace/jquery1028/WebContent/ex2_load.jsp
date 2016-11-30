<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex2_load.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	// 내가 한거. 아래는 강사님이 하신거.
// 	$(function() {
// 		$('#load1').click(function(){
// 			$('#new-projects').load('ex2_loadData.jsp?num=Click1')
// 		});
// 		$('#load2').click(function(){
// 			$('#new-projects').load('ex2_loadData.jsp?num=Click2')
// 		});
// 	});
	// ----------------------------------------
	
	$(document).ready(function() {
		// menu의 자식 클래스들을 모두 집합요소 : button들
		var $menu = $(".menu > input");
		$menu.click(function() {
			// 값
			var $val = $(this).val();
			// Ajax로 서버로 전송해서 데이터의 구분, Click이냐 else냐
			// 서버측 데이터에서 li요소만 callback받겟다는 것.
			$('#new-projects').load("ex2_loadData.jsp?num=" + $val + " li", function(resp, status, xhr) {
// 				alert(resp);
// 				alert(status);
// 				alert(xhr.statusText); // OK
				if(status == "error") {
					var msg = "error : ";
					$("#error").html(msg + xhr.status + " " + xhr.statusText);
				}
			});
		});
	});
</script>
</head>
<body>
	<div class="menu">
		<input type="button" value="Click1" id="load1" />
		<input type="button" value="Click2" id="load2" />
	</div>
	<b>Projects : </b>
	<ol id="new-projects"></ol>
</body>
</html>