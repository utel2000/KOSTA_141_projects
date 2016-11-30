<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ex7.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<script>
	$(document).ready(function() {
		// 후손(E F) 
		// 조상이 P 요소에서 후손 em요소를 찾아서 콘솔에 갯수 출력
		$('p em').css('backgroundColor', 'yellow').each(function() {
			// 엘리멘트에 값을 더하는 메서드
			$('.result1').append($(this).text()+"\n");
		});
		console.log("p의 후손 em 요소 갯수 : " + $('p em').length);
	
		// 자식요소(E > F)
		// DIV의 자식요소로 em을 검색해서 배경색을 핑크, 위와 같이 출력 후
		// 콘솔에도 출력해보세요.
		$('div > em').css('backgroundColor', 'pink').each(function() {
			$('.result2').append($(this).text()+"\n");
		});
		console.log("div의 자손 em 요소 갯수 : " + $('div > em').length);
	});
</script>
</head>
<body>
	<p>
		<em> one </em>
		<em> two </em>
		<span><em> three </em></span>
	</p>
	<div>
		<em> four </em>
		<span><em> five </em></span>
		<em> six </em>
	</div>
	<hr>
	<div>
		<span> 후손 요소로 검색된 엘리멘트 (A B) : </span>
		<span class="result1"></span>
	</div>
	<div>
		<span> 자식 요소로 검색된 엘리멘트 (A > B) : </span>
		<span class="result2"></span>
	</div>
</body>
</html>