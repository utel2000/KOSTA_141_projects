<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<script>
	$(function(){
		$('#content ul > li').css("background","white")
		.css("border","1px dotted gray")
	});
</script>	    
<!--  testData.jsp -->
<div id="article">
	<div id="header2">
		<h1>  uri : jQuery : </h1>
		<p id="time">2016. 5. 26.</p>
	</div>
	<div id="content">
		<div>
			<ul class="pdata">
				<c:forEach var="e" items="${list }">
				<li>¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú${e }</li>
				</c:forEach>
			</ul>
			<ul class="pdata2">
				<c:forEach var="e" items="${list }">
				<li>¡Ú¡Ú${e }</li>
				</c:forEach>
			</ul>
			<ul class="pdata3">
				<c:forEach var="e" items="${list }">
				<li>¡Ú${e }</li>
				</c:forEach>
			</ul>
			<ul class="pdata4">
				<c:forEach var="e" items="${list }">
				<li> ${e }</li> 
				</c:forEach>
			</ul>
			<ul class="pdata5">
				<c:forEach var="e" items="${list }">
				<li> ¢¾ ${e }</li>
				</c:forEach>
			</ul>
		</div>
	</div>
</div>