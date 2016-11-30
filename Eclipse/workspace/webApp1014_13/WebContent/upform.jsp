<%@page import="dao.SBoardDao"%>
<%@page import="vo.SBoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>upform.jsp</title>
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
			document.getElementById("oriImg").style.display="none";
		}
		reader.readAsDataURL(file[0]); // 파일을 읽는다.
	}
</script>
</head>
<body>
<%
	// list.jsp에서 사용자가 클릭했을 때 Primary Key인 num을 받아야함.
	int num = Integer.parseInt(request.getParameter("num"));
	SBoardVO v = SBoardDao.getDao().detail(num);
%>
	<div>
		<form method="post" action="update.jsp" enctype="multipart/form-data">
			<input type="hidden" name="num" value="<%=v.getNum()%>">
			<input type="hidden" name="orifn" value="<%=v.getImg()%>">
			<input type="hidden" name="reip" value="<%=request.getRemoteAddr()%>">
			제      목 : <input type="text" name="sub" value="<%=v.getSub()%>"><br />
			작  성  자 : <input type="text" name="writer" value="<%=v.getWriter()%>"><br />
			비밀  번호 : <input type="password" name="pwd" value="<%=v.getPwd()%>"><br />
			이미지첨부 : <input type="file" name="upfile" onchange="fileInfo(this)"><br />
			<div id="img_box"></div>
			<img src="img/<%=v.getImg()%>" style="width: 150px" id="oriImg">
			<br />
			내      용 : <textarea row="10" col="10" name="cont"><%=v.getCont()%></textarea><br />
			<input type="submit" value="글수정">
			<%-- location='이동할 url' --%>
			<input type="button" value="리스트" onClick="location='list.jsp'">
		</form>
	</div>
</body>
</html>