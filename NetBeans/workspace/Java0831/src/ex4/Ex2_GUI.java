package ex4;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
// 가장 기본(Base, Container)적인 객체가 부모가 될 가능성이 크다.
// 이것 때문에 일반 클래스나 추상 클래스를 상속 받을 수 없다. (단일 상속)
// 그래서 인터페이스를 사용.
// 자바에서 제공해주는 인터페이스를 사용해보고 느껴보기
public class Ex2_GUI extends JFrame implements ActionListener {

    private JButton btn;
    private JPanel p1;

    public Ex2_GUI() {
        setTitle("Test!"); // 상속받은 부모의 메서드 호출!
        // 버튼 객체를 생성한다.
        btn = new JButton("Click");
        // 사용자가 클릭할 때까지 이벤트를 감지하는 리스너 등록
        btn.addActionListener(this); // 버튼을 클릭하는걸 감지.
        // 작은 화면을 생성
        p1 = new JPanel();
        p1.setBackground(Color.red);
        add(p1); // JFrame에 배치
        add(btn, "South"); // 남쪽방향에 배치
        setBounds(100, 100, 300, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Ex2_GUI();
    }

    // 반드시 인터페이스의 추상 메서드를 재정의 해서 사용해야 함.
    // 그래야 사용자는 인터페이스를 보고 주문하고 구현클래스가 실체화(실현)한다.
    @Override
    public void actionPerformed(ActionEvent e) {
        p1.setBackground(Color.GREEN);
        System.out.println("클릭 ^^");
    }
}
