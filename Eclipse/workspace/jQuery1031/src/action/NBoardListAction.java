package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.NBoardDAO;
import util.Paging;
import vo.NBoardVO;
import vo.PagingVO;

public class NBoardListAction extends ActionSupport {
	private List<NBoardVO> list; // g
	//  view에서 사용될 최종 페이지 코드
	private String pagingCode; // g
	// 페이지는 변경되기 때문에 항상 현재 페이지 값.
	private int nowPage; // s
	public NBoardListAction() {
		nowPage = 1;
	}
	@Override
	public String execute() throws Exception {
		int numPerPage = 5;
		int numPerBlock = 5;
		// 전체 데이터 수
		int total = NBoardDAO.getDao().getTotal();
		Paging page = new Paging(total, nowPage, numPerPage, numPerBlock, "nBoardList");
		pagingCode = page.getPagingCode(); // 페이지 결과 코드
		// start, end값은 SQL문에서 Top-N쿼리의 파라미터로 전달되어서
		// 범위 값의 데이터가 list로 넘어오는 것.
		// start : nowPage는 PagingService에서 연산되는 페이지 값.
		// 항상 첫번째 row를 연산한 결과 값.
		int start = (nowPage - 1) * numPerPage + 1;
		int end = start + numPerPage - 1;
		System.out.println(start);
		System.out.println(end);
		list = NBoardDAO.getDao().getList(new PagingVO(start, end));
		return SUCCESS;
	}
	public List<NBoardVO> getList() {
		return list;
	}
	public String getPagingCode() {
		return pagingCode;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
}
