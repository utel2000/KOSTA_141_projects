<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%--
	ex2_loadData.jsp
--%>
<%
	String n = request.getParameter("num");
	System.out.println(n);
	if(n.equals("Click1")) {
		String[] sub = {"Java", "Oracle", "jQuery", "SenchaTouch", "PhoneGap"};
		for(String e : sub) {
			out.print("<li>");
			out.print(e);
			out.println("</li>");
		}
	} else {
		String[] sub = {"자바", "제이쿼리", "오라클", "센차터치", "폰갭"};
		for(String e : sub) {
			out.print("<li>");
			out.print(e);
			out.print("</li>");
		}
	}
%>