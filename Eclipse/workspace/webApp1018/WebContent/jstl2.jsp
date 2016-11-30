<%@page import="java.util.ArrayList"%>
<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	MemberVO vo1 = new MemberVO("홍길동", "hong@nate.com", "011-123-4567");
	MemberVO vo2 = new MemberVO("이순신", "lee@nate.com", "016-123-4567");
	MemberVO vo3 = new MemberVO("김유신", "kim@nate.com", "019-123-4567");

	ArrayList<MemberVO> memberList = new ArrayList<MemberVO>();
	memberList.add(vo1);
	memberList.add(vo2);
	memberList.add(vo3);

	request.setAttribute("memberList", memberList);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>forEach2.jsp</title>
</head>
<body>
	<h5>회원 리스트</h5>
	<table border="1" width="450">
		<tr>
			<th width="50">번호</th>
			<th width="100">메일</th>
			<th width="140">메일</th>
			<th width="160">연락처</th>
		</tr>
		<c:forEach var="member" items="${memberList}" varStatus="num">
			<tr>
				<td align="center">${num.count}</td>
				<td align="center">${member.name}</td>
				<td align="center">${member.email}</td>
				<td align="center">${member.phone}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>