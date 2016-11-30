<%@page import="dao.SBoardDao"%>
<%@page import="vo.SBoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>detail.jsp</title>
<style>
table{background-color: teal;}
th, td{border: 1px dotted;}
</style>
<script>
	// ������
	function delBoard(num, fn){
		if(confirm("������ �����Ͻðڽ��ϱ�?")){
			location="delete.jsp?num="+num+"&fn="+fn;
		}
	}
	// ������
	function upform(num){
		location="upform.jsp?num="+num;
	} 
</script>
</head>
<body>
	<%
		// list.jsp���� ����ڰ� Ŭ������ �� PriMary Key�� num�� �޾ƾ� ��.
		int num = Integer.parseInt(request.getParameter("num"));
		SBoardVO v = SBoardDao.getDao().detail(num);
	%>

	<div id="wrap">
		<table>
			<thead>
				<tr>
					<th colspan="2">�󼼺���</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>����</th>
					<td><%=v.getSub()%> / <%=num%></td>
				</tr>
				<tr>
					<th>�̹���</th>
					<td><img src="img/<%=v.getImg()%>" style="width: 300px;"></td>
				</tr>
				<tr>
					<th>�ۼ���</th>
					<td><%=v.getWriter()%> / <%=v.getReip()%></td>
				</tr>
				<tr>
					<th>����</th>
					<td><%=v.getCont()%></td>
				</tr>
				<tr>
					<th>�ۼ���</th>
					<td><%=v.getRdate()%></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<th colspan="2">
					<input type="button" value="����Ʈ" onclick="location='list.jsp'">&nbsp;
					<input type="button" value="����" onclick="upform(<%=num%>)">&nbsp;
					<input type="button" value="����" onclick="delBoard(<%=num%>, '<%=v.getImg()%>')">
					</th>
				</tr>
			</tfoot>
		</table>
	</div>
</body>
</html>