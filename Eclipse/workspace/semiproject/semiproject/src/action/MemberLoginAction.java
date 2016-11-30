package action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dao.MemberDao;
import vo.MemberVO;
/*�α���*/
public class MemberLoginAction extends ActionSupport
	implements Preparable, ModelDriven<MemberVO>, SessionAware {
	
	private MemberVO vo;
	private Map<String, Object> session;

	@Override
	public String execute() throws Exception {
		MemberVO resVo = MemberDao.getDao().loginChk(vo);
		System.out.println("[MemberLoginAction]Login num : " + vo.getM_num());
		System.out.println("[MemberLoginAction]Login id : " + vo.getM_id());

		try{
			if(resVo.getCnt() > 0){
				System.out.println("[MemberLoginAction]��������!");
				// session�� �Է� : m_num, m_id, m_name, m_email
				session.put("m_num", resVo.getM_num());
				session.put("m_id", resVo.getM_id());
				session.put("m_name", resVo.getM_name());
				session.put("m_email", resVo.getM_email());
			}else{
				System.out.println("[MemberLoginAction]��������!");
				return "INPUT";
			}
		} catch(NullPointerException ex){
			System.out.println("[MemberLoginAction]��������!");
			return "INPUT";
		}
		return SUCCESS;
	}
	// session���� �α��� ���̵� �Է�
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}
	@Override
	public MemberVO getModel() {
		return vo;
	}
	@Override
	public void prepare() throws Exception {
		vo = new MemberVO();
	}
	// logoutAction ����
	public String logout() throws Exception {
		session.remove("m_num");
		session.remove("m_id");		
		session.remove("m_name");
		session.remove("m_email");
		session.remove("m_grade");
		System.out.println("[MemberLoginAction]session����");
		return SUCCESS;
	}
}