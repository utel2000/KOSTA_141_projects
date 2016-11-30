package ex1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex3_GuiExample extends JFrame implements ActionListener{
    private JButton btn1, btn2, btn3;
    private JPanel p1, p2;

    public Ex3_GuiExample() {
        p1 = new JPanel();
        p1.add(btn1 = new JButton("RED"));
        p1.add(btn2 = new JButton("BLUE"));
        p1.add(btn3 = new JButton("Orange"));
        btn1.setBackground(Color.red);
        btn2.setBackground(Color.blue);
        btn3.setBackground(Color.orange);
        // eventListener : addXXListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        add(p1, "North"); // 북쪽
        p2 = new JPanel();
        add(p2); // 중앙
        setTitle("나의 첫 스윙!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창닫기 클릭
        setBounds(100, 100, 300, 300); // x, y, w, h
        setVisible(true); // 창을 활성화
    }
    public static void main(String[] args) {
        new Ex3_GuiExample();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // 버튼 3개가 모두동작
        JButton b = (JButton) e.getSource();
        String msg = "";
        if (b == btn1) {
            msg = "버튼1";
        }else if(b==btn2){
            msg = "버튼2";
        }else if(b == btn3){
            msg = "버튼3";
        }
        setTitle(msg);
        // 클릭한 버튼의 색상을 가져옴
        Color col = b.getBackground();
        // 각 패널의 setter로 색상값을 설정
        p1.setBackground(col);
        p2.setBackground(col);
    }
}
