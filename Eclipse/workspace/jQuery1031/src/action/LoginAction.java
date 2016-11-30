package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.LoginDAO;
import vo.MemberVO;

public class LoginAction extends ActionSupport implements Preparable, ModelDriven<MemberVO>, SessionAware {
	private MemberVO vo;
	private Map<String, Object> session;
	// ��Ʈ����2������ ������ �ʱ����� Ű�� ����� ����ȴ�.
	// ��, ���� Attribute�� Ű�� ������ ����.
	// �� �� Action�� ���� ���Թ޾Ƽ� Session�� �����ϱ� ���ؼ��� 
	// SessionAware�� ��������� �Ѵ�.
	// �ƿ﷯ ���ͼ��� ServletConfig�� ����ؾ� �Ѵ�.
	@Override
	public String execute() throws Exception {
		int res = LoginDAO.getDao().loginChk(vo);
		if(res > 0) {
			System.out.println("���� ����");
			session.put("loginId",  vo.getId());
		} else {
			System.out.println("���� ����");
			return "INPUT";
		}
		return SUCCESS;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}
	@Override
	public void prepare() throws Exception {
		vo = new MemberVO();
	}
	@Override
	public MemberVO getModel() {
		return vo;
	}
	// logoutAction ����
	public String logout() {
		session.remove("loginId");
		return SUCCESS;
	}
}
