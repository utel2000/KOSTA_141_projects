<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@page trimDirectiveWhitespaces="true"%>
<script src="http://code.jquery.com/jquery-1.9.0rc1.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.0.0rc1.js"></script>
<style>
@import url(https://fonts.googleapis.com/css?family=Oswald:400,300);

@import url(https://fonts.googleapis.com/css?family=Open+Sans);

#wrap{
	font-family: 'Open Sans', sans-serif;
}


.popup-box {
	background-color: #ffffff;
 	border: 1px solid #b0b0b0; 
	bottom: 10px;
	display: none;
	height: 415px;
	position: fixed;
	right: 10px;
	width: 250px;
	font-family: 'Open Sans', sans-serif;
}

.round.hollow {
 	margin: 40px 0 0; 
 	padding-top : 70px;
 	text-align: right;
}

.round.hollow a {
	border: 2px solid #EC970D;
	border-radius: 35px;
	color: red;
	color: #EC970D;
	font-size: 23px;
	padding: 10px 21px;
	text-decoration: none;
	font-family: 'Open Sans', sans-serif;
	
}
#send{
	border: 1px solid #b0b0b0;
	color: #b0b0b0;
	background-color : white;
	font-weight : bold;
	font-family: 'Open Sans', sans-serif;
}

#chat_cont{
	border: 1px solid #b0b0b0;
}


.round.hollow a:hover {
	border: 2px solid #000;
	border-radius: 35px;
	color: red;
	color: #000;
	font-size: 23px;
	padding: 10px 21px;
	text-decoration: none;
}

.popup-box-on {
	display: block !important;
	border: 1px solid #b0b0b0;
}

.popup-box .popup-head {
	background-color: #fff;
	clear: both;
	color: #7b7b7b;
	display: inline-table;
	font-size: 21px;
	padding: 7px 10px;
	width: 100%;
	font-family: Oswald;
}

.bg_none i {
	border: 1px solid #ff6701;
	border-radius: 25px;
	color: #ff6701;
	font-size: 17px;
	height: 33px;
	line-height: 30px;
	width: 33px;
}

.bg_none:hover i {
	border: 1px solid #000;
	border-radius: 25px;
	color: #000;
	font-size: 17px;
	height: 33px;
	line-height: 30px;
	width: 33px;
}

.bg_none {
	background: rgba(0, 0, 0, 0) none repeat scroll 0 100;
	border: medium none;
}

.popup-box .popup-head .popup-head-right {
	margin-left : 100px;
}

.popup-box .popup-messages {
	
}

.popup-head-left img {
	border: 1px solid #7b7b7b;
	border-radius: 50%;
	width: 44px;
}

.popup-messages-footer>textarea {
	border-bottom: 1px solid #b2b2b2 !important;
	height: 34px !important;
	margin: 7px;
	padding: 5px !important;
	border: medium none;
	width: 95% !important;
}

.popup-messages-footer {
	background: #fff none repeat scroll 0 0;
	bottom: 0;
	position: absolute;
	width: 100%;
	height: 20px;
	text-align: center;
}

.popup-messages-footer .btn-footer {
	overflow: hidden;
	padding: 2px 5px 10px 6px;
	width: 100%;
}

.simple_round {
	background: #d1d1d1 none repeat scroll 0 0;
	border-radius: 50%;
	color: #4b4b4b !important;
	height: 21px;
	padding: 0 0 0 1px;
	width: 21px;
}

.popup-box .popup-messages {
	background: #ECBF2B none repeat scroll 0 0;
	height: 320px;
	overflow: auto;
	border: 1px solid #b0b0b0;
}

.direct-chat-messages {
	overflow: auto;
	padding: 10px;
	padding-left : 5px;
	transform: translate(0px, 0px);
}

.popup-messages .chat-box-single-line {
	border-bottom: 1px solid #a4c6b5;
	height: 12px;
	margin: 7px 0 20px;
	position: relative;
	text-align: center;
}

.popup-messages abbr.timestamp {
	background: #3f9684 none repeat scroll 0 0;
	color: #fff;
 	padding: 0 11px; 
	border: 1px solid;
}

.popup-head-right .btn-group {
	display: inline-flex;
	margin: 0 8px 0 0;
	vertical-align: top !important;
}

