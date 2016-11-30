<%@ page language="java" contentType="text/html; charset=EUC-KR"
 pageEncoding="EUC-KR"%>
<%@include file="header.jsp"%>
<%
 String path=application.getRealPath("img/");
 System.out.println(path);
%>
<script>
 // JQuery
 $(document).ready(function(){
  $('#managerDel').click(function(){
   var id = '${id}';
   confirm("정말로 삭제하시겠습니까?");
   location="managerdelete?id="+id;
   }); 
 });
</script>
<div class="container">
  <div class="row">
   <div class="col-md-5  toppad  pull-right col-md-offset-3 ">
    <br>
    <p class=" text-info"></p>
   </div>
   <div
    class="col-xs-12 col-sm-12 col-md-9 col-lg-9 col-xs-offset-8 col-sm-offset-8 col-md-offset-4 col-lg-offset-1 toppad">
    <div class="panel panel-info">
     <div class="panel-heading">
      <h3 class="panel-title">회원정보 디테일</h3>
     </div>
     <div class="panel-body">
      <div class="row">
       <div class="col-md-3 col-lg-3 " align="center">
        <img src="img/<s:property value="vo.m_img"/>" class="img-rounded" width="200px" height="200">
       </div>
       <div class=" col-md-9 col-lg-9 ">
        <table class="table table-user-information">
         <tbody>
          <tr>
           <td>이름 :</td>
           <td>${vo.m_name}</td>
          </tr>
          <tr>
           <td>아이디 :</td>
           <td>${vo.m_id}</td>
          </tr>
          <tr>
           <td>이메일</td>
           <td>${vo.m_email}</a></td>
           <input type="hidden" id="m_id" value="${sessionScope['m_id']}">
          </tr>
          <tr>
         </tbody>
        </table>
       </div>
      </div>
      <div class="col-sm-offset-9 col-sm-10">
       <button class="btn btn-default" id="managerDel" >삭제</button>
       <input type="button" class="btn btn-default" value="확인" onclick="location='managerList'">
      </div>
     </div>
    </div>
   </div>
  </div>
</div>
<br />
<%@ include file="footer.jsp"%> 
