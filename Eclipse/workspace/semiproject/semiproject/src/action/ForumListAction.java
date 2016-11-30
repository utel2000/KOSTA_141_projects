package action;
import java.util.List;
import com.opensymphony.xwork2.Action;
import dao.ForumDao;
import service.Paging;
import vo.ForumVO;
import vo.PagingVO;
public class ForumListAction implements Action {
	// view���� �о���� ����Ʈ
	private List<ForumVO> list; // getter
	// view���� ���� ���� ������ �ڵ�
	private String pagingCode; // getter
	// ���� ������
	private int nowPage; // setter, getter
	// ������
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
		
		// ���� ���������� ������ �׸� ��
		int numPerPage = 5;
		// ���� ������ ������ ������ ��.
		int numPerBlock = 5;
		// ��ü ������ ��
		int total = ForumDao.getDao().totalForumList();
		Paging page = new Paging(total, nowPage, numPerPage, numPerBlock, "forumList");
		// ������ ��� �ڵ�
		pagingCode = page.getPagingCode(); // ������ ��� �ڵ�
		// start, end���� SQL������ Top-N������ �Ķ���ͷ� ���޵Ǿ
		// ���� ���� �����Ͱ� list�� �Ѿ���� ��.
		// start : nowPage�� PagingService���� ����Ǵ� ������ ��.
		// �׻� ù��° row�� ������ ��� ��.
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
