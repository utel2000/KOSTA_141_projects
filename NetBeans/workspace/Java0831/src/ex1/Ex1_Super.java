package ex1;

public class Ex1_Super {
    // 오버라이딩 : 부모의 메서드를 재정의 해서 사용하는 것
    // 부모를 참조해서 자식을 생성할 때 오버라이딩 된 매서드가 있다면
    // 자식의 재정의 된 매서드가 호출됨! (중요)
    public void message() {
        System.out.println("부모의 메서드!");
    }
    public void superM() {
        System.out.println("부모의 것!");
    }
}
