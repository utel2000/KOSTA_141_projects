<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<script>
	$(function(){
		// �ڼ�, �ڽ� 
		// �ڼ� : html head | body div p
		// �ڽ� : ���� �ڽ� div > p
		$('#content > div > p').css('color','red');
		// ü�̴� ���
		$('#content > div').css('background','yellow')
		.css('width','300').css('height','110');
		// map / ���ͷ� 
		$('#d').css({'background':'green','width':'500'});
		var num = $('div').size();
		console.log(num);
	});
</script>	
<!-- jqEx3_selector.jsp , �ڽ�, �ڼ� ��� -->
<div id="article">
	<div id="header2">
		<h1>Ex1 : jQuery : selector �⺻ ���� (�ڽ�, �ڼ� ��� )</h1>
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



