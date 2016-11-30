<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:include value="header.jsp"></s:include>
<script>
	$(document).ready(function(e) {
		$('#w_category').click(function(e) {
			e.preventDefault();
			var param = $('#w_category').val();
			console.log(param);
		});
	});

	//f : file��ü�� �ּ�
	function fileInfo(f) {

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
			document.getElementById("img_box").innerHTML = "<img src='" + rst.target.result + "' style='width:140px'>";
		}
		reader.readAsDataURL(file[0]); // ������ �д´�
	}
	;

	function addCheck() {
		if ($('#w_title').val() === "") {
			$('#w_title_check').val("������ �Է��Ͻÿ�.");
			return false;
		}
		if ($('#w_content').val().trim() === "") {
			$('#w_content_check').val("�� ������ �Է��Ͻÿ�.");
			return false;
		}
		$('#f').submit();
	}
	;

	function clear1() {
		$('#w_title_check').val("");
	}

	function clear2() {
		$('#w_content_check').val("");
	}
</script>
<style>
#wrap {
	border: 1px solid;
	border-color: black;
}

#img_box {
	width: 50%;
	height: 50%;
}

#w_title_check {
	color: red;
}

#w_content_check {
	color: red;
}

</style>

<div class="container">
	<div class="row">
		<hgroup class="mb20">
			<h2>Add Result</h2>
			<h3 class="lead">
				<strong class="text-danger">[New] </strong> ��Ű �߰��ϱ�~
			</h3>
		</hgroup>
		<form method="post" id="f" action="wikiAdd"
			enctype="multipart/form-data">
			<div
				class="col-xs-12 col-sm-12 col-md-6 col-lg-12 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-0 toppad">
				<div class="panel panel-info" id="wrap">

					<div class="panel-heading" style="background: #facc2e;"></div>
					<div class="panel-body">
						<div class="row">
							<div class=" col-md-9 col-lg-12">
								<table class="table table-user-information" id="addTable">
									<tr>
										<td>����</td>
										<td><input type='text' name='w_title' id='w_title'
											class='form-control' onkeydown="clear1()" /> <input
											type="text" id="w_title_check" readonly="readonly"></td>
									</tr>
									<tr>
										<td>ī�װ�</td>
										<td>
											<div class='form-group-sel'>
												<select name='w_category' class='form-control'
													id="w_category">
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
											<div class='form-group'>
												<textarea class='form-control' name='w_content'
													id='w_content' rows='10' onkeydown="clear2()"></textarea>
											</div> <input type="text" id="w_content_check" readonly="readonly">
										</td>
									</tr>
									<tr>
										<td>������ �ҽ�</td>
										<td><input type='text' name='w_src' class='form-control' /></td>
									</tr>
									<tr>
									</tr>
									<tr>
										<td>���� �߰�</td>
										<td><input type="file" name="upload" id="w_img"
											placeholder="Enter Your img" onchange="fileInfo(this)"><br />
											<div id="img_box"></div></td>
									</tr>
								</table>
							</div>
						</div>

					</div>

					<div class="panel-footer" style="background: #facc2e;"></div>

				</div>
			</div>
		</form>
	</div>
	<div style="float: right;">
		<button class="btn" type="button" style="background-Color: #FACC2E;"
			id="btn_add" onclick="addCheck()">��Ű ���</button>

		<a href="#" class="btn"
			style="color: black; background-Color: #FACC2E"
			onclick="location='wikiList'">��Ű ���</a>
	</div>


</div>
<br />
<s:include value="footer.jsp"></s:include>
