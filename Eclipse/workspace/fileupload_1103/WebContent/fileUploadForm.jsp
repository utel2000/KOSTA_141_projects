<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>fileUploadForm.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<style>
	progress {
		display: none;	
	}
</style>
<script>
	var progress = null;
	$(function() {
		progress = $('progress');
		$('button').click(function() {
			fileUpload();
		});
	});
	function fileUpload() {
        var uploadFile = document.querySelector("input");
        var xhr = new XMLHttpRequest();
        // ���ε� ���� -> xhr.download.onloadstart�� �ϸ� download
        xhr.upload.onloadstart = function (e) {
            $('progress').val(0);
            $('progress').css('display', 'inline');
        };
        // ���ε� ���߿� ��� �߻� -> xhr.download.onprogress �ϸ� download
        xhr.upload.onprogress = function (e) {
            // e.total : ��ü ���ε� ũ��, e.loaded : ���� ���ε�� ũ��
            $('progress').val(e.loaded / e.total);
            //console.log(progress.value);
        };
        // ���ε� ���� �� �߻� -> xhr.download.onload �ϸ� download
        xhr.upload.onload = function (e) {
            $('progress').css('display', 'none');
        };
        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4 && xhr.status == 200) {
                $('div').html(xhr.responseText + "<br>");
            }
        };
        // ũ�ν� ������ .......
        xhr.open("POST", "fileUpload.jsp", true);
        xhr.setRequestHeader("X-File-Name", 
        encodeURIComponent(uploadFile.files[0].name));
        xhr.send(uploadFile.files[0]);
	
	// �ڹٽ�ũ��Ʈ(�̰� jQuery�� �ٲ���!!)
	/*
	 var progress=null;
     window.onload = function () {
         progress = document.querySelector("progress");
         // upload ��ư�� Ŭ���ϸ� ������ ���ε� �Ѵ�.
         document.querySelector("button").onclick = function () {
             fileUpload();
         };
     };
     // ������ ���ε� �Ѵ�.
     function fileUpload() {
         var uploadFile = document.querySelector("input");
         var xhr = new XMLHttpRequest();
         // ���ε� ���� -> xhr.download.onloadstart�� �ϸ� download
         xhr.upload.onloadstart = function (e) {
             progress.value = 0;
             progress.style.display = "inline";
         };
         // ���ε� ���߿� ��� �߻� -> xhr.download.onprogress �ϸ� download
         xhr.upload.onprogress = function (e) {
             // e.total : ��ü ���ε� ũ��, e.loaded : ���� ���ε�� ũ��
             progress.value = e.loaded / e.total;
             //console.log(progress.value);
         };

         // ���ε� ���� �� �߻� -> xhr.download.onload �ϸ� download
         xhr.upload.onload = function (e) {
             progress.style.display = "none";
         };

         xhr.onreadystatechange = function () {
             if (xhr.readyState == 4 && xhr.status == 200) {
                 document.querySelector("div").innerHTML 
                         = xhr.responseText + "<br>";
             }
         };
         // ũ�ν� ������ .......
         xhr.open("POST", "fileUpload.jsp", true);
         xhr.setRequestHeader("X-File-Name", 
         encodeURIComponent(uploadFile.files[0].name));
         xhr.send(uploadFile.files[0]);
         */
     }
</script>
</head>
<body>
	<h1>XMLHttpRequest Level2�� �̿��� ���� ���ε�</h1>
	<h2>jQuery ������ �׽�Ʈ : script�� jQuery�� ���� �� �κ��� ����!</h2>
	<input type="file">
	<button>upload</button>
	<progress>0%</progress><br />
	<div></div>	
</body>
</html>