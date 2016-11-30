<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@include file="header.jsp"%>
<div class="container se">
	<h2>·Î±×ÀÎ</h2>
	<form class="form-horizontal" role="form" method="post" action="loginOk">
		<div class="form-group">
			<label class="control-label col-sm-2" for="id">ID : </label>
			<div class="col-sm-10">
				<input type="text" name="id" class="form-control" id="id" placeholder="Enter Your ID">
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="pwd">PWD : </label>
			<div class="col-sm-10">
				<input type="password" name="pwd" class="form-control" id="pwd" placeholder="Enter Your Password">
			</div>
		</div>
		<div class="form-group">
			<div class="control-offset-2 col-sm-10" >
				<div class="checkbox">
					<label>
						<input type="checkbox">Remember me
					</label>
				</div>
			</div>
		</div>
		<div class="form-group">
			<div class="control-offset-2 col-sm-10" >
				<button type="submit" class="btn btn-default">Submit</button>
			</div>
		</div>
	</form>
</div>
<%@include file="footer.jsp"%>