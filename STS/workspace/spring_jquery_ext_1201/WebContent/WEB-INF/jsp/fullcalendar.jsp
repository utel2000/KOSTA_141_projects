<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel='stylesheet'
	href='http://fullcalendar.io/js/fullcalendar-2.3.1/lib/cupertino/jquery-ui.min.css' />
<link
	href='http://fullcalendar.io/js/fullcalendar-2.3.1/fullcalendar.css'
	rel='stylesheet' />
<link
	href='http://fullcalendar.io/js/fullcalendar-2.3.1/fullcalendar.print.css'
	rel='stylesheet' media='print' />
<script
	src='http://fullcalendar.io/js/fullcalendar-2.3.1/lib/moment.min.js'></script>
<script src="https://code.jquery.com/jquery-2.2.3.min.js"
	integrity="sha256-a23g1Nt4dtEYOj7bR+vTu7+T8VP13humZFBJNIYoEJo="
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-migrate-1.4.0.min.js"
	integrity="sha256-nxdiQ4FdTm28eUNNQIJz5JodTMCF5/l32g5LwfUwZUo="
	crossorigin="anonymous"></script>
<script
	src='http://fullcalendar.io/js/fullcalendar-2.3.1/fullcalendar.min.js'></script>
<script src='http://fullcalendar.io/js/fullcalendar-2.3.1/lang-all.js'></script>
<script>
 $(function(){
    var events = [];
	function callbacks(){
			//---------
			// Ajax시작 
			var url = "memberJson?code=f";
			$.ajax({
				
				url:url,
				dataType:"json",
				success:function(data,status){
					console.log(data);	
					// each 집합 요소에서 키,값을 분리해서 반복할 경우사용
					// 배열요소에 적합
				
					$.each(data,function(k,v){
						$.each(v,function(index,res){
								events.push({
									title:res.title,
									start:res.start,
									end:res.end
								});
								
						});
						
						
					});
					return events;
					
					
				}
			});
			
			//-----------
}callbacks();
  var currentLangCode = 'ko';
  $('#calendar').fullCalendar('destroy');
  $('#calendar').fullCalendar({

            eventClick : function(calEvent,jsEvent,view){ 
              var r=confirm("Delete " + 
                calEvent.title+":"+calEvent._id);
              if (r===true)
                {
                    $('#calendar').fullCalendar('removeEvents', 
                      calEvent._id);
                }
             },
   defaultView: 'month',//기본 뷰 - 옵션   //첫 페이지 기본 뷰 옵션
   editable: false,                                             //에디터 가능 옵션
   selectable: true,
   selectHelper: true,
   // 캘린더 셀렉트 된 값을 컬럼에 표시...
   select: function(start, end, event) {
    
    var title = prompt('Event Title:');
    var eventData;
    if (title) {
     eventData = {
      title: title,
      start: start,
      end: end
     };
     
    $('#calendar').fullCalendar('renderEvent', eventData, true); // stick? = true
    }
    $('#calendar').fullCalendar('unselect');
    
    alert("selected from: " + start.format() + ", to: " + end.format());
     // 셀렉트된 결과를 서버로 전송    url: "testAjax.jsp",

   },
   editable: true,
   eventLimit: true,
   events:${tag}
  
  });// 
 });
</script>
<!--   -->

<div id="article">
	<div id="header2">
		<h1>uri : jQuery :</h1>
		<p id="time">2016. 6. 3.</p>
	</div>
	<div id="content">
		<div id='calendar'></div>
	</div>
</div>