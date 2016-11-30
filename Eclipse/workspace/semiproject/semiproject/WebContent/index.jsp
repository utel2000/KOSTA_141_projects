<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@include file="header.jsp"%>
<style>
h3 {
	background-Color: #9A6401;
	color: white;
	text-align: center
}

</style>
<script>
setInterval(function(){
	console.log("실시");
		$.ajax({
				url:"mainpage",
				success: function() {
				}
		});
}, 3000);
</script>
<div id="wrap" class="container se">
	<div class="jumbotron" style="background-Color: #9A6401; color: white; text-align: center">
		<h1>Wiki Bee Project~</h1>
		<p>그것이 알고 싶니?</p> 
	</div>
	
	<div class="col-md-6" style="margin:0px">

		<!-- 백과사전 틀 시작 -->

		<div>
			<h3>최근 등록된 Wiki Bee</h3>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>주 제</th>
						<th>작성날짜</th>
					</tr>
				</thead>
				<tbody>
				<s:if test="#session.m_id!=null">
					<s:iterator var="wlistv" value="wlist" status="sid">
						<tr>
							<td id="sub"><a href="wikiDetail?w_num=<s:property value="w_num"/>"><s:property value="w_title" /></a></td>
							<td><s:property value="w_rdate" /></td>
						</tr>
					</s:iterator>
				</s:if>
				<s:else>
					<s:iterator var="wlistv" value="wlist" status="sid">
						<tr>
							<td id="sub"><a href="loginForm?text=error"><s:property value="w_title"/></a></td>
							<td><s:property value="w_rdate" /></td>
						</tr>
					</s:iterator>
				</s:else>
				</tbody>
			</table>
		</div>

		<!-- 백과사전 틀 종료 -->

	</div>
	<div class="col-md-6">

		<!-- 포럼 틀 시작 -->

		<div>
			<h3>최근 등록된 Bee포럼</h3>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>주 제</th>
						<th>작성날짜</th>
					</tr>
				</thead>
				<tbody>
				
				<s:if test="#session.m_id!=null">
					<s:iterator var="ftop5listv" value="ftop5list" status="sid">
						<tr>
							<td id="sub"><a href="forumDetail?nowPage=1&firstPage=1&f_num=<s:property value="f_num"/>"><s:property value="f_subject"/></a></td>
							<td><s:property value="f_date_post"/></td>							
						</tr>
					</s:iterator>
				</s:if>
				
				<s:else>
					<s:iterator var="ftop5listv" value="ftop5list" status="sid">
						<tr>
							<td id="sub"><a href="loginForm?text=error"><s:property value="f_subject"/></a></td>
							<td><s:property value="f_date_post"/></td>							
						</tr>
					</s:iterator>			
				</s:else>

				</tbody>
			</table>
		</div>

		<div>
			<h3>최근 완료된 Bee포럼</h3>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>주 제</th>
						<th>작성날짜</th>
					</tr>
				</thead>
				<tbody>
				<s:if test="#session.m_id!=null">
					<s:iterator var="fcomp5listv" value="fcomp5list" status="sid">
						<tr>
							<td id="sub"><a href="forumDetail?nowPage=1&firstPage=1&f_num=<s:property value="f_num"/>"><s:property value="f_subject"/></a></td>
							<td><s:property value="f_date_post"/></td>						
						</tr>
					</s:iterator>
				</s:if>
				
				<s:else>
					<s:iterator var="fcomp5listv" value="fcomp5list" status="sid">
						<tr>
							<td id="sub"><a href="loginForm?text=error"><s:property value="f_subject"/></a></td>
							<td><s:property value="f_date_post"/></td>						
						</tr>
					</s:iterator>
				</s:else>
									
				</tbody>
			</table>
		</div>
		<!-- 포럼 틀 끝 -->

	</div>
</div>
<%@include file="chatForm.jsp"%>
<br />
<%@ include file="footer.jsp"%> 