.chat-header-button {
	background: transparent none repeat scroll 0 0;
 	border: 1px solid #636364; 
	border-radius: 50%;
	font-size: 14px;
	height: 30px;
	width: 30px;
	
}

.popup-head-right .btn-group .dropdown-menu {
	border: medium none;
	min-width: 122px;
	padding: 0;
}

.popup-head-right .btn-group .dropdown-menu li a {
	font-size: 12px;
	padding: 3px 10px;
	color: #303030;
}

.popup-messages abbr.timestamp {
	background: #3f9684 none repeat scroll 0 0;
	color: #fff;
	padding: 0 11px;
}

.popup-messages .chat-box-single-line {
	border-bottom: 1px solid #a4c6b5;
	height: 12px;
	margin: 7px 0 20px;
	position: relative;
	text-align: center;
}

.popup-messages .direct-chat-messages {
	height: auto;
}

.popup-messages .direct-chat-text {
	background: #dfece7 none repeat scroll 0 0;
	border: 1px solid #dfece7;
	border-radius: 2px;
	color: #1f2121;
}

.popup-messages .direct-chat-timestamp {
	color: #fff;
	opacity: 0.6;
}

.popup-messages .direct-chat-name {
	font-size: 15px;
	font-weight: 600;
	margin: 0 0 0 49px !important;
	color: #fff;
	opacity: 0.9;
}

.popup-messages .direct-chat-info {
	display: block;
	font-size: 12px;
	margin-bottom: 0;
}

.popup-messages  .big-round {
	margin: -9px 0 0 !important;
}

.popup-messages  .direct-chat-img {
	border: 1px solid #fff;
	background: #3f9684 none repeat scroll 0 0;
	border-radius: 50%;
	float: left;
	height: 40px;
	margin: -21px 0 0;
	width: 40px;
}

.direct-chat-reply-name {
	color: #fff;
	font-size: 15px;
	margin: 0 0 0 10px;
	opacity: 0.9;
}

.direct-chat-img-reply-small {
	border: 1px solid #fff;
	border-radius: 50%;
	float: left;
	height: 20px;
	margin: 0 8px;
	width: 20px;
	background: #3f9684;
}

.popup-messages .direct-chat-msg {
	margin-bottom: 10px;
	position: relative;
}

.popup-messages .doted-border::after {
	background: transparent none repeat scroll 0 0 !important;
	border-right: 2px dotted #fff !important;
	bottom: 0;
	content: "";
	left: 17px;
	margin: 0;
	position: absolute;
	top: 0;
	width: 2px;
	display: inline;
	z-index: -2;
}

.popup-messages .direct-chat-msg::after {
	background: #fff none repeat scroll 0 0;
	border-right: medium none;
	bottom: 0;
	content: "";
	left: 17px;
	margin: 0;
	position: absolute;
	top: 0;
	width: 2px;
	display: inline;
	z-index: -2;
}

.direct-chat-text::after, .direct-chat-text::before {
	border-color: transparent #dfece7 transparent transparent;
}

.direct-chat-text::after, .direct-chat-text::before {
	-moz-border-bottom-colors: none;
	-moz-border-left-colors: none;
	-moz-border-right-colors: none;
	-moz-border-top-colors: none;
	border-color: transparent #d2d6de transparent transparent;
	border-image: none;
	border-style: solid;
	border-width: medium;
	content: " ";
	height: 0;
	pointer-events: none;
	position: absolute;
	right: 100%;
	top: 15px;
	width: 0;
}

.direct-chat-text::after {
	border-width: 5px;
	margin-top: -5px;
}

.popup-messages .direct-chat-text {
	background: #dfece7 none repeat scroll 0 0;
	border: 1px solid #dfece7;
	border-radius: 2px;
	color: #1f2121;
}

.direct-chat-text {
	background: #d2d6de none repeat scroll 0 0;
	border: 1px solid #d2d6de;
	border-radius: 5px;
	color: #444;
	margin: 5px 0 0 50px;
	padding: 5px 10px;
	position: relative;
}

</style>

