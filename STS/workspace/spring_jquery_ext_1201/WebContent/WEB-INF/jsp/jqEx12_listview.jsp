<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<style>
#content ul li { list-style: none; background-color: orange;}
.faq {
	padding: 20px 30px 0 20px
}

.faq h3 {
	border-top: 1px solid #ddd
}

.faq h3 a {
	display: inline-block;
	padding: 15px;
	font-size: 14px;
	color: #555;
	text-decoration: none
}

.faq h3 a:hover {
	color: #3273b3
}

.faq div {
	padding: 0 15px 15px;
	line-height: 20px
}
.on { background-color: #5bf0cb}
</style>  	
<script>
$(function() {
	// ����Ʈ ���� �׸� ���� ���տ�� - title
	var $trigger2 = $(".faq > h3 > a");
	// ����Ʈ�信 ������ ���� - content
	var $content2 = $(".faq > div");
	// ��� ����Ʈ�� �����.
	$content2.hide();
	$content2.first().show();
	$trigger2.parent().first().css("borderTop", "none");
	$('#target1').load("testdata .pdata");
	$trigger2.click(function() {

// code here
		var $this = $(this).parent();
		$trigger2.parent().removeClass("on");
		$content2.slideUp(150);
		if ($this.next().is(":hidden")) {
			$trigger2.each(function(i) {
				$this.addClass("on");
				$this.next().eq(i).slideDown(150);
			});
		}
	});

});
// var url = "testdata .pdata";
// // show() �̹� ������ ��Ҹ� �ٽ� �����ִ� �޼��� 
// $('#target').load(url,function(){
// 	$(".pdata > li").css('background','white');
// }).show();
</script>
<!--  jqEx12_listview -->
<div id="article">
	<div id="header2">
		<h1>uri : jQuery :</h1>
		<p id="time">2016. 5. 26.</p>
	</div>
	<div id="content">
		<div class="faq">
			<c:forEach begin="1" end="6" varStatus="i">
			<h3>
				<a href="#none">[${i.count }] Test title ${i.count }</a>
			</h3>
			<div>
				<ul class="list_bul" id="target${i.count }">
<%-- 					<c:forEach begin="1" end="6" varStatus="j"> --%>
<%-- 					<li>test${j.count } --%>
<%-- 					<span>2009.11~2011.${j.count }</span></li> --%>
<%-- 					</c:forEach> --%>
				</ul>
			</div>
			</c:forEach>
		</div>
	</div>
</div>