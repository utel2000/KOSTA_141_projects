<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@include file="header.jsp"%>
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
		// 댓글 숨기기, 펼치기
		var $trigger = $('#a_hide_and_show_comments');
		var $trigger_parent = $trigger.parent();
		var $contents = $('#div_comments_all');
		if(${firstPage} === 1) {
			$contents.hide();			
			$trigger.html("댓글 펼치기");
			$trigger_parent.css({
				'height': '50px',
				'border-top': '1px solid #BDBDBD',
				'border-bottom': '1px solid #BDBDBD',
				'text-align': 'center',
				'padding-top': '12px',
				'background-color': 'white'
			});
		}else {
			$trigger_parent.css({
				'height': '50px',
				'border-top': '1px solid #BDBDBD',
				'border-bottom': '1px solid #BDBDBD',
				'text-align': 'center',
				'padding-top': '12px',
				'background-color': '#FACC2E'
			});
		}
		$trigger.click(function() {
			$trigger_parent.hide();
			$trigger_parent.css({
				'background-color': 'white'
			}).fadeIn(500);		
			$contents.slideUp(500);
			$trigger.html("댓글 펼치기");
			if($contents.is(":hidden")) {
				$trigger_parent.css({
					'background-color': '#FACC2E'
				}).fadeIn(500);
				$contents.slideDown(500);
				$trigger.html("댓글 숨기기");
			}
			
			
		});
		
		// jQuery Style	
		$('h1').css({
			'color': '#FACC2E',
		    'font-size': '40px',
		    'font-weight': 'bold',
		    'padding-bottom': '20px'
		});
		$('.forum_subject').css({
			'width': '1140px'	
		});
		$('#forum_subject_cell').css({
			'width': '900px'
		});
		$('#forum_state_ing').css({
			'font-size': '16pt',
			'font-weight': 'bold',
			'background-color': '#9FF781',
			'margin': 'auto',
			'float': 'right',
		});
		$('#forum_state_end').css({
			'font-size': '16pt',
			'font-weight': 'bold',
			'background-color': '#F5A9A9',
			'margin': 'auto',
			'float': 'right',
		});
		$('#forum_content_img').css({
			'width': '300px',
			'height': '225px',
			'text-align': 'center',
			'vertical-align': 'middle'
		});
		$('#forum_content').css({
			'width': '840px',
			'height': '225px',
			'float': 'center',
			'vertical-align': 'middle'
		});
		$("#forum_content_img img").css({
			'width': '280px',
			'height': '210px',
			'border': '1px solid #BDBDBD'
		});
		$('#forum_content > pre').css({
			'width': '805px',
			'height': '210px',
			'font-weight': 'bold', 
			'background-color': '#FFFFF8',
			'background-image': 'url("img/intel_man.png")',
			'background-repeat': 'no-repeat',
			'background-position': 'center',
			'border': '1px solid #BDBDBD',
			'font-family': 'Consolas'
		});
		$('.pre_space').css({
			'background': 'white',
			'border': '0'
		});
		$('#a_hide_and_show_comments').css({
			'font-size': '18px',
			'font-weight': 'bold',
			'text-decoration': 'none'
		});
		$('#a_hide_and_show_comments').hover(function() {
			$(this).css({
				'color': '#3273b3',
				
			})}, function() {
			$(this).css({
			});
		});
		$('.add_comment_row').css({
			'background-color': '#E0E6F8'	
		});
		$('#add_comment_cell1').css({
			'width': '1030px',
			'text-align': 'center',
			'padding-top': '10px'
		});
		$('#add_comment_cell2').css({
			'vertical-align': 'bottom'
		});
		$('.img_best').css({
			'width': '15px'
		});
		$('.img_worst').css({
			'width': '18px'
		});
		$('.td_good_row1').css({
			'text-align': 'center',
			'vertical-align': 'middle'
		});
		$('.td_good').css({
			'text-align': 'center',
			'vertical-align': 'middle',
			'font-size': '15pt',
			'font-weight': 'bold',
			'color': 'blue'
		});
		$('.td_good img').css({
			'width': '30px'
		});
		$('.td_good_row1 img').css({
			'width': '30px'
		});
		$('.img_good_good').css({
			'width': '60px'
		});
		$('.td_bad_row1').css({
			'text-align': 'center',
			'vertical-align': 'middle'
		});
		$('.td_bad').css({
			'text-align': 'center',
			'vertical-align': 'middle',
			'font-size': '15pt',
			'font-weight': 'bold',
			'color': 'red'
		});
		$('.td_bad img').css({
			'width': '30px'
		});
		$('.td_bad_row1 img').css({
			'width': '30px'
		});
		$('.img_bad_bad').css({
			'width': '60px'
		});
		$('#c_content').css({
			'width': '1000px',
			'height': '78px',
			'max-width': '1000px',
			'max-height': '78px'
		});
		$('.table_header1').css({
			'border-right': '1px solid #BDBDBD'
		});
		$('.table_header2').css({
			'border-right': '1px solid #BDBDBD',
			'text-align': 'center',
			'width': '165px'
		});
		$('.table_header3').css({
			'text-align': 'center',
			'width': '165px'
		});
		$('.warning').css({
			'border-top': '2px solid #8F8F8F'	
		});
		$('.table .comment_content').css({
			'background-color': '#FCFCFC'	
		});
		$('.table_content').css({
			'border-bottom': '2px solid #8F8F8F',
			'vertical-align': 'middle',
			'background-color': '#FCFBF4'
		});
		$('.table_content pre').css({
			'border': '0',
			'background-color': '#FCFBF4'
		});
		$('.table_row1').css({
			'text-align': 'center',
			'background-color': '#FCFBF4'
		});
		
		$('.table_row2').css({
			'border-top': '0px',
			'border-bottom': '2px solid #8F8F8F',
			'text-align': 'right',
			'vertical-align': 'bottom',
			'background-color': '#FCFBF4'
		});
		$('.btn').css({
			'color': 'black',
			'background-color': '#FACC2E'
		});
		$('.a_good').css({
			'background-color': "#FCFBF4"
		});
		$('.a_bad').css({
			'background-color': "#FCFBF4"
		});
		$('.table_row1 img').css({
			'width': '30px'
		});
		$('#btn_nowCPage').css({
			'background-color': 'lightblue'
		});
	});
