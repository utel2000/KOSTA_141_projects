package action;

import java.util.List;

import com.opensymphony.xwork2.Action;

import dao.NBoardDAO;
import vo.NBoardVO;
import vo.NCommVO;

public class NBoardDetailAction implements Action {
	private NBoardVO vo;
	private List<NCommVO> nclist;
	private int num;
	private int nowPage; // 리스트의 페이지로 이동하기 위해서
	@Override
	public String execute() throws Exception {
		vo = NBoardDAO.getDao().getDetail(num);
		nclist = NBoardDAO.getDao().listNcomm(num);
		return SUCCESS;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public NBoardVO getVo() {
		return vo;
	}
	public List<NCommVO> getNclist() {
		return nclist;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
