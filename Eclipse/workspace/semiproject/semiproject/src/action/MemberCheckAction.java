package action;

import com.opensymphony.xwork2.Action;
import dao.MemberDao;
/*ȸ������ : ���̵� �ߺ�üũ*/
public class MemberCheckAction implements Action{
	private String m_id; // setter
	private String sendMsg; // getter
	@Override
	public String execute() throws Exception {
		System.out.println("[MemberCheckAction]id: " + m_id);
		int check = MemberDao.getDao().checkId(m_id);
		System.out.println("[MemberCheckAction]id_check : " + check);
		// check==0�̸�, ����� �� �ִ� ���̵�
		// check==1�̸�, �̹� �����ϴ� ���̵�
		if(check == 0){
			sendMsg = "����� �� �ִ� ���̵��Դϴ�.";
		}else {
			sendMsg = "�̹� �����ϴ� ���̵��Դϴ�.";
		}
		return SUCCESS;
	}
	
	// getter, setter
	public String getSendMsg() {
		return sendMsg;
	}
	public void setSendMsg(String sendMsg) {
		this.sendMsg = sendMsg;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_id() {
		return m_id;
	}
}


