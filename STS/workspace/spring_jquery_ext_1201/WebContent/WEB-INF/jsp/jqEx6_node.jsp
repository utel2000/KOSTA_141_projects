<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>
	$(function(){
		// div�� ��� �ڽĵ鿡�� �۾� ����
		var $node1 = $('#content > div').children().css('color','red');
		$('#content > span').append($node1.size());
		// $node1�� �� 6���� �迭��� (���տ��) �ε����� 1���� �ش�Ǵ� ��Ҹ� ����
		var $nodev = $node1.eq(2);
		// span�� �ڽ��� �� ���
		// �ε����� 1�� ���� ������ ��� ����
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
        <span>�ڽĳ�� �� : </span>
	</div>
</div>