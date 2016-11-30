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
  // f : file객체의 주소
  // files를 사용해서 파일 객체의 정보를 가져온다.(배열타입으로 반환)
  var file = f.files;
  // type.indexOf : 파일의 타입을 확인하는 메서드
  if (file[0].type.indexOf('image') < 0) { // 선택한 파일이 이미지인지 확인
   alert('이미지 파일만 선택하세요.');
   return;
  }
  // FileReader 객체사용 : HTML5에서 새롭게 추가된 API
  var reader = new FileReader(); // FileReader 객체 사용
  // reader.onload : 파일업로드를 사용해서 파일이 모두 읽어졌을 때
  // 익명함수를 실행하며 읽어 온 파일의 정보를 rst로 전달
  reader.onload = function(rst) {
   document.getElementById("img_box").innerHTML = "<img alt='User Pic' src='" + rst.target.result + "' style='width:250px; height: 330px' class='img-rounded img-responsive'>";
  }
  reader.readAsDataURL(file[0]); // 파일을 읽는다
 }
</script>
<form action="wikiUpdate" method="post" enctype="multipart/form-data">
	<input type="hidden" name="w_num"
		value="<s:property value="wvo.w_num"/>">
	<!-- w_update_mem은 로그인 되어있는 회원의 번호임 나중에 바꿔줄 것 -->
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
					</strong> 위키 수정하기~
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
										<td>제목</td>
										<td><s:property value="wvo.w_title" /></td>
									</tr>
									<tr>
										<td>동영상 소스</td>
										<td>
											<textarea class="form-control" name="w_src" rows="1" id="w_src"><s:property value="wvo.w_src"/></textarea>
										</td>
									</tr>
									<tr>
										<td>카테고리</td>
										<td>
											<div class='form-group'>
												<select name='w_category' class='form-control'>
													<option value="1">정치</option>
													<option value="2">문화</option>
													<option value="3">과학</option>
													<option value="4">기타</option>
												</select>
											</div>
										</td>
									</tr>

									<tr>

									</tr>
									<tr>
										<td>상세 설명</td>
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
				style="color: black; background-Color: #FACC2E" value="위키 수정 ">

			<a href="#" class="btn"
				style="color: black; background-Color: #FACC2E"
				onclick="location='wikiDetail?w_num=<s:property value="wvo.w_num"/>&nowPage=<s:property value="nowPage"/>'">수정취소</a>
		</div>
	</div>
</form>
<br />
<s:include value="footer.jsp"></s:include>
