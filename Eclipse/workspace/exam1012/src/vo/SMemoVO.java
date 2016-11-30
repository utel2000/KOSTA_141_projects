package vo;

/* desc sboard;
NUM    NOT NULL NUMBER(10)   
TITLE           VARCHAR2(50) 
WRITER          VARCHAR2(50) 
MEMO            CLOB         
MDATE           DATE         
REIP            VARCHAR2(50) 
 */
public class SMemoVO {
	private int num;
	private String title, writer, memo, mdate, reip;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMdate() {
		return mdate;
	}

	public void setMdate(String mdate) {
		this.mdate = mdate;
	}

	public String getReip() {
		return reip;
	}

	public void setReip(String reip) {
		this.reip = reip;
	}

}
