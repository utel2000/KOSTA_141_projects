<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%!// �����
	private String msg = "�޼����� ����!";

	private String test() {
		return "hihi";
	}%>
<%
	request.setCharacterEncoding("euc-kr");
	String id = request.getParameter("id");
	String cho = request.getParameter("cho");
	String name = request.getParameter("name");
	String pwd = request.getParameter("pwd");
	String email = request.getParameter("email");
// 	out.println(test());
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex1_text.jsp</title>
</head>
<body>
	<div id="wrap">`
		<table>
			<thead>
				<tr>
					<th colspan="5">ȸ�� ����</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>���̵�</th>
					<th>�̸�</th>
					<th>���</th>
					<th>���</th>
					<th>����</th>
				</tr>
				<tr>
					<th><%=id%></th>
					<th><%=name%></th>
					<th><%=pwd%></th>
					<th><%=cho%></th>
					<th><%=email%></th>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<th colspan="5"><input type="button" value="form�̵�"
						onclick="location='ex1_testForm.html'"></th>
				</tr>
			</tfoot>
		</table>
		<%=test()%> / <%=msg%>
	</div>
</body>
</html>