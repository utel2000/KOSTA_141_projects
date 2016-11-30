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
		<!-- autocomplete="off" : 속성들의 캐시 값을 삭제한다. (기본이 on.) -->
		<form method="post" action="memberAdd.jsp" autocomplete="off">
			 <table>
			 	<tr>
			 		<th>아이디</th>
					<td>
						<!-- onkeyup="" : 키를 뗄 때 발생하는 이벤트. -->
<!-- 						<input type="text" maxlength="10" name="id" id="id" onkeyup="idCheck()"> -->
						<input type="text" maxlength="10" name="id" id="id">
						<!-- 비동기식(Ajax) -->
						<input type="button" value="중복확인" onclick="idCheck()">
					</td>
				</tr>
				<tr>
					<td colspan="2"><p id="id_target"></p></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pwd" id="pwd"></td>
				</tr>
				<tr>
			 		<th>이름</th>
					<td><input type="text" name="name" id="name"></td>
				</tr>
				<tr>
						<td colspan="2">
						<!-- 동기식 -->
						<input type="submit" value="가입처리">
						</td>
				</tr>
			 </table>
		</form>
	</div>
</body>
</html>