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
			<form method="post" action="voteInsert">
				����: <input type="text" name="sub"><br />
				Code: <input type="number" name="qt" maxlength="5" step="1" 
					min="2" max="5" value="2"><br />
				<c:forEach begin="1" end="5" step="1" varStatus="i">
					��������${i.count}: <input type="text" name="vsub${i.count}"><br />
				</c:forEach>
			<input type="submit" value="����ϱ�">
			</form>
		</div>
	</div>