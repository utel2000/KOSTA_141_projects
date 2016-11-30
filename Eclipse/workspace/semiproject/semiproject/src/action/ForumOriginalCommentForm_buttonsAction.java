package action;

import com.opensymphony.xwork2.Action;

public class ForumOriginalCommentForm_buttonsAction implements Action {
	// ��ư�� �ٽ� �����ϱ� ���� ����
	private int c_num, f_num, nowPage; // setter
	private String target_textarea, target_buttons; // setter
	// ����� ������
	private String sendMsg; // getter
	@Override
	public String execute() throws Exception {
		StringBuffer sb = new StringBuffer();
		sb.append("<button type=\"button\" class=\"btn\" id=\"btn_modify_comment\" ")
		.append("style=\"background-color: #FACC2E;\" onclick=\"changeToModifyCommentForm('")
		.append(c_num).append("', '").append(target_textarea).append("', '").append(target_buttons)
		.append("')\">����</button>")
		.append("&nbsp;&nbsp;&nbsp;&nbsp;")
		.append("<a href=\"forumDeleteComment?c_num=").append(c_num).append("&f_num=").append(f_num)
		.append("&nowPage=").append(nowPage).append("\" class=\"btn\" ")
		.append("style=\"background-color: #FACC2E; color: black\" >����</a>");
		sendMsg = sb.toString();
		
		// log start
		StringBuffer log = new StringBuffer();
		log.append("----------\n")
		.append("<ForumOriginalCommentForm_buttonsAction.java> - public String execute()\n")
		.append("[Log] sendMsg : ").append(sendMsg);
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		return SUCCESS;
	}
	public String getSendMsg() {
		return sendMsg;
	}
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	public void setTarget_textarea(String target_textarea) {
		this.target_textarea = target_textarea;
	}
	public void setTarget_buttons(String target_buttons) {
		this.target_buttons = target_buttons;
	}
	public void setF_num(int f_num) {
		this.f_num = f_num;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	
}
