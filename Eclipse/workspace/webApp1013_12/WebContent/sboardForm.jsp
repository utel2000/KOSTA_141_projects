<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>sboardForm.jsp</title>
<script>
	// f : file��ü�� �ּ�.
	function fileInfo(f) {
		// files�� ����ؼ� ���� ��ü�� ������ �����´�. (�迭 ��ȯ)
		var file = f.files;
		// type.indexOf : ������ Ÿ���� Ȯ��.
		if (file[0].type.indexOf('image') < 0) { // ������ ������ �̹������� Ȯ��.
			alert('�̹��� ���ϸ� �����ϼ���.');
			return;
		}
		// FileReader ��ü ��� : HTML5 ���.
		var reader = new FileReader(); // FileReader ��ü ���
		// reader.onload : ���Ͼ��ε带 ����ؼ� ������ ��� �о����� ��
		// �͸� �Լ��� �����ϸ� �о�� ������ ������ rst�� ����.
		reader.onload = function(rst) {
			document.getElementById("img_box").innerHTML=
				"<img src='"+rst.target.result+"' style='width: 300px;'>";
		}
		reader.readAsDataURL(file[0]); // ������ �д´�.
	}
</script>
</head>
<body>
	<div>
		<form method="post" action="save.jsp" enctype="multipart/form-data">
		<input type="hidden" name="reip"
		value="<%=request.getRemoteAddr()%>">
			��      �� : <input type="text" name="sub"><br />
			��  ��  �� : <input type="text" name="writer"><br />
			���  ��ȣ : <input type="password" name="pwd"><br />
			�̹���÷�� : <input type="file" name="upfile" onchange="fileInfo(this)"><br />
			<div id="img_box"></div><br />
			��      �� : <textarea row="10" col="10" name="cont"></textarea><br />
			<input type="submit" value="���ۼ�">
			<%-- location='�̵��� url' --%>
			<input type="button" value="����Ʈ" onClick="location='list.jsp'">
		</form>
	</div>
</body>
</html>