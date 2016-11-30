<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>
	// 댓글 수정 폼 생성
	function changeToModifyCommentForm(c_num, target_textarea, target_buttons) {
		$.ajaxSetup({
			contentType:'application/x-www-form-urlencoded;charset=euc-kr'
		});
		// textarea 생성
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
		// 확인, 취소 버튼 생성.
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
	// 댓글 수정 폼에서 원본 폼으로 교체 Ajax
	function changeToOriginalCommentForm(c_num, target_textarea, target_buttons) {
		$.ajaxSetup({
			contentType:'application/x-www-form-urlencoded;charset=euc-kr'
		});
		// 댓글 복구
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
		// 버튼 복구
		$.ajax({
			url: "forumOriginalCommentForm_buttons",
			type: "post",
			data: {
				c_num: c_num, 
				f_num: ${fvo.f_num},
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
		// 댓글 수정 확인 버튼 Ajax
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
		// 좋아요 투표 기능
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
		// 댓글 작성 시 호출
		$('#btn_addComment').click(function() {
			if($('#c_content').val() == "") {
				alert("반드시 댓글을 입력하세요.");
			}else {
				$('#form_addComment').submit();
			}
		});
	});
</script>
	<!-- 댓글 작성 테이블 -->
	<div>
		<form method="post" action="forumAddComment" id="form_addComment">
			<input type="hidden" name="f_num" value="${fvo.f_num}" />
			<input type="hidden" name="nowPage" value="${nowPage}" />
			<table>
				<tbody>
					<tr>
						<td id="add_comment_cell1">
							<textarea id="c_content" name="c_content" 
							placeholder="댓글을 입력하세요.">
							</textarea>
						</td>
						<td id="add_comment_cell2">
							<button id="btn_addComment">댓글 작성</button>
						</td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
			
	<!-- 댓글 목록 테이블 -->
	<div id="forum_comments_list">
		<c:forEach var="listv" items="${list}" varStatus="sid">
			<table>
				<tbody>
					<tr>
						<th>
							Comment
						</th>
						<th>
							${listv.c_writer_id}
						</th>
						<th>
							${listv.c_date}
						</th>
					</tr>
					<tr>
						<td rowspan="2" id="td_c_content_${listv.c_num}" >
								<pre>${listv.c_content}</pre>
						</td>
						<td>
							<div>
								<c:choose>
									<c:when test="${fvo.f_state == '진행'}">
										<a id="a_good_${listv.c_num}" 
										onclick="vote('${listv.c_num}', '#c_good_${listv.c_num}', 'good')">
											<img src="img/good.png" />
										</a>
									</c:when>
									<c:otherwise>
										<img src="img/good.png" />
									</c:otherwise>
								</c:choose>
							</div>
							&nbsp;&nbsp;
							<div id="c_good_${listv.c_num}" style="margin-top: 10px;">
								${listv.c_good}
							</div>
						</td>
						<td>
							<div>
								<c:choose>
									<c:when test="${fvo.f_state == '진행'}">
										<a id="a_bad_${listv.c_num}" 
										onclick="vote('${listv.c_num}', '#c_bad_${listv.c_num}', 'bad')">
											<img src="img/bad.png" />
										</a>
									</c:when>
									<c:otherwise>
										<img src="img/bad.png" />
									</c:otherwise>
								</c:choose>
							</div>
							&nbsp;&nbsp;
							<div id="c_bad_${listv.c_num}" style="margin-top: 10px;">
								${listv.c_bad}
							</div>
						</td>
					</tr>
					<tr>
						<td></td>
						<td id="td_modify_c_content_${listv.c_num}">
							<c:choose>
								<c:when test="${listv.c_writer == sessionScope['m_num'] && fvo.f_state == '진행'}">
									<button type="button" id="btn_modify_comment" 
									onclick="changeToModifyCommentForm(
									'${listv.c_num}','#td_c_content_${listv.c_num}', '#td_modify_c_content_${listv.c_num}'
									)">수정</button>
									&nbsp;&nbsp;
									<a href="forumDeleteComment?c_num=${listv.c_num}&f_num=${listv.f_num}&nowPage=${nowPage}">삭제</a>
								</c:when>
							</c:choose>								
						</td>
					</tr>
				</tbody>
			</table>
		</c:forEach>
		<div>
			${pagingCode}
		</div>
	</div>
