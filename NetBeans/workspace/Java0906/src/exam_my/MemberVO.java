package exam_my;
// �����ϰ� ȸ���� ������ ������ ��ü (POJO����)
// ����� ���� �߰��� �Ǵ� �������� POJO�� �ƴ϶� POJO����� �ȴ�.
public class MemberVO {
    private String id, pwd, name, age, edate;
    private int num;
    // setter/getter
    public String getEdate() {
        return edate;
    }
    public void setEdate(String edate) {
        this.edate = edate;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
}
