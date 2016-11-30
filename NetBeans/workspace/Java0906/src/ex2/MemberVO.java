package ex2;
// 순수하게 회원의 값만을 가지는 객체 (POJO상태)
// 여기다 뭔가 추가가 되는 순간부터 POJO가 아니라 POJO기반이 된다.
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
