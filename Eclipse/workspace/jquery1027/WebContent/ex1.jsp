<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex1.jsp</title>
<script>
	// ���������� �ִ� ��� ����(dom, �̹���, ������) �ε�� ��������
	// �߻��Ǵ� �̺�Ʈ ***
	// ���� ������ ����...
	window.onload=function () {
		// NodeList�� ��ȯ �Ѵ�. ��� ����(�迭 ���)
		var divs = document.getElementsByTagName("div");
		alert("div�� ��� �� : " + divs.length);
		console.log("div�� ��� �� : " + divs.length);
		for(var i = 0; i < divs.length; i++) {
			// ���� ��Ҵ� �迭�̱� ������ �迭�� �ε����� ����
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