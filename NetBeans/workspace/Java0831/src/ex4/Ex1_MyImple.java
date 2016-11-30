package ex4;
// 인터페이스를 구현하는 클래스는 implements 키워드를 사용해서 구현한다.
// 클래스나, 추상클래스를 상속 받는 extends와는 구별된다.
// 1) 다중 구현 가능. implements InterA, InterB
// 2) extends와 함께 사용 가능 extends Container implements MenuInter
// 3) 인터페이스 끼리는 다중 상속 가능 interface Sub_Inter extends InterA, InterB
public class Ex1_MyImple implements Ex1_MyInter{
    @Override
    public void test() {
    }
    @Override
    public String msg() {
        return "A";
    }
    public static void main(String[] args) {
        // 인터페이스를 사용하는 목적은 무엇일까요?
        // 인터페이스는 실체화 관계 (메뉴를 실체화 하면 음식이 된다?)
        // 인터페이스는 메뉴판이 되기 위해서만 존재.
        // 껍데기를 정해주고 실체화. 사용자에겐 껍데기만 제공.
        // 인터페이스끼리는 다중상속이 된다.
        // 인터페이스의 구성 : 추상메서드, 상수 (JDK 7까지)
        // JDK 8버전에선 Default 메서드, 스태틱 메서드 사용 가능.
        Ex1_MyInter menu = new Ex1_MyImple();
    }
}
