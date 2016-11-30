<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	// log start
	StringBuffer log = new StringBuffer();
	System.out.println("<ex3_select2.jsp>");
	// log end

	request.setCharacterEncoding("euc-kr");
	String msg = request.getParameter("msg");
	String ch = request.getParameter("ch");

	// log start
	log.append("* msg : ").append(msg).append("\n");
	System.out.println(log);
	log.delete(0, log.length());
	// log end	 

	String[] selected = null;
	String[] path = null;

	// 2. 파라미터 ch 값이  1, 2에 따라서 저장할 배열 변수 데이터를 다르게 생성하기
	if (ch.equals("1")) {
		selected = new String[] { "나연", "모모", "사나", "지효", "쯔위" };
		path = new String[] { "tw1.PNG", "tw2.PNG", "tw3.PNG", "tw4.PNG", "tw5.PNG" };
	} else if (ch.equals("2")) {
		selected = new String[] { "미스수달1", "미스수달2", "미스수달3" };
		path = new String[] { "an1.png", "an2.png", "an3.jpg" };
	}

	String imgPath = "";
	int i = 0;
	// 배열값에서 데이터를 뽑아서 msg : 나연 이면 tw1.PNG를 배열에 가져와서
	// 출력할 이미지 이름인 imgPath에 저장하는 for문 
	ll: for (String e : selected) {
		if (msg.equals(e)) {
			imgPath = path[i];
			break ll;
		}
		i++;
	}
	System.out.println(imgPath);
%>img/<%=imgPath%>