package ex2;
// �������̽��� �����ؼ� ���� �ϴ� ���.
public class Ex2_Th2 implements Runnable{
    @Override
    public void run() {
        // ���� �������� �̸� ���!
        // Thread.currentThread().getName();
        System.out.println("@_@"+Thread.currentThread().getName());
    }
}
