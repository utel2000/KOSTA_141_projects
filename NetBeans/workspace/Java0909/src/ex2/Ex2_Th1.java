package ex2;
// 스레드를 상속받아서 정의 하는 방법.
public class Ex2_Th1 extends Thread {
    @Override
    public void run() {
        System.out.println("^-^" + getName());
    }
}
