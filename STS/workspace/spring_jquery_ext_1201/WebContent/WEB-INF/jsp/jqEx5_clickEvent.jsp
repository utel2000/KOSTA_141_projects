<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<style>
	#target { width: 500px; height: 300px; border: 1px solid;}
	.site1{
		background: yellow; width: 100%; height: 30px;
		font-size: 30px
	}
	.site2{
		background: pink; width: 100%; height: 50px;
		font-size: 20px; color:blue;
	}
</style>	
<script>
	$(function() {
		// 반복적인 선택자일 경우는 jQuery변수로 선언 및 대입.
		var $target = $('#content > #target > div');
		$('#btn1').click(function(){
			console.log('btn1 Click');
			$target.removeClass('site2');
			$target.addClass('site1');
		});
		$('#btn2').click(function(){
			console.log('btn2 Click');
			$target.removeClass('site1');
			$target.addClass('site2');
		})
	});
</script>
<!-- jqEx5_clickEvent.jsp  -->
<div id="article">
	<div id="header2">
		<h1>uri : jQuery : addClass,removeClass 예제 </h1>
		<p id="time">2016. 5. 25.</p>
	</div>
	<div id="content">
		<div>
			<input type="button" value="btn1" id="btn1">
			<input type="button" value="btn2" id="btn2">
		</div>
		<div id="target">
			<div id="top">Header</div>
			<div id="body">Body</div>
			<div id="bottom">Footer</div>
		</div>
	</div>
</div>