<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>index3.jsp</title>
</head>
<body>
	<table width="300">
		<tr>
			<td>
				<!-- 
					begin과 end를 사용해서 반복횟수를 지정할 수 있다.
					stea은 증감치를 지정한다.
				-->
				<c:forEach begin="1" end="10" step="1" varStatus="num">
					<a href="#">${num.index}</a>
					<a href="#">${num.count}</a>
				</c:forEach>
			</td>
		</tr>
	</table>
</body>
</html>