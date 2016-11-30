<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
 pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>examMember.jsp</title>
<%
 String path = application.getRealPath("upfolder");
 MultipartRequest multi = new MultipartRequest(request, path, 5*1024*1024, "euc-kr", new DefaultFileRenamePolicy());
 String id = multi.getParameter("id");
 String pwd = multi.getParameter("pwd");
 int age = Integer.parseInt(multi.getParameter("age"));
 String sex = multi.getParameter("sex");
 String hobby[] = multi.getParameterValues("hobby");
 int year = Integer.parseInt(multi.getParameter("year"));
 int month = Integer.parseInt(multi.getParameter("month"));
 int day = Integer.parseInt(multi.getParameter("day"));
 String colBack = multi.getParameter("col");
 
 String fileName = multi.getFilesystemName("picProfile");
%>
</head>
<body>
 <table style="border: 3px solid; background-color: <%= colBack %>">
  <tr>
   <td rowspan="6" style="border: 1px solid;">
    <img src = "upfolder/<%= fileName %>">
   </td>
   <td style="border: 1px solid;">아이디 : </td>
   <td colspan="3" style="border: 1px solid;"><%= id %></td>
  </tr>
  <tr>
 <td style="border: 1px solid;">비밀번호 : </td>  
   <td colspan="3" style="border: 1px solid;"><%= pwd %></td>
  </tr>
  <tr>
   <td style="border: 1px solid;">나이 : </td>
   <td colspan="3" style="border: 1px solid;"><%= age %></td>
  </tr>
  <tr>
   <td style="border: 1px solid;">성별 : </td>
   <td colspan="3" style="border: 1px solid;"><%= sex %></td>
  </tr>
  <tr>
   <td style="border: 1px solid;">취미 : </td>
   <% for(String e : hobby) { %>
   <td style="border: 1px solid;"><%= e %></td>
   <% } %>
  </tr>
  <tr>
  <td style="border: 1px solid;">생년월일 : </td>
   <td colspan="3" style="border: 1px solid;"><%= year %>년 <%= month %>월 <%= day %>일</td>   
  </tr>
 </table>
</body>
</html>