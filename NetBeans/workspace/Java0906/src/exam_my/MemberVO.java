package exam_my;
// 순수하게 회원의 값만을 가지는 객체 (POJO상태)
// 여기다 뭔가 추가가 되는 순간부터 POJO가 아니라 POJO기반이 된다.
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
