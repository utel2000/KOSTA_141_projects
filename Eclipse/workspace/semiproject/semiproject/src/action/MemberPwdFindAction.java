package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dao.MemberDao;
import vo.MemberVO;

/*로그인 : pwd찾기*/
public class MemberPwdFindAction 
	implements Action, Preparable, ModelDriven<MemberVO>{
	private String mid, mpwd;
	private MemberVO vo;
	
	@Override
	public String execute() throws Exception {
		mpwd = MemberDao.getDao().pwdfind(vo);
		System.out.println("[MemberPwdFindAction]pwd : " + mpwd);
		return SUCCESS;
	}
	@Override
	public void prepare() throws Exception {
		vo = new MemberVO();
	}
	@Override
	public MemberVO getModel() {
		return vo;
	}
	
	// getter
	public String getMid() {
		return mid;
	}
	public MemberVO getVo() {
		return vo;
	}
	public void setVo(MemberVO vo) {
		this.vo = vo;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpwd() {
		return mpwd;
	}
	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}
}
