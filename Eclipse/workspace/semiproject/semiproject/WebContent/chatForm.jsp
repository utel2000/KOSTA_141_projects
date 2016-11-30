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
	url : ����� ���ϰ��� �ϴ� URL �ּҸ� �Է��մϴ�. (�ʼ� �Է� ��)
	data : ������ ���� �����͸� �Է��մϴ�. 
	type : GET, POST ���� ��� ��� �����մϴ�. 
	dataType : ����� ����� �Ѿ�� �������������� �����մϴ�. 
	success(data) : ��� ������ ȣ�� �ؾ��ϴ� �Լ��� �����մϴ�. 
					�Ű� ������ ����� �Ѿ�� �����͸� �޽��ϴ�.
	error : ��� ���н� ȣ���ؾ��ϴ� �Լ��� �����մϴ�.
	complete : ��� ���� ���ο� ���� ���� ����� ���� �� ȣ���ؾ��ϴ� �Լ��� �����մϴ�.
	beforeSend : ��� ���� ȣ���ؾ��ϴ� �Լ��� �����մϴ�.
	async : �񵿱�(true), ����(false) ���θ� �����մϴ�.
	*/
	//push Client����
	console.log("typeof:" + typeof (EventSource));
	//push�� ���� �� �ִ� ���������� �Ǵ� (Ÿ�Կ��� -> ��ü�� Ÿ��Ȯ��)
	if (typeof (EventSource) != "undefined") {
		var eventSource = new EventSource("chatList",
			{
				withCredentials : true
			});
		// EventSource EventListener�� ����
		// onmessage : ������ ���� push �޼����� ���ŵǸ� �߻�(������)
		// onerror : ������ ���� push���� ������ �߻��Ǿ��� �� �߻�
		// onopen : ������ ������ �Ǿ��� �� �߻�
		eventSource.onmessage = function(event) {
			// alert(event.data);
			console.log(event.data);
			//�������������� ���ư��� �ִ� �ݹ��Լ�
			$("#chat_target").html(event.data);
 			$("#chat_div").scrollTop(10000);
		};
	} else {
		$("#chat_target").html("�ش� �������� ������ �ȵ˴ϴ�.")
	}


	$(document).ready(function() {
		// Ajax �ʱ� ������ form Ÿ������ �����Ѵ�.
		// for post
		$.ajaxSetup({
			// post ������� ���� �� form type
			contentType : 'application/x-www-form-urlencoded;charset=euc-kr'
		});

		$('#send').click(function() {
			var chat_usr = $('#chat_usr').val(); // val�� $(����)�� ���� �������� ���� �޼��尡 �ƴϾ�!!
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
			<!-- chat header �� -->

			<div class="popup-messages" id="chat_div">
				<div class="direct-chat-messages">
					<div class="direct-chat-msg doted-border" id="chat_target" >
						<!-- ������ ���� div -->

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
					<!-- �α��ε� id�� ������ �� -->
					<input type="text" id="chat_cont" placeholder="Type a message..."
							name="chat_cont" >
					<button id="send">����</button>	
				</div>
			</form>
			
			<!-- chat footer �� -->
		</div>
		<!-- container �� -->
	</div>
</body>
</html>