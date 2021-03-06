<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<div id="article">
		<div id="header2">
			<h1>설문조사 예제: 설문조사 투표하기 폼</h1>
			<p id="time">Nov 25th, 2016</p>
		</div>
		<div id="section1">
			<form method="post" action="voteUpdate">
				<input type="hidden" name="num" value="${vvo.num}" />
				제목: <input type="text" name="sub" value="${vvo.sub}" /><br />
				<ul>
					<li>
					<c:forEach begin="1" end="${vvo.qt}" step="1" varStatus="e">
						<input type="radio" name="voteChk" value="${e.count}">
							<c:choose>
								<c:when test="${e.count == 1}">
									${vvo.vsub1}
								</c:when>
								<c:when test="${e.count == 2}">
									${vvo.vsub2}
								</c:when>
								<c:when test="${e.count == 3}">
									${vvo.vsub3}
								</c:when>
								<c:when test="${e.count == 4}">
									${vvo.vsub4}
								</c:when>
								<c:when test="${e.count == 5}">
									${vvo.vsub5}
								</c:when>
							</c:choose>
						</c:forEach>
					</li>
				</ul>
				<input type="submit" value="등록" />
				<input type="button" value="결과보기" onclick="resFunn('${vvo.num}')" />
			</form>
		</div>
	</div>