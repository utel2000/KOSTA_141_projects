<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>upform.jsp</title>
</head>
<body>
	<div>
		<form method="post" action="upload_res" enctype="multipart/form-data">
			<table>
				<thead>
					<tr>
						<th colspan="2">�� ǰ �� ��</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>��ǰ��</td>
						<td><input type="text" name="gname" size="50"></td>
					</tr>
					<tr>
						<td>����</td>
						<td><input type="text" name="price" size="50"></td>
					</tr>
					<tr>
						<td>�̹���</td>
						<td><input type="file" name="upload"></td>
					</tr>
					<tr>
						<td>����</td>
						<td><textarea name="content" cols="50" rows="5"></textarea></td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" value="���">
							<input type="reset" value="���">
						</td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
</body>
</html>