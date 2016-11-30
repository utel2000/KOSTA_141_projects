<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%!
	public int convertToInt(Object num){
		int tempCount = 0;
		if(num != null){
			tempCount = (int) num;
		}
		return tempCount;
	}
%>
<%
	Object budae = session.getAttribute("budae");
	Object gopchang = session.getAttribute("gopchang");
	Object samgyeop = session.getAttribute("samgyeop");
	Object pasta = session.getAttribute("pasta");
	Object doenjang = session.getAttribute("doenjang");
	Object sushi = session.getAttribute("sushi");
%>