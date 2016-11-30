<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>sboardForm.jsp</title>
<script>
	// f : file객체의 주소.
	function fileInfo(f) {
		// files를 사용해서 파일 객체의 정보를 가져온다. (배열 반환)
		var file = f.files;
		// type.indexOf : 파일의 타입을 확인.
		if (file[0].type.indexOf('image') < 0) { // 선택한 파일이 이미지인지 확인.
			alert('이미지 파일만 선택하세요.');
			return;
		}
		// FileReader 객체 사용 : HTML5 기능.
		var reader = new FileReader(); // FileReader 객체 사용
		// reader.onload : 파일업로드를 사용해서 파일이 모두 읽어졌을 때
		// 익명 함수를 실행하며 읽어온 파일의 정보는 rst로 전달.
		reader.onload = function(rst) {
			document.getElementById("img_box").innerHTML=
				"<img src='"+rst.target.result+"' style='width: 300px;'>";
		}
		reader.readAsDataURL(file[0]); // 파일을 읽는다.
	}
</script>
</head>
<body>
	<div>
		<form method="post" action="save.jsp" enctype="multipart/form-data">
		<input type="hidden" name="reip"
		value="<%=request.getRemoteAddr()%>">
			제      목 : <input type="text" name="sub"><br />
			작  성  자 : <input type="text" name="writer"><br />
			비밀  번호 : <input type="password" name="pwd"><br />
			이미지첨부 : <input type="file" name="upfile" onchange="fileInfo(this)"><br />
			<div id="img_box"></div><br />
			내      용 : <textarea row="10" col="10" name="cont"></textarea><br />
			<input type="submit" value="글작성">
			<%-- location='이동할 url' --%>
			<input type="button" value="리스트" onClick="location='list.jsp'">
		</form>
	</div>
</body>
</html>