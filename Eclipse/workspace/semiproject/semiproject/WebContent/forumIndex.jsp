<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@include file="header.jsp"%>
<script>
	$(function() {
		// jQuery style
		$('.temp').css({
			'border-right' : '1px solid gray'
		});
		$('.btn-primary').css({
			'color' : 'black',
			'background-color' : '#FACC2E'
		})
		$('#btn_nowPage').css({
			'background-color' : 'lightblue'
		});
	});

	//드롭검색바 조건 설정
	$(document).ready(function(e) {
		$('#dropdown-menu1').find('a').click(function(e) {
			e.preventDefault();
			var param = $(this).attr("href").replace("#", "");
			var concept = $(this).text();
			$('#search-panel1 span#search_concept').text(concept);
			$('#searchType1').val(param);
		});

		$('#dropdown-menu2').find('a').click(function(e) {
			e.preventDefault();
			var param = $(this).attr("href").replace("#", "");
			var concept = $(this).text();
			$('#search-panel2 span#search_concept').text(concept);
			$('#searchType2').val(param);
		});
	});

	function forumSearchPage(newPage) {
		location = "forumSearch?nowPage="
				+ newPage
				+ "&searchValue=<s:property value="searchValue"/>&searchType1=<s:property value="searchType1"/>&searchType2=<s:property value="searchType2"/>"
	};
	
</script>
<%-- forum 메인_간판 시작 --%>
<div class="container se" style="width: 1110px;">
	<div class="jumbotron"
		style="width: 1100px; margin: auto; background-image: url(img/agora.jpg)">
		<h2 style="color: white">WIKI-B 지식포럼에 오신걸 환영합니다.</h2>
		<p style="color: white">의견을 나누세요!</p>
		<a href="forumAddForm" class="btn"
			style="color: black; background-Color: #FACC2E">포럼 등록하기</a>
	</div>
	<hr>
	<%-- forum 메인_간판 종료 --%>

	<%-- forum 메인_검색바 시작 --%>
	<form method="post" action="forumSearch">
		<div class="row" style="width: 700px; float: right;">
			<div class="col-xs-8 col-xs-offset-4">
				<div class="input-group">
					<div class="input-group-btn search-panel" id="search-panel1">
						<button type="button" class="btn btn-default dropdown-toggle"
							data-toggle="dropdown">
							<span id="search_concept">카테고리</span> <span class="caret"></span>
						</button>
						<ul class="dropdown-menu" role="menu" id="dropdown-menu1">
							<li><a href="#1">정치</a></li>
							<li><a href="#2">문화</a></li>
							<li><a href="#3">과학</a></li>
							<li><a href="#4">기타</a></li>
						</ul>
					</div>
					<div class="input-group-btn search-panel" id="search-panel2">
						<button type="button" class="btn btn-default dropdown-toggle"
							data-toggle="dropdown">
							<span id="search_concept">내용별</span> <span class="caret"></span>
						</button>
						<ul class="dropdown-menu" role="menu" id="dropdown-menu2">
							<li><a href="#1">작성자</a></li>
							<li><a href="#2">제목</a></li>
							<li><a href="#3">내용</a></li>
						</ul>
					</div>
					<input type="text" class="form-control" name="searchValue"
						placeholder="검색어를 입력하세요."> <span class="input-group-btn">
						<input type="hidden" name="searchType1" id="searchType1">
						<input type="hidden" name="searchType2" id="searchType2">
						<button class="btn btn-default" type="submit">
							<span class="glyphicon glyphicon-search"></span>
						</button>
					</span>
				</div>
			</div>
		</div>
	</form>
	<br /> <br />
	<%-- forum 메인_검색바 종료 --%>
	<%-- forum 메인_테이블 시작 --%>
	<table style="width: 1100px; margin: auto"
		class="table table-striped table-hover ">
		<thead>
			<tr>
				<th class="temp">no</th>
				<th class="temp">등록된 지식포럼</th>
				<th class="temp">상태</th>
				<th>등록날짜</th>
			</tr>
		</thead>
		<tbody>
			<!-- 포럼 리스트 출력 이터레이터 시작 -->
			<s:iterator var="listv" value="list" status="sid">
				<tr class="warning">
					<td><s:property value="f_num" /></td>

					<td><a
						href="forumDetail?f_num=<s:property value="f_num"/>&nowPage=<s:property value="nowPage"/>&firstPage=1">
							<s:property value="f_subject" />
					</a> [<s:property value="cnt" />]</td>
					<td
						<s:if test="f_state=='진행'">
							style="font-weight: bold; color: blue;"
						</s:if>
						<s:else>
							style="font-weight: bold; color: red;"
						</s:else>>
						<s:property value="f_state" />
					</td>
					<td><s:property value="f_date_post" /></td>
				</tr>
			</s:iterator>
			<!-- 포럼 리스트 출력 이터레이터 종료 -->
		</tbody>
		<tfoot>
			<tr>
				<th colspan="4">
					<form method="post" action="forumSearch">
						<div class="btn-group" id="moveBlock">
							<s:property value="pagingCode" escape="false" />
						</div>
					</form>
				</th>
			</tr>
		</tfoot>
	</table>
</div>
<%-- forum 메인_테이블 종료 --%>
<%-- --%>
<br />
<%@ include file="footer.jsp"%>