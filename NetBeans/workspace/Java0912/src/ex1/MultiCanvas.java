package ex1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class MultiCanvas extends JFrame {

    private Canvas can;
    private int arcNum;
    private int arcNum2;
    private int arcNum3;

    public int getArcNum3() {
        return arcNum3;
    }

    public void setArcNum3(int arcNum3) {
        this.arcNum3 = arcNum3;
    }

    public int getArcNum2() {
        return arcNum2;
    }

    public void setArcNum2(int arcNum2) {
        this.arcNum2 = arcNum2;
    }

    public Canvas getCan() {
        return can;
    }

    public void setCan(Canvas can) {
        this.can = can;
    }

    public int getArcNum() {
        return arcNum;
    }

    public void setArcNum(int arcNum) {
        this.arcNum = arcNum;
    }

    public MultiCanvas() throws InterruptedException {
        can = new Canvas() {
            // Canvas ȣ�� ����
            // 1. �����ڰ� repaint() ȣ���ϸ�
            // 2. JVM�� update() -> paint() ȣ��
            
//            @Override
//            public void update(Graphics g) {
//
//            }

            @Override
            public void paint(Graphics g) {
                g.setColor(Color.red);
                // �ش� ��ǥ(x, y)�� �ش� ũ��(w, h)��ŭ�� ���� �׸�.
                 g.fillOval(100, 100, 100, 100); // ��
                g.drawArc(250, 100, 100, 100, 0, arcNum);
                g.drawArc(400, 100, 100, 100, 0, arcNum2);
                g.drawArc(550, 100, 100, 100, 0, arcNum3);
            }
        };
        add(can);
        can.setBackground(Color.WHITE);
        setBounds(100, 100, 800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        MyThread t = new MyThread(this);
        MyThread2 t2 = new MyThread2(this);
        MyThread3 t3 = new MyThread3(this);
        t.start();
        t.join();
        t2.start();
        t2.join();
        t3.start();
    }

    public static void main(String[] args) throws InterruptedException {
        new MultiCanvas();
    }
}
