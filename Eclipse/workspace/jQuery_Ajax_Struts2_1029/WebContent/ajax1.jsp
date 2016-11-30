<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ajax1.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	/*
		url : ����� ���ϰ��� �ϴ� URL�ּҸ� �Է��մϴ�.(�ʼ� �Է� ��)
		data : ������ ���� �����͸� �Է��մϴ�.
		type : GET, POST���� ��� ��� �����մϴ�.
		dataType(= data(?)) : ����� ����� �Ѿ�� �������� ������ �����մϴ�. (text, HTML, JSON, XML ��) 
		success(data) : ��� ������ ȣ�� �ؾ��ϴ� �Լ��� �����մϴ�.(xhr.readyStatus==4, xhr.status==200)
						�Ű������� ����� �Ѿ�� �����͸� �޽��ϴ�.
		error : ��� ���н� ȣ�� �ؾ��ϴ� �Լ��� �����մϴ�.
		complete : ��� ���� ���ο� ������� ����� ���� �� ȣ�� �ؾ��ϴ� �Լ��� �����մϴ�.
		beforeSend : ��� ���� ȣ�� �ؾ��ϴ� �Լ��� �����մϴ�.
		async : �񵿱�(true), ����(false) ���θ� �����մϴ�.
	*/
	$(document).ready(function() {
		// Ajax�ʱ� ������ formŸ������ �����Ѵ�. (for POST���)
		$.ajaxSetup({
			contentType:'application/x-www-form-urlencoded;charset=euc-kr'
		});
		
		$('#btn1').click(function() {
			var n = $('#name').val();
			var on = $('#orderNum').val();
			console.log("Name"+n);
			console.log("orderNum"+n);
			$.ajax({
				url: "ex1_server",
				type: "post",
				data: {name: n, orderNum: on},
				success: function (data, status) {
					alert(data + "," + status);
					$('#res').html(data);
				},
				error: function(e) {
					alert(e);
				}
			});
		});
	});
</script>
</head>
<body>
	<h1>�ֹ�Ȯ��!</h1>
	<input type="text" name="name" id="name" value="" /><br />
	<input type="text" name="orderNum" id="orderNum" /><br />
	<input type="button" value="Ȯ��" id="btn1" /><br />
	<div id="res">Status : </div>
</body>
</html>