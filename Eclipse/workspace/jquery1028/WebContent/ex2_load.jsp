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
	// ���� �Ѱ�. �Ʒ��� ������� �ϽŰ�.
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
		// menu�� �ڽ� Ŭ�������� ��� ���տ�� : button��
		var $menu = $(".menu > input");
		$menu.click(function() {
			// ��
			var $val = $(this).val();
			// Ajax�� ������ �����ؼ� �������� ����, Click�̳� else��
			// ������ �����Ϳ��� li��Ҹ� callback�ްٴٴ� ��.
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