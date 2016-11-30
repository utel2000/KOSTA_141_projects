package ex2;
// <추상클래스>
// 1. 추상클래스 : new로 생성될 수 없고, 오직 자식클래스에 의해서 상속으로 생성.
// 2. 추상메서드(몸체가 없는, 미구현된)를 가지고 있는 클래스. (수동적)
public abstract class Ex1_Abstract {
    // 추상메서드 : 반드시 자식클래스가 상속 받으면 재정의 해야 하는 책임있다(구현)
    // abstract라는 키워드를 붙여야 한다.
    private String money;
    public Ex1_Abstract(){
        money="1000억원";
    }
    // 부모의 자원을 가져갈 수 있도록 제공
    public String getMoney(){
        return money;
    }
    // 추상메서드 (책임) : abstract
    public abstract void moveMountain();
}
