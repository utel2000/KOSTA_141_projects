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
	<!-- �Ӽ����� "member"�� bean�� name property�� "ȫ�浿"�� ���� -->
	<c:set target="${member}" property="name" value="ȫ�浿"/>
	<!-- �Ӽ����� "member"�� bean�� email property�� "hong@nate.com" �� ���� -->
	<c:set target="${member}" property="email">
		hong@nate.com
	</c:set>
	<!-- phone�̶�� �Ӽ������� 011-1234-5678���� page ������ ����. -->
	<c:set var="phone" value="011-1234-5678"/>
	<!-- �Ӽ����� "member"�� bean�� phone property�� �Ӽ��� "phone"�� ���� �о� ����. -->
	<c:set target="${member}" property="phone" value="${phone}"/>
	<h4>ȸ������</h4>
	<ul>
		<li>�̸� : ${member.name}</li>
		<li>���� : ${member.email}</li>
		<li>��ȭ : ${member.phone}</li>
	</ul>
</body>
</html>