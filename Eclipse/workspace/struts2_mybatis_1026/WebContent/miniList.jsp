<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>miniList.jsp</title>
</head>
<body>
	<div style="margin:0px 0px 0px 0px;">
		<fieldset>
			<legend>미니 리스트</legend>
			<table style="width: 500px;">
				<thead style="background-color: skyblue;">
					<tr>
						<th>내    용</th>
						<th>아 이 콘</th>
						<th>작 성 자</th>
						<th>작성날짜</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator var="Listv" value="list" status="sid">
						<tr>
							<td><s:property value="cont" /></td>
							<td>
								<span style="background-color: skyblue">
									<s:if test="icon.equals(\"A\")">
										<img src="icon/chu1.gif" style="width: 150px;" />
									</s:if>
									<s:elseif test="icon.equals(\"B\")">
										<img src="icon/chu2.gif" style="width: 150px;" />
									</s:elseif>
									<s:elseif test="icon.equals(\"C\")">
										<img src="icon/chu3.gif" style="width: 150px;" />
									</s:elseif>
									<s:elseif test="icon.equals(\"D\")">
										<img src="icon/chu4.gif" style="width: 150px;" />
									</s:elseif>
									<s:elseif test="icon.equals(\"E\")">
										<img src="icon/chu5.gif" style="width: 150px;" />
									</s:elseif>
								</span>
							</td>
							<td><s:property value="id" /></td>
							<td><s:property value="wday" /></td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
			<p>
				<%-- 페이지 출력 프로퍼티 --%>
				<s:property value="pagingCode" escape="false" />
			</p>
		</fieldset>
	</div>
</body>
</html>