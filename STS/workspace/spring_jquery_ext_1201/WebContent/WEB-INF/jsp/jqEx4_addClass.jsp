<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<style>
	.spotlight { background: #ff0}
	.redtext { color:red}
	.largetext{ font-size: 30pt}
	.italictext{ font-style: italic;}
</style>	
<script>
	$(function() {
		//������ �����ڿ� �̹� ���ǵ� css�� class�� �������� �����ϱ� ���� �޼���
		$('span').addClass('redtext');
		//$('span').removeClass('redtext');// ����
		$('#content div').addClass('spotlight');
		$('.simpletext1').addClass('italictext');
	});
</script>
<!--   -->
<div id="article">
	<div id="header2">
		<h1>jqEx4 : jQuery : addClass, removeClass</h1>
		<p id="time">2016. 5. 25.</p>
	</div>
	<div id="content">
		<span id="simpletext1">simple</span>
		<div class="simpletext1">jQuery</div>
		<span id="simpletext2">simple</span>
		<div id="simpletext3">jQuery</div>
	</div>
</div>