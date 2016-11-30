<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>
	$(document).ready(function() {
		$('#btn_call').click(function() {
			$.ajax({
				// Spring jackson을 사용한 JSON데이터를 요청하기 위한 url
				url: "memberJson",
				// MIME타입이 json.
				datatype: "json",
				success: function(data) {
					console.log(data);
					// each 집합 요소에서 키, 값을 분리해서 반복할 경우 사용.
					// 배열요소에 적합 (JSON데이터 추출)
					$.each(data, function(key, value) {
						console.log("key: " + key + " / Value: " + value);
						// key의 값이 member에 Object형 Value가 여러개이니
						// 다시 each문 사용해서 value.name, value.num
						$.each(value, function(index, result) {
							var tag = "<tr><td>" + result.num + "</td>";
							tag += "<td>" + result.name + "</td>";
							tag += "<td>" + result.age + "</td>";
							tag += "<td>" + result.job + "</td></tr>";
							// target이 tbody에 tag를 하나씩 붙여넣는 함수.
							$('#target').append(tag);
						});
					});
				}
			});
		});
	});
</script>
	<div id="article">
		<div id="header2">
			<h1>설문조사 예제: 설문조사 투표하기 폼</h1>
			<p id="time">Nov 6th, 2016</p>
		</div>
		<div id="section1">
			<table>
				<tr>
					<td>번호</td>
					<td>이름</td>
					<td>나이</td>
					<td>직책</td>
				</tr>
				<tbody id="target">
				</tbody>
				<tr>
					<td colspan="4">
						<input type="button" id="btn_call" value="불러오기" />
					</td>
				</tr>
			</table>
		</div>
	</div>