<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>login.jsp</title>
</head>
<body>
	<div id="wrap">
		<form method="post" action="login">
			<input type="hidden" name="loc" value="${loc}" />
			<table>
				<thead>
					<tr><td><th colspan="2">Login ����</th></tr>
				</thead>
				<tbody>
					<tr>
						<th>���̵�</th>
						<td><input type="text" name="id"></td>
					</tr>
					<tr>
						<th>��й�ȣ</th>
						<td><input type="password" name="pwd"></td>
					</tr>
				</tbody>
				<tfoot>
					<tr><th colspan="2">
					<input type="submit" value="login">
					</th>
				</tfoot>
			</table>
		</form>
	</div>
</body>
</html>