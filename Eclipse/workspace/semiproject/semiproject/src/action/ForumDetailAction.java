
package action;
import java.util.List;
import com.opensymphony.xwork2.Action;
import vo.ForumCommentsVO;
import vo.ForumVO;
import dao.ForumCommentsDao;
import dao.ForumDao;
import service.CommentsPaging;
import vo.PagingVO;
public class ForumDetailAction implements Action {
	// 포럼 상세 항목을 조회 후 결과를 담을 VO 
	private ForumVO fvo; // getter
	// (완료 페이지)최다 좋아요 받은 댓글
	private List<ForumCommentsVO> goodList; // getter
	// (완료 페이지)최다 싫어요 받은 댓글
	private List<ForumCommentsVO> badList; // getter
	// 이전 목록의 페이지
	private int nowPage; // setter, getter
	// 댓글이 소속된 포럼의 기본키
	private int f_num; // setter
	// view에서 읽어들일 리스트
	private List<ForumCommentsVO> list; // getter
	// view에서 사용될 최종 페이지 코드
	private String pagingCode; // getter
	// 현재 포럼의 댓글 페이지
	private int nowCPage; // setter
	// 상세 페이지를 처음 열었을 때를 구별하기 위함
	private int firstPage; // setter, getter
	// 생성자
	public ForumDetailAction() {
		nowCPage = 1;
	}
	@Override
	public String execute() throws Exception {
		// log start
		StringBuffer log = new StringBuffer();
		log.append("----------\n")
		.append("<ForumDetailAction.java> - public String execute()");
		System.out.println(log);
		log.delete(0, log.length());
		// log end

		// 포럼 상세 항목 조회
		fvo = ForumDao.getDao().forumDetail(f_num);
		
		// log start
		log.append("[Log] fvo.getF_num() : ").append(fvo.getF_num()).append("\n")
		.append("[Log] fvo.getF_writer() : ").append(fvo.getF_writer()).append("\n")
		.append("[Log] fvo.getF_category() : ").append(fvo.getF_category()).append("\n")
		.append("[Log] fvo.getF_subject() : ").append(fvo.getF_subject()).append("\n")
		.append("[Log] fvo.getF_content() : ").append(fvo.getF_content()).append("\n")
		.append("[Log] fvo.getF_img() : ").append(fvo.getF_img()).append("\n")
		.append("[Log] fvo.getF_state() : ").append(fvo.getF_state()).append("\n")
		.append("[Log] fvo.getF_date_post() : ").append(fvo.getF_date_post()).append("\n")
		.append("[Log] fvo.getF_date_complete() : ").append(fvo.getF_date_complete());
		System.out.println(log);
		log.delete(0, log.length());
		// log end
				
		// 현재 페이지에서 보여줄 항목 수
		int numPerPage = 3;
		// 현재 블럭에서 보여줄 페이지 수.
		int numPerBlock = 3;
		// 전체 데이터 수
		int total = ForumCommentsDao.getDao().totalCommentsList(f_num);
		CommentsPaging page = new CommentsPaging(total, nowPage, nowCPage, numPerPage, numPerBlock, f_num, "forumDetail");
		// 페이지 결과 코드
		pagingCode = page.getPagingCode(); // 페이지 결과 코드
		// start, end값은 SQL문에서 Top-N쿼리의 파라미터로 전달되어서
		// 범위 값의 데이터가 list로 넘어오는 것.
		// start : nowPage는 PagingService에서 연산되는 페이지 값.
		// 항상 첫번째 row를 연산한 결과 값.
		int start = (nowCPage - 1) * numPerPage + 1;
		int end = start + numPerPage - 1;

		// log start
		log.append("[Log] total : ").append(total).append("\n")
		.append("[Log] nowCPage : ").append(nowCPage).append("\n")
		.append("[Log] pagingCode : ").append(pagingCode).append("\n")
		.append("[Log] start : ").append(start).append("\n")
		.append("[Log] end : ").append(end);
		System.out.println(log);
		log.delete(0, log.length());
		// log end

		list = ForumCommentsDao.getDao().commentsList(new PagingVO(start, end, f_num));
		goodList = ForumCommentsDao.getDao().goodComment(f_num);
		badList = ForumCommentsDao.getDao().badComment(f_num);
		
		// log start
		int idx = 0;
		for(ForumCommentsVO e : list) {
			log.append("[Log] --idx-- : ").append(idx).append("\n")
			.append("[Log] e.getC_num() : ").append(e.getC_num()).append("\n")
			.append("[Log] e.getC_content() : ").append(e.getC_content()).append("\n")
			.append("[Log] e.getC_forum() : ").append(e.getC_forum()).append("\n")
			.append("[Log] e.getC_writer() : ").append(e.getC_writer()).append("\n")
			.append("[Log] e.getC_good() : ").append(e.getC_good()).append("\n")
			.append("[Log] e.getC_bad() : ").append(e.getC_bad()).append("\n")
			.append("[Log] e.getC_date() : ").append(e.getC_date()).append("\n")
			.append("[Log] e.getC_writer_id() : ").append(e.getC_writer_id()).append("\n");
			idx++;
		}
		System.out.print(log);
		log.delete(0, log.length());
		// log end
		
		return SUCCESS;
	}
	public void setF_num(int f_num) {
		this.f_num = f_num;
	}
	public List<ForumCommentsVO> getList() {
		return list;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowCPage(int nowCPage) {
		this.nowCPage = nowCPage;
	}
	public List<ForumCommentsVO> getGoodList() {
		return goodList;
	}
	public List<ForumCommentsVO> getBadList() {
		return badList;
	}
	public ForumVO getFvo() {
		return fvo;
	}
	public String getPagingCode() {
		return pagingCode;
	}
	public int getFirstPage() {
		return firstPage;
	}
	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}
}
