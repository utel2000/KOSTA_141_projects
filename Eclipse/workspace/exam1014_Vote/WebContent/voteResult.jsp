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
					<th colspan="6">점심메뉴 투표 결과</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>부대찌개</td>
					<td>곱창전골</td>
					<td>삼겹살</td>
					<td>파스타</td>
					<td>된장찌개</td>
					<td>초밥</td>
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
							<input type="button" value="초기화" onclick="location='resetVote.jsp'">
					<%
						}
					%>
							<a href="index.jsp">메인으로</a>
							<a href="logout.jsp">로그아웃</a>
					</th>
				</tr>
			</tfoot>
		</table>
	</div>
</body>
</html>