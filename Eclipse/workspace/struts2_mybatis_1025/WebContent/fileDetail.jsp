<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>fileDetail.jsp</title>
</head>
<body>
	<div>
		<table>
			<thead>
				<tr>
					<th colspan="3">�� ǰ �� ��</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td colspan="3" align="right">
						<s:url id="del" action="fileDel">
							<s:param name="basePath" value="basePath" />
							<s:param name="fileName" value="vo.img" />
							<s:param name="fileNo" value="vo.no" />
						</s:url>
						<s:a href="%{del}">����</s:a>
					</td>
				</tr>
				<tr>
					<td rowspan="3" align="center">
						<s:url id="downLoad" action="fileDown">
							<s:param name="basePath" value="basePath" />
							<s:param name="fileName" value="vo.img" />
						</s:url>
						<s:a href="%{downLoad}">
							<img src="fileup/goodsimg/<s:property value="vo.img" />" width="250" border="0" />
						</s:a>
					</td>
					<th width="60">��ǰ��</th>
					<td><s:property value="vo.gname" /></td>
				</tr>
				<tr>
					<th>����</th>
					<td>
						<s:property value="vo.price" />
					</td>
				</tr>
				<tr>
					<th>��¥</th>
					<td>
						<s:property value="vo.redate" />
					</td>
				</tr>
				<tr>
					<th colspan="3">����</th>
				</tr>
				<tr>
					<th colspan="3">
						<s:property value="vo.content" />
					</th>
				</tr>
				<tr>
					<td colspan="3" align="center">
						<input type="button" value="����Ʈ" onclick="location='glist'" />
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>