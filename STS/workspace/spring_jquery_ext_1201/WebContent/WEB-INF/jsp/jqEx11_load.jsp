<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<style>
	#target { width: 100%; border: 1px dotted red; display: none;}
</style>    
<script>
	$(function(){
		$('#loadBtn').click(function(){
			var url = "testdata .pdata";
			// show() 이미 감춰진 요소를 다시 보여주는 메서드 
			$('#target').load(url,function(){
				$(".pdata > li").css('background','white');
			}).show();
		});
	});
</script>	    
<!--  jqEx11_load  -->
<div id="article">
	<div id="header2">
		<h1> jqEx11 : jQuery : </h1>
		<p id="time">2016. 5. 26.</p>
	</div>
	<div id="content">
		<input type="button" value="Ajaxload" id="loadBtn"><br />
		<div id="target"></div>
	</div>
</div>