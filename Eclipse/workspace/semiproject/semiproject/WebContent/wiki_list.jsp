<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@include file="header.jsp" %>
<%-- <jsp:include value="header.jsp"></s:include> --%>
<style>
@import "http://fonts.googleapis.com/css?family=Roboto:300,400,500,700";

@import
	url('http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css')
	;

.container {
	margin-top: 20px;
	width: 90%;
}

.mb20 {
	margin-bottom: 8px;
}

hgroup {
	padding-left: 15px;
	border-bottom: 1px solid #ccc;
	overflow: hidden;
}

hgroup h1 {
	font: 500 normal 1.625em "Roboto", Arial, Verdana, sans-serif;
	color: #2a3644;
	margin-top: 0;
	line-height: 1.15;
}

hgroup h2.lead {
	font: normal normal 1.125em "Roboto", Arial, Verdana, sans-serif;
	color: #2a3644;
	margin: 0;
	padding-bottom: 10px;
}

.search-result .thumbnail {
	border-radius: 0 !important;
}

.search-result:first-child {
	margin-top: 0 !important;
}

.search-result {
	margin-top: 20px;
}

.search-result .col-md-2 {
	border-right: 1px dotted #ccc;
	min-height: 140px;
}

.search-result ul {
	padding-left: 0 !important;
	list-style: none;
}

.search-result ul li {
	font: 400 normal .85em "Roboto", Arial, Verdana, sans-serif;
	line-height: 30px;
}

.search-result ul li i {
	padding-right: 5px;
}

.search-result .col-md-7 {
	position: relative;
}

.search-result h3 {
	font: 500 normal 1.375em "Roboto", Arial, Verdana, sans-serif;
	margin-top: 0 !important;
	margin-bottom: 10px !important;
}

.search-result h3>a, .search-result i {
	color: #248dc1 !important;
}

.search-result p {
	font: normal normal 1.125em "Roboto", Arial, Verdana, sans-serif;
}

.search-result span.plus {
	position: absolute;
	right: 0;
	top: 126px;
}

.search-result span.plus a {
	background-color: #248dc1;
	padding: 5px 5px 3px 5px;
}

.search-result span.plus a:hover {
	background-color: #414141;
}

.search-result span.plus a i {
	color: #fff !important;
}

.search-result span.border {
	display: block;
	width: 97%;
	margin: 0 15px;
	border-bottom: 1px dotted #ccc;
}

#search1, #search2 {
	width: 90px;
} /*REQUIRED*/
.carousel-row {
	margin-bottom: 10px;
	height: 50px;
	width: 100%;
}

.slide-row {
	padding: 0;
	background-color: #ffffff;
	min-height: 150px;
	border: 1px solid #e7e7e7;
	overflow: hidden;
	height: auto;
	position: relative;
}

.slide-carousel {
	width: 20%;
	float: left;
	display: inline-block;
}

.slide-carousel .carousel-indicators {
	margin-bottom: 0;
	bottom: 0;
	background: rgba(0, 0, 0, .5);
}

.slide-carousel .carousel-indicators li {
	border-radius: 0;
	width: 20px;
	height: 6px;
}

.slide-carousel .carousel-indicators .active {
	margin: 1px;
}

.slide-content {
	/*  position: relative; */
	top: 0;
	/*  left: 20%; */
	display: block;
	/*  float: left; */
	width: 70%;
	height: 86%;
	padding: 1.5% 2% 2% 2%;
	overflow-y: auto;
	font-family: "맑은고딕";
	rert
	cn
}

.slide-content h4 {
	margin-bottom: 3px;
	margin-top: 0;
}

.slide-footer {
	position: absolute;
	bottom: 0;
	left: 20%;
	width: 78%;
	height: 20%;
	margin: 1%;
} /* Scrollbars */
.slide-content::-webkit-scrollbar {
	width: 5px;
}

.slide-content::-webkit-scrollbar-thumb:vertical {
	margin: 5px;
	background-color: #999;
	-webkit-border-radius: 5px;
}

.slide-content::-webkit-scrollbar-button:start:decrement, .slide-content::-webkit-scrollbar-button:end:increment
	{
	height: 3px;
	display: block;
}

#articleId{
	 border-bottom: 1px solid;
	 border-bottom-color:#D8D8D8;
	 padding-bottom: 20px;
	 padding-top: 20px;
}
#div_paging button{
	color: black;
	background-color: #FACC2E;
}
</style>

<script>
	function justtest(newPage){
		location="wikiList?nowPage="+newPage+" &searchValue=<s:property value="searchValue"/> &searchType1=<s:property value="searchType1"/>&searchType2=<s:property value="searchType2"/>";
	};
	
</script>
<!-- 검색바 시작 -->
<div class="row"
	style="width: 100%; float: left; margin: auto; padding-bottom: 50px; padding-top: 50px;">
	<div class="col-xs-9 col-xs-offset-1">
		<form action="wikiList" method="post">
			<div class="input-group" style="width: 110%;">
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
	</div>
</div>
<!-- 검색바 끝 -->

<!-- list -->
<div class="container">
	<hgroup class="mb20">
		<h2>Search Results</h2>
		<h3 class="lead">
			<strong class="text-danger"><s:property value="total" /></strong>개의
			결과가 검색되었습니다.
		</h3>
	</hgroup>
	<section class="col-xs-12 col-sm-6 col-md-12"  style="padding-bottom:20px;">
		<s:iterator var="wlistv" value="wlist" status="i">
			<article id="articleId">

				<div class="col-sm-12 col-md-3" style="height: 210px;">
						<a title="Lorem ipsum" class="thumbnail">
							<img style="height: 200px; border: 1px solid; "src="img/<s:property value="w_img"/>" /> 
						</a>
				</div>
				<!-- 이미지 -->
				<div class="slide-content" style="height: 210px;">
					<table
						style="width: 90%; height: 120%; margin-left: 5%; font-size: 11pt;">
						<tr>
							<td
								style="font-size: 14pt; padding-bottom: 4%; text-decoration: underline;"><a
								href="wikiDetail?w_num=<s:property value="w_num"/>&nowPage=<s:property value="nowPage"/>">
									<s:property value="w_title" />
							</a></td>
						</tr>

						<tr>
							<td>
								<p>
									<s:property value="w_content" />
								</p>
							</td>
						</tr>


					</table>
				</div>

				<span class="clearfix borda"></span>
			</article>
		</s:iterator>
	</section>
		<%-- 페이지 출력 프로퍼티 --%>
	<p
		style="margin: auto; text-align: center; width: 200px; height: 100px;">
	<div class="btn-group" id="div_paging">	
		<s:property value="pagingCode" escape="false" />
	</div>
	</p>
	<div class="col-sm-offset-11 col-sm-1">
		<button type="submit" class="btn btn-warning" onclick="location='wikiAddForm'">위키등록</button>
	</div>
</div>
<br />
<s:include value="footer.jsp"></s:include>