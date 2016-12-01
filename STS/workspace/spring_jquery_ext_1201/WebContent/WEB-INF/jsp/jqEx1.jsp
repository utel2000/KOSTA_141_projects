<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<script>
	$(document).ready(function(){
		$('*').css('backgroundColor', 'pink'); 
		$('table').css('width','500');
		$('tr:even').css('backgroundColor', 'pink'); 
		$('tr:odd').css('backgroundColor', 'yellow'); 
	});
</script>
<div id="article">
	<div id="header2">
		<h1>Ex1 : jQuery : 요소 선택자 !</h1>
		<p id="time">Oct 1th, 2011</p>
	</div>
	<div>
		<table>
			<c:forEach begin="1" step="1" end="10" varStatus="i">
			<tr><td>${i.index}</td></tr>
			</c:forEach>
		</table>
	</div>
</div>