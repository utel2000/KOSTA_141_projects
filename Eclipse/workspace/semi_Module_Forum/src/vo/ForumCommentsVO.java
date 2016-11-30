package vo;
public class ForumCommentsVO {
	private int c_num, c_forum, c_writer, c_good, c_bad;
	private String c_content, c_date, c_writer_id, check;
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public String getC_writer_id() {
		return c_writer_id;
	}
	public void setC_writer_id(String c_writer_id) {
		this.c_writer_id = c_writer_id;
	}
	public int getC_num() {
		return c_num;
	}
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	public int getC_forum() {
		return c_forum;
	}
	public void setC_forum(int c_forum) {
		this.c_forum = c_forum;
	}
	public int getC_writer() {
		return c_writer;
	}
	public void setC_writer(int c_writer) {
		this.c_writer = c_writer;
	}
	public int getC_good() {
		return c_good;
	}
	public void setC_good(int c_good) {
		this.c_good = c_good;
	}
	public int getC_bad() {
		return c_bad;
	}
	public void setC_bad(int c_bad) {
		this.c_bad = c_bad;
	}
	public String getC_content() {
		return c_content;
	}
	public void setC_content(String c_content) {
		this.c_content = c_content;
	}
	public String getC_date() {
		return c_date;
	}
	public void setC_date(String c_date) {
		this.c_date = c_date;
	}
}
