<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ include file="header.jsp"%>
<%
	String path = application.getRealPath("img");
	System.out.println(path);
%>

<style>
#wrap {
	border: 1px solid;
	border-color: black;
}
</style>
<script>
	function deleteConfirm() {
		if (confirm("������ ���� �Ͻðڽ��ϱ�?")) {
			location = "wikiDelete?w_num=<s:property value='w_num' />&fileName=<s:property value='wvo.w_img'/>";
		}
	}

	function updateConfirm() {
		if (confirm("������ ���� �Ͻðڽ��ϱ�?")) {
			location = "wikiUpdateForm?w_num=<s:property value="w_num"/>&nowPage=<s:property value="nowPage"/>";
		}
	}

	$(document).ready(function() {
		//	 	if(${sessionScope.m_grade}==="queenbee"){
		if (2 < 1) { // ��ģ �Ŀ� if�� ���� �ٲ��� ��
			$('#btn0').css("display", "none");
			$('#btn1').css("display", "none");
		}
	});

	$(document).ready(
			function() {
				var txt = $('#w_src').val();
				if (txt != "") {
					$('iframe').attr("width", "560").attr("height", "315")
							.attr("src", txt);
				} else {
					return;
				}
			});
</script>
<div class="container">
	<div class="row">
		<hgroup class="mb20">
			<h2>Detail Result</h2>
			<h3 class="lead">
				<strong class="text-danger">[<s:property
						value="wvo.w_title" />]
				</strong> ��Ű �󼼺���~
			</h3>
		</hgroup>
		<div
			class="col-xs-12 col-sm-12 col-md-6 col-lg-12 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-0 toppad"
			style="padding-top: 20px;">


			<div class="panel panel-info" id="wrap">
				<div class="panel-heading" style="background: #facc2e;"></div>
				<div class="panel-body">
					<div class="row">
						<div class="col-md-3 col-lg-3 " align="center">
							<c:choose>
								<c:when test="${wvo.w_img == 'noimg2.png'}">
									<img alt="User Pic" src="img/noimg2.png"
										class="img-rounded img-responsive"
										style="height: 200px; border: 1px solid;">
								</c:when>
								<c:otherwise>
									<s:url id="download" action="fileDown">
										<s:param name="fileName" value="wvo.w_img" />
									</s:url>
									<s:a href="%{download}">
										<img alt="User Pic" src="img/<s:property value="wvo.w_img"/>"
											class="img-rounded img-responsive"
											style="height: 200px; border: 1px solid;">
									</s:a>
								</c:otherwise>
							</c:choose>
						</div>

						<div class=" col-md-9 col-lg-9 ">
							<table class="table table-user-information">
								<tbody>
									<tr>
										<td style="width: 100px; font-weight: bold;">����</td>
										<td><s:property value="wvo.w_title" /></td>
									</tr>
									<tr>
										<td style="width: 100px; font-weight: bold;">ī�װ�</td>
										<td><s:property value="cat_name" /></td>
									</tr>

									<tr>
										<td style="width: 100px; font-weight: bold;">�� ����</td>
										<td><s:property value="wvo.w_content" /></td>
									</tr>
									<tr>
										<input type="hidden" id="w_src"	value="<s:property value='wvo.w_src'/>">
										<td style="width: 100px; font-weight: bold;">������ �ҽ�</td>
										<td><iframe frameborder="0" allowfullscreen> </iframe></td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<div class="panel-footer" style="background: #facc2e;"></div>

			</div>
		</div>

	</div>

	<div style="float: right;">
			<!-- ���� ��ư Ŭ���� - confirm �ް� update�� �̵� -->
			<a href="#" class="btn" id="btn0"
				style="color: black; background-Color: #FACC2E"
				onclick="updateConfirm()">��Ű ����</a>

			<!-- ���� ��ư Ŭ���� - confirm �ް� ���� - list�� �̵� -->
			<button id="btn1" name="f" onclick="deleteConfirm()"
				class="btn btn-warning">��Ű����</button>



		<!-- �ڷ� ��ư Ŭ���� - list�� �̵� -->
		<c:choose>
			<c:when test="${nowPage == ''}">
				<a href="#" class="btn"
					style="color: black; background-Color: #FACC2E"
					onclick="location='mainpage'">��Ű
					�ڷ�</a>
			</c:when>
			<c:otherwise>
				<a href="#" class="btn"
					style="color: black; background-Color: #FACC2E"
					onclick="location='wikiList?nowPage=<s:property value="nowPage"/>'">��Ű
					�ڷ�</a>

			</c:otherwise>
		</c:choose>

	</div>
</div>
<br />
<!-- detail ���̺� �� -->
<s:include value="footer.jsp"></s:include>