package action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.NBoardDAO;
import vo.NBoardVO;
import vo.PagingVO;

public class NBoardSearchDemoAction implements Action, Preparable, ModelDriven<PagingVO>{
	private PagingVO pvo;
	private List<NBoardVO> list; // getter
	@Override
	public String execute() throws Exception {
		System.out.println("검색타입 : " + pvo.getSearchType());
		System.out.println("검색어 : " + pvo.getSearchValue());
		list = NBoardDAO.getDao().searchExampleList(pvo);
		return SUCCESS;
	}
	@Override
	public void prepare() throws Exception {
		pvo = new PagingVO();
	}
	@Override
	public PagingVO getModel() {
		return pvo;
	}
	public List<NBoardVO> getList() {
		return list;
	}
}
