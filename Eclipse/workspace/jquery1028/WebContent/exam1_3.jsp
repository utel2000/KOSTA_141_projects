<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>exam1_3.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<style>
	div{ width: 50%; margin: auto}
	div table{width: 100%;}
	div table td { text-align: center; border: 1px dotted;}
</style>
<script>
	$(function(){
		$('#res').click(function(){
			var danv = $('#dan').val();
			var limitv = $('#limit').val();
			var colv = $('#col').val();
			//�ʱ�İ�
			var start = parseInt(danv,10) - parseInt(limitv,10)/2;
			//���ǽİ�
			var end = parseInt(danv,10) + parseInt(limitv,10)/2;
			console.log("start : "+start);
			console.log("end : "+end);
			var tag = "<table>";
			for(var i=0; i<=9; i++){
				tag +="<tr>";
				// 11.2 -> 12�ø�ó�� 
				for(var j=Math.ceil(start); j<Math.ceil(end); j++){
					var colr = "";
					if(danv == j){ // ������ ���� �ݺ��Ǵ� ���� ��ġ�� ��
						colr = colv; // ������ �������� ���� 
					}else{
						colr = "#ffffff";
					}
					if(i == 0){
						tag +="<td style='background:"+colr+"'>"+j+"�� </td>";
					}else{
						tag +="<td style='background:"+colr+"'>"+j+"x"+i+"</td>";
					}
				}
				tag +="</tr>";
			}
			tag+="</table>";
			$('#target').html(tag);
		});
	});
</script>
</head>
<body>
	<div>
		<input type="number" name="dan" id="dan">
		<select name="limit" id="limit">
			<option>1</option>
			<option>3</option>
			<option>5</option>
			<option>7</option>
			<option>9</option>
		</select>
		 <input type="color" name="col" id="col">
		 <input type="button" id="res" value="res">
	</div>
	<div id="target">
	</div>
</body>
</html>