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

	// 2. �Ķ���� ch ����  1, 2�� ���� ������ �迭 ���� �����͸� �ٸ��� �����ϱ�
	if (ch.equals("1")) {
		selected = new String[] { "����", "���", "�糪", "��ȿ", "����" };
		path = new String[] { "tw1.PNG", "tw2.PNG", "tw3.PNG", "tw4.PNG", "tw5.PNG" };
	} else if (ch.equals("2")) {
		selected = new String[] { "�̽�����1", "�̽�����2", "�̽�����3" };
		path = new String[] { "an1.png", "an2.png", "an3.jpg" };
	}

	String imgPath = "";
	int i = 0;
	// �迭������ �����͸� �̾Ƽ� msg : ���� �̸� tw1.PNG�� �迭�� �����ͼ�
	// ����� �̹��� �̸��� imgPath�� �����ϴ� for�� 
	ll: for (String e : selected) {
		if (msg.equals(e)) {
			imgPath = path[i];
			break ll;
		}
		i++;
	}
	System.out.println(imgPath);
%>img/<%=imgPath%>