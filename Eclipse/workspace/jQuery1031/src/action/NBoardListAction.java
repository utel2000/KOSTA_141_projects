package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.NBoardDAO;
import util.Paging;
import vo.NBoardVO;
import vo.PagingVO;

public class NBoardListAction extends ActionSupport {
	private List<NBoardVO> list; // g
	//  view���� ���� ���� ������ �ڵ�
	private String pagingCode; // g
	// �������� ����Ǳ� ������ �׻� ���� ������ ��.
	private int nowPage; // s
	public NBoardListAction() {
		nowPage = 1;
	}
	@Override
	public String execute() throws Exception {
		int numPerPage = 5;
		int numPerBlock = 5;
		// ��ü ������ ��
		int total = NBoardDAO.getDao().getTotal();
		Paging page = new Paging(total, nowPage, numPerPage, numPerBlock, "nBoardList");
		pagingCode = page.getPagingCode(); // ������ ��� �ڵ�
		// start, end���� SQL������ Top-N������ �Ķ���ͷ� ���޵Ǿ
		// ���� ���� �����Ͱ� list�� �Ѿ���� ��.
		// start : nowPage�� PagingService���� ����Ǵ� ������ ��.
		// �׻� ù��° row�� ������ ��� ��.
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
