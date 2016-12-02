<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>index2.jsp</title>
<script>
	var wsUri = "ws://localhost/spring_websocket_1202/websocket/echo";
	function init() {
		output = document.getElementById("output");
	};
	function send_message() {
		websocket = new WebSocket(wsUri);
		// ó�� ����� �� �߻��Ǵ� �̺�Ʈ
		websocket.onopen = function(evt) {
			console.log("onopen: " + evt);
			onOpen(evt);
		};
		// ������ ���� ���� ���� ��
		websocket.onmessage = function(evt) {
			console.log("onmessage: " + evt);
			onMessage(evt);
		};
		// ����...
		websocket.onerror = function(evt) {
			onError(evt);
		};
	}; // end function
	function onOpen(evt) {
		writeToScreen("Connected to Endpoint!");
		doSend(textID.value);
	};
	function onMessage(evt) {
		writeToScreen("Message Received: " + evt.data);
	};
	function onError(evt) {
		writeToScreen("ERROR: " + evt.data);
	};
	function doSend(message) {
		writeToScreen("Message Sent: " + message);
		// ����� �������� �޼����� ����
		websocket.send(message);
		websocket.close();
	};
	function writeToScreen(message) {
		var pre = document.createElement("p");
		pre.style.wordWrap = "break-word";
		pre.innerHTML = message;
		output.appendChild(pre);
		output.scrollTop = output.scrollHeight;
	};
</script>
</head>
<body>
	<h1 style="text-align: center;">MyWebSocket!</h1>
	<br />
	<div style="text-align: center;">
		<form action="">
			<input type="button" value="send" onclick="send_message()" />
			<input type="text" id="textID" name="message" value="" onsubmit="return false"/>
		</form>
	</div>
	<div id="output"></div>
</body>
</html>