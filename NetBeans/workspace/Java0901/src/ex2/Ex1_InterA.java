package ex2;

public interface Ex1_InterA {
    int NUM = 100; // 상수
    public void myAMethod(); // 추상메서드
    // default메서드 : 구현 클래스들에게 적용할 기본 메서드(강제,책임 x)
    // 구현 클래스들은 재정의(오버라이딩)해서 사용할 수 있고,
    // 그냥 호출해서 사용할 수도 있다.
    default public String aResource(){
        return "A 본사의 리소스!";
    }
}
