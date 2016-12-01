<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script src="resources/js/turn.min.js"></script>    
<style>
	#magazin{
		width: 800px; height: 600px; background-color: white;
	}
	#magazin .turn-page{ width: 800px; height: 600px; 
		background-color: white;
		autoCenter: true;
	}
</style>    
<script>
	$(function(){
		$('#magazin').turn();
		var url = "memberJson?code=g";
		$.ajax({
			url:url,
			dataType:"json",
			success:function(data,status){
				console.log(data);	
				// each 집합 요소에서 키,값을 분리해서 반복할 경우사용
				// 배열요소에 적합
				$.each(data,function(k,v){
					$.each(v,function(index,res){
						tag = "<tr><td>"+res.num+"</td>";
						tag += "<td><img src=\"resources/img/"+res.img+"\"></td>";
						tag += "<td>"+res.name+"</td>";
						tag += "<td>"+res.age+"</td>";
						tag += "<td>"+res.job+"</td></tr>";
						// target 이 tbody에 tag를 하나씩 붙여넣는 함수 
						$('.se').append(tag);
					});
				});
			}
		});
	});
</script>	    
<!--   -->
<div id="article">
	<div id="header2">
		<h1>  uri : jQuery : </h1>
		<p id="time">2016. 5. 26.</p>
	</div>
	<div id="content">
		<div id="magazin">
			<div class="hard" 
			style="background-image:url(resources/images/1.jpg)"></div>
		
			<div class="se hard" style="background: white"> Page 3 </div>
			<div class="se" style="background: white"> Page 2 </div>
			<div class="se" style="background: white"> Page 3 </div>
			<div class="se" style="background: white"> Page 3 </div>
			<div class="se" style="background: white"> Page 3 </div>
			<div style="background: white"> Page 3 </div>
			<div style="background: white"> Page 3 </div>
			<div style="background: white"> Page 3 </div>
		</div>
	</div>
</div>