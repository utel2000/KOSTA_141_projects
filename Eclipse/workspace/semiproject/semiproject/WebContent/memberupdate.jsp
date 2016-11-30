
<%@ page language="java" contentType="text/html; charset=EUC-KR"
 pageEncoding="EUC-KR"%>
<%@ include file="header.jsp"%>
<script>
// f : file��ü�� �ּ�
 function fileInfo(f){
 
 // files�� ����ؼ� ���� ��ü�� ������ �����´�.(�迭Ÿ������ ��ȯ)
  var file = f.files;
  // type.indexOf : ������ Ÿ���� Ȯ���ϴ� �޼���
  if(file[0].type.indexOf('image') < 0){ // ������ ������ �̹������� Ȯ��
   alert('�̹��� ���ϸ� �����ϼ���.');
   return;
  }
  // FileReader ��ü��� : HTML5���� ���Ӱ� �߰��� API
  var reader = new FileReader(); // FileReader ��ü ���
  // reader.onload : ���Ͼ��ε带 ����ؼ� ������ ��� �о����� ��
  // �͸��Լ��� �����ϸ� �о� �� ������ ������ rst�� ����
  reader.onload = function(rst){
   document.getElementById("img_box").innerHTML 
   = "<img src='" + rst.target.result + "' style='width:120px'>";
  }
  reader.readAsDataURL(file[0]); // ������ �д´�
 }/*
 $(function(){
  $('#update').click(function(){
   alert("ȸ�������� �����Ͻðڽ��ϱ�?");
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
 <h2>ȸ������ ����</h2>
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
    <button type="submit" class="btn btn-primary" id="update">Ȯ��</button>
   </div>
  </div>
 </form>
</div>
<br />
<%@ include file="footer.jsp"%>