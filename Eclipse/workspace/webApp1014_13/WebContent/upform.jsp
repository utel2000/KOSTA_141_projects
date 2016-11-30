<%@page import="dao.SBoardDao"%>
<%@page import="vo.SBoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>upform.jsp</title>
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
			document.getElementById("oriImg").style.display="none";
		}
		reader.readAsDataURL(file[0]); // ������ �д´�.
	}
</script>
</head>
<body>
<%
	// list.jsp���� ����ڰ� Ŭ������ �� Primary Key�� num�� �޾ƾ���.
	int num = Integer.parseInt(request.getParameter("num"));
	SBoardVO v = SBoardDao.getDao().detail(num);
%>
	<div>
		<form method="post" action="update.jsp" enctype="multipart/form-data">
			<input type="hidden" name="num" value="<%=v.getNum()%>">
			<input type="hidden" name="orifn" value="<%=v.getImg()%>">
			<input type="hidden" name="reip" value="<%=request.getRemoteAddr()%>">
			��      �� : <input type="text" name="sub" value="<%=v.getSub()%>"><br />
			��  ��  �� : <input type="text" name="writer" value="<%=v.getWriter()%>"><br />
			���  ��ȣ : <input type="password" name="pwd" value="<%=v.getPwd()%>"><br />
			�̹���÷�� : <input type="file" name="upfile" onchange="fileInfo(this)"><br />
			<div id="img_box"></div>
			<img src="img/<%=v.getImg()%>" style="width: 150px" id="oriImg">
			<br />
			��      �� : <textarea row="10" col="10" name="cont"><%=v.getCont()%></textarea><br />
			<input type="submit" value="�ۼ���">
			<%-- location='�̵��� url' --%>
			<input type="button" value="����Ʈ" onClick="location='list.jsp'">
		</form>
	</div>
</body>
</html>