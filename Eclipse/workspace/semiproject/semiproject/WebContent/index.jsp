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
	console.log("�ǽ�");
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
		<p>�װ��� �˰� �ʹ�?</p> 
	</div>
	
	<div class="col-md-6" style="margin:0px">

		<!-- ������� Ʋ ���� -->

		<div>
			<h3>�ֱ� ��ϵ� Wiki Bee</h3>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>�� ��</th>
						<th>�ۼ���¥</th>
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

		<!-- ������� Ʋ ���� -->

	</div>
	<div class="col-md-6">

		<!-- ���� Ʋ ���� -->

		<div>
			<h3>�ֱ� ��ϵ� Bee����</h3>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>�� ��</th>
						<th>�ۼ���¥</th>
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
			<h3>�ֱ� �Ϸ�� Bee����</h3>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>�� ��</th>
						<th>�ۼ���¥</th>
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
		<!-- ���� Ʋ �� -->

	</div>
</div>
<%@include file="chatForm.jsp"%>
<br />
<%@ include file="footer.jsp"%> 
