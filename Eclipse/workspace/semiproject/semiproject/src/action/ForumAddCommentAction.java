package action;
import java.util.Map;
import javax.swing.JOptionPane;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.Action;
import dao.ForumCommentsDao;
import vo.ForumCommentsVO;
public class ForumAddCommentAction implements Action, SessionAware{
	// ����� �ۼ��ڸ� �������κ��� �޾ƿ����� ���� ����.
	private Map<String, Object> session;
	// ����� �߰���, �׸��� �ٽ� ���ư� ������ �⺻Ű 
	private int f_num; // setter, getter
	// ���� ����Ʈ������ ���� ������ ��
	private int nowPage; // setter, getter
	// ��ۿ� �߰��� ����
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