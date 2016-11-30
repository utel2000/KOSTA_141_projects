package action;

import com.opensymphony.xwork2.Action;
import dao.MemberDao;
/*회원가입 : 아이디 중복체크*/
public class MemberCheckAction implements Action{
	private String m_id; // setter
	private String sendMsg; // getter
	@Override
	public String execute() throws Exception {
		System.out.println("[MemberCheckAction]id: " + m_id);
		int check = MemberDao.getDao().checkId(m_id);
		System.out.println("[MemberCheckAction]id_check : " + check);
		// check==0이면, 사용할 수 있는 아이디
		// check==1이면, 이미 존재하는 아이디
		if(check == 0){
			sendMsg = "사용할 수 있는 아이디입니다.";
		}else {
			sendMsg = "이미 존재하는 아이디입니다.";
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


