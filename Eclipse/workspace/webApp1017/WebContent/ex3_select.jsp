<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- ex3_select.jsp --%>
<option value="">����</option>
<%
	// log start
	StringBuffer log = new StringBuffer();
	System.out.println("<ex3_select.jsp>");
	// log end

	String msg = request.getParameter("msg");
	String[] cats = { "�߿�1", "�߿�2", "�߿�3", "�߿�4", "�߿�5" };
	String[] bulbs = { "����1", "����2" };
	
	// log start
	log.append("* msg : ").append(msg).append("\n");
	System.out.println(log);
	log.delete(0, log.length());
	// log end
	
	if (msg.equals("1")) {
		for (String e : cats) {
%>
			<option value="<%=e%>"><%=e%></option>
<%			
		} // end for
	} else if (msg.equals("2")) {
		for (String e : bulbs) {
%>
			<option value="<%=e%>"><%=e%></option>
<%
		} // end for
	} // end if
%>