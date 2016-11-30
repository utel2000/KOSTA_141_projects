package ex1;
public class Ex1_Main {
    public static void main(String[] args) {
        // 오버라이딩인 경우 두 경우는 결과가 같으나 호출 형태는 엄연히 다름.
        // 둘 다 어떠한 경우라도
        // 오버라이딩으로 정의된 부모의 메서드는 호출될 수 없다.(은닉화)
        
        // 부모를 참조해서 자식을 생성한 경우
        Ex1_Super ref = new Ex1_Sub();
        ref.message(); // 재정의로 링크된 자식 메서드가 실행됨.
        // 자식을 참조해서 자식을 생성한 경우
        Ex1_Sub ref1 = new Ex1_Sub();
        ref1.message();
    }
}
