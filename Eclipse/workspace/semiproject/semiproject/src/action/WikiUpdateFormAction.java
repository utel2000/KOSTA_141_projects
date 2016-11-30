package action;

import com.opensymphony.xwork2.Action;

import dao.WikiDao;
import vo.WikiVO;

public class WikiUpdateFormAction implements Action{
	
	private WikiVO wvo; // getter
	private int w_num; // setter & getter
	private int nowPage; // setter & getter
	
	@Override
	public String execute() throws Exception {
		System.out.println("[check][WikiUpdateFormAction] w_num »Æ¿Œ : " + w_num);	
		wvo = WikiDao.getDao().getDetail(w_num);
		return SUCCESS;
	}

	public int getW_num() {
		return w_num;
	}

	public void setW_num(int w_num) {
		this.w_num = w_num;
	}

	public WikiVO getWvo() {
		return wvo;
	}

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	
	
}
