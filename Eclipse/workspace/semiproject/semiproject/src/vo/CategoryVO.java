package vo;
/*
 이름       널        유형            
-------- -------- ------------- 
CAT_NUM   NOT NULL NUMBER        
CAT_NAME          VARCHAR2(100)
 * */
public class CategoryVO {
	private int cat_num;
	private String cat_name;
	public int getCat_no() {
		return cat_num;
	}
	public void setCat_no(int cat_num) {
		this.cat_num = cat_num;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	
	
}
