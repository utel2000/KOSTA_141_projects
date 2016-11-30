<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!-- fileList.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>fileList Page</title>
</head>
<body>
	<div>
		저장 위치 : <s:property value="basePath" /><br />
		<table>
			<tr>
				<th colspan="3">상 품 리 스 트</th>
			</tr>
			<tr>
				<s:iterator value="list" status="stat">
					<s:if test="#stat.index % 3 == 0">
						<tr></tr>
					</s:if>
					<td>
						<table>
							<tr>
								<td>
									<s:url id="detail" action="showDetail">
										<s:param name="basePath" value="basePath" />
										<s:param name="fileName" value="name" />
										<s:param name="fileNo" value="no" />
									</s:url>
									<s:a href="%{detail}"><s:property value="img" />
										<img src="fileup/goodsimg/<s:property value="img" />" width="180" border="0" />
									</s:a>
								</td>
							</tr>
							<tr>
								<td align="center">
									<s:property value="gname" />&nbsp;|&nbsp;
									<s:property value="price" />원
								</td>
							</tr>
						</table>
					</td>
				</s:iterator>
			</tr>
			<tr>
				<td colspan="3" align="center">
					<input type="button" value="글 올리기" onclick="location='upForm'" />
				</td>
			</tr>
		</table>
	</div>
</body>
</html>