<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex1.jsp</title>
<script>
	// 웹페이지에 있는 모든 내용(dom, 이미지, 동영상) 로드된 시점에서
	// 발생되는 이벤트 ***
	// 돔의 동작을 수행...
	window.onload=function () {
		// NodeList를 반환 한다. 요소 집합(배열 취급)
		var divs = document.getElementsByTagName("div");
		alert("div의 노드 수 : " + divs.length);
		console.log("div의 노드 수 : " + divs.length);
		for(var i = 0; i < divs.length; i++) {
			// 집합 요소는 배열이기 때문에 배열의 인덱스로 접근
			// divs[0] -> 1 div
			divs[i].style.backgroundColor='yellow';
		}
	};
</script>
</head>
<body>
	<div>TODO write content</div>
	<div>TODO write content</div>
	<div>TODO write content</div>
	<div>TODO write content</div>
	<div>TODO write content</div>
</body>
</html>