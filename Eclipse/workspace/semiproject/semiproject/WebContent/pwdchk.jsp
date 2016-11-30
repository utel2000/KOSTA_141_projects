<%@ page language="java" contentType="text/html; charset=EUC-KR"
 pageEncoding="EUC-KR"%>

<%@ include file="header.jsp"%>

<style>
 #id{ width: 50%; }
 #name { width: 50%;}
 #email { width: 50%;}
</style>


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
 <h2>비밀번호 찾기</h2>
 <br />
 <br />

 <form class="form-horizontal" role="form" method="post" action="pwdfind">
 <div class="form-group">
   <label class="control-label col-sm-2" for="id">Id : </label>
   <div class="col-sm-10">
    <input type="text" name="m_id" class="form-control" id="id" placeholder="Enter Your Id">
   </div>
  </div>

  <div class="form-group">
   <label class="control-label col-sm-2" for="name">Name : </label>
   <div class="col-sm-10">
    <input type="text" name="m_name" class="form-control" id="name" placeholder="Enter Your Name">
   </div>
  </div>

  <div class="form-group">
   <label class="control-label col-sm-2" for="email">Email : </label>
   <div class="col-sm-10">
    <input type="email" name="m_email" class="form-control" id="email" placeholder="Enter Your Email">
   </div>
  </div>

  <div class="form-group">
   <div class="col-sm-offset-6 col-sm-10">
    <button type="submit" class="btn btn-primary">찾기</button>
   </div>
  </div>
 </form>
</div>
<br />
<%@ include file="footer.jsp"%>