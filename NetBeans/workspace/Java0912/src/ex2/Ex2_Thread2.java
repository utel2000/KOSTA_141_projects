package ex2;

public class Ex2_Thread2 extends Thread {

    private Ex2_MyData d;

    public Ex2_Thread2(Ex2_MyData d) {
        this.d = d;
    }

    @Override
    public void run() {
        int i = 0;
        // ���� �������� �̸��� ����
        String name = Thread.currentThread().getName();
        while (i < 3) {
            System.out.println(name + " �������� : " + (++i));
            System.out.println(name + " ����ʵ� : " + (d.getValue()));
            System.out.println("Thread Active Cnt : " + Thread.activeCount());
        }
    }
    public static void main(String[] args) {
        // �ϳ��� ��ü�� �����ϴ� ������!
        Ex2_MyData d = new Ex2_MyData();
        Ex2_Thread2 ref = new Ex2_Thread2(d);
        Ex2_Thread2 ref2 = new Ex2_Thread2(d);
        ref.start();
        ref2.start();
    }
}
