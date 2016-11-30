package ex2;

public interface Ex1_InterB {
    int NUM2 = 200; // 상수
    public void myBMethod(); // 추상메서드
    // 구현 클래스들에게 적용할 기본 메서드
    // 구현 클래스들은 재정의해서 사용할 수 있고, 그냥 호출해서 사용할 수 있다.
    default public String bResource(){
        return "B 본사의 리소스!";
    }
}
