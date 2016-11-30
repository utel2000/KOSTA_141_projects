
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
	// ���� �� �׸��� ��ȸ �� ����� ���� VO 
	private ForumVO fvo; // getter
	// (�Ϸ� ������)�ִ� ���ƿ� ���� ���
	private List<ForumCommentsVO> goodList; // getter
	// (�Ϸ� ������)�ִ� �Ⱦ�� ���� ���
	private List<ForumCommentsVO> badList; // getter
	// ���� ����� ������
	private int nowPage; // setter, getter
	// ����� �Ҽӵ� ������ �⺻Ű
	private int f_num; // setter
	// view���� �о���� ����Ʈ
	private List<ForumCommentsVO> list; // getter
	// view���� ���� ���� ������ �ڵ�
	private String pagingCode; // getter
	// ���� ������ ��� ������
	private int nowCPage; // setter
	// �� �������� ó�� ������ ���� �����ϱ� ����
	private int firstPage; // setter, getter
	// ������
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

		// ���� �� �׸� ��ȸ
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
				
		// ���� ���������� ������ �׸� ��
		int numPerPage = 3;
		// ���� ������ ������ ������ ��.
		int numPerBlock = 3;
		// ��ü ������ ��
		int total = ForumCommentsDao.getDao().totalCommentsList(f_num);
		CommentsPaging page = new CommentsPaging(total, nowPage, nowCPage, numPerPage, numPerBlock, f_num, "forumDetail");
		// ������ ��� �ڵ�
		pagingCode = page.getPagingCode(); // ������ ��� �ڵ�
		// start, end���� SQL������ Top-N������ �Ķ���ͷ� ���޵Ǿ
		// ���� ���� �����Ͱ� list�� �Ѿ���� ��.
		// start : nowPage�� PagingService���� ����Ǵ� ������ ��.
		// �׻� ù��° row�� ������ ��� ��.
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
