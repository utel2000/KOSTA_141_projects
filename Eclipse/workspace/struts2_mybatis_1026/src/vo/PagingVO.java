package vo;

public class PagingVO { // 페이지 값을 처리하기 위한 단순 VO 작성. 
	private int start, end;
	public PagingVO(int start, int end) {
		this.start = start;
		this.end = end;
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
