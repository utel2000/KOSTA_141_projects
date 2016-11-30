<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<script>
	$(document).ready(function() {
		$('#btn_call').click(function() {
			$.ajax({
				// Spring jackson�� ����� JSON�����͸� ��û�ϱ� ���� url
				url: "memberJson",
				// MIMEŸ���� json.
				datatype: "json",
				success: function(data) {
					console.log(data);
					// each ���� ��ҿ��� Ű, ���� �и��ؼ� �ݺ��� ��� ���.
					// �迭��ҿ� ���� (JSON������ ����)
					$.each(data, function(key, value) {
						console.log("key: " + key + " / Value: " + value);
						// key�� ���� member�� Object�� Value�� �������̴�
						// �ٽ� each�� ����ؼ� value.name, value.num
						$.each(value, function(index, result) {
							var tag = "<tr><td>" + result.num + "</td>";
							tag += "<td>" + result.name + "</td>";
							tag += "<td>" + result.age + "</td>";
							tag += "<td>" + result.job + "</td></tr>";
							// target�� tbody�� tag�� �ϳ��� �ٿ��ִ� �Լ�.
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
			<h1>�������� ����: �������� ��ǥ�ϱ� ��</h1>
			<p id="time">Nov 6th, 2016</p>
		</div>
		<div id="section1">
			<table>
				<tr>
					<td>��ȣ</td>
					<td>�̸�</td>
					<td>����</td>
					<td>��å</td>
				</tr>
				<tbody id="target">
				</tbody>
				<tr>
					<td colspan="4">
						<input type="button" id="btn_call" value="�ҷ�����" />
					</td>
				</tr>
			</table>
		</div>
	</div>