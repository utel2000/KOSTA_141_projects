<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="member" class="vo.MemberVO"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>jstl5.jsp</title>
</head>
<body>
	<!-- 속성명이 "member"인 bean의 name property에 "홍길동"값 저장 -->
	<c:set target="${member}" property="name" value="홍길동"/>
	<!-- 속성명이 "member"인 bean의 email property에 "hong@nate.com" 값 저장 -->
	<c:set target="${member}" property="email">
		hong@nate.com
	</c:set>
	<!-- phone이라는 속성명으로 011-1234-5678값을 page 범위에 저장. -->
	<c:set var="phone" value="011-1234-5678"/>
	<!-- 속성명이 "member"인 bean의 phone property에 속성명 "phone"인 값을 읽어 저장. -->
	<c:set target="${member}" property="phone" value="${phone}"/>
	<h4>회원정보</h4>
	<ul>
		<li>이름 : ${member.name}</li>
		<li>메일 : ${member.email}</li>
		<li>전화 : ${member.phone}</li>
	</ul>
</body>
</html>