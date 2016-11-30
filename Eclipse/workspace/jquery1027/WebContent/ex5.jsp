<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex5.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	$(document).ready(function() {
		var resultText = "";
		// , 기준으로 서로 다른 요소를 집합 요소로 생성, $searchEls jQuery변수.
		var $searchEls = $('p, span, div, .simpletext1');
		resultText += "검색된 엘리멘트의 갯수 : "
		+ $searchEls.length + "\n";
		// each는 반복자, 배열요소.each(fn); 배열의 요소를 읽어 들이면서 true
		$searchEls.each(function(idx) {
			// $this - dom객체의 주소, p, span ...
			// 요소선택자.text()함ㅅ는 선택자가 가지고 있는 값을 가져옴.
			resultText += $(this).text() + "\t";
			if(idx % 2 == 0) {
				$(this).css("border", "1px solid pink");
			}
		});
		console.log("Result : " + resultText);
	});
</script>
</head>
<body>
	<span> simple </span>
	<div class="simpletext1"> jQuery </div>
	<div> basic </div>
	<p> example </p>
</body>
</html>