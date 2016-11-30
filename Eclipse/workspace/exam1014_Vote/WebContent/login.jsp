<%@page import="dao.LoginDao"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	// log start
	StringBuffer log = new StringBuffer();
	System.out.println("<login.jsp>");
	// log end
	
	request.setCharacterEncoding("euc-kr");
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
	// log start
	log.append("* 아  이  디 : ").append(id).append("\n")
	.append("* 비밀 번호 : ").append(pwd).append("\n");
	System.out.println(log);
	log.delete(0, log.length());
	// log end
	
	Map<String, String> m = new HashMap<>();
	m.put("id", id);
	m.put("pwd", pwd);
	
	// log start
	log.append("* m.get(\"id\") : ").append(m.get("id")).append("\n")
	.append("* m.get(\"pwd\") : ").append(m.get("pwd")).append("\n");
	System.out.println(log);
	log.delete(0, log.length());
	// log end
	
	Map<String, String> mRes = LoginDao.getDao().loginProcess(m);
	
	// log start
	log.append("<login.jsp>").append("\n")
	.append("* 로그인 성공 여부  : ").append(!mRes.isEmpty()).append("\n")
	.append("* mRes.get(\"name\" : ").append(mRes.get("name")).append("\n")
	.append("* mRes.get(\"priv\") : ").append(mRes.get("priv")).append("\n");
	System.out.println(log);
	log.delete(0, log.length());
	// log end

	if (!mRes.isEmpty()) {
		session.setAttribute("id", m.get("id"));
		session.setAttribute("name", mRes.get("name"));
		session.setAttribute("priv", mRes.get("priv"));
		response.sendRedirect("index.jsp");
	} else {
		response.sendRedirect("loginFail.jsp");
	}
%>