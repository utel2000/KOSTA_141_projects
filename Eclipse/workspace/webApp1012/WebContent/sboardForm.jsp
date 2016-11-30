<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>sboardForm.jsp</title>
</head>
<body>
	<div>
		<form method="post" action="save.jsp">
		<input type="hidden" name="reip"
		value="<%=request.getRemoteAddr()%>">
			제    목 : <input type="text" name="sub"><br />
			작 성 자 : <input type="text" name="writer"><br />
			비밀번호 : <input type="password" name="pwd"><br />
			내    용 : <textarea row="10" col="10" name="cont"></textarea><br />
			<input type="submit" value="글작성">
			<%-- location='이동할 url' --%>
			<input type="button" value="리스트" onClick="location='list.jsp'">
		</form>
	</div>
</body>
</html>