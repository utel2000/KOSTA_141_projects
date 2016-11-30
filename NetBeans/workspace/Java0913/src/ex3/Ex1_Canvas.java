package ex3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.event.MouseInputAdapter;

public class Ex1_Canvas extends JFrame{
    private int x = -100, y = -100;
    public Ex1_Canvas(){
        Canvas can = new Canvas(){
            @Override
            public void update(Graphics g) {
                paint(g);
            }

            @Override
            public void paint(Graphics g) {
                g.setColor(Color.red);
                g.fillOval(x, y, 10, 10);
            }
        };
        add(can);
        can.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e){
                x=e.getX();
                y=e.getY();
                can.repaint();
            }
        });        
    
        setBounds(100, 100, 600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Ex1_Canvas();
    }
}
