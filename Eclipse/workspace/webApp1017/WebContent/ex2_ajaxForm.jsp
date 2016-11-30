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
	// 전역변수 : xhr (XMLHTTPREQUEST 객체를 저장할 변수)
	var xhr;
	function ajaxSend() {
		if(window.ActiveXObject) { // ie 10이전.
			xhr = new ActiveXObject("Microsoft.XMLHTTP");
		} else { // ie 10이상 cross포함. (cross는 ie가 아닌 브라우저)
			xhr = new XMLHttpRequest();
		}
		// callback함수 지정
		xhr.onreadystatechange = view;
		// param
		var msg = document.getElementById("msg").value;
		// 준비단계 method, url+param, 비동기식은 true
		xhr.open("get", "ex2_serverData.jsp?msg="+msg, true);
		// server전송
		xhr.send(null); // get일 경우 null, post일 경우 param
	}
	function view() {
		// 서버 통신은 1, 2, 3, 4단계를 가지는데
		// 4번까지 오면 서버가 완전히 응답한 단계
		if(xhr.readyState === 4) {
			// 서버의 결과가 정상적인 처리 결과 200
			// 아니면 500이나 404와 같은 오류 발생.
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
				<input type="button" value="Ajax전송" onclick="ajaxSend()"><br/>
				<input type="submit" value="send">
			</form>
		</div>
		<div id="target"></div>
	</div>
</body>
</html>