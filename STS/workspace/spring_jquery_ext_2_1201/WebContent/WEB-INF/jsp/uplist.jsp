<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<style>
	#content th, td { color: #000;}
	#content a:link{ color:#000000; text-decoration: none;}

</style> 
<script>
	$(function() {
		
	});
</script>
<!--   -->
<div id="article">
	<div id="header2">
		<h1>uri : jQuery :</h1>
		<p id="time">2016. 5. 30.</p>
	</div>
	<div id="content">
		<table>
			<thead>
				<tr><th colspan="5">업 / 다운 / poi 리스트 예제 </th></tr>
				<tr>
					<th>번호</th>
					<th>이미지</th>
					<th>작성자</th>
					<th>날짜</th>
					<th>down</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="e" items="${list }">
				<tr>
					<td>${e.num }</td>
					<td>${e.mfile }</td>
					<td>${e.writer}</td>
					<td>${e.tdate }</td>
					<td><a href="fileDown?fileName=${e.mfile }">down</a></td>
				</tr>
			</c:forEach>	
			</tbody>
			<tfoot><tr><th colspan="5">
			<input type="button" value="writer" onclick="location='upform'">
			</th>
			
			</tr>
			<tr><th colspan="5">
			<a href="downloadExcel" style="color:black">
			download Excel</a></th></tr>
			</tfoot>
		</table>
	</div>
</div>