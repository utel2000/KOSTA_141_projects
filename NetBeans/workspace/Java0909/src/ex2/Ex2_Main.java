package ex2;
public class Ex2_Main {
    public static void main(String[] args) {
        // 스레드를 각각 생성
        Ex2_Th1 ref1 = new Ex2_Th1(); // 상속받은 것
        Ex2_Th2 ref2 = new Ex2_Th2(); // 인터페이스 구현한 것
        ref1.start();
        // ref2는 Runnable 인터페이스를 구현한 클래스일 경우
        // start()메서드를 사용하기 위해서
        // Runnable을 구현한 클래스의 주소를 인자로
        // 넣어서 Thread를 생성해서 사용!
        Thread t = new Thread(ref2);
        t.start();
        // 메인 메서드가 실행할 반복문
        for(int i=0; i<50; i++){
            System.out.print("-");
        }
    }
}
