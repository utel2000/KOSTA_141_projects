<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@include file="header.jsp"%>
<script>
	$(document).ready(function(e){
	    $('.search-panel .dropdown-menu').find('a').click(function(e) {
			e.preventDefault();
			var param = $(this).attr("href").replace("#","");
			var concept = $(this).text();
			$('.search-panel span#search_concept').text(concept);
// 			$('.input-group #search_param').val(param);
			$('#searchType').val(param);
		});
	});
</script>
<div class="container">
	<h2>게시판 리스트 페이지 예제</h2>
	<p>게시판에서 페이지 처리르르 위한 리스트 예제 입니다. 세미프로젝트에 적용해보세요.</p>
	<table class="table">
		<thead>
			<tr>
				<th colspan="5">게시판 리스트 페이지 예제</th>
			</tr>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>아이콘</th>
				<th>작성날짜</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator var="listv" value="list" status="sid">
				<tr
					<s:if test="#sid.index % 2 == 0">
						class="success"
					</s:if>
					<s:else>
						class="danger"
					</s:else>>
					<s:property value="#sid.count" />
					<td><s:property value="num" /></td>
					<td><a
						href="nBoardDetail?num=<s:property value="num"/>&nowPage=<s:property value="nowPage"/>">
							<s:property value="sub" /> [<s:property value="cnt" />]
					</a></td>
					<td><s:property value="usr" /></td>
					<td><img src="img/<s:property value="icon" />.gif"
						class="img-rounded" width="30" height="30"></td>
					<td><s:property value="ndate" /></td>
				</tr>
			</s:iterator>
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
					<div class="col-sm-offset-11 col-sm-1">
						<input type="button" value="write" onclick="location='nBoardForm'"
							class="btn btn-danger">
					</div>
				</th>
			</tr>
		</tfoot>
		<tr>
			<td colspan="5">
				<form method="post" action="nBoardSearch">
					<input type="hidden" name="searchType" id="searchType">
					<div class="row">
						<div class="col-xs-8 col-xs-offset-2">
							<div class="input-group">
								<div class="input-group-btn search-panel">
									<button type="button" class="btn btn-default dropdown-toggle"
										data-toggle="dropdown">
										<span id="search_concept">검색조건</span> <span class="caret"></span>
									</button>
									<ul class="dropdown-menu" role="menu"|>
										<li><a href="#1">작성자</a></li>
										<li><a href="#2">제목</a></li>
										<li><a href="#3">내용</a></li>
									</ul>
								</div>
								<input type="text" class="form-control" name="searchValue" placeholder="검색어를 입력하세요.">
								<span class="input-group-btn">
									<button class="btn btn-default" id="search_btn" type="submit">
										<span class="glyphicon glyphicon-search"></span>
									</button>
								</span>
							</div>
						</div>
					</div>
				</form>
			</td>
		</tr>
	</table>
</div>
<%@include file="footer.jsp"%>