package ex1;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;

public class Ex1_Chat extends javax.swing.JFrame {

    private int x = -50, y = -50; // 캔버스에 그림의 좌표
    private int drawScale = 10;
    private String chkColor;
    private Color col; // 색상
    private CardLayout card; // 카드레이아웃 *****
    private Socket s; // 소켓의 주소
    private PrintWriter pw; // 서버로 전송할 스트림

    public Ex1_Chat() {
        initComponents();
        card = (CardLayout) pp.getLayout();
        col = Color.white;
        chkColor = "white";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pp = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnConnect = new javax.swing.JButton();
        hostv = new javax.swing.JTextField();
        portv = new javax.swing.JTextField();
        nickNamev = new javax.swing.JTextField();
        p2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgView = new javax.swing.JTextArea();
        canvas1 = new java.awt.Canvas() {
            @Override
            public void update(Graphics g) {
                paint(g);
            }

            @Override
            public void paint(Graphics g) {
                g.setColor(col);
                g.fillOval(x, y, drawScale, drawScale);
            }};
            jButton1 = new javax.swing.JButton();
            nick = new javax.swing.JLabel();
            chat = new javax.swing.JTextField();
            btnRed = new javax.swing.JButton();
            btnPink = new javax.swing.JButton();
            btnBlack = new javax.swing.JButton();
            btnErase = new javax.swing.JButton();
            jLabel5 = new javax.swing.JLabel();
            drawScalev = new javax.swing.JTextField();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            pp.setBackground(new java.awt.Color(255, 255, 255));
            pp.setLayout(new java.awt.CardLayout());

            p1.setBackground(new java.awt.Color(153, 255, 153));

            jLabel1.setText("IP : ");

            jLabel2.setText("PORT : ");

            jLabel3.setText("NickName : ");

            btnConnect.setText("접속");
            btnConnect.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnConnectActionPerformed(evt);
                }
            });

            hostv.setText("192.168.0.112");
            hostv.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    hostvActionPerformed(evt);
                }
            });

            portv.setText("9999");

            nickNamev.setText("배길동님");

            javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
            p1.setLayout(p1Layout);
            p1Layout.setHorizontalGroup(
                p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p1Layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGap(18, 18, 18)
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(hostv, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(portv, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nickNamev, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(150, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConnect)
                    .addGap(208, 208, 208))
            );
            p1Layout.setVerticalGroup(
                p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p1Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(hostv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(portv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(nickNamev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(56, 56, 56)
                    .addComponent(btnConnect)
                    .addContainerGap(167, Short.MAX_VALUE))
            );

            pp.add(p1, "c1");

            p2.setBackground(new java.awt.Color(255, 153, 255));

            msgView.setColumns(20);
            msgView.setRows(5);
            jScrollPane1.setViewportView(msgView);

            canvas1.setBackground(new java.awt.Color(255, 255, 255));
            canvas1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                public void mouseDragged(java.awt.event.MouseEvent evt) {
                    canvas1MouseDragged(evt);
                }
            });

            jButton1.setText("X");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            nick.setText("김길동님");

            chat.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    chatActionPerformed(evt);
                }
            });

            btnRed.setText("Red");
            btnRed.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnRedActionPerformed(evt);
                }
            });

            btnPink.setText("Pink");
            btnPink.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnPinkActionPerformed(evt);
                }
            });

            btnBlack.setText("Black");
            btnBlack.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnBlackActionPerformed(evt);
                }
            });

            btnErase.setText("지우개");
            btnErase.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnEraseActionPerformed(evt);
                }
            });

            jLabel5.setText("붓크기 : ");

            drawScalev.setText("10");
            drawScalev.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    drawScalevActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
            p2.setLayout(p2Layout);
            p2Layout.setHorizontalGroup(
                p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addGroup(p2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(p2Layout.createSequentialGroup()
                            .addComponent(nick)
                            .addGap(18, 18, 18)
                            .addComponent(chat, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(73, 73, 73))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)))
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(p2Layout.createSequentialGroup()
                            .addComponent(btnRed)
                            .addGap(18, 18, 18)
                            .addComponent(btnPink)
                            .addGap(18, 18, 18)
                            .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnBlack)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(drawScalev)
                                .addComponent(btnErase)))
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(42, Short.MAX_VALUE))
            );
            p2Layout.setVerticalGroup(
                p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nick)
                        .addComponent(chat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRed)
                        .addComponent(btnPink)
                        .addComponent(btnBlack)
                        .addComponent(btnErase))
                    .addGap(18, 18, 18)
                    .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(drawScalev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(52, 52, 52))
            );

            pp.add(p2, "c2");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        try {
            // 5. XXIP의 port 서버로 접속을 한다.
            s = new Socket(hostv.getText().trim(), Integer.parseInt(portv.getText()));
            pw = new PrintWriter(new BufferedOutputStream(s.getOutputStream()), true);
            pw.println(nickNamev.getText() + "/nothing/null/null/null");
            card.show(pp, "c2");
            // 10. 서버로 부터 sendMsg가 호출이 되어서 전송되어 온
            // 메세지를 받아서 프로토콜을 분석하여 클라이언트가 해야할
            // 일을 정의한 스레드 익명 내부 클래스임.
            new Thread(new Runnable() {
                private BufferedReader br = null;

                @Override
                public void run() {
                    try {
                        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                        while (true) {
                            String str = br.readLine();
                            StringTokenizer stz = new StringTokenizer(str, "/");
                            // 프로토콜을 분석해야 하는 구문
                            // talk/[null]xxx님/message
                            String token = stz.nextToken();
                            String token2 = stz.nextToken();
                            if (token.equals("talk")) {
                                String msg = "[" + token2 + "]"
                                        + stz.nextToken() + " : "
                                        + stz.nextToken();
                                msgView.append(msg + "\n");
                                msgView.setCaretPosition(msgView.getText().length());
                            } else if (token.equals("draw")) {
                                // 멤버필드에 있는 x, y에 값을 할당.
                                switch (token2) {
                                    case "red":
                                        col = Color.red;
                                        break;
                                    case "black":
                                        col = Color.black;
                                        break;
                                    case "pink":
                                        col = Color.pink;
                                        break;
                                    case "white":
                                        col = Color.white;
                                        break;
                                }
                                x = Integer.parseInt(stz.nextToken());
                                y = Integer.parseInt(stz.nextToken());
                                drawScale = Integer.parseInt(stz.nextToken());
                                canvas1.repaint();
                            } else {
                                nick.setText(token);
                            }
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }).start();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnConnectActionPerformed

    private void chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatActionPerformed
        // 7번 접속 후 사용자가 소켓을 통해서 메세지를 전달한다.
        // 서버의 ServerThread가 관리하는 Socket과 통신한다.
        // Output으로 보내면 / 서버에서는 InputStream으로 받는다.
        // talk/ : 임의로 약속된 서버와 클라이언트의 프로토콜이 된다.
        String msg = "talk/"
                + nickNamev.getText() + "/"
                + chat.getText()
                + "/null/null";
        pw.println(msg); // 소켓을 통해서 연결된 스트림으로 서버로 메세지를 송출!
        chat.setText("");
        chat.requestFocus(); // 커서를 처음으로 잡아줌.
    }//GEN-LAST:event_chatActionPerformed

    private void canvas1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseDragged
        String msg = "draw/"
                + chkColor + "/"
                + evt.getX() + "/"
                + evt.getY() + "/"
                + drawScale;
        pw.println(msg);
    }//GEN-LAST:event_canvas1MouseDragged

    private void hostvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hostvActionPerformed

    private void btnRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedActionPerformed
        chkColor = "red";
    }//GEN-LAST:event_btnRedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEraseActionPerformed
        chkColor = "white";
    }//GEN-LAST:event_btnEraseActionPerformed

    private void btnBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlackActionPerformed
        chkColor = "black";
    }//GEN-LAST:event_btnBlackActionPerformed

    private void btnPinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinkActionPerformed
        chkColor = "pink";
    }//GEN-LAST:event_btnPinkActionPerformed

    private void drawScalevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawScalevActionPerformed
        drawScale = Integer.parseInt(drawScalev.getText());
    }//GEN-LAST:event_drawScalevActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ex1_Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ex1_Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ex1_Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ex1_Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ex1_Chat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlack;
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnErase;
    private javax.swing.JButton btnPink;
    private javax.swing.JButton btnRed;
    private java.awt.Canvas canvas1;
    private javax.swing.JTextField chat;
    private javax.swing.JTextField drawScalev;
    private javax.swing.JTextField hostv;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea msgView;
    private javax.swing.JLabel nick;
    private javax.swing.JTextField nickNamev;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JTextField portv;
    private javax.swing.JPanel pp;
    // End of variables declaration//GEN-END:variables
}
