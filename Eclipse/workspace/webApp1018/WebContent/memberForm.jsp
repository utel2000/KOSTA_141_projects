<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>member.jsp</title>
<style>
	table, th, td { border: 1px dotted; }
</style>
<script>
	var xhr;
	function idCheck() {
		if (window.ActiveXObject) {
			xhr = new ActiveXObject("Microsoft.XMLHTTP");
		} else {
			xhr = new XMLHttpRequest();		
		}
		xhr.onreadystatechange = view;
		var idv = document.getElementById("id").value;
		xhr.open("get", "ex1_idChk.jsp?id="+idv, true);
		xhr.send(null);
	}
	function view() {
		if(xhr.readyState === 4) {
			if(xhr.status === 200) {
				var target = document.getElementById("id_target");
				// alert(xhr.responseText;	);
				target.innerHTML = xhr.responseText;
			}
		}
	}
</script>
</head>
<body>
	<div>
		<!-- autocomplete="off" : �Ӽ����� ĳ�� ���� �����Ѵ�. (�⺻�� on.) -->
		<form method="post" action="memberAdd.jsp" autocomplete="off">
			 <table>
			 	<tr>
			 		<th>���̵�</th>
					<td>
						<!-- onkeyup="" : Ű�� �� �� �߻��ϴ� �̺�Ʈ. -->
<!-- 						<input type="text" maxlength="10" name="id" id="id" onkeyup="idCheck()"> -->
						<input type="text" maxlength="10" name="id" id="id">
						<!-- �񵿱��(Ajax) -->
						<input type="button" value="�ߺ�Ȯ��" onclick="idCheck()">
					</td>
				</tr>
				<tr>
					<td colspan="2"><p id="id_target"></p></td>
				</tr>
				<tr>
					<th>��й�ȣ</th>
					<td><input type="password" name="pwd" id="pwd"></td>
				</tr>
				<tr>
			 		<th>�̸�</th>
					<td><input type="text" name="name" id="name"></td>
				</tr>
				<tr>
						<td colspan="2">
						<!-- ����� -->
						<input type="submit" value="����ó��">
						</td>
				</tr>
			 </table>
		</form>
	</div>
</body>
</html>