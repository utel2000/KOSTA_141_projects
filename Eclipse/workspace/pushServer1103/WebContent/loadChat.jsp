<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page trimDirectiveWhitespaces="true"%>
<%response.setContentType("text/event-stream");%>
${sendMsg}
<%-- 
<%
	response.setContentType("text/event-stream");
	List<ChatVO> list = ChatDAO.getDao().getList();
	StringBuffer outs = new StringBuffer();
	out.write("retry: 1000\n"); // 지연 대기 시간
	outs.append("data: "); // data란 키 값으로 클라이언트에게 보내짐.
	for (ChatVO e : list) {
		outs.append("[")
		.append(e.getU_id())
		.append("] : ")
		.append(e.getChat())
		.append("<br />");
	}
	out.write(outs.toString());
	out.newLine();
	out.newLine(); // 개행 2회!! 외쳐 EE!!
	out.flush(); // 전송!!
%>
--%>