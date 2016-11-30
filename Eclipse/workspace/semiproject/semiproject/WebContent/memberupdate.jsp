
<%@ page language="java" contentType="text/html; charset=EUC-KR"
 pageEncoding="EUC-KR"%>
<%@ include file="header.jsp"%>
<script>
// f : file객체의 주소
 function fileInfo(f){
 
 // files를 사용해서 파일 객체의 정보를 가져온다.(배열타입으로 반환)
  var file = f.files;
  // type.indexOf : 파일의 타입을 확인하는 메서드
  if(file[0].type.indexOf('image') < 0){ // 선택한 파일이 이미지인지 확인
   alert('이미지 파일만 선택하세요.');
   return;
  }
  // FileReader 객체사용 : HTML5에서 새롭게 추가된 API
  var reader = new FileReader(); // FileReader 객체 사용
  // reader.onload : 파일업로드를 사용해서 파일이 모두 읽어졌을 때
  // 익명함수를 실행하며 읽어 온 파일의 정보를 rst로 전달
  reader.onload = function(rst){
   document.getElementById("img_box").innerHTML 
   = "<img src='" + rst.target.result + "' style='width:120px'>";
  }
  reader.readAsDataURL(file[0]); // 파일을 읽는다
 }/*
 $(function(){
  $('#update').click(function(){
   alert("회원정보를 수정하시겠습니까?");
   var m_num = $('#m_num').val();
   location="updateok?m_num="+m_num;
   }); 
 });
 */
</script>

<style>
#id {
 width: 50%;
}

#pwd {
 width: 50%;
}

#name {
 width: 50%;
}

#email {
 width: 50%;
}

#img {
 width: 50%;
}
</style>
<div class="container se">
 <h2>회원정보 수정</h2>
 <br />
 <br />
 <form class="form-horizontal" role="form" method="post"
  action="updateok" autocomplete="off" enctype="multipart/form-data">
  <div class="form-group">
  <input type="hidden" name="m_num" value="${sessionScope['m_num'] }">
   <label class="control-label col-sm-2" for="id">UserID : </label>
   <div class="col-sm-10">
    <input type="text" name="m_id" class="form-control" id="id"
     placeholder="Enter Your UserID" >
   </div>
  </div>

  <div class="form-group">
   <label class="control-label col-sm-2" for="pwd">Password : </label>
   <div class="col-sm-10">
    <input type="password" name="m_pwd" class="form-control" id="pwd"
     placeholder="Enter Your password">
   </div>
  </div>

  <div class="form-group">
   <label class="control-label col-sm-2" for="name">UserName : </label>
   <div class="col-sm-10">
    <input type="text" name="m_name" class="form-control" id="name"
     placeholder="Enter Your Name">
   </div>
  </div>

  <div class="form-group">
   <label class="control-label col-sm-2" for="email">Email : </label>
   <div class="col-sm-10">
    <input type="text" name="m_email" class="form-control" id="email"
     placeholder="Enter Your Email">
   </div>
  </div>

  <div class="form-group">
   <label class="control-label col-sm-2" for="img">Image : </label>
   <div class="col-sm-10">
    <input type="file" name="upload" id="upfile" onchange="fileInfo(this)">
    <div id="img_box"></div>
    <br />
   </div>
  </div>

  <div class="form-group">
   <div class="col-sm-offset-6 col-sm-10">
    <button type="submit" class="btn btn-primary" id="update">확인</button>
   </div>
  </div>
 </form>
</div>
<br />
<%@ include file="footer.jsp"%>