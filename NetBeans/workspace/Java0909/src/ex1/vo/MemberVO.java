package ex1.vo;
// ����ȭ ����� �� ��ü! implements Serializable

import java.io.Serializable;

public class MemberVO implements Serializable{

    private String name;
    private String addr;
    // transient �� �Ӽ��� ����ȭ ��󿡼� ����!
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
