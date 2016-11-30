package action;
import com.opensymphony.xwork2.Action;
public class ForumModifyCommentForm_buttonsAction implements Action {
	// ��ư�� �����ϱ� ���� ����
	private int c_num; //  setter
	private String target_textarea, target_buttons; // setter
	// ����� ������
	private String sendMsg; // getter
	@Override
	public String execute() throws Exception {
		StringBuffer sb = new StringBuffer();
		sb.append("<button type=\"button\" class=\"btn\" id=\"btn_confirm_modify_comment\" ")
		.append("style=\"background-color: #FACC2E;\" onclick=\"confirmModifyComment('")
		.append(c_num).append("', '").append(target_textarea).append("', '").append(target_buttons)
		.append("')\">Ȯ��</button>")
		.append("&nbsp;&nbsp;&nbsp;&nbsp;")
		.append("<button type=\"button\" class=\"btn\" id=\"btn_cancel_modify_comment\" ")
		.append("style=\"background-color: #FACC2E;\" onclick=\"changeToOriginalCommentForm('")
		.append(c_num).append("', '").append(target_textarea).append("', '").append(target_buttons)
		.append("')\">���</button>");		
		sendMsg = sb.toString();
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
}
