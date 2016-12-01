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
			<table>
				<tr>
					<td colspan="5" class="cLs">리스트</td>
				</tr>
				<tr>
					<td>번호</td>
					<td>제목</td>
					<td>설문갯수</td>
					<td>작성일</td>
					<td>삭제</td>
				</tr>
				<c:forEach var="listv" items="${list}">
					<tr>
						<td>${listv.num}</td>
						<td><a href="voteDetail?num=${listv.num}">${listv.sub}</a></td>
						<td>${listv.qt}</td>
						<td>${listv.vdate}</td>
						<td><a href="javascript:del(${listv.num})">삭제</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>