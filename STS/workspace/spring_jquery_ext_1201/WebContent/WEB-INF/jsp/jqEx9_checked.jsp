<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>
	$(function(){
		// �����߿��� ������� + 
		$val = $('#content  input:not(:checked) + span')
			.css('backgroundColor','yellow');
		// üũ ������ �Ǵ�.
		console.log("Checked :"+$('#f1').is(':checked'));
		console.log("Checked :"+$('#f2').is(':checked'));
		// $val�� �ᱹ üũ�� �ȵ� input�� �ǹ��ϴµ�
		// span�� ���� console.log�� �ϳ��� , ����غ��� - �������� 
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
		<input type="checkbox" name="fruit" id="f1" value="���">
		<span>���</span>
		<input type="checkbox" name="fruit" value="�ٳ���">
		<span>�ٳ���</span>
		<input type="checkbox" name="fruit" id="f2" checked="checked" 
		value="������">
		<span>������</span>
		</div>
	</div>
</div>