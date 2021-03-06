<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>mJoinForm.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	$(function() {
		// jQuery 요소 선택자를 사용해서 btn_idChk의 클릭 이벤트를 감지하여
		// id가 id인 text의 값을 받아오는 예제
		$('#btn_idChk').click(function() {
			var idv = $('#id').val();
			console.log("id값: " + idv);
			// target에 ajax의 결과를 바로 적용
			$('#target').load('mJoinChk?id=' + idv);
		});
	});
</script>
</head>
<body>
	<div id="wrap">
		<h2>SpringFramework기반의 jQuery를 사용한 아이디 중복화인 및 가입 예제!</h2>
		<form action="mJoinAdd" method="post">
			<p>아이디: <input type="text" name="id" id="id">
				<input type="button" value="중복확인" id="btn_idChk">
			</p>
			<p id="target"></p>
			<p>비밀번호: <input type="password" name="pwd" id="pwd"></p>
			<p>이름: <input type="text" name="name" id="name"></p>
			<p><input type="submit" value="join"></p>
		</form>
	</div>
</body>
</html>