<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<c:forEach var="e" items="${slist}" varStatus="i">				
			<tr>
			<td>${i.count}</td>
			<td>noimage</td>
			<td><a href="detail.jsp?num=${e.num}">${e.sub}</a></td>
			<td>${e.writer}</td>
			<td>${e.rdate}</td>
			</tr>
			</c:forEach>
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