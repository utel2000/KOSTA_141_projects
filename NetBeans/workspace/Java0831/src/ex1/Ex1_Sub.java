package ex1;

public class Ex1_Sub extends Ex1_Super {
    // Alt + Insert => 오버라이드 참고
    // 상속관계에서 부모의 메서드를 재정의 했다.(링크)
    @Override // 실행 가능한 주석이면서 JVM이 읽어들인다.
    public void message() { // 커서 올리고 Ctrl + Shift + P 하면 링크된 곳으로 이동.
        System.out.println("!★☆☆☆★!");
    }
    public void subM() {
        System.out.println("부모를 참조해서 생성되면"
                + " 이 메서드는 호출 할 수 없다!");
    }
}
