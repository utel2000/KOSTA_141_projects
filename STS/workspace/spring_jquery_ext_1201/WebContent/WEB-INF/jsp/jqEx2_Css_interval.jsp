<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>
$(document).ready(function(){
	// �ڹٽ�ũ��Ʈ �迭
	var col = ['red','green','blue','orange','gray'];
	var num = 0;
	// setInterval : 1�ʴ� �ݺ��ϸ鼭 function �� ���� 
	var inter = setInterval(function(){
		console.log(num);
		// id�� article �� ��Ҹ� �����ؼ�
		// �� ����� ��Ÿ���� ���� �� �� �迭�� �ε����� ������ ���� 
		$('#article').css('backgroundColor',col[num]);
		num++;
		// clearInterval : Ư�� ������ �������� �� �ݺ����� interval�� ���� 
		if(num >= col.length){
			clearInterval(inter); //Interval ����
			num=0;
		}
	}, 1000);
	
});
</script>    
<div id="article">
	<div id="header2">
		<h1>Ex2 : jQuery : Css�� Interval </h1>
		<p id="time">Oct 1th, 2011</p>
	</div>
	<div>
		<!-- content Start -->
		<div > ���� ù��° JQuery �ǽ�1 !</div>
		<!-- content End -->
	</div>
</div>