package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dao.MemberDao;
import vo.MemberVO;

/*회원 : 마이페이지*/
public class MemberMypageAction extends ActionSupport 
	implements Preparable, ModelDriven<MemberVO>{
	private MemberVO vo;
	private int num;
	private String img;
	private String basePath;

	@Override
	public String execute() throws Exception {
		// 이미지별도
	    img = MemberDao.getDao().mypageimg(vo.getM_id());
		vo = MemberDao.getDao().getMypage(vo.getM_id());
		System.out.println("[MemberMypageAction]id : " + vo.getM_id());
		System.out.println("[MemberMypageAction]img : " + img);
		basePath = getText("file.path");
		return SUCCESS;
	}

	@Override
	public MemberVO getModel() {
		return vo;
	}
	@Override
	public void prepare() throws Exception {
		vo = new MemberVO();
	}

	// setter, getter
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getBasePath() {
		return basePath;
	}
	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public MemberVO getVo() {
		return vo;
	}
	public void setVo(MemberVO vo) {
		this.vo = vo;
	}
}
