<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<style>
	#content div { padding: 5px 5px 5px 5px};
	.item { float: left; width: 100px}
</style>
<script>
	$(function(){
		$('#selectBtn').click(function(){
			var checkedList="";
			var checkedConsole="";
			$("input[name='hobby']:checkbox:checked").each(function(){
				//next() ��  +�� ����, prev() ���� ������带 �ǹ� 
				checkedList += $(this).prev().text()+"\t";
				checkedConsole += $(this).val()+"\t";
				$('#contents').html(checkedList);
			});
			console.log(checkedConsole);
		});
	});
</script>
<!-- jqEx10_checkbox  -->
<div id="article">
	<div id="header2">
		<h1>uri : jQuery :</h1>
		<p id="time">2016. 5. 26.</p>
	</div>
	<div id="content">
		<div>
			<span class="item">���ǰ���</span> 
			<input type="checkbox" name="hobby"
				value="music">
		</div>
		<div>
			<span class="item">�䰡</span> 
			<input type="checkbox" name="hobby"
				value="yoga">
		</div>
		<div>
			<span class="item">����</span> 
			<input type="checkbox" name="hobby"
				value="reading">
		</div>
		<div>
			<input type="button" id="selectBtn" 
			value="��� ����">
		</div>
		<div id="contents">�� �� :</div>
	</div>
</div>