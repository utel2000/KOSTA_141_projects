<%@page import="vo.SBoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.SBoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	// SBoardDao�� �����ϸ鼭 �ʿ��� �޼��带 ȣ��.
	ArrayList<SBoardVO> list = SBoardDao.getDao().list();
%>	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>list.jsp</title>
<style>
	#listTable{border: 1px dotted;}
	th, td{border: 1px dotted;}
</style>
</head>
<body>
	<div>
		<table id="listTable">
			<thead>
				<tr>
					<th>��ȣ</th>
					<th>����</th>
					<th>�ۼ���</th>
					<th>�ۼ���¥</th>
				</tr>
			</thead>
			<tbody>
			<%-- �ݺ��� ���� --%>
			<% for(SBoardVO e : list) { 
				int num = e.getNum();
			%>
			<tr>
			<td><%= num %></td>
			<td><a href="detail.jsp?num=<%= num %>"><%= e.getSub() %></a></td>
			<td><%= e.getWriter() %></td>
			<td><%= e.getRdate() %></td>
			</tr>
			<% } %>
			<%-- �ݺ��� �� --%>
			</tbody>
			<tfoot>
				<tr>
					<th colspan="4">
						<input type="button" value="�Է���"
						onclick="location='sboardForm.jsp'">
					</th>
				</tr>
			</tfoot>
		</table>
	</div>
</body>
</html>