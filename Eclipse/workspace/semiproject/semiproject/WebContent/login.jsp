<%@ page language="java" contentType="text/html; charset=EUC-KR"
 pageEncoding="EUC-KR"%>
<%@ include file="header.jsp"%>
<style>
 #id { width: 50%;}
 #pwd { width: 50%;}

</style>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
 function loginchk(){
  var idv = document.getElementById("id");
  if(idv.value == ""){
   alert("아이디를 입력하세요");
   idv.focus();
   return false;
  }
  var pwdv = document.getElementById("pwd");
  if(pwdv.value ==""){
   alert("비밀번호를 입력하세요");
   pwdv.focus();
   return false;
  }
  var f = document.LogF;
  f.submit();
 }
</script>
<div class="container">
    <div class="col-xs-6 col-sm-3">
        <a href="#" class="thumbnail" data-toggle="modal" data-target="#lightbox"> 
            <img src="https://s3.amazonaws.com/ooomf-com-files/lqCNpAk3SCm0bdyd5aA0_IMG_4060_1%20copy.jpg" alt="...">
        </a>
    </div>
    <div class="col-xs-6 col-sm-3">
        <a href="#" class="thumbnail" data-toggle="modal" data-target="#lightbox"> 
            <img src="https://s3.amazonaws.com/ooomf-com-files/deYU3EyQP9cN23moYfLw_Dandelion.jpg" alt="...">
        </a>
    </div>
    <div class="col-xs-6 col-sm-3">
        <a href="#" class="thumbnail" data-toggle="modal" data-target="#lightbox"> 
            <img src="https://s3.amazonaws.com/ooomf-com-files/8H0UdTsvRFqe03hZkNJr_New%20York%20-%20On%20the%20rock%20-%20Empire%20State%20Building.jpg" alt="...">
        </a>
    </div>
    <div class="col-xs-8 col-sm-3">
        <a href="#" class="thumbnail" data-toggle="modal" data-target="#lightbox"> 
            <img src="https://s3.amazonaws.com/ooomf-com-files/Z3LXxzFMRe65FC3Dmhnp_woody_unsplash_DSC0129.jpg" alt="...">
        </a>
    </div>
</div>

<div id="lightbox" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <button type="button" class="close hidden" data-dismiss="modal" aria-hidden="true">×</button>
        <div class="modal-content">
            <div class="modal-body">
                <img src="" alt="" />
            </div>
        </div>
    </div>
</div>

<div class="container se">

 <h2>로그인</h2>
 <br />
 <br />

 <form class="form-horizontal" role="form" method="post" action="loginok">
  <div class="form-group">
   <label class="control-label col-sm-2" for="id">UserID : </label>
   <div class="col-sm-10">
    <input type="text" name="m_id" class="form-control" id="id" placeholder="Enter Your Id">
   </div>
  </div>

  <div class="form-group">
   <label class="control-label col-sm-2" for="pwd">Password : </label>
   <div class="col-sm-10">
    <input type="password" name="m_pwd" class="form-control" id="pwd" placeholder="Enter Your password">
   </div>
  </div>

  <div class="form-group">
   <div class="col-sm-offset-2 col-sm-10">
    <div>
     <label><a href="idchk">아이디 찾기</a></label>
     <label><a href="pwdchk">비밀번호 찾기</a></label>
    </div>
   </div>
  </div>

  <div class="form-group">
   <div class="col-sm-offset-6 col-sm-10">
    <button type="submit" class="btn" style="color: black; background-Color:#FACC2E" onclick="loginchk()">Login</button>
   </div>
  </div>
 </form>
</div>
<br />
<%@ include file="footer.jsp"%>