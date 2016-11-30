package action;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;

import dao.MiniDAO;
import util.Paging;
import vo.MiniVO;
import vo.PagingVO;
public class MiniListAction extends ActionSupport {
	private List<MiniVO> list;
	private String pagingCode;
	private int nowPage;
	public MiniListAction() {
		nowPage=1;
	}
	@Override
	public String execute() throws Exception {
		// log start
		StringBuffer log = new StringBuffer();
		System.out.println("<MiniListAction> - public String execute()");
		// log end
		
		int numPerPage = Integer.parseInt(getText("numPerPage"));
		int numPerBlock = Integer.parseInt(getText("numPerBlock"));
		
		// log start
		log.append("[Log] MiniDao.getDao().getTotal() : ").append(MiniDAO.getDao().getTotal());
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		Paging page = new Paging(MiniDAO.getDao().getTotal(), nowPage, numPerPage, numPerBlock, "miniList");
		pagingCode = page.getPagingCode();
		
		// log start
		log.append("[Log] Page : ").append(page);
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		// 현재 페이지에서 보여주기 시작할 rownum과 마지막 rownum 결정.
		int start = (nowPage - 1) * numPerPage + 1;
		int end = start + numPerPage - 1;
		
		// log start
		log.append("[Log] Start rownum : ").append(start).append("\n")
		.append("[Log] End rownum : ").append(end);
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		list = MiniDAO.getDao().getList(new PagingVO(start, end));
		
		// log start
		log.append("[Log] list.get(0).getId() : ").append(list.get(0).getId());
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		return SUCCESS;
	}
	public List<MiniVO> getList() {
		return list;
	}
	public void setList(List<MiniVO> list) {
		this.list = list;
	}
	public String getPagingCode() {
		return pagingCode;
	}
	public void setPagingCode(String pagingCode) {
		this.pagingCode = pagingCode;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
}
