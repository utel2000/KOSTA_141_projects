<%@ page language="java" contentType="text/html; charset=EUC-KR"
 pageEncoding="EUC-KR"%>
<%@include file="header.jsp"%>
<%-- <%
 String path=application.getRealPath("img/");
 System.out.println(path);
%> --%>
<script>
 // Jquery
 $(document).ready(function(){
  $('#memberdelete').click(function(){
   confirm("������ Ż���Ͻðڽ��ϱ�?");
   //alert("������ �����Ͻðڽ��ϱ�?");
   var m_num = $('#m_num').val();
   location="memberdelete?m_num="+m_num;
   }); 
 });
 $(document).ready(function(){
  $('#update').click(function(){
   var m_num = $('#m_num').val();
   location="memberupdate?m_num="+m_num;
  });
 });
 /*
 function memberdelete(){
  confirm("������ �����Ͻðڽ��ϱ�?");
  var id = $('#m_id').val();
  location="memberdelete?m_id="+id;
 }*/
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
      <h3 class="panel-title">����������</h3>
     </div>
     <div class="panel-body">
      <div class="row">
       <div class="col-md-3 col-lg-3 " align="center">
        <img src="img/<s:property value="img"/>" class="img-rounded" width="200px" height="200">
       </div>
       <div class=" col-md-9 col-lg-9 ">
        <table class="table table-user-information">
         <tbody>
          <tr>
           <td>�̸� :</td>
           <%-- <td><s:property value="m_num"/></td> --%>
           <%--<td>${sessionScope["m_name"]}</td> --%>
           <td>${vo.m_name}</td>
          </tr>
          <tr>
           <td>���̵� :</td>
           <!-- <td><property value="m_id"/></td> -->
           <%-- <td>${sessionScope["m_id"]}</td> --%>
           <td>${vo.m_id}</td>
          </tr>
          <tr>
           <td>�̸��� : </td>
           <!-- <td><property value="m_email"/></td> -->
           <%-- <td>${sessionScope["m_email"]}</a></td> --%>
           <td>${vo.m_email}</a></td>
           <input type="hidden" id="m_num" value="${sessionScope['m_num']}">
          </tr>
          <tr>
         </tbody>
        </table>
       </div>
      </div>
      <div class="col-sm-offset-9 col-sm-10">
       <button class="btn btn-default" id="update">����</button>
       <button class="btn btn-default" id="memberdelete">����</button>
       <input type="button" class="btn btn-default" value="Ȯ��" onclick="location='mainpage'">
      </div>
     </div>
    </div>
   </div>
  </div>
</div>
<br />
<%@ include file="footer.jsp"%> 