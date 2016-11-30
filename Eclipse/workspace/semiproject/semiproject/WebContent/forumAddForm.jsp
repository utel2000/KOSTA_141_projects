<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@include file="header.jsp"%>
<style>
#forumimg {
	height: 230px;
	text-align: center;
}

#forumdata {
	height: 230px;
	text-align: center;
}

#forumtitle {
	width: 500px;
	border: 1px solid gray;
}

 .form-control{
   max-height: 220px ; min-height: 220px ; max-width: 745px ; min-width: 745px;
  }
  .hover{
   border: solid #f00 3px;
  }
  .no_hover{
   border: solid #000 3px;
  }
</style>

<script>
	function showimagepreview(input) {
		if (input.files && input.files[0]) {
			var filerdr = new FileReader();
			filerdr.onload = function(e) {
				$('#img_box').attr('src', e.target.result);
			}
			filerdr.readAsDataURL(input.files[0]);
		}
	};  
	
	$(document).ready(function(){
		$(function(){
			var idx = 0;
			var	title = $('#forumtitle');
			var content = $('#f_content');
			var category = $('#f_category');
			
			if (title != null & content != null & category.val() != 0){
					$('#f_content').on('keyup',function(){ 
	 				//alert("d");
	 					if(idx == 0){
		 				var compMsg = $('.completeMsg');
		 				compMsg.css({'visibility':'visible'});
		 				compMsg.hide();
		 				compMsg.fadeIn(2000);
	 					}
	 					idx++;	
					});
			}});
	});
	
</script>

<div class="container" id="wrap">
	<form method="post" action="forumAdd" enctype="multipart/form-data"">
		<hr>
		<input type="hidden" name="m_num" value="${sessionScope.m_num}" />
<!-- 포럼의 카테고리와 제목 입력 시작 -->
	<div class="formgroup" style="margin: 0px">
			<label for="sel1">게시글 분류 : </label>
  			<select id="forumsel" name="f_category" id="f_category" class="selectpicker" style="width: auto">
   				<option value="0">카테고리</option>
    			<option value="1">정치</option>
  		  		<option value="2">문화</option>
    			<option value="3">과학</option>
    			<option value="4">기타</option>
   </select> 
   
   
		 <br/><br/>
			<label for="usr">제목 입력</label> <input type="text" id="forumtitle"
				name="f_subject" autocomplete="off">
		</div>
<!-- 포럼의 카테고리와 제목 입력 끝 -->
		
		<hr />
			<div class="row" style="margin: auto ; height: 235px">
				<!-- 포럼의 이미지 등록 시작 -->
				<div class="col-md-4" id="forumimg">
					<span><img src="img/noimg2.png" id="img_box" 
						style="width: 300px; height: 220px; vertical-align: middle; border: 1px solid gray"></span>
				</div>
				
<!-- 포럼의 이미지 등록 끝 -->

<!-- 포럼의 내용을 기입 할 텍스트영역 시작 -->
				<div class="col-md-8" id="forumdata">
					<textarea class="form-control"  rows="14" id="f_content" name="f_content" autocomplete="off" ></textarea>
				</div>
<!-- 포럼의 내용을 기입 할 텍스트영역 끝 -->

			</div>
			
<!-- 폼 전송 시작 -->
					<div style="float: left ; margin-left: 40px;margin-top: 20px;  ">
						<input type="file" id="f_img" name="fileName" onchange="showimagepreview(this)"  class="btn btn-warning" display="none" style="width: 300px;"/>
					</div>
					<div style="float: right; ">
						<img src="img/complete2.png" style="margin-right: 40px; visibility:hidden" onchange="compMsg()"class="completeMsg">
						<button type="submit" class="btn btn-warning" style="margin-top: 20px">작성 완료</button>

<!-- 폼 전송 끝 -->
					
					
			
		</div>
	</form>
</div>

<br />
<%@ include file="footer.jsp"%>