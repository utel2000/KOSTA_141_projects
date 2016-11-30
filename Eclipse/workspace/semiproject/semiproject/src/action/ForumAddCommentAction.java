package action;
import java.util.Map;
import javax.swing.JOptionPane;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.Action;
import dao.ForumCommentsDao;
import vo.ForumCommentsVO;
public class ForumAddCommentAction implements Action, SessionAware{
	// 댓글의 작성자를 세션으로부터 받아오려고 세션 생성.
	private Map<String, Object> session;
	// 댓글을 추가할, 그리고 다시 돌아갈 포럼의 기본키 
	private int f_num; // setter, getter
	// 포럼 리스트에서의 현재 페이지 값
	private int nowPage; // setter, getter
	// 댓글에 추가할 내용
	private String c_content; // setter
	@Override
	public String execute() throws Exception {
		// log start
		StringBuffer log = new StringBuffer();
		log.append("----------\n")
		.append("<ForumAddCommentAction.java> - public String execute()\n")
		.append("[Log] f_num : ").append(f_num).append("\n")
		.append("[Log] c_content : ").append(c_content).append("\n")
		.append("[Log] session.get(\"m_num\")").append(session.get("m_num"));
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		if(!c_content.isEmpty()) {
			ForumCommentsVO fcvo = new ForumCommentsVO();
			fcvo.setC_writer((int)session.get("m_num"));
			fcvo.setC_forum(f_num);
			fcvo.setC_content(c_content);
			ForumCommentsDao.getDao().addComment(fcvo);
		}
		return SUCCESS;
	}
	public int getF_num() {
		return f_num;
	}
	public void setF_num(int f_num) {
		this.f_num = f_num;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public void setC_content(String c_content) {
		this.c_content = c_content;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}
}
