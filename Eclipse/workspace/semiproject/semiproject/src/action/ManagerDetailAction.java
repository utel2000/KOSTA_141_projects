package action;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dao.MemberDao;
import vo.MemberVO;
/*관리자 : 회원세부정보*/
public class ManagerDetailAction extends ActionSupport
	implements Action, Preparable, ModelDriven<MemberVO>{
	private MemberVO vo;
	private int num;
	private String id, img;
	private String basePath;
	private int nowPage;
	private String m_id;
	@Override
	public String execute() throws Exception {
		System.out.println("[ManagerDetailAction]id 전 : " + vo.getM_id());
		System.out.println("[ManagerDetailAction]nowPage 전 : " + nowPage);
		
		vo=MemberDao.getDao().getDetail(num);
		/*img = MemberDao.getDao().getDetailimg(img);
		vo = MemberDao.getDao().getDetail(num);*/
		System.out.println("[ManagerDetailAction]id 후: " + m_id);

		//System.out.println("[ManagerDetailAction]id : " + vo.getM_id());

		//System.out.println("DetailAction[img] : " + img);
//		basePath = getText("file.path");
		return SUCCESS;
	}
	
	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	@Override
	public MemberVO getModel() {
		return vo;
	}

	@Override
	public void prepare() throws Exception {
		vo = new MemberVO();
	}

	// getter, setter
	public int getNum() {
		return num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
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
	public MemberVO getVo() {
		return vo;
	}
	public void setVo(MemberVO vo) {
		this.vo = vo;
	}
}
