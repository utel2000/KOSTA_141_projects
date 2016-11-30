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
		// , �������� ���� �ٸ� ��Ҹ� ���� ��ҷ� ����, $searchEls jQuery����.
		var $searchEls = $('p, span, div, .simpletext1');
		resultText += "�˻��� ������Ʈ�� ���� : "
		+ $searchEls.length + "\n";
		// each�� �ݺ���, �迭���.each(fn); �迭�� ��Ҹ� �о� ���̸鼭 true
		$searchEls.each(function(idx) {
			// $this - dom��ü�� �ּ�, p, span ...
			// ��Ҽ�����.text()�Ԥ��� �����ڰ� ������ �ִ� ���� ������.
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