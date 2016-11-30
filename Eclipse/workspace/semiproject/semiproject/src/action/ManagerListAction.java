package action;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import dao.MemberDao;
import service.PagingService;
import vo.MemberVO;
import vo.PagingVO;
/*관리자 : 회원정보페이지*/
public class ManagerListAction extends ActionSupport{
	private List<MemberVO> list;	//getter
	private String pagingCode;	//getter
	private int nowPage;	// setter
	public ManagerListAction(){
		nowPage = 1;
	}
	@Override
	public String execute() throws Exception {
		int numPerpage = 5;
		int numPerBlock = 5;
		int total = MemberDao.getDao().getTotal();
		PagingService page = new PagingService(total,
				nowPage, numPerpage, 
				numPerBlock, "managerList");
		pagingCode = page.getPagingCode();//페이지 결과 코드  
		int start = (nowPage - 1) * numPerpage +  1;
		int end = start + numPerpage - 1;
		System.out.println(start);
		System.out.println(end);
		list = MemberDao.getDao().getList(new PagingVO(start, end));
		return SUCCESS;
	}
	public List<MemberVO> getList() {
		return list;
	}
	public String getPagingCode() {
		return pagingCode;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getNowPage() {
		return nowPage;
	}
}
