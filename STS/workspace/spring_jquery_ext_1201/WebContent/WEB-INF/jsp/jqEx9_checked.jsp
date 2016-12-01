<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>
	$(function(){
		// 노드들중에서 형제노드 + 
		$val = $('#content  input:not(:checked) + span')
			.css('backgroundColor','yellow');
		// 체크 유무를 판단.
		console.log("Checked :"+$('#f1').is(':checked'));
		console.log("Checked :"+$('#f2').is(':checked'));
		// $val은 결국 체크가 안된 input을 의미하는데
		// span의 값을 console.log에 하나씩 , 출력해보기 - 연습문제 
		$.each($val,function(idx,item){
			console.log(idx+":"+$(this).text());
		});
	});
</script>	    
<!-- jqEx9_checked.jsp  -->
<div id="article">
	<div id="header2">
		<h1>  uri : jQuery : checkbox </h1>
		<p id="time">2016. 5. 26.</p>
	</div>
	<div id="content">
		<div>
		<input type="checkbox" name="fruit" id="f1" value="사과">
		<span>사과</span>
		<input type="checkbox" name="fruit" value="바나나">
		<span>바나나</span>
		<input type="checkbox" name="fruit" id="f2" checked="checked" 
		value="오렌지">
		<span>오렌지</span>
		</div>
	</div>
</div>