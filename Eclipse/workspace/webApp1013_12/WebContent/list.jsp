<%@page import="vo.SBoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.SBoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	// SBoardDao를 생성하면서 필요한 메서드를 호출.
	ArrayList<SBoardVO> list = SBoardDao.getDao().list();
%>	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>list.jsp</title>
<style>
	#listTable{border: 1px dotted; background-color: aqua;}
	th{border: 1px dotted; background-color: pink;}
	td{border: 1px dotted;}
</style>
<script>
	function delBoardAll(){
		if(confirm("정말로 삭제 하시겠습니까?")){
			location="deleteAll.jsp";
		}
	}
</script>
</head>
<body>
	<div>
		<table id="listTable">
			<thead>
				<tr>
					<th>번호</th>
					<th>이미지</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성날짜</th>
				</tr>
			</thead>
			<tbody>
			<%-- 반복문 시작 --%>
			<% for(SBoardVO e : list) { 
				int num = e.getNum();
			%>
			<tr>
			<td><%= num %></td>
			<td><img src="img/<%=e.getImg()%>" style="width: 150px;"></td>
			<td><a href="detail.jsp?num=<%= num %>"><%= e.getSub() %></a></td>
			<td><%= e.getWriter() %></td>
			<td><%= e.getRdate() %></td>
			</tr>
			<% } %>
			<%-- 반복문 끝 --%>
			</tbody>
			<tfoot>
				<tr>
					<th colspan="5">
						<input type="button" value="입력폼"
						onclick="location='sboardForm.jsp'">
						<input type="button" value="전체삭제"
						onclick="delBoardAll()">
					</th>
				</tr>
			</tfoot>
		</table>
	</div>
</body>
</html>