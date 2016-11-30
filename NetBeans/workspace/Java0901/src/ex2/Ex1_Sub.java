package ex2;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// 인터페이스에서는 다중 구현이 된다.
// public class Ex1_Sub extends JFrame implements Ex1_InterA, Ex1_InterB {
// 다중 상속을 받은 인터페이스를 추가.
public class Ex1_Sub extends JFrame implements Ex1_InterC {
    private JButton btn, btn2; // 버튼
    private JPanel p1, p2; // 패널
    private JLabel lb; // 라벨
    public Ex1_Sub() {
        btn = new JButton("A본사 제품");
        btn2 = new JButton("B본사 제품");
        p1 = new JPanel();
        p1.add(btn);
        p1.add(btn2);
        add(p1, "North");
        p2 = new JPanel();
        lb = new JLabel();
        p2.add(lb);
        add(p2);
        // btn 색상 변경
        btn.setBackground(Color.pink);
        p2.setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 시스템 종료
        setBounds(100, 100, 300, 500); // 창의 좌표와 크기
        setVisible(true);
        // btn1, btn2에 이벤트 처리 : 사용자의 click 이벤트를 받아서 핸들링 하겠다.
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
        System.out.println("A지점의 메뉴를 요리합니다.");
        lb.setText("사용한 재료 : " + aResource());
    }
    @Override
    public void myBMethod() {
        System.out.println("B지점의 메뉴를 요리합니다.");
        lb.setText("사용한 재료 : " + bResource());
    }
}
