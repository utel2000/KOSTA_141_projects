<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@include file="header.jsp"%>
<script>
	$(function() {
		$('.chu').css('width', '150px');
		$('.btn-danger').css({
			'float': 'right',
			'width': '100px'
		});
	});
</script>
<div class="container se">
	<h2>회원가입</h2>
	<form class="form-horizontal" role="form" method="post" action="nBoardAdd">
		<input type="hidden" name="reip" value="<%=request.getRemoteAddr()%>">
		<div class="form-group">
			<label class="control-label col-sm-2" for="sub">제목 : </label>
			<div class="col-sm-10">
				<input type="text" name="sub" class="form-control" id="sub" placeholder="Enter Your Subject">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="usr">작성자 : </label>
			<div class="col-sm-10">
				<input type="text" name="usr" class="form-control" id="usr" placeholder="Enter Username">
			</div>
		</div>
		<div class="form-group">
			<label for="textArea" class="col-lg-2 control-label">내용 : </label>
			<div class="col-lg-10">
			<textarea class="form-control" rows="3" name="cont" id="cont" placeholder="Enter Content"></textarea>
			</div>
		</div>
	<div class="form-group">
		<label class="col-lg-2 control-label">아이콘 : </label>
		<div class="col-lg-10">
			<div class="radio">
				<label>
					<input type="radio" name="icon" id="chu1" value="chu1" checked="">
					<img class="chu" src="img/chu1.gif">
				</label>
				<label>
					<input type="radio" name="icon" id="chu2" value="chu2">
					<img class="chu" src="img/chu2.gif">
				</label>
				<label>
					<input type="radio" name="icon" id="chu3" value="chu3">
					<img class="chu" src="img/chu3.gif">
				</label>
				<label>
					<input type="radio" name="icon" id="chu4" value="chu4">
					<img class="chu" src="img/chu4.gif">
				</label>
				<label>
					<input type="radio" name="icon" id="chu5" value="chu5">
					<img class="chu" src="img/chu5.gif">
				</label>
			</div>
		</div>
	</div>
		<div class="form-group">
			<div class="control-offset-2 col-sm-10" >
				<button type="submit" class="btn btn-danger">확인</button>
			</div>
		</div>
	</form>
</div>
<%@include file="footer.jsp"%>