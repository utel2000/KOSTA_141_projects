<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@include file="header.jsp"%>
<style>
table, th, td{border: 1px solid}
</style>
<div class="container">
	<h2>Bordered Table</h2>
	<p>The .table-bordered class adds borders to a table:</p>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th colspan="2">심플게시판 예제</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>제목</th>
				<td>${vo.sub}</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><s:property value="vo.usr" /></td>
			</tr>
			<tr>
				<th>아이콘</th>
				<td><img src="img/<s:property value="vo.icon"/>.gif"
					class="img-rounded" width="30" height="30"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><s:property value="vo.cont" /></td>
			</tr>
			<tr>
				<th>날짜</th>
				<td><s:property value="vo.ndate" /></td>
			</tr>
			<tr>
				<th>아이피</th>
				<td><s:property value="vo.reip" /></td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<th colspan="2"><input type="button" value="Delete">
					&nbsp; <input type="button" value="List"
					onclick="location='nBoardList?nowPage=<s:property value="nowPage"/>'">
				</th>
			</tr>
		</tfoot>
	</table>
	<hr />
	<!-- 댓글 리스트  -->
	<div id="commList">
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>내용</th>
					<th>작성자</th>
					<th>작성날짜</th>
					<th>작성IP</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator var="nclistv" value="nclist">
					<tr>
						<td><s:property value="num" /></td>
						<td><s:property value="comm" /></td>
						<td><s:property value="usr" /></td>
						<td><s:property value="ncdate" /></td>
						<td><s:property value="reip" />IP</td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</div>
	<!-- 원글 번호를 기준으로 댓글의 구분을 code 
    num 5 - code [5,5,5,5,5,5,5] 1:n 의 관계
   -->
	<form method="post" action="NcommAdd">
		<input type="hidden" name="reip" value="<%=request.getRemoteAddr()%>">
		<!-- code는 답변글들이 참조해야 하는  원글의 PK(num)-->
		<input type="hidden" name="code" value="<s:property value="vo.num"/>">
		<input type="hidden" name="nowPage"
			value="<s:property value="nowPage"/>">

		<table border="1">
			<tr>
				<c:forEach begin="1" step="1" end="5" varStatus="i">
					<td class="icon"><img src="img/chu${i.count }.gif"
						class="img-rounded" width="60" height="60"> <input
						type="radio" name="icon" value="${i.count }">&nbsp;</td>
				</c:forEach>
			</tr>
			<tr>
				<td colspan="3"><textarea rows="3" cols="45" name="comm"></textarea>
				</td>
				<td><input type="text" name="usr" style="width: 100px">
				</td>
				<td><input type="submit" value="작성" /></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>