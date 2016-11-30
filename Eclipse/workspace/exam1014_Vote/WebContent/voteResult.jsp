<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@include file="includeLoginSession.jsp"%>
<%@include file="includeVoteSession.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>voteResult.jsp</title>
<style>
	table{margin: auto; text-align: center; border: 1px dotted;}
	th, td{border: 1px dotted;}
</style>

</head>
<body>

	<div>
		<table>
			<thead>
				<tr>
					<th colspan="6">���ɸ޴� ��ǥ ���</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>�δ��</td>
					<td>��â����</td>
					<td>����</td>
					<td>�Ľ�Ÿ</td>
					<td>�����</td>
					<td>�ʹ�</td>
				</tr>
				<tr>
					<td><%=convertToInt(budae)%></td>
					<td><%=convertToInt(gopchang)%></td>
					<td><%=convertToInt(samgyeop)%></td>
					<td><%=convertToInt(pasta)%></td>
					<td><%=convertToInt(doenjang)%></td>
					<td><%=convertToInt(sushi)%></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<th colspan="6">
					<%
						if(priv.equals("admin")) {
					%>
							<input type="button" value="�ʱ�ȭ" onclick="location='resetVote.jsp'">
					<%
						}
					%>
							<a href="index.jsp">��������</a>
							<a href="logout.jsp">�α׾ƿ�</a>
					</th>
				</tr>
			</tfoot>
		</table>
	</div>
</body>
</html>