<script>
	/*
	url : 통신을 원하고자 하는 URL 주소를 입력합니다. (필수 입력 값)
	data : 서버로 보낼 데이터를 입력합니다. 
	type : GET, POST 등의 통신 방식 지정합니다. 
	dataType : 통신의 결과로 넘어올 데이터의종류를 지정합니다. 
	success(data) : 통신 성공시 호출 해야하는 함수를 지정합니다. 
					매개 변수로 결과로 넘어온 데이터를 받습니다.
	error : 통신 실패시 호출해야하는 함수를 지정합니다.
	complete : 통신 성공 여부와 관계 없이 통신이 끝난 후 호출해야하는 함수를 지정합니다.
	beforeSend : 통신 전에 호출해야하는 함수를 지정합니다.
	async : 비동기(true), 동기(false) 여부를 지정합니다.
	*/
	//push Client설정
	console.log("typeof:" + typeof (EventSource));
	//push를 받을 수 있는 브라우저인지 판단 (타입오브 -> 객체의 타입확인)
	if (typeof (EventSource) != "undefined") {
		var eventSource = new EventSource("chatList",
			{
				withCredentials : true
			});
		// EventSource EventListener의 종류
		// onmessage : 서버가 보낸 push 메세지가 수신되면 발생(리스너)
		// onerror : 서버가 보낸 push에서 에러가 발생되었을 때 발생
		// onopen : 서버가 연결이 되었을 때 발생
		eventSource.onmessage = function(event) {
			// alert(event.data);
			console.log(event.data);
			//리스너형식으로 돌아가고 있는 콜백함수
			$("#chat_target").html(event.data);
 			$("#chat_div").scrollTop(10000);
		};
	} else {
		$("#chat_target").html("해당 브라우저는 지원이 안됩니다.")
	}


	$(document).ready(function() {
		// Ajax 초기 설정시 form 타입으로 변경한다.
		// for post
		$.ajaxSetup({
			// post 방식으로 보낼 때 form type
			contentType : 'application/x-www-form-urlencoded;charset=euc-kr'
		});

		$('#send').click(function() {
			var chat_usr = $('#chat_usr').val(); // val은 $(변수)의 값을 가져오기 위한 메서드가 아니얌!!
			var chat_cont = $('#chat_cont').val();

			$.ajax({
				url : "chatAdd",
				type : "post",
				data : {
					chat_usr : chat_usr,
					chat_cont : chat_cont
				}
			});
			$('#chat_cont').val("");
			return false;
		});
	});


	$(function() {
		$("#addClass").click(function() {
			$('#qnimate').addClass('popup-box-on');
		});

		$("#removeClass").click(function() {
			$('#qnimate').removeClass('popup-box-on');
		});
	})
</script>

<body>
	<div id="wrap">
		<!-- container -->
		<div class="container text-center">
			<div class="row">
				<div class="round hollow text-center">
					<a href="#" id="addClass"><span
						class="glyphicon glyphicon-comment"></span> Open in chat </a>
				</div>
			</div>
		</div>


		<div class="popup-box chat-popup" id="qnimate">
			<!-- chat header -->
			<div class="popup-head">
				<div class="popup-head-right pull-right">
					<button data-widget="remove" id="removeClass"
						class="chat-header-button pull-right" type="button">
					<i class="glyphicon glyphicon-off"></i>
					</button>
				</div>
			</div>
			<!-- chat header 끝 -->

			<div class="popup-messages" id="chat_div">
				<div class="direct-chat-messages">
					<div class="direct-chat-msg doted-border" id="chat_target" >
						<!-- 데이터 들어올 div -->

						<!-- /.direct-chat-text -->
					</div>
					<!-- /.direct-chat-msg -->
				</div>
			</div>


			<!-- chat footer -->
			
			<form method="post" action="chatAdd" name="chatForm" id="chatForm" >
				<div class="popup-messages-footer" style="bottom: 10px;">
					<input type="hidden" id="chat_usr" name="chat_usr" value="${sessionScope['m_name']}" >
					<input type="hidden" name="m_id" value="${sessionScope['m_id']}">
					<!-- 로그인된 id로 변경할 것 -->
					<input type="text" id="chat_cont" placeholder="Type a message..."
							name="chat_cont" >
					<button id="send">전송</button>	
				</div>
			</form>
			
			<!-- chat footer 끝 -->
		</div>
		<!-- container 끝 -->
	</div>
</body>
</html>