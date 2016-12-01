<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<style>
	#content img{ width: 80px }
	#left{ width: 600px; text-align: right;}
	#cont{ width: 800px;}
	#left,#cont { float: left; }
	.left{ float: left;}
    
</style>	
<script>
	$(function() {
		var url = null; var tag ="";
		$('#wrap').css({'width':'800px','margin':'auto'});
		$('#cont').css('width','600px');
		$('.btn').click(function(){
			// ------ 아이유 데이터를 초기화 
			tag = "<tr><td>No 1</td>";
			tag += "<td><img src=\"resources/img/default.PNG\"></td>";
			tag += "<td>아이유 ♥</td>";
			tag += "<td>28</td>";
			tag += "<td>비서실장</td></tr>";
			$('#target').html(tag);
			// 버튼의 값을 가져와서 trim함수로 공백을 잘라내어서 출력
			console.log($.trim($(this).val()));
			// 걸스데이, 다비치 인지 값으로 구분 , 파라미터값을 구분
			if($.trim($(this).val()) ==='걸스데이'){
				url = "memberJson?code=g";
			}else if($.trim($(this).val()) ==='다비치'){
				url = "memberJson?code=d";
			}else if($.trim($(this).val()) ==='다비치'){
				url = "memberJson?code=d";
			}
			// Ajax시작 
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
							$('#target').append(tag);
						});
						
					});
					
				}
			});
		});
	});
</script>
<!-- jqEx8_Ajax  -->
<div id="article">
	<div id="header2">
		<h1>jqEx8_Ajax : jQuery :</h1>
		<p id="time">2016. 5. 25.</p>
	</div>
	<div id="content">
		<div id="left">
			<input type="button" id="btn1" value="걸스데이" class="btn">
			<input type="button" id="btn2" value=" 다비치  " class="btn">
		</div>
		<div id="cont">
		<table>
			<tr>
				<td>번호</td>
				<td>이름</td>
				<td>나이</td>
				<td>직책</td>
			</tr>
			<tbody id="target">
				<tr>
				<td>1</td>
				<td><img src="resources/img/default.PNG"></td>
				<td>아이유 ♥</td>
				<td>28</td>
				<td>비서</td>
			</tr>
			</tbody>

		</table>
		</div>
	</div>
</div>