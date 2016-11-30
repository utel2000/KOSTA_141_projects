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
	// 삭제폼
	function delBoard(num, fn){
		if(confirm("정말로 삭제하시겠습니까?")){
			location="delete.jsp?num="+num+"&fn="+fn;
		}
	}
	// 수정폼
	function upform(num){
		location="upform.jsp?num="+num;
	} 
</script>
</head>
<body>
	<%
		// list.jsp에서 사용자가 클릭했을 때 PriMary Key인 num을 받아야 함.
		int num = Integer.parseInt(request.getParameter("num"));
		SBoardVO v = SBoardDao.getDao().detail(num);
	%>

	<div id="wrap">
		<table>
			<thead>
				<tr>
					<th colspan="2">상세보기</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>제목</th>
					<td><%=v.getSub()%> / <%=num%></td>
				</tr>
				<tr>
					<th>이미지</th>
					<td><img src="img/<%=v.getImg()%>" style="width: 300px;"></td>
				</tr>
				<tr>
					<th>작성자</th>
					<td><%=v.getWriter()%> / <%=v.getReip()%></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><%=v.getCont()%></td>
				</tr>
				<tr>
					<th>작성일</th>
					<td><%=v.getRdate()%></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<th colspan="2">
					<input type="button" value="리스트" onclick="location='list.jsp'">&nbsp;
					<input type="button" value="수정" onclick="upform(<%=num%>)">&nbsp;
					<input type="button" value="삭제" onclick="delBoard(<%=num%>, '<%=v.getImg()%>')">
					</th>
				</tr>
			</tfoot>
		</table>
	</div>
</body>
</html>