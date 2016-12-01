<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<script>
	$(function(){
		// 자손, 자식 
		// 자손 : html head | body div p
		// 자식 : 직계 자식 div > p
		$('#content > div > p').css('color','red');
		// 체이닝 방식
		$('#content > div').css('background','yellow')
		.css('width','300').css('height','110');
		// map / 리터럴 
		$('#d').css({'background':'green','width':'500'});
		var num = $('div').size();
		console.log(num);
	});
</script>	
<!-- jqEx3_selector.jsp , 자식, 자손 요소 -->
<div id="article">
	<div id="header2">
		<h1>Ex1 : jQuery : selector 기본 예제 (자식, 자손 요소 )</h1>
		<p id="time">Oct 1th, 2011</p>
	</div>
	<div id="content">
		<p>OK1</p>
		<div>
			Test1
			<p>OK2 : RED (#content > div > p )</p>
		</div>
		<div id="d">Test1</div>
		<div>Test1</div>
		<div>Test1</div>
		<div>Test1</div>
	</div>
</div>



