package ex3;
// 생성자는 무엇이며, 왜 사용해야 하는다?
// 클래스를 객체화 하는 방법. new란 연산자와 함께 사용하여 호출.
// 이렇게 되면 클래스는 생성자에 의해서 초기화 되며 heap 영역에 생성.
public class Ex2_Constructor {
    private int pay;
    private String name;
    public void printMsg() {
        System.out.println("이름 : " + name);
        System.out.println("급여 : " + pay);
    } // 생성자를 정의하면 컴파일러는 기본생성자를 정의해놓지 않음!
    public Ex2_Constructor(int pay, String name) {
        this.name = name;
        this.pay = pay;
    }
// 외부클래스에서 현재클래스를 사용하기 위해서 생성.
    public static void main(String[] args) {
        Ex2_Constructor ec;
        ec = new Ex2_Constructor(0, "hi");
        ec.printMsg();
    }
}
