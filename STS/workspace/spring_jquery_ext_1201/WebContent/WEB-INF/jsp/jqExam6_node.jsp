<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
      <style type="text/css">
      		a{ color: black;}
            .textstyle {
                font-size:14pt; line-height: 20pt; margin:10px;   
            }
            .test{
            	background-color: yellow
            }
        </style>
<script>




	$(function(){
		 $('#stBtn').click(function(){
         	var $chNode = $('#content > div').children();
         	$chNode.css("backgroundColor","white");
             var i = 0;
             var inter = setInterval(function() {
                 var $node = $chNode.eq(i);
                 console.log("node",$node.html()+"");
                 $node.addClass('test');

                 i++;
                 if(i >= ($chNode.size())){
                     clearInterval(inter);
                  }
             }, 1000);
         });
	});
</script>	    
<!--  jqExam6_node.jsp -->
<div id="article">
	<div id="header2">
		<h1>  jqExam6_node : jQuery : </h1>
		<p id="time">2016. 5. 25.</p>
	</div>
	<div id="content">
    	<div>
        <em> one </em>      
        <a>two</a>
        <a>three</a>
        <b>four</b>
        <a>five</a>
        <em>six</em>
        </div>
        <input type="button" value="click" id="stBtn">
	</div>
</div>