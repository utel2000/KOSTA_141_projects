<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>smemoForm.jsp</title>
</head>
<body>
	<div>
		<form method="post" action="save.jsp">
		<input type="hidden" name="reip"
		value="<%=request.getRemoteAddr()%>">
			��    �� : <input type="text" name="title"><br />
			�� �� �� : <input type="text" name="writer"><br />
			��    �� : <textarea row="10" col="10" name="memo"></textarea><br />
			<input type="submit" value="�޸��ۼ�">
			<input type="button" value="����Ʈ" onClick="">
		</form>
	</div>
</body>
</html>