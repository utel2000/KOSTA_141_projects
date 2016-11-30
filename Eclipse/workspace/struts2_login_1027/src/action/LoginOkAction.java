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
	// 스트럿츠2에서는 세션이 맵 구조로 키와 밸류로 저장된다.
	// 즉, 세션 Attribute가 키와 값으로 저장.
	// 이 때 액션이 맵을 주입받아서 Session에 저장 하기 위해서는 SessionAware를 구현해야 함.
	// 아울러 인터셉터 : ServletConfig가 사용된다.(SessionAware를 포함하고 있음.)
	// 동작 방식은 현재 액션에서 구현한 SessionAware를 instanceof로 비교해서 인지할 경우
	// Session객체를 Map으로 주입시켜준다. *****
	
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
		
		// res가 1이면 로그인 정보 정확. 0이면 틀림.
		int res = LoginDAO.getDao().loginProcess(vo);
		
		// log start
		log.append("[Log] res(0 or 1) : ").append(res);
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		// Dao를 사용해서 memdemo와 mybatis로 연결해서 비교 하기.
		if(res == 1) {
			// 인증된 사용자
			session.put("loginId",  vo.getId());
		} else {
			// 아래서 이름을 Session에 저장할 수도 있다.
			this.addFieldError("err.msg", "잘못된 로그인 입니다.");
			return "INPUT";
		}
		return SUCCESS;
	}
	public String logout() {
		// 세션 삭제.
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
