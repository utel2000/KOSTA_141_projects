package action;
import com.opensymphony.xwork2.Action;
import dao.ForumCommentsDao;
public class ForumModifyCommentForm_textareaAction implements Action{
	// 수정할 댓글의 기본키를 받음
	private int c_num;
	// 출력할 데이터
	private String sendMsg; // getter
	@Override
	public String execute() throws Exception {
		
		StringBuffer sb = new StringBuffer();
		
		String c_content = ForumCommentsDao.getDao().commentContent(c_num);
		sb.append("<textarea id=\"textarea_c_content_update\" style=\"width: 780px; height: 70px; ")
		.append("max-width: 780px; max-height: 70px;\">").append(c_content).append("</textarea>");
		sendMsg = sb.toString();
		
		
		
		
		
		// log start
		StringBuffer log = new StringBuffer();
		log.append("----------\n")
		.append("<ForumModifyCommentForm_textareaAction.java> - public String execute()\n")
		.append("[Log] c_content : ").append(c_content).append("\n")
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
}
