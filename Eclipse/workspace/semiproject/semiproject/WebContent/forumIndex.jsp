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

	//��Ӱ˻��� ���� ����
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
<%-- forum ����_���� ���� --%>
<div class="container se" style="width: 1110px;">
	<div class="jumbotron"
		style="width: 1100px; margin: auto; background-image: url(img/agora.jpg)">
		<h2 style="color: white">WIKI-B ���������� ���Ű� ȯ���մϴ�.</h2>
		<p style="color: white">�ǰ��� ��������!</p>
		<a href="forumAddForm" class="btn"
			style="color: black; background-Color: #FACC2E">���� ����ϱ�</a>
	</div>
	<hr>
	<%-- forum ����_���� ���� --%>

	<%-- forum ����_�˻��� ���� --%>
	<form method="post" action="forumSearch">
		<div class="row" style="width: 700px; float: right;">
			<div class="col-xs-8 col-xs-offset-4">
				<div class="input-group">
					<div class="input-group-btn search-panel" id="search-panel1">
						<button type="button" class="btn btn-default dropdown-toggle"
							data-toggle="dropdown">
							<span id="search_concept">ī�װ�</span> <span class="caret"></span>
						</button>
						<ul class="dropdown-menu" role="menu" id="dropdown-menu1">
							<li><a href="#1">��ġ</a></li>
							<li><a href="#2">��ȭ</a></li>
							<li><a href="#3">����</a></li>
							<li><a href="#4">��Ÿ</a></li>
						</ul>
					</div>
					<div class="input-group-btn search-panel" id="search-panel2">
						<button type="button" class="btn btn-default dropdown-toggle"
							data-toggle="dropdown">
							<span id="search_concept">���뺰</span> <span class="caret"></span>
						</button>
						<ul class="dropdown-menu" role="menu" id="dropdown-menu2">
							<li><a href="#1">�ۼ���</a></li>
							<li><a href="#2">����</a></li>
							<li><a href="#3">����</a></li>
						</ul>
					</div>
					<input type="text" class="form-control" name="searchValue"
						placeholder="�˻�� �Է��ϼ���."> <span class="input-group-btn">
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
	<%-- forum ����_�˻��� ���� --%>
	<%-- forum ����_���̺� ���� --%>
	<table style="width: 1100px; margin: auto"
		class="table table-striped table-hover ">
		<thead>
			<tr>
				<th class="temp">no</th>
				<th class="temp">��ϵ� ��������</th>
				<th class="temp">����</th>
				<th>��ϳ�¥</th>
			</tr>
		</thead>
		<tbody>
			<!-- ���� ����Ʈ ��� ���ͷ����� ���� -->
			<s:iterator var="listv" value="list" status="sid">
				<tr class="warning">
					<td><s:property value="f_num" /></td>

					<td><a
						href="forumDetail?f_num=<s:property value="f_num"/>&nowPage=<s:property value="nowPage"/>&firstPage=1">
							<s:property value="f_subject" />
					</a> [<s:property value="cnt" />]</td>
					<td
						<s:if test="f_state=='����'">
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
			<!-- ���� ����Ʈ ��� ���ͷ����� ���� -->
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
<%-- forum ����_���̺� ���� --%>
<%-- --%>
<br />
<%@ include file="footer.jsp"%>