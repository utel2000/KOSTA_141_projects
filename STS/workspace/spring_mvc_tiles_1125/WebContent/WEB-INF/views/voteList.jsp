<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<!-- article ���� ���� -->
	<div id="article">
		<div id="header2">
			<h1>�������� ����: �������� ��� ��</h1>
			<p id="time">Nov 25th, 2016</p>
		</div>
		<div id="section1">
			<table>
				<tr>
					<td colspan="5" class="cLs">����Ʈ</td>
				</tr>
				<tr>
					<td>��ȣ</td>
					<td>����</td>
					<td>��������</td>
					<td>�ۼ���</td>
					<td>����</td>
				</tr>
				<c:forEach var="listv" items="${list}">
					<tr>
						<td>${listv.num}</td>
						<td><a href="voteDetail?num=${listv.num}">${listv.sub}</a></td>
						<td>${listv.qt}</td>
						<td>${listv.vdate}</td>
						<td><a href="javascript:del(${listv.num})">����</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>