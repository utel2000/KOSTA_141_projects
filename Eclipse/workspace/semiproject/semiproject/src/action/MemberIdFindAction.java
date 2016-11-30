package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dao.MemberDao;
import vo.MemberVO;

/*로그인 : ID찾기*/
public class MemberIdFindAction 
	implements Action, Preparable, ModelDriven<MemberVO>{
	private String mid;
	private MemberVO vo;
	
	@Override
	public String execute() throws Exception {
		mid = MemberDao.getDao().idfind(vo);
		System.out.println("[MemberIdFindAction]id : " + mid);
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
}
