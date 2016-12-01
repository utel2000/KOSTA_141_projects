<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<style>
	#content > table { table-layout: auto; width: 75%}
	.textstyle{ color:blue; font-weight: bold;
		background: yellow;
	 }
</style>	
<script>
	$(function() {
		$('#content td').addClass('textstyle');
		// n번째 미만에 위치하는 문서 객체를 선택
		$('#content td:lt(1)').removeClass('textstyle');
		// n번째 초과 위치에 문서 객체를 선택
		$('#content td:gt(3)').removeClass('textstyle');
	});
</script>
<!--  jqEx7_ltgt.jsp -->
<div id="article">
	<div id="header2">
		<h1>jqEx7 : jQuery :</h1>
		<p id="time">2016. 5. 25.</p>
	</div>
	<div id="content">
		<table>
			<tr>
				<td>zero</td>
				<td>one</td>
				<td>two</td>
			</tr>
			<tr>
				<td>three</td>
				<td>four</td>
				<td>five</td>
			</tr>
		</table>
	</div>
</div>