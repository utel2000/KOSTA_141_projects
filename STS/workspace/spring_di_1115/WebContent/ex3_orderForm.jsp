<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex3_orderForm.jsp</title>
</head>
<body>
	<div>
		<form method="post" action="ex3_order.jsp">
			<select name="orderMenu">
				<option value="kor">한국 요리</option>
				<option value="indo">인도 요리</option>
			</select>
			<input type="submit" value="선택" />
		</form>
	</div>
</body>
</html>