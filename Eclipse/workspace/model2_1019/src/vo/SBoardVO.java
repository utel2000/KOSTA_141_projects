package vo;
/* desc sboard;
NUM    NOT NULL NUMBER        
SUB    NOT NULL VARCHAR2(100) 
WRITER          VARCHAR2(34)  
PWD             VARCHAR2(10)  
CONT            CLOB          
RDATE           DATE          
REIP            VARCHAR2(40)
IMG 			VARCHAR2(50)
 */
public class SBoardVO {
	private int num;
	private String sub, writer, pwd, cont, rdate, reip, img;

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	public String getReip() {
		return reip;
	}

	public void setReip(String reip) {
		this.reip = reip;
	}
}
