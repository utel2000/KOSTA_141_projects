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
				<th colspan="2">���ðԽ��� ����</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>����</th>
				<td>${vo.sub}</td>
			</tr>
			<tr>
				<th>�ۼ���</th>
				<td><s:property value="vo.usr" /></td>
			</tr>
			<tr>
				<th>������</th>
				<td><img src="img/<s:property value="vo.icon"/>.gif"
					class="img-rounded" width="30" height="30"></td>
			</tr>
			<tr>
				<th>����</th>
				<td><s:property value="vo.cont" /></td>
			</tr>
			<tr>
				<th>��¥</th>
				<td><s:property value="vo.ndate" /></td>
			</tr>
			<tr>
				<th>������</th>
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
	<!-- ��� ����Ʈ  -->
	<div id="commList">
		<table>
			<thead>
				<tr>
					<th>��ȣ</th>
					<th>����</th>
					<th>�ۼ���</th>
					<th>�ۼ���¥</th>
					<th>�ۼ�IP</th>
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
	<!-- ���� ��ȣ�� �������� ����� ������ code 
    num 5 - code [5,5,5,5,5,5,5] 1:n �� ����
   -->
	<form method="post" action="NcommAdd">
		<input type="hidden" name="reip" value="<%=request.getRemoteAddr()%>">
		<!-- code�� �亯�۵��� �����ؾ� �ϴ�  ������ PK(num)-->
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
				<td><input type="submit" value="�ۼ�" /></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>