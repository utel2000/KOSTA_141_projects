package ex1;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex1_SelectDemo extends javax.swing.JFrame {

    private CardLayout card;
    private String url, user, password;

    // 1. Driver를 최초 1번만 로딩.(main()보다 빨리)
    static { // 스태틱 초기화 블럭.
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loading Surccess!");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public Ex1_SelectDemo() {
        url = "jdbc:oracle:thin:@localhost:1521:xe";
        user = "mykosta";
        password = "test00";
        initComponents();
        card = (CardLayout) pp.getLayout();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pp = new javax.swing.JPanel();
        empList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        emplistv = new javax.swing.JTextArea();
        showBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        empForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enamev = new javax.swing.JTextField();
        salv = new javax.swing.JTextField();
        addBtn2 = new javax.swing.JButton();
        listBtn = new javax.swing.JButton();
        jobv = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pp.setLayout(new java.awt.CardLayout());

        empList.setBackground(new java.awt.Color(153, 204, 255));

        emplistv.setColumns(20);
        emplistv.setRows(5);
        jScrollPane1.setViewportView(emplistv);

        showBtn.setText("showList");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        addBtn.setText("addEmp");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout empListLayout = new javax.swing.GroupLayout(empList);
        empList.setLayout(empListLayout);
        empListLayout.setHorizontalGroup(
            empListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empListLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empListLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showBtn)
                .addGap(23, 23, 23)
                .addComponent(addBtn)
                .addGap(42, 42, 42))
        );
        empListLayout.setVerticalGroup(
            empListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empListLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(empListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31))
        );

        pp.add(empList, "c1");

        empForm.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setText("이름 : ");

        jLabel2.setText("직책 :");

        jLabel3.setText("급여 :");

        addBtn2.setText("Add");
        addBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn2ActionPerformed(evt);
            }
        });

        listBtn.setText("List");
        listBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBtnActionPerformed(evt);
            }
        });

        jobv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "대리", "과장", "부장", "이사", "대표" }));

        javax.swing.GroupLayout empFormLayout = new javax.swing.GroupLayout(empForm);
        empForm.setLayout(empFormLayout);
        empFormLayout.setHorizontalGroup(
            empFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empFormLayout.createSequentialGroup()
                .addGroup(empFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empFormLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(enamev, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(empFormLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25)
                        .addComponent(salv, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(empFormLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(jobv, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empFormLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addBtn2)
                .addGap(35, 35, 35)
                .addComponent(listBtn)
                .addGap(194, 194, 194))
        );
        empFormLayout.setVerticalGroup(
            empFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empFormLayout.createSequentialGroup()
                .addGroup(empFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empFormLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1))
                    .addGroup(empFormLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(enamev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(empFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empFormLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empFormLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jobv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(empFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empFormLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3))
                    .addGroup(empFormLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(salv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(empFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empFormLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(addBtn2))
                    .addGroup(empFormLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(listBtn)))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        pp.add(empForm, "c2");

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
    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        empListAll();
    }//GEN-LAST:event_showBtnActionPerformed

    private void addBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn2ActionPerformed
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DriverManager.getConnection(url, user, password);
            // sequence 테이블에 번호를 증가시킨 값을 empno에 저장.
            // sequence.nextVal 하면 시퀀스가 1증가된 값.
            String sql = "insert into emp values (emp_seq.nextVal, ?, ?, 0, sysdate, ?, 0)";
            System.out.println(sql);
            pstmt = con.prepareStatement(sql);
            // pstmt.setter로 바인딩
            pstmt.setString(1, enamev.getText().trim());
            pstmt.setString(2, jobv.getSelectedItem().toString().trim());
            pstmt.setInt(3, Integer.parseInt(salv.getText().trim()));
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_addBtn2ActionPerformed

    private void listBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBtnActionPerformed
        card.show(pp, "c1");
        empListAll();
    }//GEN-LAST:event_listBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        card.show(pp, "c2");
    }//GEN-LAST:event_addBtnActionPerformed
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
            java.util.logging.Logger.getLogger(Ex1_SelectDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ex1_SelectDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ex1_SelectDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ex1_SelectDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ex1_SelectDemo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addBtn2;
    private javax.swing.JPanel empForm;
    private javax.swing.JPanel empList;
    private javax.swing.JTextArea emplistv;
    private javax.swing.JTextField enamev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jobv;
    private javax.swing.JButton listBtn;
    private javax.swing.JPanel pp;
    private javax.swing.JTextField salv;
    private javax.swing.JButton showBtn;
    // End of variables declaration//GEN-END:variables

    private void empListAll() {
        emplistv.setText("");
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // Connection
            con = DriverManager.getConnection(url, user, password);
            // Statement
            stmt = con.createStatement();
            // Query, ResultSet 커서를 반환
            String sql = "select empno, ename, job, hiredate from emp";
            rs = stmt.executeQuery(sql);
            // select된 데이터로부터 커서를 반복할 때 true
            while (rs.next()) {
                emplistv.append("번호 : " + rs.getInt("empno") + "\n");
                emplistv.append("이름 : " + rs.getString("ename") + "\n");
                emplistv.append("직책 : " + rs.getString("job") + "\n");
                emplistv.append("입사일 : " + rs.getString("hiredate") + "\n");
                emplistv.append("------------------------\n");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
