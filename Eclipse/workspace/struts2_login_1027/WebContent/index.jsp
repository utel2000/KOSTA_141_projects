<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>index.jsp</title>

</head>
<body>
	<h1>�⺻������</h1>
	<div style="border: 0px solid #ccc; margin-right: 20px; background-color: orange;">
		<div align="right">
			<%-- #session�� OGNLǥ������� sessionScope�� �ǹ� --%>
			<s:if test="#session.loginId == null">
				<a href="ssnchkF">ȸ������</a> &nbsp;
				<a href="loginForm">�α���</a>
			</s:if>
			<s:else>
				<a href="ssnchkF">����������(��������)</a>
				&nbsp; ${sessionScope["loginId"]}��
				<a href="logout">�α׾ƿ�</a>
			</s:else>
			&nbsp;
			<a href="#">������</a>
		</div>
	</div>
</body>
</html>