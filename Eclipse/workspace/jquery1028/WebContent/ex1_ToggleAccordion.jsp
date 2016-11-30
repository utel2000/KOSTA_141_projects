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
		// ���ڵ�� ���� : ���տ�ҷ� ����
		var $trigger = $(".faq > h4 > a");
		var $content = $(".faq > div");
		// show() �����ֱ�, hide() ���߱�
		// display: block => show
		// display: none => hide
		$content.hide();	
		$trigger.click(function() {
			// �θ� ���.
			var $this = $(this).parent();
			$trigger.parent().removeClass("on");
			// ���� �����̵�� ���ߴ� ����.
			$content.slideUp(500);
			// +�� ����. ���� ���� ��� h4 ���� �ִ� div�� hidden�̸�
			// true�� �Ǿ� if���� ������ �����Ǿ� ����.
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
			����1<br />����1<br />����1<br />
			����1<br />����1<br />����1<br />
		</div>
		<h4><a href="#none">[2]Ajax</a></h4>
		<div id="message">
			����2<br />����2<br />����2<br />
			����2<br />����2<br />����2<br />
		</div>
		<h4><a href="#none">[3]Ajax2</a></h4>
		<div id="message2">
			����3<br />����3<br />����3<br />
			����3<br />����3<br />����3<br />
		</div>
	</div>
</body>
</html>