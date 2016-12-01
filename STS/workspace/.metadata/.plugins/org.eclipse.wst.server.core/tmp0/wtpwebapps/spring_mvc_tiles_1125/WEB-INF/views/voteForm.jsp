<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<!-- article 영역 시작 -->
	<div id="article">
		<div id="header2">
			<h1>설문조사 예제: 설문조사 등록 폼</h1>
			<p id="time">Nov 25th, 2016</p>
		</div>
		<div id="section1">
			<form method="post" action="voteInsert">
				제목: <input type="text" name="sub"><br />
				Code: <input type="number" name="qt" maxlength="5" step="1" 
					min="2" max="5" value="2"><br />
				<c:forEach begin="1" end="5" step="1" varStatus="i">
					설문문항${i.count}: <input type="text" name="vsub${i.count}"><br />
				</c:forEach>
			<input type="submit" value="등록하기">
			</form>
		</div>
	</div>