<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>        
<style>
   #target img{ width: 550px; height: 350px; margin: 50px}
   #imgCnt img { width: 100px; height:60px; cursor:pointer }
   #imgCnt ul li { float: left;  
   background:white;
   border: 1px solid dotted; padding: 2px;}
</style>    
<script>
	$(function(){
		//$('#content img').css('width','120px')
		//$('#content img').attr('width',120);
// 		$('#content img').attr('width',function(idx){
// 			return (idx + 1) * 100;
// 		}).attr('border','3');
		$('img').click(function(){
// 			console.log($(this).attr('src').valueOf());
			$('#target img').attr('src',$(this).attr('src').valueOf());
		});
// 	 	$('img').bind({
// 		mouseenter:function(){
// 			$('#target img').attr('src',$(this).attr('src').valueOf());
// 		}
// 	})


	});
</script>	    
<!--  jqEx14_attr.jsp  -->
<div id="article">
	<div id="header2">
		<h1>  uri : jQuery : </h1>
		<p id="time">2016. 5. 26.</p>
	</div>
	<div id="content">
		<div id="subcont">
		<div id="target">
			<img src="resources/images/default.PNG">
		</div>
		<div id="imgCnt">
			<ul>
				<c:forEach varStatus="i" begin="1" end="6">
				<li><img src="resources/images/iu${i.count}.PNG"></li>
				</c:forEach>
			</ul>
		</div>
		</div>
	</div>
</div>