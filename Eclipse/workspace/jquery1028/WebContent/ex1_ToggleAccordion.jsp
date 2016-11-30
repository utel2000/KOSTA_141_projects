<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" conten
t="text/html; charset=EUC-KR">
<title>ex1_ToggleAccordion.jsp</title>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<style>
	.faq {
	 	padding: 20px 30px 0px 20px;
	}
	.faq h4 {
		border-top: 1px solid #ddd;
	}
	.faq h4 a {
		display: inline-block; padding: 15px; font-size: 14px; color: #555; text-decoration: none;
	}
	.faq h4 a:hover {
		color: #3273b3;
	}
	.fa div {
		padding: 0px 15px 15px; line-height: 20px;
	}
	.on {
		background: orange;
	}
</style>
<script>
	$(document).ready(function() {
		// 아코디언 제목 : 집합요소로 접근
		var $trigger = $(".faq > h4 > a");
		var $content = $(".faq > div");
		// show() 보여주기, hide() 감추기
		// display: block => show
		// display: none => hide
		$content.hide();	
		$trigger.click(function() {
			// 부모 요소.
			var $this = $(this).parent();
			$trigger.parent().removeClass("on");
			// 위로 슬라이드로 감추는 개념.
			$content.slideUp(500);
			// +와 같다. 인접 형제 노드 h4 옆에 있는 div가 hidden이면
			// true가 되어 if문의 조건이 만족되어 수행.
			if($this.next().is(":hidden")) {
				$trigger.each(function(i) {
					$this.addClass("on");
					$this.next().eq(i).slideDown(500);
				});
			}
		});
	});
</script>
</head>
<body>
	<div class="faq">
		<h4><a href="#none">[1]Load Test Title1</a></h4>
		<div id="load1">
			내용1<br />내용1<br />내용1<br />
			내용1<br />내용1<br />내용1<br />
		</div>
		<h4><a href="#none">[2]Ajax</a></h4>
		<div id="message">
			내용2<br />내용2<br />내용2<br />
			내용2<br />내용2<br />내용2<br />
		</div>
		<h4><a href="#none">[3]Ajax2</a></h4>
		<div id="message2">
			내용3<br />내용3<br />내용3<br />
			내용3<br />내용3<br />내용3<br />
		</div>
	</div>
</body>
</html>