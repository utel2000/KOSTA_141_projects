package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.WikiDao;
import service.Paging;
import vo.PagingVO;
import vo.WikiVO;

// ������ list�� �������� ���� Ŭ����
public class WikiListAction extends ActionSupport implements Preparable, ModelDriven<PagingVO> {
	private PagingVO pvo;
	private List<WikiVO> wlist; // getter
	private String pagingCode;
	private int nowPage;
	private int total;
	private String basePath;

	public WikiListAction() {
		nowPage = 1; // Ŭ���� ������ ���ÿ� nowPage �ʱ�ȭ
	}

	@Override
	public String execute() throws Exception {
		int numPerpage = Integer.parseInt(getText("numPerPage"));
		int numPerBlock = Integer.parseInt(getText("numPerBlock"));
		// properties ���Ͽ��� numPerpage, numPerBlock ������

		int start = (nowPage - 1) * numPerpage + 1;
		int end = start + numPerpage - 1;
		pvo.setStart(start);
		pvo.setEnd(end);
		System.out.println("[check][WikiListAction] StartRowNum : " + start);
		System.out.println("[check][WikiListAction] EndRowNum : " + end);

		System.out.println("[check][WikiListAction] nowPage : " + nowPage);
		System.out.println("[check][WikiListAction] searchType1 : " + pvo.getSearchType1());
		System.out.println("[check][WikiListAction] searchType2 : " + pvo.getSearchType2());
		System.out.println("[check][WikiListAction] searchValue : " + pvo.getSearchValue());
		
		// page �̵��� ��� searchValue �ڿ� �ٸ� ���� ���� �Ѿ�ͼ� trim ������� (�ƽ�Ű�ڵ�� ����)
		if(pvo.getSearchValue() != null){pvo.setSearchValue(pvo.getSearchValue().trim());}
		wlist = WikiDao.getDao().getList(pvo);

		total = WikiDao.getDao().getTotal(pvo);
		System.out.println("[check][WikiListAction] wiki_total : " + total);
		Paging page = new Paging(total, nowPage, numPerpage, numPerBlock, "wikiList");
		pagingCode = page.getPagingCode();

		return SUCCESS;
	}

	public List<WikiVO> getWlist() {
		return wlist;
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

	public int getTotal() {
		return total;
	}

	@Override
	public PagingVO getModel() {
		return pvo;
	}

	@Override
	public void prepare() throws Exception {
		pvo = new PagingVO();
	}

	public String getBasePath() {
		return basePath;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	
}
