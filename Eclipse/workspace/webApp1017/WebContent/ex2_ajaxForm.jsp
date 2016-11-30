<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex2_ajaxForm.jsp</title>
<style>
	#wrap { width: 300px; margin: auto; border: 1px dotted; }
</style>
<script>
	// �������� : xhr (XMLHTTPREQUEST ��ü�� ������ ����)
	var xhr;
	function ajaxSend() {
		if(window.ActiveXObject) { // ie 10����.
			xhr = new ActiveXObject("Microsoft.XMLHTTP");
		} else { // ie 10�̻� cross����. (cross�� ie�� �ƴ� ������)
			xhr = new XMLHttpRequest();
		}
		// callback�Լ� ����
		xhr.onreadystatechange = view;
		// param
		var msg = document.getElementById("msg").value;
		// �غ�ܰ� method, url+param, �񵿱���� true
		xhr.open("get", "ex2_serverData.jsp?msg="+msg, true);
		// server����
		xhr.send(null); // get�� ��� null, post�� ��� param
	}
	function view() {
		// ���� ����� 1, 2, 3, 4�ܰ踦 �����µ�
		// 4������ ���� ������ ������ ������ �ܰ�
		if(xhr.readyState === 4) {
			// ������ ����� �������� ó�� ��� 200
			// �ƴϸ� 500�̳� 404�� ���� ���� �߻�.
			if(xhr.status === 200) {
				var target = document.getElementById("target");
				target.style.width="100px;";
				target.style.backgroundColor="blue";
				target.style.color="#000000";
				target.innerHTML=xhr.responseText;
			}
		}
	}
</script>
</head>
<body>
	<div id="wrap">
		<div id="f">
			<form method="post" action="test.jsp">
				MSG : <input type="text" name="msg" id="msg">
				<input type="button" value="Ajax����" onclick="ajaxSend()"><br/>
				<input type="submit" value="send">
			</form>
		</div>
		<div id="target"></div>
	</div>
</body>
</html>