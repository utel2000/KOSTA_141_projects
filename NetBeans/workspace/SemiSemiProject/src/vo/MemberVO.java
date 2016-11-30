package vo;

/* @author Administrator*/
public class MemberVO {
    private int memnum; // 회원번호
    private String memname; // 회원이름
    private String memgender; // 성별
    private int memage; // 나이
    private String memtel; // 전화번호
    private String memid; // 아이디
    private String mempwd; // 비밀번호
    private String memadmin; // 관리자여부(관리자1, 일반0)
    private String memadr; // 주소
    private String mememail; // 메일주소

    public int getMemnum() {
        return memnum;
    }

    public void setMemnum(int memnum) {
        this.memnum = memnum;
    }

    public String getMemname() {
        return memname;
    }

    public void setMemname(String memname) {
        this.memname = memname;
    }

    public String getMemgender() {
        return memgender;
    }

    public void setMemgender(String memgender) {
        this.memgender = memgender;
    }

    public int getMemage() {
        return memage;
    }

    public void setMemage(int memage) {
        this.memage = memage;
    }

    public String getMemtel() {
        return memtel;
    }

    public void setMemtel(String memtel) {
        this.memtel = memtel;
    }

    public String getMemid() {
        return memid;
    }

    public void setMemid(String memid) {
        this.memid = memid;
    }

    public String getMempwd() {
        return mempwd;
    }

    public void setMempwd(String mempwd) {
        this.mempwd = mempwd;
    }

    public String getMemadmin() {
        return memadmin;
    }

    public void setMemadmin(String memadmin) {
        this.memadmin = memadmin;
    }

    public String getMemadr() {
        return memadr;
    }

    public void setMemadr(String memadr) {
        this.memadr = memadr;
    }

    public String getMememail() {
        return mememail;
    }

    public void setMememail(String mememail) {
        this.mememail = mememail;
    }
}