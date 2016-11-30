package ex2;

public class Ex4_ATMTwo implements Runnable {

    private long dMoney;

    public Ex4_ATMTwo(long dMoney) {
        this.dMoney = dMoney;
    }

    @Override
    public void run() {
            synchronized (this) { // ����ȭ ������� ����ȭ ���� ������ ������ �� ����.
            for (int i = 0; i < 10; i++) {
                if (dMoney < 0) {
                    break;
                }
                withDraw(1000);
                if (dMoney == 2000 || dMoney == 4000 || dMoney == 6000 || dMoney == 8000) {
                    try {
                        // WaitPool�� �̵�.
                        // wait() : ����ȭ���� ����ϴ� �޼���.
                        this.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    // LockPool�� �̵�.
                    this.notify();
                }
            }
        }
    }

    // ����/�Ƶ� �����尡 ����  ���� �޼��带 ȣ���ϴ� ����.
    private void withDraw(int howMuch) {
        if (dMoney > 0) {
            dMoney -= howMuch;
            System.out.println("----------------------------------");
            System.out.println(Thread.currentThread().getName());
            System.out.println("�ܾ� : " + dMoney);
        } else {
            System.out.println("----------------------------------");
            System.out.println(Thread.currentThread().getName());
            System.out.println("�ܾ��� �����մϴ�.");
        }
    }

}
