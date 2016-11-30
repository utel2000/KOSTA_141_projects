package ex1;
// �������̽��� ���� �̷��� Ŭ������ �ϳ� ���ִ°� �ٶ���������,
// ����ó�� '�ʸ��� ���� Ŭ����'��� ���� '���� Ŭ����'�� ���� ���� �ٶ���.

public class MyThread2 extends Thread {

    private MultiCanvas myCan;

    public MyThread2(MultiCanvas myCan) {
        this.myCan = myCan;
    }

    @Override
    public void run() {
        while (myCan.getArcNum2() <= 360) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            int tempN = myCan.getArcNum2();
            tempN += tempN + 10;
            myCan.setArcNum2(tempN);
            myCan.getCan().repaint();
        }
    }

}
