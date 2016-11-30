package ex1.vo;
// 직렬화 대상이 될 객체! implements Serializable

import java.io.Serializable;

public class MemberVO implements Serializable{

    private String name;
    private String addr;
    // transient 준 속성은 직렬화 대상에서 제외!
    transient private int pay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }
}
