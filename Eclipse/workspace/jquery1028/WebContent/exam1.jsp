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
// < ������ ���� �� �ڵ�. �Ʒ��� ����� �ڵ� >
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
		// div�� �ڽ� Element�� ���� ����.
		// $('div').children() => em, a ���.
		var $chNode = $('div').children();
		$chNode.css({
			'display': 'block', 'width': '100px', 'height': '30px',
			'float': 'left', 'text-align': 'center' 
		});
		var i = 0;
		var inter = setInterval(function() {
			// 0�� em�� �ּ�
			var $node = $chNode.eq(i);
			// $node.html() -> em�ȿ� html�����͸� ������ ��.
			// ������ $.trim���� ó��.
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
	<!-- five�� �ܾ��� ������ ��������� �����ϰ� �ٸ� ������
	���������� �����ϸ鼭 ������ ������� �����ϸ鼭 ��� -->
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