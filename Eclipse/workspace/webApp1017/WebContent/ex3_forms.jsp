<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex3_forms.jsp</title>
<script>
	var xhr;
	function changeV1() {
		if(window.ActiveXObject) {
			xhr = new ActiveXObject("Microsoft.XMLHTTP");
		} else { 
			xhr = new XMLHttpRequest();
		}
		xhr.onreadystatechange = view;
		var msg = document.getElementById("ch1").value;
		xhr.open("get", "ex3_select.jsp?msg="+msg, true);
		xhr.send(null); 
	}
	function view() {
		if(xhr.readyState === 4) {
			if(xhr.status === 200) {
				var target = document.getElementById("ch2");
				target.innerHTML=xhr.responseText;
			}
		}
	}
	// �������� : ������ �׸� �̹��� ���
	 function changeV2(){
  if(window.ActiveXObject){
   xhr = new ActiveXObject("Microsoft.XMLHTTP");
  }else{ 
   xhr = new XMLHttpRequest();
  }
  // ��з� ���� ch1�̶� ������ ����!
  var ch1 =  document.getElementById("ch1").value;
  
  xhr.onreadystatechange = view2;
  // �̹��� 
  var msg =  document.getElementById("ch2").value;
  xhr.open("get","ex3_select2.jsp?msg="+msg+"&ch="+ch1,true);
  xhr.send(null);
 }
 function view2(){
  if(xhr.readyState === 4){
   if(xhr.status === 200){
    var target = document.getElementById("targetImg");
    // img/aa.jpg ������ ���� ���۹���
    target.src=xhr.responseText;
   }
  }
 }
</script>
</head>
<body>
	<div>
		<select name="ch1" onchange="changeV1()" id="ch1">
			<option value="">����</option>
			<option value="1">���� ����� �ø���</option>
			<option value="2">���� ���� �ø���</option>
		</select>
		<select name="ch2" id="ch2" onchange="changeV2()">
			<option value="">����</option>
		</select>
		<img src="" id="targetImg" style="width: 150px">
	</div>
</body>
</html>