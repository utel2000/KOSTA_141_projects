<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>voteForm.jsp</title>
<style>
	div{display: table; margin: auto; border: 1px dotted;}
	dl{margin-left: 50px;}
	p{text-align: center;}
</style>
</head>
<body>
	<div>
		<h2>Q. ���� �������� ���� �԰������ ��ǥ���ּ���!</h2>
		<form method="post" action="vote.jsp">
		<dl>
			<dd><input type="radio" name="menu" value="budae">�ܰ� ��ä ������ ��ǰ�� �δ��</dd>
			<dd><input type="radio" name="menu" value="gopchang">���~�ϰ� �̱�~�̱��� ��â����</dd>
			<dd><input type="radio" name="menu" value="samgyeop">��� �ŴϾƴ� ��� ���� ����</dd>
			<dd><input type="radio" name="menu" value="pasta">��ǰ�ְ� �����ְ� �Ľ�Ÿ</dd>
			<dd><input type="radio" name="menu" value="doenjang">�ѱ����̶�� �����</dd>
			<dd><input type="radio" name="menu" value="sushi">���� ���ٸ� ������� ���� �ʹ�</dd>
		</dl>
		<p>
			<input type="submit" value="��ǥ">
			<input type="button" value="�������" onclick="location='voteResult.jsp'">
		</p>
		</form>
	</div>
</body>
</html>