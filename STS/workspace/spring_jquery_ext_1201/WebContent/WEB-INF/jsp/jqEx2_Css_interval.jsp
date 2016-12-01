<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>
$(document).ready(function(){
	// 자바스크립트 배열
	var col = ['red','green','blue','orange','gray'];
	var num = 0;
	// setInterval : 1초당 반복하면서 function 을 수행 
	var inter = setInterval(function(){
		console.log(num);
		// id가 article 인 요소를 선택해서
		// 그 요소의 스타일을 지정 할 때 배열의 인덱스로 적용한 예제 
		$('#article').css('backgroundColor',col[num]);
		num++;
		// clearInterval : 특정 조건을 만족했을 때 반복적인 interval을 종료 
		if(num >= col.length){
			clearInterval(inter); //Interval 종료
			num=0;
		}
	}, 1000);
	
});
</script>    
<div id="article">
	<div id="header2">
		<h1>Ex2 : jQuery : Css와 Interval </h1>
		<p id="time">Oct 1th, 2011</p>
	</div>
	<div>
		<!-- content Start -->
		<div > 나의 첫번째 JQuery 실습1 !</div>
		<!-- content End -->
	</div>
</div>