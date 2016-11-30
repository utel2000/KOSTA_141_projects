<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>exam1.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<style>
	div {
		width: 600px; height: 200px;
	}
	.textstyle {
		font-size: 14pt; line-height: 20pt; margin: 10px;
	}
</style>
<script>
// < 위에건 내가 한 코드. 아래건 강사님 코드 >
// 	$(function() {
// 		$('div').addClass('textstyle');
// 		var $children = $('div').children();
// 		var idx = 0;
// 		setInterval(function() {
// 			if($.trim($children.eq(idx).text()) == 'five') {
// 				$children.eq(idx).css('background-color', 'purple')
// 			} else {
// 				$children.eq(idx).css('background-color', 'yellow')
// 			}
// 			idx++;
// 		}, 1000);
// 	})
// -------------------------------------

	$(document).ready(function() {
		// div의 자식 Element를 변수 저장.
		// $('div').children() => em, a 등등.
		var $chNode = $('div').children();
		$chNode.css({
			'display': 'block', 'width': '100px', 'height': '30px',
			'float': 'left', 'text-align': 'center' 
		});
		var i = 0;
		var inter = setInterval(function() {
			// 0은 em의 주소
			var $node = $chNode.eq(i);
			// $node.html() -> em안에 html데이터를 가져온 것.
			// 공백은 $.trim으로 처리.
			if($.trim($node.html()) === 'five') {
				$node.css('backgroundColor', 'orange');
			} else {
				$node.css('backgroundColor', 'pink');
			}
			if(i > ($chNode.size())) {
				clearInterval(inter);
			}
			i++;
		}, 1000);
	});
</script>
</head>
<body>
	<!-- five란 단어라면 배경색을 보라색으로 변경하고 다른 노드들은
	순차적으로 증가하면서 배경색을 노랑으로 변경하면서 출력 -->
	<div>
		<em> one </em>
		<a> five </a>
		<a> two </a>
		<a> three </a>
		<a> four </a>
		<em> six </em>
	</div>
</body>
</html>