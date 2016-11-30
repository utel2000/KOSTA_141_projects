package vo;

public class ForumSearchPagingVO {
	private String  searchType2, searchValue;
	private int start, end, pk, searchType1;
	public ForumSearchPagingVO() {
	}
	public ForumSearchPagingVO(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	public ForumSearchPagingVO(int start, int end, int pk) {
		super();
		this.start = start;
		this.end = end;
		this.pk = pk;
	}
	
	public String getSearchType2() {
		return searchType2;
	}
	public void setSearchType2(String searchType2) {
		this.searchType2 = searchType2;
	}
	public int getSearchType1() {
		return searchType1;
	}
	public void setSearchType1(int searchType1) {
		this.searchType1 = searchType1;
	}
	public int getPk() {
		return pk;
	}
	public void setPk(int pk) {
		this.pk = pk;
	}
	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
}
