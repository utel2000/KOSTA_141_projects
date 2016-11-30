<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>voteForm.jsp</title>
<style>
	div{display: table; margin: auto; border: 1px dotted;}
	dl{margin-left: 50px;}
	p{text-align: center;}
</style>
</head>
<body>
	<div>
		<h2>Q. 오늘 점심으로 뭐가 먹고싶은지 투표해주세요!</h2>
		<form method="post" action="vote.jsp">
		<dl>
			<dd><input type="radio" name="menu" value="budae">햄과 야채 육수가 일품인 부대찌개</dd>
			<dd><input type="radio" name="menu" value="gopchang">고소~하고 쫄깃~쫄깃한 곱창전골</dd>
			<dd><input type="radio" name="menu" value="samgyeop">고기 매니아는 삼시 세끼 삼겹살</dd>
			<dd><input type="radio" name="menu" value="pasta">기품있고 교양있게 파스타</dd>
			<dd><input type="radio" name="menu" value="doenjang">한국인이라면 된장찌개</dd>
			<dd><input type="radio" name="menu" value="sushi">돈이 많다면 고민하지 말고 초밥</dd>
		</dl>
		<p>
			<input type="submit" value="투표">
			<input type="button" value="결과보기" onclick="location='voteResult.jsp'">
		</p>
		</form>
	</div>
</body>
</html>