package vo;

/* @author Administrator*/
public class MemberVO {
    private int memnum; // ȸ����ȣ
    private String memname; // ȸ���̸�
    private String memgender; // ����
    private int memage; // ����
    private String memtel; // ��ȭ��ȣ
    private String memid; // ���̵�
    private String mempwd; // ��й�ȣ
    private String memadmin; // �����ڿ���(������1, �Ϲ�0)
    private String memadr; // �ּ�
    private String mememail; // �����ּ�

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