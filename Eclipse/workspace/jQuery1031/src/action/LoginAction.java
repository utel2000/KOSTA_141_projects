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
	// 스트럿츠2에서는 세션이 맵구조로 키와 밸류로 저장된다.
	// 즉, 세션 Attribute가 키와 값으로 저장.
	// 이 때 Action이 맵을 주입받아서 Session에 저장하기 위해서는 
	// SessionAware를 구현해줘야 한다.
	// 아울러 인터셉터 ServletConfig를 사용해야 한다.
	@Override
	public String execute() throws Exception {
		int res = LoginDAO.getDao().loginChk(vo);
		if(res > 0) {
			System.out.println("인증 성공");
			session.put("loginId",  vo.getId());
		} else {
			System.out.println("인증 실패");
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
	// logoutAction 정의
	public String logout() {
		session.remove("loginId");
		return SUCCESS;
	}
}
