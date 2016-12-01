<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<script>
	$(function() {

	});
</script>
<!--   -->
<div id="article">
	<div id="header2">
		<h1>uri : jQuery :</h1>
		<p id="time">2016. 5. 30.</p>
	</div>
	<div id="content">
		<h1>Spring MVC에서 폼파라미터 처리 예제 1</h1>
		<form method="post" action="upsave" enctype="multipart/form-data">
			sub : <input type="text" name="sub"><br /> writer : <input
				type="text" name="writer"><br /> pwd : <input
				type="password" name="pwd"><br /> Image : <input
				type="file" name="upfile"><br /> content :
			<textarea rows="10" cols="10" name="content"></textarea>
			<br />
			<input type="submit">
		</form>
	</div>

</div>



