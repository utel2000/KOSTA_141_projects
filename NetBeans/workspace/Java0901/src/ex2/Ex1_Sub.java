package ex2;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// �������̽������� ���� ������ �ȴ�.
// public class Ex1_Sub extends JFrame implements Ex1_InterA, Ex1_InterB {
// ���� ����� ���� �������̽��� �߰�.
public class Ex1_Sub extends JFrame implements Ex1_InterC {
    private JButton btn, btn2; // ��ư
    private JPanel p1, p2; // �г�
    private JLabel lb; // ��
    public Ex1_Sub() {
        btn = new JButton("A���� ��ǰ");
        btn2 = new JButton("B���� ��ǰ");
        p1 = new JPanel();
        p1.add(btn);
        p1.add(btn2);
        add(p1, "North");
        p2 = new JPanel();
        lb = new JLabel();
        p2.add(lb);
        add(p2);
        // btn ���� ����
        btn.setBackground(Color.pink);
        p2.setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ý��� ����
        setBounds(100, 100, 300, 500); // â�� ��ǥ�� ũ��
        setVisible(true);
        // btn1, btn2�� �̺�Ʈ ó�� : ������� click �̺�Ʈ�� �޾Ƽ� �ڵ鸵 �ϰڴ�.
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myAMethod();
                p2.setBackground(Color.blue);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myBMethod();
                p2.setBackground(Color.red);
            }
        });
    }
    public static void main(String[] args) {
        new Ex1_Sub();
    }
    @Override
    public void myAMethod() {
        System.out.println("A������ �޴��� �丮�մϴ�.");
        lb.setText("����� ��� : " + aResource());
    }
    @Override
    public void myBMethod() {
        System.out.println("B������ �޴��� �丮�մϴ�.");
        lb.setText("����� ��� : " + bResource());
    }
}
