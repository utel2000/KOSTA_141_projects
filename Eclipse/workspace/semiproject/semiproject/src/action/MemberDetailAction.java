package action;

import com.opensymphony.xwork2.Action;

import dao.MemberDao;
import vo.MemberVO;

public class MemberDetailAction implements Action{
	private MemberVO vo;
	private int num;
	private int nowPage;
	
	@Override
	public String execute() throws Exception {
		System.out.println("MemberDetail / num : " + num);
		System.out.println("MemberDetail / nowpage : " + nowPage);

		vo = MemberDao.getDao().getDetail(num);
		System.out.println("³ª¿À³Ä? " +vo.getM_id());
		return SUCCESS;
	}

	// getter, setter
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

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
}
