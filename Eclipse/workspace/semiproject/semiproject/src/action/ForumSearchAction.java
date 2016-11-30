package action;

import java.util.List;

import javax.swing.JOptionPane;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.ForumDao;
import sun.invoke.empty.Empty;
import service.ForumSearchPaging;
import service.Paging;
import vo.ForumSearchPagingVO;
import vo.ForumVO;

public class ForumSearchAction implements Action, Preparable, ModelDriven<ForumSearchPagingVO> {

	private ForumSearchPagingVO fspvo;
	private List<ForumVO> list; // getter
	private int total;

	// view에서 읽어들일 리스트
	// view에서 사용될 최종 페이지 코드
	private String pagingCode; // getter
	// 현재 페이지
	private int nowPage; // setter, getter
	// 생성자
	public ForumSearchAction() {
		nowPage = 1;
	}

	@Override
	public String execute() throws Exception {
		// 현재 페이지에서 보여줄 항목 수
		int numPerPage = 5;
		// 현재 블럭에서 보여줄 페이지 수.
		int numPerBlock = 5;
		// 전체 데이터 수
		total = ForumDao.getDao().totalForumSearchList(fspvo);
		ForumSearchPaging  page = new ForumSearchPaging(total, nowPage, numPerPage, numPerBlock, "forumSearch", fspvo);
		// 페이지 결과 코드
		pagingCode = page.getPagingCode(); // 페이지 결과 코드
		// start, end값은 SQL문에서 Top-N쿼리의 파라미터로 전달되어서
		// 범위 값의 데이터가 list로 넘어오는 것.
		// start : nowPage는 PagingService에서 연산되는 페이지 값.
		// 항상 첫번째 row를 연산한 결과 값.
		int start = (nowPage - 1) * numPerPage + 1;
		int end = start + numPerPage - 1;
		fspvo.setStart(start);
		fspvo.setEnd(end);

		if(fspvo.getSearchValue().isEmpty()){
			fspvo.setSearchValue("");
		}
		list = ForumDao.getDao().forumSearchList(fspvo);

		return SUCCESS;
		}
	
	
	public ForumSearchPagingVO getFspvo() {
		return fspvo;
	}
	@Override
	public ForumSearchPagingVO getModel() {
		return fspvo;
	}
	@Override
	public void prepare() throws Exception {
		fspvo = new ForumSearchPagingVO();
	}

	public List<ForumVO> getList() {
		return list;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public String getPagingCode() {
		return pagingCode;
	}
}
