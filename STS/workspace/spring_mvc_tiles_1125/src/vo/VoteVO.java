package vo;
public class VoteVO {
	private int num, qt, vcnt1, vcnt2, vcnt3;
	private String sub, vsub1, vsub2, vsub3, vdate;
	private String voteChk; // 설문에 대한 투표 체크 유무
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getQt() {
		return qt;
	}
	public void setQt(int qt) {
		this.qt = qt;
	}
	public int getVcnt1() {
		return vcnt1;
	}
	public void setVcnt1(int vcnt1) {
		this.vcnt1 = vcnt1;
	}
	public int getVcnt2() {
		return vcnt2;
	}
	public void setVcnt2(int vcnt2) {
		this.vcnt2 = vcnt2;
	}
	public int getVcnt3() {
		return vcnt3;
	}
	public void setVcnt3(int vcnt3) {
		this.vcnt3 = vcnt3;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getVsub1() {
		return vsub1;
	}
	public void setVsub1(String vsub1) {
		this.vsub1 = vsub1;
	}
	public String getVsub2() {
		return vsub2;
	}
	public void setVsub2(String vsub2) {
		this.vsub2 = vsub2;
	}
	public String getVsub3() {
		return vsub3;
	}
	public void setVsub3(String vsub3) {
		this.vsub3 = vsub3;
	}
	public String getVdate() {
		return vdate;
	}
	public void setVdate(String vdate) {
		this.vdate = vdate;
	}
	public String getVoteChk() {
		return voteChk;
	}
	public void setVoteChk(String voteChk) {
		this.voteChk = voteChk;
	}
}
