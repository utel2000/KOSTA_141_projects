<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>txForm.jsp</title>
</head>
<body>
	<div id="header2">
		<h1>uri : tx : </h1>
		<div id="content">
			<div style="width: 450px; margin: auto;">
				<form method="post" action="testTx">
				<fieldset>
					<legend>트랜잭션 처리 예제 폼</legend>
					<p>
						<label>ID(Unique)</label>
						<input type="text" name="id" />
					</p>
					<p>
						<label>PWD</label>
						<input type="password" name="password" />
					</p>
					<p>
						<label>Name</label>
						<input type="text" name="name" />
					</p>
					<p>
						<label>Address</label>
						<input type="text" name="address" />
					</p>
					<p>
						<label>SSN(Unique)</label>
						<input type="text" name="ssn" />
					</p>
					<p>
						<input type="submit" name="입력" />
					</p>
				</fieldset>
				</form>
			</div>
		</div>
	</div>
</body>
</html>