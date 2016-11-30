<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:include value="header.jsp"></s:include>
<style>
#search1, #search2{
	width: 90px;
}
</style>
<div class="carousel-inner" role="listbox">
	<div class="item active">
		<img src="img/H1.gif" alt="Chania" style="width: 490px; height: auto;">
		<div class="carousel-caption"></div>
	</div>
	<div class="col-lg-6"
		style="text-align: center; width: 100%; padding-top: 40px; padding-bottom: 110px;">
		<form action="wikiList" method="post">
			<div class="input-group"
				style="width: 70%; margin-left: 250px; margin-right: 150px;">
				<div class="input-group-btn search-panel">
					<select name='searchType1' class='form-control' id="search1">
						<option value="0">검색</option>
						<option value="1">정치</option>
						<option value="2">문화</option>
						<option value="3">과학</option>
						<option value="4">기타</option>
					</select>
				</div>
				<div class="input-group-btn search-panel">
					<select name='searchType2' class='form-control' id="search2">
						<option value="0">검색</option>
						<option value="1">작성자</option>
						<option value="2">제목</option>
						<option value="3">내용</option>
					</select>
				</div>
				<input type="text" class="form-control" placeholder="Search for..."
					name="searchValue"> <span class="input-group-btn">
					<button class="btn btn-default" type="submit">Go!</button>
				</span>
			</div>
		</form>
		<br />
	</div>
</div>

<div id="target" style="text-align: center;"></div>
<br />
<s:include value="footer.jsp"></s:include>
