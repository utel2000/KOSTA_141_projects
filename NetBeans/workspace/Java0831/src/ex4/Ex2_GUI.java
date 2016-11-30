package ex4;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
// ���� �⺻(Base, Container)���� ��ü�� �θ� �� ���ɼ��� ũ��.
// �̰� ������ �Ϲ� Ŭ������ �߻� Ŭ������ ��� ���� �� ����. (���� ���)
// �׷��� �������̽��� ���.
// �ڹٿ��� �������ִ� �������̽��� ����غ��� ��������
public class Ex2_GUI extends JFrame implements ActionListener {

    private JButton btn;
    private JPanel p1;

    public Ex2_GUI() {
        setTitle("Test!"); // ��ӹ��� �θ��� �޼��� ȣ��!
        // ��ư ��ü�� �����Ѵ�.
        btn = new JButton("Click");
        // ����ڰ� Ŭ���� ������ �̺�Ʈ�� �����ϴ� ������ ���
        btn.addActionListener(this); // ��ư�� Ŭ���ϴ°� ����.
        // ���� ȭ���� ����
        p1 = new JPanel();
        p1.setBackground(Color.red);
        add(p1); // JFrame�� ��ġ
        add(btn, "South"); // ���ʹ��⿡ ��ġ
        setBounds(100, 100, 300, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Ex2_GUI();
    }

    // �ݵ�� �������̽��� �߻� �޼��带 ������ �ؼ� ����ؾ� ��.
    // �׷��� ����ڴ� �������̽��� ���� �ֹ��ϰ� ����Ŭ������ ��üȭ(����)�Ѵ�.
    @Override
    public void actionPerformed(ActionEvent e) {
        p1.setBackground(Color.GREEN);
        System.out.println("Ŭ�� ^^");
    }
}
