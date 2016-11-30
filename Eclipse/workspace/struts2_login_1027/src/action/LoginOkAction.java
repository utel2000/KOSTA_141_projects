package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.LoginDAO;
import vo.Mems2VO;

public class LoginOkAction extends ActionSupport implements SessionAware, Preparable, ModelDriven<Mems2VO>{
	private Mems2VO vo;
	private Map<String, Object> session;
	// ��Ʈ����2������ ������ �� ������ Ű�� ����� ����ȴ�.
	// ��, ���� Attribute�� Ű�� ������ ����.
	// �� �� �׼��� ���� ���Թ޾Ƽ� Session�� ���� �ϱ� ���ؼ��� SessionAware�� �����ؾ� ��.
	// �ƿ﷯ ���ͼ��� : ServletConfig�� ���ȴ�.(SessionAware�� �����ϰ� ����.)
	// ���� ����� ���� �׼ǿ��� ������ SessionAware�� instanceof�� ���ؼ� ������ ���
	// Session��ü�� Map���� ���Խ����ش�. *****
	
	@Override
	public String execute() throws Exception {
		// log start
		StringBuffer log = new StringBuffer();
		log.append("----------\n")
		.append("<LoginOkAction> - public String execute()\n")
		.append("[Log] vo.getId() : ").append(vo.getId()).append("\n")
		.append("[Log] vo.getPwd() : ").append(vo.getPwd());
		System.out.println(log);
		log.delete(0, log.length());
		// log end	
		
		// res�� 1�̸� �α��� ���� ��Ȯ. 0�̸� Ʋ��.
		int res = LoginDAO.getDao().loginProcess(vo);
		
		// log start
		log.append("[Log] res(0 or 1) : ").append(res);
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		// Dao�� ����ؼ� memdemo�� mybatis�� �����ؼ� �� �ϱ�.
		if(res == 1) {
			// ������ �����
			session.put("loginId",  vo.getId());
		} else {
			// �Ʒ��� �̸��� Session�� ������ ���� �ִ�.
			this.addFieldError("err.msg", "�߸��� �α��� �Դϴ�.");
			return "INPUT";
		}
		return SUCCESS;
	}
	public String logout() {
		// ���� ����.
		session.remove("loginId");
		return SUCCESS;
	}
	@Override
	public Mems2VO getModel() {
		return vo;
	}
	@Override
	public void prepare() throws Exception {
		vo = new Mems2VO();
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}
	
}
