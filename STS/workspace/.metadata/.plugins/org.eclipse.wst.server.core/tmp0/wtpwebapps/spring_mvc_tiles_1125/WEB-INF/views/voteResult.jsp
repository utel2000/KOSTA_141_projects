<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<div id="article">
		<div id="header2">
			<h1>설문조사 예제 : 설문조사 투표 결과</h1>
			<p id="time">Nov 25th, 2016</p>
		</div>
		<div id="section1">
			<c:if test="${vvo.vsub1 != null}">
				1. [ ${vvo.vsub1} ]<br />
				<p style="background-color: orange; width: ${vvo.vcnt1 * 2}px;
					text-align: right;">
					${vvo.vcnt1}%<br />
				</p>
			</c:if>
			<c:if test="${vvo.vsub2 != null}">
				2. [ ${vvo.vsub2} ]<br />
				<p style="background-color: orange; width: ${vvo.vcnt2 * 2}px;
					text-align: right;">
					${vvo.vcnt2}%<br />
				</p>
			</c:if>
			<c:if test="${vvo.vsub3 != null}">
				3. [ ${vvo.vsub3} ]<br />
				<p style="background-color: orange; width: ${vvo.vcnt3 * 2}px;
					text-align: right;">
					${vvo.vcnt3}%<br />
				</p>
			</c:if>
		</div>
	</div>