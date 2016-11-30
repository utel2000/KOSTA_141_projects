package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.NBoardDAO;
import vo.NCommVO;

public class NCommAddAction implements Action, Preparable, ModelDriven<NCommVO> {
	private NCommVO ncvo;
	private int dnum; // getterÁ¦°ø
	private int nowPage; // s, g
	@Override
	public String execute() throws Exception {
		System.out.println("usr : " + ncvo.getUsr());
		NBoardDAO.getDao().addNcomm(ncvo);;
		dnum = ncvo.getCode();
		System.out.println(nowPage);
		return SUCCESS;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getDnum() {
		return dnum;
	}
	@Override
	public NCommVO getModel() {
		return ncvo;
	}
	@Override
	public void prepare() throws Exception {
		ncvo = new NCommVO();
	}
}
