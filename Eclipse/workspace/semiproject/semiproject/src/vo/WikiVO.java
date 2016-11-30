package vo;
/*
 이름           널        유형            
------------ -------- ------------- 
W_Num         NOT NULL NUMBER        
W_TITLE      NOT NULL VARCHAR2(150) 
W_CONTENT    NOT NULL CLOB          
W_CATEGORY   NOT NULL NUMBER        
W_RDATE               DATE          
W_UPDATE_MEM NOT NULL NUMBER        
W_IMG                 VARCHAR2(100) 
W_SRC                 VARCHAR2(200) 
 * */
public class WikiVO {
	private int w_num, w_category, w_update_mem;
	private String w_title, w_content, w_img, w_src, w_rdate;
	public int getW_num() {
		return w_num;
	}
	public void setW_num(int w_num) {
		this.w_num = w_num;
	}
	public int getW_category() {
		return w_category;
	}
	public void setW_category(int w_category) {
		this.w_category = w_category;
	}
	public int getW_update_mem() {
		return w_update_mem;
	}
	public void setW_update_mem(int w_update_mem) {
		this.w_update_mem = w_update_mem;
	}
	public String getW_title() {
		return w_title;
	}
	public void setW_title(String w_title) {
		this.w_title = w_title;
	}
	public String getW_content() {
		return w_content;
	}
	public void setW_content(String w_content) {
		this.w_content = w_content;
	}
	public String getW_img() {
		return w_img;
	}
	public void setW_img(String w_img) {
		this.w_img = w_img;
	}
	public String getW_src() {
		return w_src;
	}
	public void setW_src(String w_src) {
		this.w_src = w_src;
	}
	public String getW_rdate() {
		return w_rdate;
	}
	public void setW_rdate(String w_rdate) {
		this.w_rdate = w_rdate;
	}
	
}
