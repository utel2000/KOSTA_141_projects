package action;
import java.util.List;
import com.opensymphony.xwork2.Action;
import dao.ForumDao;
import service.Paging;
import vo.ForumVO;
import vo.PagingVO;
public class ForumListAction implements Action {
	// view에서 읽어들일 리스트
	private List<ForumVO> list; // getter
	// view에서 사용될 최종 페이지 코드
	private String pagingCode; // getter
	// 현재 페이지
	private int nowPage; // setter, getter
	// 생성자
	public ForumListAction() {
		nowPage = 1;
	}
	@Override
	public String execute() throws Exception {
		
		// log start
		StringBuffer log = new StringBuffer();
		log.append("----------\n")
		.append("<ForumListAction.java> - public String execute()");
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		// 현재 페이지에서 보여줄 항목 수
		int numPerPage = 5;
		// 현재 블럭에서 보여줄 페이지 수.
		int numPerBlock = 5;
		// 전체 데이터 수
		int total = ForumDao.getDao().totalForumList();
		Paging page = new Paging(total, nowPage, numPerPage, numPerBlock, "forumList");
		// 페이지 결과 코드
		pagingCode = page.getPagingCode(); // 페이지 결과 코드
		// start, end값은 SQL문에서 Top-N쿼리의 파라미터로 전달되어서
		// 범위 값의 데이터가 list로 넘어오는 것.
		// start : nowPage는 PagingService에서 연산되는 페이지 값.
		// 항상 첫번째 row를 연산한 결과 값.
		int start = (nowPage - 1) * numPerPage + 1;
		int end = start + numPerPage - 1;
		
		// log start
		log.append("[Log] total : ").append(total).append("\n")
		.append("[Log] pagingCode : ").append(pagingCode).append("\n")
		.append("[Log] start : ").append(start).append("\n")
		.append("[Log] end : ").append(end);
		System.out.println(log);
		log.delete(0, log.length());
		// log end

		list = ForumDao.getDao().forumList(new PagingVO(start, end));

		// log start
		int idx = 0;
		for (ForumVO e : list) {
			log.append("[Log] --idx-- : ").append(idx).append("\n")
			.append("[Log] e.getF_num() : ").append(e.getF_num()).append("\n")
			.append("[Log] e.getF_writer() : ").append(e.getF_writer()).append("\n")
			.append("[Log] e.getF_category() : ").append(e.getF_category()).append("\n")
			.append("[Log] e.getF_subject() : ").append(e.getF_subject()).append("\n")
			.append("[Log] e.getF_content() : ").append(e.getF_content()).append("\n")
			.append("[Log] e.getF_img() : ").append(e.getF_img()).append("\n")
			.append("[Log] e.getF_state() : ").append(e.getF_state()).append("\n")
			.append("[Log] e.getF_date_post() : ").append(e.getF_date_post()).append("\n")
			.append("[Log] e.getF_date_complete() : ").append(e.getF_date_complete()).append("\n");
			idx++;
		}
		System.out.print(log);
		log.delete(0, log.length());
		// log end
		
		return SUCCESS;
	}
	public List<ForumVO> getList() {
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
