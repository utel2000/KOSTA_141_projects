package action;
import javax.swing.JOptionPane;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.ForumCommentsDao;
import dao.ForumCommentsVoteDao;
import vo.ForumCommentsVO;
import vo.ForumCommentsVoteVO;
public class ForumVoteCommentAction implements Action, Preparable, ModelDriven<ForumCommentsVoteVO>{
	// ��ǥ�ڿ� ��ǥ�ϴ� ����� �⺻Ű�� ����.
	private ForumCommentsVoteVO fcvvo;
	// ���� ��ư�� �����ؼ� ����.(���ƿ�, �Ⱦ��)
	private String checkVote; // setter
	// ��ǥ �� ���ŵ� ��� ���
	private String sendMsg; // getter
	@Override
	public String execute() throws Exception {
		// log start
		StringBuffer log = new StringBuffer();
		log.append("----------\n")
		.append("<ForumVoteCommentAction.java> - public String execute() throws Exception\n")
		.append("[Log] fcvvo.getCv_m_num() : ").append(fcvvo.getCv_m_num()).append("\n")
		.append("[Log] fcvvo.getCv_c_num() : ").append(fcvvo.getCv_c_num()).append("\n")
		.append("[Log] checkVote : ").append(checkVote);
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		StringBuffer sb = new StringBuffer();
		// ��ǥ�� ��ۿ� �̹� ��ǥ�ߴ��� �˻�.
		int checkDuplication = ForumCommentsVoteDao.getDao().checkVoteDuplication(fcvvo);
		
		// log start
		log.append("[Log] checkDuplication : ").append(checkDuplication);
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		ForumCommentsVO fcvo = new ForumCommentsVO();
		fcvo.setC_num(fcvvo.getCv_c_num());
		fcvo.setCheck(checkVote);
		if(checkDuplication == 0) {
			ForumCommentsVoteDao.getDao().addVote(fcvvo);
			ForumCommentsDao.getDao().UpdateGood(fcvo);
		} else {
			sb.append("<script>alert('��ǥ�� 1ȸ�� �����մϴ�.');</script>");
		}
		sb.append(ForumCommentsDao.getDao().checkVote(fcvo));
		sendMsg = sb.toString();
		
		
		// log start
		log.append("[Log] sendMsg : ").append(sendMsg);
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		return SUCCESS;
	}
	@Override
	public ForumCommentsVoteVO getModel() {
		return fcvvo;
	}
	@Override
	public void prepare() throws Exception {
		fcvvo = new ForumCommentsVoteVO();
	}
	public void setCheckVote(String checkVote) {
		this.checkVote = checkVote;
	}
	public String getSendMsg() {
		return sendMsg;
	}
}
