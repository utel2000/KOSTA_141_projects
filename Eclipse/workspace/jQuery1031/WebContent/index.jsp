<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@include file="header.jsp"%>
<%--   carousel --%>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
	<!-- Indicators -->
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
		<li data-target="#myCarousel" data-slide-to="3"></li>
	</ol>
	<!-- Wrapper for slides -->
	<div class="carousel-inner" role="listbox">
		<div class="item active">
			<img src="img/chu1.gif" alt="Chania">
			<div class="carousel-caption">
				<h3>Kosta141��</h3>
				<p>kosta141�� ����������Ʈ�� ���� Bootstrap UI�����Դϴ�. Good Project
					!!!!!!!1.</p>
			</div>
		</div>

		<div class="item">
			<img src="img/chu2.gif" alt="Chania">
			<div class="carousel-caption">
				<h3>Kosta141</h3>
				<p>kosta141�� ����������Ʈ�� ���� Bootstrap UI�����Դϴ�.Good Project !!!!!!!2.</p>
			</div>
		</div>
		<div class="item">
			<img src="img/chu3.gif" alt="Flower">
			<div class="carousel-caption">
				<h3>Kosta141</h3>
				<p>Beautiful flowers in kosta141, Create</p>
			</div>
		</div>
		<div class="item">
			<img src="img/chu4.gif" alt="Flower">
			<div class="carousel-caption">
				<h3>Kosta141</h3>
				<p>Beautiful flowers in kosta141, Create</p>
			</div>
		</div>
	</div>

	<!-- Left and right controls -->
	<a class="left carousel-control" href="#myCarousel" role="button"
		data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
		aria-hidden="true"></span> <span class="sr-only">Previous</span>
	</a> <a class="right carousel-control" href="#myCarousel" role="button"
		data-slide="next"> <span class="glyphicon glyphicon-chevron-right"
		aria-hidden="true"></span> <span class="sr-only">Next</span>
	</a>
</div>
<%-- --%>
<div class="container se">
	<div class="jumbotron">
		<h1>My First Bootstrap Page</h1>
		<p>kosta141�� ����������Ʈ�� ���� Bootstrap UI�����Դϴ�.</p>
	</div>
	<div class="row">
		<div class="col-sm-4">
			<h3>Column 1</h3>
			<p>����� div�����̸� �÷��� ������ �Բ� �� �ڸ��̸�, � �����̵��� ��⸸ �ϸ� �ȴ�.</p>
			<p>ȭ����! kosta141�� Ŀ�´�Ƽ�Դϴ�. ����, ����, ���� ~ ������� �׳����� ȭ�����Դϴ�. ��!...</p>
		</div>
		<div class="col-sm-4">
			<h3>Column 2</h3>
			<p>����� div�����̸� �÷��� ������ �Բ� �� �ڸ��̸�, � �����̵��� ��⸸ �ϸ� �ȴ�.</p>
			<p>ȭ����! kosta141�� Ŀ�´�Ƽ�Դϴ�. ����, ����, ���� ~ ������� �׳����� ȭ�����Դϴ�. ��!...</p>
		</div>
		<div class="col-sm-4">
			<h3>Column 3</h3>
			<p>����� div�����̸� �÷��� ������ �Բ� �� �ڸ��̸�, � �����̵��� ��⸸ �ϸ� �ȴ�.</p>
			<p>ȭ����! kosta141�� Ŀ�´�Ƽ�Դϴ�. ����, ����, ���� ~ ������� �׳����� ȭ�����Դϴ�. ��!...</p>
		</div>
	</div>
</div>
<%@include file="footer.jsp"%>