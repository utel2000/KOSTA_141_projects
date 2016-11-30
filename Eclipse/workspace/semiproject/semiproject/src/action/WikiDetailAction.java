package action;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.CategoryDao;
import dao.WikiDao;
import vo.WikiVO;

public class WikiDetailAction implements Action {
	private WikiVO wvo; // getter
	private int w_num; // setter
	private int nowPage; // getter / setter / 리스트의 페이지로 이동하기 위해서
	private String cat_name;

	@Override
	public String execute() throws Exception {
		System.out.println("[check][WikiDetailAction] w_num : " + w_num);

		wvo = WikiDao.getDao().getDetail(w_num);
		cat_name = CategoryDao.getDao().getCategoryName(wvo);
		return SUCCESS;
	}


	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public WikiVO getWvo() {
		return wvo;
	}

	public void setW_num(int w_num) {
		this.w_num = w_num;
	}

	public int getW_num() {
		return w_num;
	}

	public String getCat_name() {
		return cat_name;
	}

	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}

}