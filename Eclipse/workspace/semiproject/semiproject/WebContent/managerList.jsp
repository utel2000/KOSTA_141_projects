<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@include file="header.jsp"%>

<div class="container">
	<h2>관리자 회원관리 페이지</h2>
	<p>회원정보 확인 및 삭제하는 페이지 입니다.</p>

	<table class="table">
		<thead>
			<tr>
				<th colspan="5">관리자 회원관리 페이지</th>
			</tr>
			<tr>
				<th class="m_num">회원번호</th>
				<th class="m_id">아이디</th>
				<th class="m_name">이름</th>
				<th class="m_email">이메일</th>
				<th class="m_date">가입날짜</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="data" begin="${((nowPage-1)*5)+1}" end="${nowPage*5}" step="1">
				<tr>
					<td><c:out value="${data.m_num}"/></td>
					<td><a href="memberDetail?num=<c:out value="${ data.m_num}"/>&nowPage=<c:out value="${nowPage}"/>">
					<c:out value="${data.m_id}" /></a></td>
					<td><c:out value="${data.m_name}" /></td>
					<td><c:out value="${data.m_email}" /></td>
					<td><c:out value="${data.m_date}" /></td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<tr>
				<th colspan="5">
					<ul class="pagination">
						<s:property value="pagingCode" escape="false" />
					</ul>
				</th>
			</tr>
			<tr>
				<th colspan="5">
					<div class="col-sm-offset-11 col-sm-10">
						<input type="button" class="btn btn-default" value="확인" onclick="location='mainpage'">
					</div>
				</th>
			</tr>
		</tfoot>
	</table>
</div>
<br />
<%@ include file="footer.jsp"%>