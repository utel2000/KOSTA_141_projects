<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@include file="header.jsp"%>
<script>
	// ��� ���� �� ����
	function changeToModifyCommentForm(c_num, target_textarea, target_buttons) {
		$.ajaxSetup({
			contentType:'application/x-www-form-urlencoded;charset=euc-kr'
		});
		// textarea ����
		$.ajax({
			url: "forumModifyCommentForm_textarea",
			type: "post",
			data: {
				c_num: c_num
			},
			success: function (data) { 
				$(target_textarea).html(data);
			},
			error: function(e) {
				alert(e);
			}
		});
		// Ȯ��, ��� ��ư ����.
		$.ajax({
			url: "forumModifyCommentForm_buttons",
			type: "post",
			data: {
				c_num: c_num, 
				target_textarea: target_textarea,
				target_buttons: target_buttons
			},
			success: function (data) {
				$(target_buttons).html(data);
			},
			error: function(e) {
				alert(e);
			}
		});
	};
	// ��� ���� ������ ���� ������ ��ü Ajax
	function changeToOriginalCommentForm(c_num, target_textarea, target_buttons) {
		$.ajaxSetup({
			contentType:'application/x-www-form-urlencoded;charset=euc-kr'
		});
		// ��� ����
		$.ajax({
			url: "forumOriginalCommentForm_textarea",
			type: "post",
			data: {
				c_num: c_num 
			},
			success: function (data) {
				$(target_textarea).html(data);
			},
			error: function(e) {
				alert(e);
			}
		});
		// ��ư ����
		$.ajax({
			url: "forumOriginalCommentForm_buttons",
			type: "post",
			data: {
				c_num: c_num, 
				f_num: ${fvo.f_num},
				nowPage: ${nowPage},
				target_textarea: target_textarea,
				target_buttons: target_buttons
			},
			success: function (data) {
				$(target_buttons).html(data);
			},
			error: function(e) {
				alert(e);
			}
		});
	};
	function confirmModifyComment(c_num, target_textarea, target_buttons) {
		$.ajaxSetup({
			contentType:'application/x-www-form-urlencoded;charset=euc-kr'
		});
		// ��� ���� Ȯ�� ��ư Ajax
		$.ajax({
			url: "forumModifyComment",
			type: "post",
			data: {
				c_num: c_num,
				c_content: $('#textarea_c_content_update').val()
			},
			success: function() {
				changeToOriginalCommentForm(c_num, target_textarea, target_buttons);
			},
			error: function(e) {
				alert(e);
			}
		});
	};
	function vote(c_num, target, checkVote) {
		// ���ƿ� ��ǥ ���
		$.ajax({
			url: "forumVoteComment",
			type: "post",
			data: {
				cv_m_num: ${sessionScope.m_num},
				cv_c_num: c_num,
				checkVote: checkVote
			},
			success: function(data) {
				$(target).html(data);
			},
			error: function(e) {
				alert(e);
			}
		});
	};
	$(function() {
		// ��� �ۼ� �� ȣ��
		$('#btn_addComment').click(function() {
			if($('#c_content').val() == "") {
				alert("�ݵ�� ����� �Է��ϼ���.");
			}else {
				$('#form_addComment').submit();
			}
		});
	});
</script>
	<!-- ��� �ۼ� ���̺� -->
	<div>
		<form method="post" action="forumAddComment" id="form_addComment">
			<input type="hidden" name="f_num" value="${fvo.f_num}" />
			<input type="hidden" name="nowPage" value="${nowPage}" />
			<table class="table">
				<tbody>
					<tr class="add_comment_row">
						<td id="add_comment_cell1">
							<textarea id="c_content" name="c_content" placeholder="����� �Է��ϼ���."></textarea>
						</td>
						<td id="add_comment_cell2">
							<button class="btn" id="btn_addComment">��� �ۼ�</button>
						</td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
			
		<!-- ��� ��� ���̺� -->
		<div class="forum_comments_list" id="forum_comments_list">
			<c:forEach var="listv" items="${list}" varStatus="sid">
				<table class="table">
					<tbody>
						<tr class="warning">
							<th class="table_header1">
								Comment
							</th>
							<th class="table_header2">
								${listv.c_writer_id}
							</th>
							<th class="table_header3">
								${listv.c_date}
							</th>
						</tr>
						<tr class="comment_content">
							<td class="table_content" rowspan="2" id="td_c_content_${listv.c_num}" >
									<pre>${listv.c_content}</pre>
							</td>
							<td class="table_row1">
								<div class="col-md-6">
									<c:choose>
										<c:when test="${fvo.f_state == '����'}">
											<a class="btn a_vote a_good" id="a_good_${listv.c_num}" onclick="vote('${listv.c_num}', '#c_good_${listv.c_num}', 'good')">
												<img src="img/good.png" />
											</a>
										</c:when>
										<c:otherwise>
											<img src="img/good.png" />
										</c:otherwise>
									</c:choose>
								</div>
								&nbsp;&nbsp;
								<div class="col-md-4" id="c_good_${listv.c_num}" style="margin-top: 10px;">
									${listv.c_good}
								</div>
							</td>
							<td class="table_row1">
								<div class="col-md-6">
									<c:choose>
										<c:when test="${fvo.f_state == '����'}">
											<a class="btn a_vote a_bad" id="a_bad_${listv.c_num}" onclick="vote('${listv.c_num}', '#c_bad_${listv.c_num}', 'bad')">
												<img src="img/bad.png" />
											</a>
										</c:when>
										<c:otherwise>
											<img src="img/bad.png" />
										</c:otherwise>
									</c:choose>
								</div>
								&nbsp;&nbsp;
								<div class="col-md-4" id="c_bad_${listv.c_num}" style="margin-top: 10px;">
									${listv.c_bad}
								</div>
							</td>
						</tr>
						<tr class="comment_content">
							<td class="table_row2"></td>
							<td class="table_row2" id="td_modify_c_content_${listv.c_num}">
								<c:choose>
									<c:when test="${sessionScope['m_num'] == listv.c_writer && fvo.f_state == '����'}">
										<button type="button" class="btn" id="btn_modify_comment" 
										onclick="changeToModifyCommentForm(
										'${listv.c_num}','#td_c_content_${listv.c_num}', '#td_modify_c_content_${listv.c_num}'
										)">����</button>
										&nbsp;&nbsp;
										<a href="forumDeleteComment?c_num=${listv.c_num}&f_num=${fvo.f_num}&nowPage=${nowPage}" class="btn">����</a>
									</c:when>
								</c:choose>								
							</td>
						</tr>
					</tbody>
				</table>
			</c:forEach>
			<div class="btn-group">
				${pagingCode}
			</div>
		</div>
	</div>