</script>
<!-- 시작 -->
<div class="container">
	<!-- 글 제목, 포럼 상태 테이블 -->
	<table class="forum_subject">
		<tr>
			<td id="forum_subject_cell">
				<h1>☞ ${fvo.f_subject}</h1>
			</td>
			<td>
				<div
					<c:choose>
						<c:when test="${fvo.f_state == '진행'}">
							id="forum_state_ing"
						</c:when>
						<c:otherwise>
							id="forum_state_end"
						</c:otherwise>
					</c:choose>
				>
					포럼 상태: ${fvo.f_state} 
				</div>
			</td>
			<td>
				<div>
					&nbsp;&nbsp;					
					<a href="forumList?nowPage=${nowPage}" class="btn">목록</a>
				</div>
			</td>
		</tr>
	</table>
	<hr>
	<!-- 본문 이미지, 내용 -->
	<div>
		<div class="col-md-6" id="forum_content_img">
			<c:choose>
				<c:when test="${fvo.f_img == 'noimg'}">
					<img src="img/noimg2.png">
				</c:when>
				<c:otherwise>
					<img src="img/${fvo.f_img}">
				</c:otherwise>
			</c:choose>	
		</div>
		<div class="col-md-6" id="forum_content">
			<pre>${fvo.f_content}</pre>
		</div>
	</div>
	<pre class="pre_space"></pre>
	<!-- 댓글 숨기기 / 펼치기 -->
	<div id="div_hide_and_show_comments">
		<a href="#none" id="a_hide_and_show_comments">댓글 숨기기</a>
	</div>
	<br /><br />
	<div id="div_comments_all">
		<!-- 댓글 작성 테이블 -->
		<c:choose>
			<c:when test="${fvo.f_state == '진행'}">
				<div>
					<form method="post" action="forumAddComment" id="form_addComment">
						<input type="hidden" name="f_num" value="${fvo.f_num}" />
						<input type="hidden" name="nowPage" value="${nowPage}" />
						<table class="table">
							<tbody>
								<tr class="add_comment_row">
									<td id="add_comment_cell1">
										<textarea id="c_content" name="c_content" placeholder="댓글을 입력하세요."></textarea>
									</td>
									<td id="add_comment_cell2">
										<button class="btn" id="btn_addComment">댓글 작성</button>
									</td>
								</tr>
							</tbody>
						</table>
					</form>
				</div>
			</c:when>
			<c:otherwise>
			<!-- 완료 포럼 베스트/워스트 댓글 -->
				<div>
					<!-- 최다 좋아요 댓글 -->
					<c:forEach var="goodListv" items="${goodList}" varStatus="sid">
						<table class="table">
							<tbody>
								<tr class="success">
									<th class="table_header1">
										<img src="img/medal.png" class="img_best" />
										Best Comment - ${sid.count}
									</th>
									<th class="table_header2">
										${goodListv.c_writer_id}
									</th>
									<th class="table_header3">
										${goodListv.c_date}
									</th>
								</tr>
								<tr class="comment_content">
									<td class="table_content" rowspan="2">
										<pre>${goodListv.c_content}</pre>
									</td>
									<td class="td_good">
											<img src="img/good.png" class="img_good_good" />
											&nbsp;&nbsp;
											${goodListv.c_good}
									</td>
									<td class="td_good_row1">
											<img src="img/bad.png" />
											&nbsp;&nbsp;
											${goodListv.c_bad}
									</td>
								</tr>
								<tr class="comment_content">
									<td class="table_row2"></td>
									<td class="table_row2">
									</td>
								</tr>
							</tbody>
						</table>
					</c:forEach>
					<!-- 최다 싫어요 댓글 -->
					<c:forEach var="badListv" items="${badList}" varStatus="sid">
						<table class="table">
							<tbody>
								<tr class="danger">
									<th class="table_header1">
										<img src="img/shit.png" class="img_worst" />
										Worst Comment - ${sid.count}
									</th>
									<th class="table_header2">
										${badListv.c_writer_id}
									</th>
									<th class="table_header3">
										${badListv.c_date}
									</th>
								</tr>
								<tr class="comment_content">
									<td class="table_content" rowspan="2">
										<pre>${badListv.c_content}</pre>
									</td>
									<td class="td_bad_row1">
											<img src="img/good.png" />
											&nbsp;&nbsp;
											${badListv.c_good}
									</td>
									<td class="td_bad">
											<img src="img/bad.png" class="img_bad_bad"/>
											&nbsp;&nbsp;
											${badListv.c_bad}
									</td>
								</tr>
								<tr class="comment_content">
									<td class="table_row2"></td>
									<td class="table_row2">
									</td>
								</tr>
							</tbody>
						</table>
					</c:forEach>
				</div>
			</c:otherwise>
		</c:choose>
		<pre class="pre_space" id="pre_noUse"></pre>
		<!-- 댓글 목록 테이블 -->
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
										<c:when test="${fvo.f_state == '진행'}">
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
										<c:when test="${fvo.f_state == '진행'}">
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
									<c:when test="${sessionScope['m_num'] == listv.c_writer && fvo.f_state == '진행'}">
										<button type="button" class="btn" id="btn_modify_comment" 
										onclick="changeToModifyCommentForm(
										'${listv.c_num}','#td_c_content_${listv.c_num}', '#td_modify_c_content_${listv.c_num}'
										)">수정</button>
										&nbsp;&nbsp;
										<a href="forumDeleteComment?c_num=${listv.c_num}&f_num=${fvo.f_num}&nowPage=${nowPage}" class="btn">삭제</a>
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
</div>
<!-- 끝 -->
<br />
<%@ include file="footer.jsp"%>