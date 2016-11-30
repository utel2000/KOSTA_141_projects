package ex2;
// 인터페이스를 구현해서 정의 하는 방법.
public class Ex2_Th2 implements Runnable{
    @Override
    public void run() {
        // 현재 스레드의 이름 출력!
        // Thread.currentThread().getName();
        System.out.println("@_@"+Thread.currentThread().getName());
    }
}
