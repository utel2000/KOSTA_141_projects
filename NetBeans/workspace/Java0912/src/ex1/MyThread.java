package ex1;
// 인터페이스를 쓰면 이렇게 클래스를 하나 빼주는게 바람직하지만,
// 지금처럼 '너만을 위한 클래스'라면 차라리 '내부 클래스'를 쓰는 것이 바람직.

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
