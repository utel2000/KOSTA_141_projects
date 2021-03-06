package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dao.MemberDao;
import vo.MemberVO;
/*관리자 : 회원삭제*/
public class ManagerDeleteAction extends ActionSupport
	implements Action, Preparable, ModelDriven<MemberVO>{
	private MemberVO vo;
	private int num;
	private String id, name, email, img;
	private String basePath;
	
	@Override
	public String execute() throws Exception {
		MemberDao.getDao().managerDelete(id);
		System.out.println("[DeleteAction]id " + id);
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
	public MemberVO getVo() {
		return vo;
	}
	public void setVo(MemberVO vo) {
		this.vo = vo;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
}
