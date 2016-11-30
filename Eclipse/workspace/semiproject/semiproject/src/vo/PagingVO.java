package vo;

public class PagingVO {
	// 페이지 값을 처리하기 위한 단순 VO를 작성한다.
	// 검색

	private int start, end, searchType1, searchType2, pk;
	private String searchValue;

	public PagingVO() {
	}

	public PagingVO(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public PagingVO(int start, int end, int pk) {
		this.start = start;
		this.end = end;
		this.pk = pk;
	}

	public int getPk() {
		return pk;
	}

	public void setPk(int pk) {
		this.pk = pk;
	}

	public int getSearchType1() {
		return searchType1;
	}

	public void setSearchType1(int searchType1) {
		this.searchType1 = searchType1;
	}

	public int getSearchType2() {
		return searchType2;
	}

	public void setSearchType2(int searchType2) {
		this.searchType2 = searchType2;
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
