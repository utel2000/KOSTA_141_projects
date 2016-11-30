<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:include value="header.jsp"></s:include>
<style>
#wrap {
	border: 1px solid;
	border-color: black;
}

#w_img {
	width: 250px;	
}

#img_box{
	width: 250px;
	height: 330px;
}

</style>
<script>
 $(document)
   .ready(
     function() {
      document.getElementById("img_box").innerHTML = "<img alt='User Pic' src='img/"
        + "<s:property value="wvo.w_img"/>"
        + "' style='width:250px; height: 330px' class='img-rounded img-responsive'>";
     })

 function fileInfo(f) {
  // f : file��ü�� �ּ�
  // files�� ����ؼ� ���� ��ü�� ������ �����´�.(�迭Ÿ������ ��ȯ)
  var file = f.files;
  // type.indexOf : ������ Ÿ���� Ȯ���ϴ� �޼���
  if (file[0].type.indexOf('image') < 0) { // ������ ������ �̹������� Ȯ��
   alert('�̹��� ���ϸ� �����ϼ���.');
   return;
  }
  // FileReader ��ü��� : HTML5���� ���Ӱ� �߰��� API
  var reader = new FileReader(); // FileReader ��ü ���
  // reader.onload : ���Ͼ��ε带 ����ؼ� ������ ��� �о����� ��
  // �͸��Լ��� �����ϸ� �о� �� ������ ������ rst�� ����
  reader.onload = function(rst) {
   document.getElementById("img_box").innerHTML = "<img alt='User Pic' src='" + rst.target.result + "' style='width:250px; height: 330px' class='img-rounded img-responsive'>";
  }
  reader.readAsDataURL(file[0]); // ������ �д´�
 }
</script>
<form action="wikiUpdate" method="post" enctype="multipart/form-data">
	<input type="hidden" name="w_num"
		value="<s:property value="wvo.w_num"/>">
	<!-- w_update_mem�� �α��� �Ǿ��ִ� ȸ���� ��ȣ�� ���߿� �ٲ��� �� -->
	<input type="hidden" name="w_update_mem" value="${sessionScope['m_num'] }"> <input
		type="hidden" name="nowPage" value='<s:property value="nowPage"/>'>
	<input type="hidden" name="prevImg"
		value="<s:property value="wvo.w_img"/>">
	<div class="container">
		<div class="row">
			<hgroup class="mb20">
				<h2>Update Result</h2>
				<h3 class="lead">
					<strong class="text-danger">[<s:property
							value="wvo.w_title" />
					</strong> ��Ű �����ϱ�~
				</h3>
			</hgroup>
			<div
				class="col-xs-12 col-sm-12 col-md-6 col-lg-12 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-0 toppad">


				<div class="panel panel-info" id="wrap">
					<div class="panel-heading" style="background: #facc2e;"></div>
					<div class="panel-body">
						<div class="row">

							<div class="col-md-3 col-lg-3 " align="center">
								<div id="img_box"></div>
								<br /> <input id="w_img" name="upload" class="input-file"
									type="file" onchange="fileInfo(this)">
								
							</div>
							<div class=" col-md-9 col-lg-9 ">
								<table class="table table-user-information">

									<tr>
										<td>����</td>
										<td><s:property value="wvo.w_title" /></td>
									</tr>
									<tr>
										<td>������ �ҽ�</td>
										<td>
											<textarea class="form-control" name="w_src" rows="1" id="w_src"><s:property value="wvo.w_src"/></textarea>
										</td>
									</tr>
									<tr>
										<td>ī�װ�</td>
										<td>
											<div class='form-group'>
												<select name='w_category' class='form-control'>
													<option value="1">��ġ</option>
													<option value="2">��ȭ</option>
													<option value="3">����</option>
													<option value="4">��Ÿ</option>
												</select>
											</div>
										</td>
									</tr>

									<tr>

									</tr>
									<tr>
										<td>�� ����</td>
										<td>
											<div class="form-group">
												<textarea class="form-control" name="w_content" rows="10"
													id="w_content"><s:property value="wvo.w_content" /></textarea>
											</div>
										</td>
									</tr>

								</table>
							</div>
						</div>
					</div>
					<div class="panel-footer" style="background: #facc2e;"></div>
				</div>
			</div>
		</div>
		<div style="float: right;">
			<input class="btn" type="submit"
				style="color: black; background-Color: #FACC2E" value="��Ű ���� ">

			<a href="#" class="btn"
				style="color: black; background-Color: #FACC2E"
				onclick="location='wikiDetail?w_num=<s:property value="wvo.w_num"/>&nowPage=<s:property value="nowPage"/>'">�������</a>
		</div>
	</div>
</form>
<br />
<s:include value="footer.jsp"></s:include>
