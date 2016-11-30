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
			제    목 : <input type="text" name="title"><br />
			작 성 자 : <input type="text" name="writer"><br />
			내    용 : <textarea row="10" col="10" name="memo"></textarea><br />
			<input type="submit" value="메모작성">
			<input type="button" value="리스트" onClick="">
		</form>
	</div>
</body>
</html>