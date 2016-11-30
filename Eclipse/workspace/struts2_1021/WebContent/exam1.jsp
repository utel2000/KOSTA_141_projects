<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>exam1.jsp</title>
<script>
	var xhr = null;
	function operRes() {
		if(window.ActiveXObject) {
			xhr = new ActiveXObject("Microsoft.XMLHTTP");
		}else{
			xhr = new XMLHttpRequest();
		}
		xhr.onreadystatechange = view;
		var num1 = document.getElementById("num1").value;
		var num2 = document.getElementById("num2").value;
		var cho = document.getElementById("cho").value;
		xhr.open("get", "operRes?num1="+num1+"&num2="+num2+"&cho="+cho, true);
		xhr.send(null);
	}
	function view() {
		if(xhr.readyState === 4) {
			if(xhr.status === 200) {
				var target = document.getElementById("target");
				target.innerHTML = xhr.responseText;
			}
		}
	}
</script>
</head>
<body>
	<input type="number" name="num1" id="num1">
	<select name="cho" id="cho">
		<option value="">����</option>
		<option value="0">+����</option>
		<option value="1">-����</option>
		<option value="2">x����</option>
		<option value="3">%����</option>
	</select>
	<input type="number" name="num2" id="num2">
	<input type="button" value="����ϱ�" onclick="operRes()">
	<div id="target"></div>
</body>
</html>