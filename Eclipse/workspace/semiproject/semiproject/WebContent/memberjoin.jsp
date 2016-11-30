<%@ page language="java" contentType="text/html; charset=EUC-KR"
 pageEncoding="EUC-KR"%>
<%@ include file="header.jsp"%>

<script>
 function fileInfo(f) {
  var file = f.files;

  if (file[0].type.indexOf('image') < 0) {
   alert('�̹��� ���ϸ� �����ϼ���.');
   return;
  }
  var reader = new FileReader();

  reader.onload = function(rst) {
   document.getElementById("img_box").innerHTML = "<img src='" + rst.target.result + "' style='width:120px'>";
  }
  reader.readAsDataURL(file[0]);
 }

 $(document).ready(function(){
     $("#flip").click(function(){
         $("#panel").slideDown("slow");
     });
 });

   
 /* Progress bar*/
 var width = 60;
 $(document).ready(function() {
  $('#flip').click(function(){
   var elem = document.getElementById("progressBar");
   var id = setInterval(frame, 600);
   function frame() {
    if (width <= 0) {
     clearInterval(id);     
     alert("���ѽð��� ����Ǿ����ϴ�.");
     location.href = "index";
    } else {
     width--;
     console.log("width:" + width);
     elem.style.width = width + '��';
     $('#label').text(width + '��');
    }
   }
  });
 });

 $(document).ready(function() {
  // Ajax �ʱ� ������ formŸ������ �����Ѵ�. for post
  $('#id').keyup(function() {
   $.ajaxSetup({
    contentType : 'application/x-www-form-urlencoded;charset=utf8'
   });
   $.ajax({
    url : "memberIdcheck",
    type : "post",
    data : {
     m_id : $('#id').val()
    },
    success : function(data) {
     $('#div_checkId_res').html(data);
    }
   });
  });
 });

 $(document).ready(function() {
  $('tr:odd').css('backgroundColor', '#FCEEBB');
  $('tr:even').css('backgroundColor', '#F2F5A9');
  $('#sendRes').click(function() { 
   var cnt = 0;
   var tag = "<s:iterator var="listv" value="list" status="sid"><input type='hidden' id='ans<s:property value='q_num'/>' value='<s:property value="q_answer" />'></s:iterator>"
   $('p').html(tag);
   for (var i = 1; i <= 10; i++) {
    var q_ans = "#ans" + i
    var resName= "res" + i    
    var radioChk="input[type=radio][name="+resName+"]:checked";
    var ans = $(q_ans).val();
    var res = $(radioChk).val();        
    if (res == ans) {
     cnt++;
    }
   }
   if(cnt > 5){
    $("input[name='m_grade']").attr("value", "queenbee"); 
   }
   else{
    $("input[name='m_grade']").attr("value", "bee"); 
   }
  $('#iform').submit();
  });
 });
</script>

<style>
#panel, #flip {
    padding: 5px;
    text-align: center;
    background-color: #E6E6E6;
    border: solid 1px #c3c3c3;
    width: 70%
}

#panel {
    padding: 50px;
    display: none;
}

#id {width: 50%;}
#pwd {width: 50%;}
#name {width: 50%;}
#email {width: 50%;}
#img {width: 50%;}

</style>
<div class="container se" style="margin-left: 250px">

 <h2>���������</h2>
 <br /> <br />
 <form class="form-horizontal" role="form" method="post" action="joinok" id="iform" autocomplete="off" enctype="multipart/form-data">

  <div class="form-group">
   <label class="control-label col-sm-2" for="id">UserID : </label>
   <div class="col-sm-10">
    <input type="text" name="m_id" class="form-control" id="id"
     placeholder="Enter Your Id" onkeyup="idCheck()">
   </div>

   <div class="col-md-4" id="div_checkId_res"
    style="color: red; text-align: right;"></div>
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
     placeholder="Enter Your UserName">
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
    <input type="file" name="upload" id="upfile"
     placeholder="Enter Your img" onchange="fileInfo(this)">
    <div id="img_box"></div>
    <br />
   </div>
  </div>
  
  <div class="Progress">
  <p>60�ʾȿ� �Ϸ��ؾ� �մϴ�.</p>
  <div id="progressBar" class="progress-bar progress-bar-danger"
   role="progressbar" aria-valuenow="70" aria-valuemin="0"
   aria-valuemax="100" style="width: 70%">
   <div id="label">60��</div>
  </div>
  </div><br/><br/>
  <div id="flip" onclick="">�� �� Ǯ ��</div>
  <div id="panel">
  
  <table class="table table-bordered" style="width: 100%">
   <thead>
    <td>�� ��</td>
    <td colspan="2">�� �� �� ��</td>
   </thead>
   <tbody>
    <s:iterator var="listv" value="list" status="sid">
     <tr>
      <td><s:property value="q_question" /></td>
      <td><input type="radio" name="res<s:property value="q_num"/>"
       id="res<s:property value="q_num"/>" value="Yes">Yes</td>
      <td><input type="radio" name="res<s:property value="q_num"/>"
       id="res<s:property value="q_num"/>" value="No">No</td>
     </tr>
    </s:iterator>
   </tbody>
  </table>
  <p></p>
  <div id="cnt"></div>
  <div style="margin-left: 500px">
   <button type="reset" class="btn"
    style="background-Color: #E64C4C; font-size: 14pt;">Reset</button>
   <button id="sendRes" class="btn"
    style="color: black; background-Color: #FACC2E; font-size: 14pt;">
    ȸ������</button>
  </div>
  </div>
      <input type="hidden" name="m_grade" value="">
 </form>
</div>

<%@ include file="footer.jsp"%>