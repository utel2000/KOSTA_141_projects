package ex2;
// �����ϰ� ȸ���� ������ ������ ��ü (POJO����)
// ����� ���� �߰��� �Ǵ� �������� POJO�� �ƴ϶� POJO����� �ȴ�.
public class MemberVO {
    private String id, pwd;
    private int age;
    // setter/getter
    public void setId(String id) {
        this.id = id;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getId() {
        return id;
    }
    public String getPwd() {
        return pwd;
    }
    public int getAge() {
        return age;
    }
}
