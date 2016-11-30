package action;
import com.opensymphony.xwork2.Action;
import dao.ForumCommentsDao;
public class ForumOriginalCommentForm_textareaAction implements Action {
	// 댓글 내용을 조회하기 위한 댓글의 기본키
	private int c_num;
	// 출력할 데이터
	private String sendMsg; // getter
	@Override
	public String execute() throws Exception {
		StringBuffer sb = new StringBuffer();
		String c_content = ForumCommentsDao.getDao().commentContent(c_num);
		sb.append("<pre style=\"border: 0; background-color: #FCFBF4;\">").append(c_content).append("</pre>");
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
