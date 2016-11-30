package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.WikiDao;
import service.Paging;
import vo.PagingVO;
import vo.WikiVO;

// 데이터 list를 가져오기 위한 클래스
public class WikiListAction extends ActionSupport implements Preparable, ModelDriven<PagingVO> {
	private PagingVO pvo;
	private List<WikiVO> wlist; // getter
	private String pagingCode;
	private int nowPage;
	private int total;
	private String basePath;

	public WikiListAction() {
		nowPage = 1; // 클래스 생성과 동시에 nowPage 초기화
	}

	@Override
	public String execute() throws Exception {
		int numPerpage = Integer.parseInt(getText("numPerPage"));
		int numPerBlock = Integer.parseInt(getText("numPerBlock"));
		// properties 파일에서 numPerpage, numPerBlock 가져옴

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
		
		// page 이동할 경우 searchValue 뒤에 다른 값이 같이 넘어와서 trim 해줘야함 (아스키코드로 추정)
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
