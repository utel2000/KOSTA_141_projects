package or.kosta.vo;

import org.springframework.web.multipart.MultipartFile;

public class TboardVO {
	private int num;
	private String sub,writer,content,pwd,tdate;
	// �����ͺ��̽��� �̹��� �̸��� ���ڿ��� �����ϱ� ���ؼ� ���
	private String mfile;
	// vo�� ���ε�ó���� ���ؼ� mfile�� �߰��Ѵ�.
	private MultipartFile upfile;
	
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	public String getMfile() {
		return mfile;
	}
	public void setMfile(String mfile) {
		this.mfile = mfile;
	}
	public MultipartFile getUpfile() {
		return upfile;
	}
	public void setUpfile(MultipartFile upfile) {
		this.upfile = upfile;
	}
	
}