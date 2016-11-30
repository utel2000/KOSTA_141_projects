package action;

import com.opensymphony.xwork2.Action;

public class FormAddAction implements Action{
	private String sub;
	private String writer;
	private String cont;
	
	@Override
	public String execute() throws Exception {
		// log start
		StringBuffer log = new StringBuffer();
		System.out.println("<FormAddAction.java> - public String execute()");
		log.append("[Log] sub : ").append(sub).append("\n")
		.append("[Log] writer : ").append(writer).append("\n")
		.append("[Log] cont : ").append(cont);
		System.out.println(log);
		log.delete(0, log.length());
		// log end

		return SUCCESS;
	}
	// params�� ���ͼ��Ͱ� �����ؼ� setter�� ȣ���Ͽ�
	// �Ķ���ͷ� ���۵Ǿ�� ���� VS�� �����Ѵ�.

	public void setSub(String sub) {
		this.sub = sub;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}

}
