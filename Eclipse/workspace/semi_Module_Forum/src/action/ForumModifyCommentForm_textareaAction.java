package action;
import com.opensymphony.xwork2.Action;
import dao.ForumCommentsDao;
public class ForumModifyCommentForm_textareaAction implements Action{
	// ������ ����� �⺻Ű�� ����
	private int c_num;
	// ����� ������
	private String sendMsg; // getter
	@Override
	public String execute() throws Exception {
		StringBuffer sb = new StringBuffer();
		String c_content = ForumCommentsDao.getDao().commentContent(c_num);
		sb.append("<textarea id=\"textarea_c_content_update\" style=\"width: 780px; height: 70px; ")
		.append("max-width: 780px; max-height: 70px;\">").append(c_content).append("</textarea>");
		sendMsg = sb.toString();
		return SUCCESS;
	}
	public String getSendMsg() {
		return sendMsg;
	}
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
}
