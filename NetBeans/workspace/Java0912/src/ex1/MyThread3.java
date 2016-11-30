package ex1;
// �������̽��� ���� �̷��� Ŭ������ �ϳ� ���ִ°� �ٶ���������,
// ����ó�� '�ʸ��� ���� Ŭ����'��� ���� '���� Ŭ����'�� ���� ���� �ٶ���.

public class MyThread3 extends Thread {

    private MultiCanvas myCan;

    public MyThread3(MultiCanvas myCan) {
        this.myCan = myCan;
    }

    @Override
    public void run() {
        while (myCan.getArcNum3() <= 360) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            int tempN = myCan.getArcNum3();
            tempN += tempN + 10;
            myCan.setArcNum3(tempN);
            myCan.getCan().repaint();
        }
    }

}
