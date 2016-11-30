<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>exam_Bean.jsp</title>
<script>
	$(function() {
		$('#btn_confirm').click(function() {
			$.ajax({
				url: "exam_BeanResult.jsp",
				type: "post",
				data: {
					choice: $('#select_choice').val()
				},
				success: function(data) {
					$('#div_result').html(data)
				}
			});
		});
	});
</script>
</head>
<body>
	<div>
		<form method="post" action="exam_BeanResult.jsp">
			<select name="choice" id="select_choice">
				<option value="typeA">A</option>
				<option value="typeB">B</option>
				<option value="typeC">C</option>
			</select>
			<input type="button" id="btn_confirm" value="확인" />
		</form>
	</div>
	<div id="div_result"></div>
</body>
</html>