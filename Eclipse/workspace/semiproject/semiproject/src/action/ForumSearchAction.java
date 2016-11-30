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

	// view���� �о���� ����Ʈ
	// view���� ���� ���� ������ �ڵ�
	private String pagingCode; // getter
	// ���� ������
	private int nowPage; // setter, getter
	// ������
	public ForumSearchAction() {
		nowPage = 1;
	}

	@Override
	public String execute() throws Exception {
		// ���� ���������� ������ �׸� ��
		int numPerPage = 5;
		// ���� ������ ������ ������ ��.
		int numPerBlock = 5;
		// ��ü ������ ��
		total = ForumDao.getDao().totalForumSearchList(fspvo);
		ForumSearchPaging  page = new ForumSearchPaging(total, nowPage, numPerPage, numPerBlock, "forumSearch", fspvo);
		// ������ ��� �ڵ�
		pagingCode = page.getPagingCode(); // ������ ��� �ڵ�
		// start, end���� SQL������ Top-N������ �Ķ���ͷ� ���޵Ǿ
		// ���� ���� �����Ͱ� list�� �Ѿ���� ��.
		// start : nowPage�� PagingService���� ����Ǵ� ������ ��.
		// �׻� ù��° row�� ������ ��� ��.
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
