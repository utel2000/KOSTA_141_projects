<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>login.jsp</title>
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
		xhr.open("get", "idchk.kosta?cmd=idchk&id="+idv, true);
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
<style>
	div { text-align: center; }
</style>
</head>
<body>
	<div>
		<form method="post" action="login.kosta">
			<input type="hidden" name="cmd" value="login">
			아 이 디 : <input type="text" id="id" name="id" onkeyup="idCheck()"><br/>
			비밀번호 : <input type="password" id="pwd" name="pwd"><br/>
			<div id="id_target"></div> 
			<input type="submit" value="로그인">
		</form>
	</div>
</body>
</html>