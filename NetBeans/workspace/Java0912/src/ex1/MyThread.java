package ex1;
// �������̽��� ���� �̷��� Ŭ������ �ϳ� ���ִ°� �ٶ���������,
// ����ó�� '�ʸ��� ���� Ŭ����'��� ���� '���� Ŭ����'�� ���� ���� �ٶ���.

public class MyThread extends Thread {

    private MultiCanvas myCan;

    public MyThread(MultiCanvas myCan) {
        this.myCan = myCan;
    }

    @Override
    public void run() {
        while (myCan.getArcNum() <= 360) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            int tempN = myCan.getArcNum();
            tempN += tempN + 10;
            myCan.setArcNum(tempN);
            myCan.getCan().repaint();
        }
    }
}
