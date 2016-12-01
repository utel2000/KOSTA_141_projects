<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>
	$(function(){
		// div의 모든 자식들에게 글씨 레드
		var $node1 = $('#content > div').children().css('color','red');
		$('#content > span').append($node1.size());
		// $node1은 총 6개의 배열요소 (집합요소) 인덱스가 1번에 해당되는 요소를 선택
		var $nodev = $node1.eq(2);
		// span에 자식의 수 출력
		// 인덱스가 1인 에게 배경색을 노란 변경
		$nodev.css('background','yellow');
	});
</script>	    
<!-- jqEx6_node.jsp  -->
<div id="article">
	<div id="header2">
		<h1> jqEx6 : jQuery : </h1>
		<p id="time">2016. 5. 25.</p>
	</div>
	<div id="content">
		<div>
	        <em> one  </em>      
	        <a> two  </a>
	        <a> three  </a>
	        <b> four </b>
	        <a> five </a>
	        <em> six </em>
    	</div>
        <span>자식노드 수 : </span>
	</div>
</div>