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
			// ------ ������ �����͸� �ʱ�ȭ 
			tag = "<tr><td>No 1</td>";
			tag += "<td><img src=\"resources/img/default.PNG\"></td>";
			tag += "<td>������ ��</td>";
			tag += "<td>28</td>";
			tag += "<td>�񼭽���</td></tr>";
			$('#target').html(tag);
			// ��ư�� ���� �����ͼ� trim�Լ��� ������ �߶󳻾 ���
			console.log($.trim($(this).val()));
			// �ɽ�����, �ٺ�ġ ���� ������ ���� , �Ķ���Ͱ��� ����
			if($.trim($(this).val()) ==='�ɽ�����'){
				url = "memberJson?code=g";
			}else if($.trim($(this).val()) ==='�ٺ�ġ'){
				url = "memberJson?code=d";
			}else if($.trim($(this).val()) ==='�ٺ�ġ'){
				url = "memberJson?code=d";
			}
			// Ajax���� 
			$.ajax({
				url:url,
				dataType:"json",
				success:function(data,status){
					console.log(data);	
					// each ���� ��ҿ��� Ű,���� �и��ؼ� �ݺ��� �����
					// �迭��ҿ� ����
					
					$.each(data,function(k,v){
						$.each(v,function(index,res){
							tag = "<tr><td>"+res.num+"</td>";
							tag += "<td><img src=\"resources/img/"+res.img+"\"></td>";
							tag += "<td>"+res.name+"</td>";
							tag += "<td>"+res.age+"</td>";
							tag += "<td>"+res.job+"</td></tr>";
							// target �� tbody�� tag�� �ϳ��� �ٿ��ִ� �Լ� 
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
			<input type="button" id="btn1" value="�ɽ�����" class="btn">
			<input type="button" id="btn2" value=" �ٺ�ġ  " class="btn">
		</div>
		<div id="cont">
		<table>
			<tr>
				<td>��ȣ</td>
				<td>�̸�</td>
				<td>����</td>
				<td>��å</td>
			</tr>
			<tbody id="target">
				<tr>
				<td>1</td>
				<td><img src="resources/img/default.PNG"></td>
				<td>������ ��</td>
				<td>28</td>
				<td>��</td>
			</tr>
			</tbody>

		</table>
		</div>
	</div>
</div>