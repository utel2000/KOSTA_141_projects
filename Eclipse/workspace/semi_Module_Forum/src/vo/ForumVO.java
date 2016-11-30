package vo;
public class ForumVO {
	private int f_num, f_writer, f_category, cnt;
	private String f_subject, f_content, f_img, f_state, f_date_post, f_date_complete;
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getF_num() {
		return f_num;
	}
	public void setF_num(int f_num) {
		this.f_num = f_num;
	}
	public int getF_writer() {
		return f_writer;
	}
	public void setF_writer(int f_writer) {
		this.f_writer = f_writer;
	}
	public int getF_category() {
		return f_category;
	}
	public void setF_category(int f_category) {
		this.f_category = f_category;
	}
	public String getF_subject() {
		return f_subject;
	}
	public void setF_subject(String f_subject) {
		this.f_subject = f_subject;
	}
	public String getF_content() {
		return f_content;
	}
	public void setF_content(String f_content) {
		this.f_content = f_content;
	}
	public String getF_img() {
		return f_img;
	}
	public void setF_img(String f_img) {
		this.f_img = f_img;
	}
	public String getF_state() {
		return f_state;
	}
	public void setF_state(String f_state) {
		this.f_state = f_state;
	}
	public String getF_date_post() {
		return f_date_post;
	}
	public void setF_date_post(String f_date_post) {
		this.f_date_post = f_date_post;
	}
	public String getF_date_complete() {
		return f_date_complete;
	}
	public void setF_date_complete(String f_date_complete) {
		this.f_date_complete = f_date_complete;
	}
}
