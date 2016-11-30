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
        // 업로드 시작 -> xhr.download.onloadstart로 하면 download
        xhr.upload.onloadstart = function (e) {
            $('progress').val(0);
            $('progress').css('display', 'inline');
        };
        // 업로드 도중에 계속 발생 -> xhr.download.onprogress 하면 download
        xhr.upload.onprogress = function (e) {
            // e.total : 전체 업로드 크기, e.loaded : 현재 업로드된 크기
            $('progress').val(e.loaded / e.total);
            //console.log(progress.value);
        };
        // 업로드 종료 시 발생 -> xhr.download.onload 하면 download
        xhr.upload.onload = function (e) {
            $('progress').css('display', 'none');
        };
        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4 && xhr.status == 200) {
                $('div').html(xhr.responseText + "<br>");
            }
        };
        // 크로스 도메인 .......
        xhr.open("POST", "fileUpload.jsp", true);
        xhr.setRequestHeader("X-File-Name", 
        encodeURIComponent(uploadFile.files[0].name));
        xhr.send(uploadFile.files[0]);
	
	// 자바스크립트(이걸 jQuery로 바꾸자!!)
	/*
	 var progress=null;
     window.onload = function () {
         progress = document.querySelector("progress");
         // upload 버튼을 클릭하면 파일을 업로드 한다.
         document.querySelector("button").onclick = function () {
             fileUpload();
         };
     };
     // 파일을 업로드 한다.
     function fileUpload() {
         var uploadFile = document.querySelector("input");
         var xhr = new XMLHttpRequest();
         // 업로드 시작 -> xhr.download.onloadstart로 하면 download
         xhr.upload.onloadstart = function (e) {
             progress.value = 0;
             progress.style.display = "inline";
         };
         // 업로드 도중에 계속 발생 -> xhr.download.onprogress 하면 download
         xhr.upload.onprogress = function (e) {
             // e.total : 전체 업로드 크기, e.loaded : 현재 업로드된 크기
             progress.value = e.loaded / e.total;
             //console.log(progress.value);
         };

         // 업로드 종료 시 발생 -> xhr.download.onload 하면 download
         xhr.upload.onload = function (e) {
             progress.style.display = "none";
         };

         xhr.onreadystatechange = function () {
             if (xhr.readyState == 4 && xhr.status == 200) {
                 document.querySelector("div").innerHTML 
                         = xhr.responseText + "<br>";
             }
         };
         // 크로스 도메인 .......
         xhr.open("POST", "fileUpload.jsp", true);
         xhr.setRequestHeader("X-File-Name", 
         encodeURIComponent(uploadFile.files[0].name));
         xhr.send(uploadFile.files[0]);
         */
     }
</script>
</head>
<body>
	<h1>XMLHttpRequest Level2를 이용한 파일 업로드</h1>
	<h2>jQuery 마지막 테스트 : script를 jQuery로 변경 할 부분은 변경!</h2>
	<input type="file">
	<button>upload</button>
	<progress>0%</progress><br />
	<div></div>	
</body>
</html>