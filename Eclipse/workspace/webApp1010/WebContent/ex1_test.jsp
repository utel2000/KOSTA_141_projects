<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%!// 선언부
	private String msg = "메세지를 선언!";

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
					<th colspan="5">회원 정보</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>아이디</th>
					<th>이름</th>
					<th>비번</th>
					<th>등급</th>
					<th>메일</th>
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
					<th colspan="5"><input type="button" value="form이동"
						onclick="location='ex1_testForm.html'"></th>
				</tr>
			</tfoot>
		</table>
		<%=test()%> / <%=msg%>
	</div>
</body>
</html>