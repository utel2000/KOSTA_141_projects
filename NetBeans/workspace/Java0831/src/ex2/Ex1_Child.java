package ex2;
// 추상메서드를 가진 추상클래스는 자식이 상속받을 때
// 반드시 재정의 해야 상속관계를 이룰 수 있다.
public class Ex1_Child extends Ex1_Abstract {
    // 추상클래스는 반드시 extends Ex1_Absract로 상속하거나,
    // 익명 내부클래스로 정의가 되지 생성은 안된다.
    // Ex1_Abstract ref = new Ex1_Abstract(); // => 오류
    
    @Override
    public void moveMountain() {
        System.out.println("힘들었지만 산을 옮겼다!");
        System.out.println("나의 재산은 : " + getMoney());
    }
    public static void main(String[] args) {
        Ex1_Child ref = new Ex1_Child();
        ref.moveMountain();
    }
}
