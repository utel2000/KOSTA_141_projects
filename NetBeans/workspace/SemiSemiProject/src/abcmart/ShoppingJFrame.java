package abcmart;

import dao.ProductDAO;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import model.JTableModel;
import vo.MemberVO;
import vo.OrderVO;
import vo.ProductVO;

public class ShoppingJFrame extends javax.swing.JFrame {

    // 패널을 전환시키기 위해 카드 레이아웃을 사용했으며
    // 각 카드를 전환시키기 위해 사용할 카드 레이아웃 객체.
    private CardLayout card;
    // 파트별로 구현함에 따라 로그인 된 회원세션을 가정할 회원번호. 
    private int memberNo;

    public ShoppingJFrame() {
        initComponents();
        // 프로그램 실행 시 타이틀 설정 및 카드 레이아웃 초기화.
        setTitle("ABC마트 - 로그인");
        card = (CardLayout) pp.getLayout();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pp = new javax.swing.JPanel();
        pLogin = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnSearchIdPwd = new javax.swing.JButton();
        btnJoin = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnUpdateMember = new javax.swing.JButton();
        idv = new javax.swing.JTextField();
        pwdv = new javax.swing.JTextField();
        pJoinMember = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        pJoinSuccess = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        pJoinFail = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        pSearchIdPwd = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        c2_namev1 = new javax.swing.JTextField();
        c2_telv1 = new javax.swing.JTextField();
        c2_idv2 = new javax.swing.JTextField();
        c2_telv2 = new javax.swing.JTextField();
        c2_namev2 = new javax.swing.JTextField();
        idsearchBtn = new javax.swing.JButton();
        pwsearchBtn = new javax.swing.JButton();
        pSearchIdSuccess = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pSearchIdFail = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pSearchPwdSuccess = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        pSearchPwdFail = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        pUpdateMember = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        pCSearchProduct = new javax.swing.JPanel();
        comboBrand = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableProductList1 = new javax.swing.JTable();
        comboUse = new javax.swing.JComboBox<>();
        productNamev = new javax.swing.JTextField();
        btnSearchProduct = new javax.swing.JButton();
        btnOrder1 = new javax.swing.JButton();
        radioLowPrice = new javax.swing.JRadioButton();
        radioHighPrice = new javax.swing.JRadioButton();
        btnBackToLogin = new javax.swing.JButton();
        btnToWish = new javax.swing.JButton();
        btnWish = new javax.swing.JButton();
        pCProductDetail = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        labelProduct = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        spinnerSelectQty = new javax.swing.JSpinner();
        btnOrder3 = new javax.swing.JButton();
        btnWish2 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        btnBackToPcproduct = new javax.swing.JButton();
        pCWish = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableWish = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        orderQtyv = new javax.swing.JTextField();
        btnModifyQty = new javax.swing.JButton();
        btnOrder2 = new javax.swing.JButton();
        btnBackToSearchProduct = new javax.swing.JButton();
        pCCompleteOrder = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnToLogin = new javax.swing.JButton();
        pSMain = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        pSMember = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        pSOrder = new javax.swing.JPanel();
        btnRemoveOrder = new javax.swing.JButton();
        btnBackToPsmain2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableSupervisorShowOrderList = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        pSProduct = new javax.swing.JPanel();
        btnProductReset = new javax.swing.JButton();
        btnRemoveProduct = new javax.swing.JButton();
        btnAddProduct = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        additionalQtyv = new javax.swing.JTextField();
        btnCallAdditionalProduct = new javax.swing.JButton();
        btnBackToPsmain3 = new javax.swing.JButton();
        pSAddProduct = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        imgPathv = new javax.swing.JTextField();
        btnAddNewImage = new javax.swing.JButton();
        brandv = new javax.swing.JTextField();
        newQtyv = new javax.swing.JTextField();
        productv = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        btnAddNewProduct = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pp.setLayout(new java.awt.CardLayout());

        jLabel15.setFont(new java.awt.Font("굴림", 0, 36)); // NOI18N
        jLabel15.setText("ID  :");

        jLabel16.setFont(new java.awt.Font("굴림", 0, 36)); // NOI18N
        jLabel16.setText("PW :");

        btnSearchIdPwd.setText("아이디/비밀번호 찾기");
        btnSearchIdPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIdPwdActionPerformed(evt);
            }
        });

        btnJoin.setText("회원가입");
        btnJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinActionPerformed(evt);
            }
        });

        btnLogin.setText("로그인");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnUpdateMember.setText("회원 정보 수정");

        javax.swing.GroupLayout pLoginLayout = new javax.swing.GroupLayout(pLogin);
        pLogin.setLayout(pLoginLayout);
        pLoginLayout.setHorizontalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pLoginLayout.createSequentialGroup()
                        .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pLoginLayout.createSequentialGroup()
                                .addGap(267, 267, 267)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pLoginLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))
                        .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pLoginLayout.createSequentialGroup()
                                .addComponent(btnSearchIdPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnUpdateMember, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(btnJoin, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(idv)
                            .addComponent(pwdv))))
                .addContainerGap(681, Short.MAX_VALUE))
        );
        pLoginLayout.setVerticalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pLoginLayout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(pwdv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdateMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnJoin, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(btnSearchIdPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pLoginLayout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(282, Short.MAX_VALUE))
        );

        pp.add(pLogin, "c_login");

        pJoinMember.setForeground(new java.awt.Color(204, 204, 255));
        pJoinMember.setDoubleBuffered(false);

        jLabel48.setFont(new java.awt.Font("새굴림", 1, 16)); // NOI18N
        jLabel48.setText("아이디");

        jLabel49.setFont(new java.awt.Font("새굴림", 1, 16)); // NOI18N
        jLabel49.setText("비밀번호");

        jLabel50.setFont(new java.awt.Font("새굴림", 1, 16)); // NOI18N
        jLabel50.setText("비밀번호 확인");

        jLabel51.setFont(new java.awt.Font("새굴림", 1, 16)); // NOI18N
        jLabel51.setText("휴대전화");

        jLabel52.setFont(new java.awt.Font("새굴림", 1, 16)); // NOI18N
        jLabel52.setText("주  소");

        jLabel53.setFont(new java.awt.Font("새굴림", 1, 16)); // NOI18N
        jLabel53.setText("이메일");

        jLabel54.setFont(new java.awt.Font("새굴림", 1, 16)); // NOI18N
        jLabel54.setText("이  름");

        jButton17.setText("중복확인");

        jButton18.setText("등록하기");

        javax.swing.GroupLayout pJoinMemberLayout = new javax.swing.GroupLayout(pJoinMember);
        pJoinMember.setLayout(pJoinMemberLayout);
        pJoinMemberLayout.setHorizontalGroup(
            pJoinMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pJoinMemberLayout.createSequentialGroup()
                .addContainerGap(709, Short.MAX_VALUE)
                .addGroup(pJoinMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pJoinMemberLayout.createSequentialGroup()
                        .addGroup(pJoinMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel53)
                            .addComponent(jLabel51)
                            .addComponent(jLabel50)
                            .addComponent(jLabel49)
                            .addGroup(pJoinMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel54)
                                .addComponent(jLabel52)
                                .addComponent(jLabel48)))
                        .addGap(18, 18, 18)
                        .addGroup(pJoinMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pJoinMemberLayout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pJoinMemberLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(561, 561, 561))
        );
        pJoinMemberLayout.setVerticalGroup(
            pJoinMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pJoinMemberLayout.createSequentialGroup()
                .addContainerGap(388, Short.MAX_VALUE)
                .addGroup(pJoinMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel54)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pJoinMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pJoinMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pJoinMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pJoinMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pJoinMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pJoinMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pJoinMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
        );

        pp.add(pJoinMember, "card2");

        jLabel45.setFont(new java.awt.Font("안상수2006중간", 3, 24)); // NOI18N
        jLabel45.setText("회원가입에 성공 하셨습니다");

        jButton11.setText("로그인 화면으로");

        jButton12.setText("Home으로");

        javax.swing.GroupLayout pJoinSuccessLayout = new javax.swing.GroupLayout(pJoinSuccess);
        pJoinSuccess.setLayout(pJoinSuccessLayout);
        pJoinSuccessLayout.setHorizontalGroup(
            pJoinSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pJoinSuccessLayout.createSequentialGroup()
                .addContainerGap(868, Short.MAX_VALUE)
                .addGroup(pJoinSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pJoinSuccessLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(pJoinSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton11)
                            .addGroup(pJoinSuccessLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jButton12)))))
                .addGap(638, 638, 638))
        );
        pJoinSuccessLayout.setVerticalGroup(
            pJoinSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pJoinSuccessLayout.createSequentialGroup()
                .addContainerGap(446, Short.MAX_VALUE)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addGap(429, 429, 429))
        );

        pp.add(pJoinSuccess, "card3");

        jLabel55.setFont(new java.awt.Font("안상수2006중간", 3, 24)); // NOI18N
        jLabel55.setText("회원 가입에 실패하셨습니다");

        jButton19.setText("뒤로가기");

        jButton20.setText("Home으로");

        javax.swing.GroupLayout pJoinFailLayout = new javax.swing.GroupLayout(pJoinFail);
        pJoinFail.setLayout(pJoinFailLayout);
        pJoinFailLayout.setHorizontalGroup(
            pJoinFailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pJoinFailLayout.createSequentialGroup()
                .addContainerGap(811, Short.MAX_VALUE)
                .addGroup(pJoinFailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pJoinFailLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton19))
                    .addGroup(pJoinFailLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jButton20)))
                .addGap(695, 695, 695))
        );
        pJoinFailLayout.setVerticalGroup(
            pJoinFailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pJoinFailLayout.createSequentialGroup()
                .addContainerGap(470, Short.MAX_VALUE)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton19)
                .addGap(16, 16, 16)
                .addComponent(jButton20)
                .addGap(418, 418, 418))
        );

        pp.add(pJoinFail, "card4");

        jLabel21.setText("아이디찾기");

        jLabel26.setText("이름");

        jLabel29.setText("휴대전화");

        jLabel30.setText("비밀번호 찾기");

        jLabel31.setText("이름");

        jLabel32.setText("아이디");

        jLabel33.setText("휴대전화");

        idsearchBtn.setText("확인");

        pwsearchBtn.setText("확인");

        javax.swing.GroupLayout pSearchIdPwdLayout = new javax.swing.GroupLayout(pSearchIdPwd);
        pSearchIdPwd.setLayout(pSearchIdPwdLayout);
        pSearchIdPwdLayout.setHorizontalGroup(
            pSearchIdPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSearchIdPwdLayout.createSequentialGroup()
                .addContainerGap(623, Short.MAX_VALUE)
                .addGroup(pSearchIdPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pSearchIdPwdLayout.createSequentialGroup()
                        .addGroup(pSearchIdPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel29)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33))
                        .addGap(69, 69, 69)
                        .addGroup(pSearchIdPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c2_telv2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2_namev2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pSearchIdPwdLayout.createSequentialGroup()
                                .addGroup(pSearchIdPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c2_telv1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c2_namev1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c2_idv2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(pSearchIdPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pwsearchBtn)
                                    .addComponent(idsearchBtn))))))
                .addGap(618, 618, 618))
        );
        pSearchIdPwdLayout.setVerticalGroup(
            pSearchIdPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSearchIdPwdLayout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pSearchIdPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pSearchIdPwdLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pSearchIdPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(c2_namev1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pSearchIdPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(c2_telv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pSearchIdPwdLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(idsearchBtn)))
                .addGap(44, 44, 44)
                .addComponent(jLabel30)
                .addGap(27, 27, 27)
                .addGroup(pSearchIdPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(c2_namev2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pSearchIdPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(c2_idv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwsearchBtn))
                .addGap(18, 18, 18)
                .addGroup(pSearchIdPwdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(c2_telv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(402, Short.MAX_VALUE))
        );

        pp.add(pSearchIdPwd, "card2");

        pSearchIdSuccess.setForeground(new java.awt.Color(240, 240, 240));

        jLabel34.setText("회원님의 아이디는");

        jLabel35.setText("입니다");

        jLabel36.setText("ID변수");

        jButton1.setText("로그인 화면으로");

        javax.swing.GroupLayout pSearchIdSuccessLayout = new javax.swing.GroupLayout(pSearchIdSuccess);
        pSearchIdSuccess.setLayout(pSearchIdSuccessLayout);
        pSearchIdSuccessLayout.setHorizontalGroup(
            pSearchIdSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSearchIdSuccessLayout.createSequentialGroup()
                .addContainerGap(828, Short.MAX_VALUE)
                .addGroup(pSearchIdSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSearchIdSuccessLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel36)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel35)
                        .addGap(610, 610, 610))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSearchIdSuccessLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(694, 694, 694))))
        );
        pSearchIdSuccessLayout.setVerticalGroup(
            pSearchIdSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSearchIdSuccessLayout.createSequentialGroup()
                .addContainerGap(476, Short.MAX_VALUE)
                .addGroup(pSearchIdSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addGap(114, 114, 114)
                .addComponent(jButton1)
                .addGap(388, 388, 388))
        );

        pp.add(pSearchIdSuccess, "card3");

        pSearchIdFail.setForeground(new java.awt.Color(240, 240, 240));

        jLabel37.setText("등록되지 않은 회원입니다.");

        jButton2.setText("로그인화면");

        jButton3.setText("회원가입");

        javax.swing.GroupLayout pSearchIdFailLayout = new javax.swing.GroupLayout(pSearchIdFail);
        pSearchIdFail.setLayout(pSearchIdFailLayout);
        pSearchIdFailLayout.setHorizontalGroup(
            pSearchIdFailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSearchIdFailLayout.createSequentialGroup()
                .addGap(782, 782, 782)
                .addGroup(pSearchIdFailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addGroup(pSearchIdFailLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(pSearchIdFailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(788, Short.MAX_VALUE))
        );
        pSearchIdFailLayout.setVerticalGroup(
            pSearchIdFailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSearchIdFailLayout.createSequentialGroup()
                .addContainerGap(486, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addGap(64, 64, 64)
                .addComponent(jButton3)
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addGap(375, 375, 375))
        );

        pp.add(pSearchIdFail, "card4");

        pSearchPwdSuccess.setForeground(new java.awt.Color(240, 240, 240));

        jLabel56.setText("회원님의 비밀번호는");

        jLabel57.setText("입니다");

        jLabel58.setText("PWD변수");

        jButton21.setText("로그인 화면으로");

        javax.swing.GroupLayout pSearchPwdSuccessLayout = new javax.swing.GroupLayout(pSearchPwdSuccess);
        pSearchPwdSuccess.setLayout(pSearchPwdSuccessLayout);
        pSearchPwdSuccessLayout.setHorizontalGroup(
            pSearchPwdSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSearchPwdSuccessLayout.createSequentialGroup()
                .addContainerGap(793, Short.MAX_VALUE)
                .addGroup(pSearchPwdSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSearchPwdSuccessLayout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel58)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel57)
                        .addGap(610, 610, 610))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSearchPwdSuccessLayout.createSequentialGroup()
                        .addComponent(jButton21)
                        .addGap(694, 694, 694))))
        );
        pSearchPwdSuccessLayout.setVerticalGroup(
            pSearchPwdSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSearchPwdSuccessLayout.createSequentialGroup()
                .addContainerGap(476, Short.MAX_VALUE)
                .addGroup(pSearchPwdSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(jLabel58))
                .addGap(114, 114, 114)
                .addComponent(jButton21)
                .addGap(388, 388, 388))
        );

        pp.add(pSearchPwdSuccess, "card3");

        pSearchPwdFail.setForeground(new java.awt.Color(240, 240, 240));

        jLabel38.setText("등록하신 정보와 일치하지 않습니다.");

        jButton4.setText("뒤로가기");

        javax.swing.GroupLayout pSearchPwdFailLayout = new javax.swing.GroupLayout(pSearchPwdFail);
        pSearchPwdFail.setLayout(pSearchPwdFailLayout);
        pSearchPwdFailLayout.setHorizontalGroup(
            pSearchPwdFailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSearchPwdFailLayout.createSequentialGroup()
                .addContainerGap(859, Short.MAX_VALUE)
                .addGroup(pSearchPwdFailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addGroup(pSearchPwdFailLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton4)))
                .addGap(650, 650, 650))
        );
        pSearchPwdFailLayout.setVerticalGroup(
            pSearchPwdFailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSearchPwdFailLayout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jButton4)
                .addContainerGap(464, Short.MAX_VALUE))
        );

        pp.add(pSearchPwdFail, "card5");

        pUpdateMember.setForeground(new java.awt.Color(240, 240, 240));

        jLabel39.setText("아이디");

        jLabel40.setText("비밀번호");

        jLabel41.setText("주소");

        jLabel42.setText("연락처");

        jLabel43.setText("이메일");

        jLabel44.setText("id변수");

        jButton5.setText("수정하기");

        jButton6.setText("수정하기");

        jButton7.setText("수정하기");

        jButton8.setText("수정하기");

        jButton9.setText("탈퇴");

        javax.swing.GroupLayout pUpdateMemberLayout = new javax.swing.GroupLayout(pUpdateMember);
        pUpdateMember.setLayout(pUpdateMemberLayout);
        pUpdateMemberLayout.setHorizontalGroup(
            pUpdateMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUpdateMemberLayout.createSequentialGroup()
                .addContainerGap(1176, Short.MAX_VALUE)
                .addGroup(pUpdateMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pUpdateMemberLayout.createSequentialGroup()
                        .addGroup(pUpdateMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addGroup(pUpdateMemberLayout.createSequentialGroup()
                                .addGroup(pUpdateMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel43))
                                .addGap(66, 66, 66)
                                .addGroup(pUpdateMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel44)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(59, 59, 59)
                        .addGroup(pUpdateMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(jButton5)
                            .addComponent(jButton7)
                            .addComponent(jButton8)))
                    .addGroup(pUpdateMemberLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jButton9)))
                .addGap(85, 85, 85))
        );
        pUpdateMemberLayout.setVerticalGroup(
            pUpdateMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUpdateMemberLayout.createSequentialGroup()
                .addContainerGap(645, Short.MAX_VALUE)
                .addGroup(pUpdateMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel44))
                .addGap(24, 24, 24)
                .addGroup(pUpdateMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(24, 24, 24)
                .addGroup(pUpdateMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(26, 26, 26)
                .addGroup(pUpdateMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(26, 26, 26)
                .addGroup(pUpdateMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addGap(51, 51, 51)
                .addComponent(jButton9)
                .addGap(74, 74, 74))
        );

        pp.add(pUpdateMember, "card6");

        pCSearchProduct.setForeground(new java.awt.Color(240, 240, 240));

        comboBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[브랜드]", "나이키", "아디다스", "리복", "소다" }));
        comboBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBrandActionPerformed(evt);
            }
        });

        tableProductList1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tableProductList1);

        comboUse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[용도]", "운동화", "샌들", "부츠", "구두" }));

        btnSearchProduct.setText("검색");
        btnSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchProductActionPerformed(evt);
            }
        });

        btnOrder1.setText("주문하기");
        btnOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrder1ActionPerformed(evt);
            }
        });

        radioLowPrice.setText("낮은가격순");
        radioLowPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLowPriceActionPerformed(evt);
            }
        });

        radioHighPrice.setText("높은가격순");
        radioHighPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHighPriceActionPerformed(evt);
            }
        });

        btnBackToLogin.setText("뒤로가기");
        btnBackToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToLoginActionPerformed(evt);
            }
        });

        btnToWish.setText("장바구니");
        btnToWish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToWishActionPerformed(evt);
            }
        });

        btnWish.setText("찜");
        btnWish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCSearchProductLayout = new javax.swing.GroupLayout(pCSearchProduct);
        pCSearchProduct.setLayout(pCSearchProductLayout);
        pCSearchProductLayout.setHorizontalGroup(
            pCSearchProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCSearchProductLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCSearchProductLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pCSearchProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCSearchProductLayout.createSequentialGroup()
                        .addComponent(comboBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(comboUse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(productNamev, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnSearchProduct)
                        .addGap(553, 553, 553))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCSearchProductLayout.createSequentialGroup()
                        .addComponent(btnWish, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnToWish)
                        .addGap(30, 30, 30)
                        .addComponent(btnOrder1)
                        .addGap(18, 18, 18)
                        .addComponent(btnBackToLogin)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCSearchProductLayout.createSequentialGroup()
                        .addComponent(radioLowPrice)
                        .addGap(18, 18, 18)
                        .addComponent(radioHighPrice)
                        .addGap(473, 473, 473))))
        );
        pCSearchProductLayout.setVerticalGroup(
            pCSearchProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCSearchProductLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(pCSearchProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productNamev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboUse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchProduct))
                .addGap(48, 48, 48)
                .addGroup(pCSearchProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioLowPrice)
                    .addComponent(radioHighPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pCSearchProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrder1)
                    .addComponent(btnBackToLogin)
                    .addComponent(btnToWish)
                    .addComponent(btnWish))
                .addGap(51, 51, 51))
        );

        pp.add(pCSearchProduct, "c_searchProduct");

        jLabel25.setText("상품명 :");

        labelProduct.setText("티셔츠A");

        jLabel27.setText("수 량 :");

        btnOrder3.setText("주문하기");

        btnWish2.setText("찜하기");

        jLabel28.setText("상품상세보기");

        btnBackToPcproduct.setText("뒤로가기");

        javax.swing.GroupLayout pCProductDetailLayout = new javax.swing.GroupLayout(pCProductDetail);
        pCProductDetail.setLayout(pCProductDetailLayout);
        pCProductDetailLayout.setHorizontalGroup(
            pCProductDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCProductDetailLayout.createSequentialGroup()
                .addComponent(jLabel28)
                .addGap(0, 1655, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCProductDetailLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pCProductDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCProductDetailLayout.createSequentialGroup()
                        .addGroup(pCProductDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCProductDetailLayout.createSequentialGroup()
                                .addComponent(btnWish2)
                                .addGap(85, 85, 85)
                                .addComponent(btnOrder3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCProductDetailLayout.createSequentialGroup()
                                .addGroup(pCProductDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pCProductDetailLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel27)
                                        .addGap(83, 83, 83)
                                        .addComponent(spinnerSelectQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pCProductDetailLayout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(62, 62, 62)
                                        .addComponent(labelProduct)))
                                .addGap(48, 48, 48)))
                        .addGap(612, 612, 612))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCProductDetailLayout.createSequentialGroup()
                        .addComponent(btnBackToPcproduct)
                        .addGap(701, 701, 701))))
        );
        pCProductDetailLayout.setVerticalGroup(
            pCProductDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCProductDetailLayout.createSequentialGroup()
                .addComponent(jLabel28)
                .addGap(250, 250, 250)
                .addGroup(pCProductDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(labelProduct))
                .addGroup(pCProductDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCProductDetailLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel27))
                    .addGroup(pCProductDetailLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(spinnerSelectQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(pCProductDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWish2)
                    .addComponent(btnOrder3))
                .addGap(209, 209, 209)
                .addComponent(btnBackToPcproduct)
                .addGap(0, 345, Short.MAX_VALUE))
        );

        pp.add(pCProductDetail, "c_productDetail");

        tableWish.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableWish);

        jLabel13.setText("선택한 항목의 수량 :");

        btnModifyQty.setText("수정");
        btnModifyQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQtyActionPerformed(evt);
            }
        });

        btnOrder2.setText("주문하기");
        btnOrder2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrder2ActionPerformed(evt);
            }
        });

        btnBackToSearchProduct.setText("뒤로가기");
        btnBackToSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToSearchProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCWishLayout = new javax.swing.GroupLayout(pCWish);
        pCWish.setLayout(pCWishLayout);
        pCWishLayout.setHorizontalGroup(
            pCWishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCWishLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(pCWishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pCWishLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(pCWishLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(27, 27, 27)
                        .addComponent(orderQtyv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnModifyQty)
                        .addGap(97, 97, 97)
                        .addComponent(btnOrder2)
                        .addGap(18, 18, 18)
                        .addComponent(btnBackToSearchProduct)
                        .addGap(82, 82, 82))))
        );
        pCWishLayout.setVerticalGroup(
            pCWishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCWishLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(pCWishLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(orderQtyv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyQty)
                    .addComponent(btnOrder2)
                    .addComponent(btnBackToSearchProduct))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        pp.add(pCWish, "c_wish");

        jLabel2.setFont(new java.awt.Font("굴림", 0, 30)); // NOI18N
        jLabel2.setText("▶ 주문해주셔서 감사합니다!");

        jLabel3.setFont(new java.awt.Font("굴림", 0, 30)); // NOI18N
        jLabel3.setText("최대한 빠르게 배송하겠습니다.");

        jLabel4.setFont(new java.awt.Font("굴림", 1, 20)); // NOI18N
        jLabel4.setText("담당 : 김수환 강사님");

        jLabel5.setFont(new java.awt.Font("굴림", 1, 20)); // NOI18N
        jLabel5.setText("<C조>");

        jLabel6.setFont(new java.awt.Font("굴림", 1, 20)); // NOI18N
        jLabel6.setText("송명진");

        jLabel7.setFont(new java.awt.Font("굴림", 1, 20)); // NOI18N
        jLabel7.setText("이지원");

        jLabel8.setFont(new java.awt.Font("굴림", 1, 20)); // NOI18N
        jLabel8.setText("배성호");

        jLabel9.setFont(new java.awt.Font("굴림", 1, 20)); // NOI18N
        jLabel9.setText("김승용");

        jLabel10.setFont(new java.awt.Font("굴림", 1, 20)); // NOI18N
        jLabel10.setText("황호건");

        jLabel11.setFont(new java.awt.Font("굴림", 1, 20)); // NOI18N
        jLabel11.setText("이알찬");

        jLabel12.setFont(new java.awt.Font("굴림", 1, 20)); // NOI18N
        jLabel12.setText("한예지");

        btnToLogin.setText("홈으로");
        btnToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCCompleteOrderLayout = new javax.swing.GroupLayout(pCCompleteOrder);
        pCCompleteOrder.setLayout(pCCompleteOrderLayout);
        pCCompleteOrderLayout.setHorizontalGroup(
            pCCompleteOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCCompleteOrderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pCCompleteOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCCompleteOrderLayout.createSequentialGroup()
                        .addGroup(pCCompleteOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(pCCompleteOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pCCompleteOrderLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11))
                                .addGroup(pCCompleteOrderLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10))
                                .addGroup(pCCompleteOrderLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(38, 38, 38)
                                    .addComponent(jLabel8))))
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCCompleteOrderLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(246, 246, 246))))
            .addGroup(pCCompleteOrderLayout.createSequentialGroup()
                .addGroup(pCCompleteOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCCompleteOrderLayout.createSequentialGroup()
                        .addGap(600, 600, 600)
                        .addComponent(jLabel2))
                    .addGroup(pCCompleteOrderLayout.createSequentialGroup()
                        .addGap(643, 643, 643)
                        .addComponent(jLabel3))
                    .addGroup(pCCompleteOrderLayout.createSequentialGroup()
                        .addGap(778, 778, 778)
                        .addComponent(btnToLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(676, Short.MAX_VALUE))
        );
        pCCompleteOrderLayout.setVerticalGroup(
            pCCompleteOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCCompleteOrderLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(119, 119, 119)
                .addComponent(btnToLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addGroup(pCCompleteOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCCompleteOrderLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addGroup(pCCompleteOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(pCCompleteOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCCompleteOrderLayout.createSequentialGroup()
                        .addGroup(pCCompleteOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(20, 20, 20)))
                .addComponent(jLabel12)
                .addGap(46, 46, 46))
        );

        pp.add(pCCompleteOrder, "c_completeOrder");

        jLabel46.setFont(new java.awt.Font("굴림", 1, 14)); // NOI18N
        jLabel46.setText("안녕하세요 관리자");

        jLabel47.setFont(new java.awt.Font("굴림", 1, 14)); // NOI18N
        jLabel47.setText("님");

        jButton13.setText("회 원 관 리");

        jButton14.setText("주 문 관 리");

        jButton15.setText("상품관리 조회");

        javax.swing.GroupLayout pSMainLayout = new javax.swing.GroupLayout(pSMain);
        pSMain.setLayout(pSMainLayout);
        pSMainLayout.setHorizontalGroup(
            pSMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSMainLayout.createSequentialGroup()
                .addContainerGap(803, Short.MAX_VALUE)
                .addGroup(pSMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSMainLayout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(508, 508, 508))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSMainLayout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel47)
                        .addGap(591, 591, 591))))
        );
        pSMainLayout.setVerticalGroup(
            pSMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSMainLayout.createSequentialGroup()
                .addContainerGap(461, Short.MAX_VALUE)
                .addGroup(pSMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(pSMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(416, 416, 416))
        );

        pp.add(pSMain, "card5");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jTable3);

        jButton16.setText("강제탈퇴");

        jTextField9.setFont(new java.awt.Font("굴림", 2, 12)); // NOI18N
        jTextField9.setText("search");

        javax.swing.GroupLayout pSMemberLayout = new javax.swing.GroupLayout(pSMember);
        pSMember.setLayout(pSMemberLayout);
        pSMemberLayout.setHorizontalGroup(
            pSMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSMemberLayout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addGroup(pSMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSMemberLayout.createSequentialGroup()
                        .addGroup(pSMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSMemberLayout.createSequentialGroup()
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSMemberLayout.createSequentialGroup()
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))))
        );
        pSMemberLayout.setVerticalGroup(
            pSMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSMemberLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton16)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        pp.add(pSMember, "card6");

        btnRemoveOrder.setText("주문삭제");

        btnBackToPsmain2.setText("뒤로가기");

        tableSupervisorShowOrderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tableSupervisorShowOrderList);

        jLabel17.setFont(new java.awt.Font("굴림", 0, 18)); // NOI18N
        jLabel17.setText("주문관리조회");

        javax.swing.GroupLayout pSOrderLayout = new javax.swing.GroupLayout(pSOrder);
        pSOrder.setLayout(pSOrderLayout);
        pSOrderLayout.setHorizontalGroup(
            pSOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSOrderLayout.createSequentialGroup()
                .addGroup(pSOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pSOrderLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pSOrderLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSOrderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBackToPsmain2)
                .addGap(42, 42, 42)
                .addComponent(btnRemoveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        pSOrderLayout.setVerticalGroup(
            pSOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSOrderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel17)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addGroup(pSOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveOrder)
                    .addComponent(btnBackToPsmain2))
                .addGap(94, 94, 94))
        );

        pp.add(pSOrder, "card5");

        btnProductReset.setText("상품관리초기화");
        btnProductReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductResetActionPerformed(evt);
            }
        });

        btnRemoveProduct.setText("상품삭제");

        btnAddProduct.setText("상품추가");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTable2);

        jLabel18.setText("상품관리조회");

        additionalQtyv.setText("2");

        btnCallAdditionalProduct.setText("추가발주");

        btnBackToPsmain3.setText("뒤로가기");

        javax.swing.GroupLayout pSProductLayout = new javax.swing.GroupLayout(pSProduct);
        pSProduct.setLayout(pSProductLayout);
        pSProductLayout.setHorizontalGroup(
            pSProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSProductLayout.createSequentialGroup()
                .addGroup(pSProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pSProductLayout.createSequentialGroup()
                        .addGap(702, 702, 702)
                        .addComponent(btnBackToPsmain3))
                    .addGroup(pSProductLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSProductLayout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addGroup(pSProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSProductLayout.createSequentialGroup()
                        .addComponent(btnAddProduct)
                        .addGap(41, 41, 41)
                        .addComponent(btnRemoveProduct)
                        .addGap(102, 102, 102)
                        .addComponent(btnProductReset))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(additionalQtyv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCallAdditionalProduct)
                .addGap(149, 149, 149))
        );
        pSProductLayout.setVerticalGroup(
            pSProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSProductLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addGroup(pSProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSProductLayout.createSequentialGroup()
                        .addGroup(pSProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCallAdditionalProduct)
                            .addComponent(additionalQtyv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(423, 423, 423))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSProductLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(pSProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProductReset)
                    .addGroup(pSProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddProduct)
                        .addComponent(btnRemoveProduct)))
                .addGap(107, 107, 107)
                .addComponent(btnBackToPsmain3)
                .addContainerGap())
        );

        pp.add(pSProduct, "card6");

        jLabel19.setText("상품명");

        jLabel20.setText("수량");

        jLabel22.setText("브랜드");

        jLabel23.setText("이미지");

        btnAddNewImage.setText("이미지 등록");

        jLabel24.setText("상품추가메뉴");

        btnAddNewProduct.setText("등록");
        btnAddNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSAddProductLayout = new javax.swing.GroupLayout(pSAddProduct);
        pSAddProduct.setLayout(pSAddProductLayout);
        pSAddProductLayout.setHorizontalGroup(
            pSAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSAddProductLayout.createSequentialGroup()
                .addGroup(pSAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pSAddProductLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel24))
                    .addGroup(pSAddProductLayout.createSequentialGroup()
                        .addGap(647, 647, 647)
                        .addGroup(pSAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pSAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel23))
                        .addGap(41, 41, 41)
                        .addGroup(pSAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brandv, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productv, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pSAddProductLayout.createSequentialGroup()
                                .addGroup(pSAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAddNewProduct)
                                    .addComponent(imgPathv, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addComponent(btnAddNewImage)))))
                .addContainerGap(324, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSAddProductLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(newQtyv, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(484, 484, 484))
        );
        pSAddProductLayout.setVerticalGroup(
            pSAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSAddProductLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel24)
                .addGap(218, 218, 218)
                .addGroup(pSAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(productv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pSAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newQtyv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pSAddProductLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(pSAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(brandv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pSAddProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(imgPathv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddNewImage))
                .addGap(40, 40, 40)
                .addComponent(btnAddNewProduct)
                .addContainerGap(510, Short.MAX_VALUE))
        );

        pp.add(pSAddProduct, "card7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnSearchIdPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIdPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchIdPwdActionPerformed
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // 로그인 버튼을 누르면 회원을 인식하여 사용자의 물품검색 페이지로 전환.
        try {
            memberNo = Integer.parseInt(idv.getText());
            idv.setText("");
            idv.requestFocus();
            card.show(pp, "c_searchProduct");
            setTitle("ABC마트 - 물품검색");
            showProductList();
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "올바른 회원번호(숫자)를 입력하세요.", "오류", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnLoginActionPerformed
    private void btnOrder2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrder2ActionPerformed
        // 주문 완료 페이지로 이동.
        card.show(pp, "c_completeOrder");
        setTitle("ABC마트 - 주문완료");
    }//GEN-LAST:event_btnOrder2ActionPerformed
    private void btnProductResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductResetActionPerformed

    private void btnAddNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNewProductActionPerformed

    private void btnSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchProductActionPerformed
        // 물품목록을 출력하는 메서드 실행.
        // 그 후 검색 버튼을 누르면 물품명 란을 비워주면서 커서를 위치시켜준다.
        showProductList();
        productNamev.setText("");
        productNamev.requestFocus();
    }//GEN-LAST:event_btnSearchProductActionPerformed
    // 사용자가 설정한 각 조건을 체크한 후
    // DAO를 통해 DB에 접근한 후 SQL문을 실행하여 받아온 값을
    // ArrayList와 VO객체로 받아서 테이블에 출력.
    private void showProductList() {
        String name = productNamev.getText();
        String brand = comboBrand.getSelectedItem().toString();
        String use = comboUse.getSelectedItem().toString();
        String chkCondition = "nothing";
        String chkSort = "nothing";
        ProductVO pv = new ProductVO();
        // 제품명 확인
        if (!productNamev.getText().isEmpty()) {
            pv.setPdname(name);
        }
        // 브랜드 확인
        if (comboBrand.getSelectedIndex() != 0) {
            pv.setPdbrand(brand);
        }
        // 용도 확인
        if (comboUse.getSelectedIndex() != 0) {
            pv.setPduse(use);
        }
        // 정렬 여부 확인
        if (radioLowPrice.isSelected()) {
            chkSort = "low";
        } else if (radioHighPrice.isSelected()) {
            chkSort = "high";
        }
        ArrayList<ProductVO> productList = ProductDAO.getDao().productSearch(pv, chkSort);
        String[] c_name = {"제품번호", "제품이름", "브랜드", "제품수량", "용도분류", "제품가격", "입고일"};
        String[][] data = new String[productList.size()][c_name.length];
        String[][] emptyData = new String[1][c_name.length];
        int i = 0;
        // 향상된 for문으로 한 row씩 테이블에 들어갈 값을 data에 저장.
        for (ProductVO e : productList) {
            data[i][0] = String.valueOf(e.getPdbun());
            data[i][1] = e.getPdname();
            data[i][2] = e.getPdbrand();
            data[i][3] = String.valueOf(e.getPdcount());
            data[i][4] = e.getPduse();
            data[i][5] = String.valueOf(e.getPdprice());
            data[i][6] = String.valueOf(e.getPddate());
            i++;
        }
        // Model을 사용해서 테이블에 값을 넣는다.
        if (productList.size() == 0) {
            tableProductList1.setModel(new JTableModel(c_name, emptyData));
        } else {
            tableProductList1.setModel(new JTableModel(c_name, data));
        }
    }
    private void btnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJoinActionPerformed
    private void btnOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrder1ActionPerformed
        // 주문완료 페이지로 이동.
        card.show(pp, "c_completeOrder");
        setTitle("ABC마트 - 주문완료");
    }//GEN-LAST:event_btnOrder1ActionPerformed
    private void radioLowPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLowPriceActionPerformed
        if (radioHighPrice.isSelected()) {
            radioHighPrice.setSelected(false);
        }
        showProductList();
        productNamev.setText("");
        productNamev.requestFocus();
    }//GEN-LAST:event_radioLowPriceActionPerformed
    private void radioHighPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHighPriceActionPerformed
        if (radioLowPrice.isSelected()) {
            radioLowPrice.setSelected(false);
        }
        showProductList();
        productNamev.setText("");
        productNamev.requestFocus();
    }//GEN-LAST:event_radioHighPriceActionPerformed

    private void btnModifyQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQtyActionPerformed
        if (tableWish.getSelectedRowCount()>0) {
            updateWishQty();
        } else {
            JOptionPane.showMessageDialog(null, "주문을 선택하세요.", "오류", JOptionPane.ERROR_MESSAGE);
        }
        orderQtyv.setText("");
        orderQtyv.requestFocus();
        showWish();
    }//GEN-LAST:event_btnModifyQtyActionPerformed

    private void btnToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToLoginActionPerformed
        card.show(pp, "c_login");
        setTitle("ABC마트 - 로그인");
    }//GEN-LAST:event_btnToLoginActionPerformed

    private void btnBackToSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToSearchProductActionPerformed
        // 뒤로가기.
        card.show(pp, "c_searchProduct");
        setTitle("ABC마트 - 물품검색");
    }//GEN-LAST:event_btnBackToSearchProductActionPerformed

    private void btnBackToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToLoginActionPerformed
        // 뒤로가기
        card.show(pp, "c_login");
        setTitle("ABC마트 - 로그인");
    }//GEN-LAST:event_btnBackToLoginActionPerformed

    private void btnToWishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToWishActionPerformed
        card.show(pp, "c_wish");
        showWish();
        setTitle("ABC마트 - 장바구니");
    }//GEN-LAST:event_btnToWishActionPerformed
    // 찜을 하여 주문 목록에 추가하기 위해 VO객체를 거쳐서 
    // DAO를 통해 DB에 접근하는 메서드.
    private void btnWishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWishActionPerformed
        if (tableProductList1.getSelectedRowCount() > 0) {
            OrderVO vo = new OrderVO();
            vo.setMemberno(memberNo);
            vo.setProductno(Integer.parseInt(tableProductList1.getValueAt(
                    tableProductList1.getSelectedRow(), 0).toString()));
            dao.OrderDAO.getDao().addOrder(vo);
            JOptionPane.showMessageDialog(null, "찜 되었습니다.", "안내",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "물품을 선택해주십시오.", "오류",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnWishActionPerformed

    private void comboBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBrandActionPerformed
    public JRadioButton getRadioHighPrice() {
        return radioHighPrice;
    }

    public JRadioButton getRadioLowPrice() {
        return radioLowPrice;
    }

    public JTable getTableProdutList1() {
        return tableProductList1;
    }

    public JComboBox<String> getComboBrand() {
        return comboBrand;
    }

    public JComboBox<String> getComboUse() {
        return comboUse;
    }

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
            java.util.logging.Logger.getLogger(ShoppingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShoppingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShoppingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShoppingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShoppingJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField additionalQtyv;
    private javax.swing.JTextField brandv;
    private javax.swing.JButton btnAddNewImage;
    private javax.swing.JButton btnAddNewProduct;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnBackToLogin;
    private javax.swing.JButton btnBackToPcproduct;
    private javax.swing.JButton btnBackToPsmain2;
    private javax.swing.JButton btnBackToPsmain3;
    private javax.swing.JButton btnBackToSearchProduct;
    private javax.swing.JButton btnCallAdditionalProduct;
    private javax.swing.JButton btnJoin;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnModifyQty;
    private javax.swing.JButton btnOrder1;
    private javax.swing.JButton btnOrder2;
    private javax.swing.JButton btnOrder3;
    private javax.swing.JButton btnProductReset;
    private javax.swing.JButton btnRemoveOrder;
    private javax.swing.JButton btnRemoveProduct;
    private javax.swing.JButton btnSearchIdPwd;
    private javax.swing.JButton btnSearchProduct;
    private javax.swing.JButton btnToLogin;
    private javax.swing.JButton btnToWish;
    private javax.swing.JButton btnUpdateMember;
    private javax.swing.JButton btnWish;
    private javax.swing.JButton btnWish2;
    private javax.swing.JTextField c2_idv2;
    private javax.swing.JTextField c2_namev1;
    private javax.swing.JTextField c2_namev2;
    private javax.swing.JTextField c2_telv1;
    private javax.swing.JTextField c2_telv2;
    private javax.swing.JComboBox<String> comboBrand;
    private javax.swing.JComboBox<String> comboUse;
    private javax.swing.JButton idsearchBtn;
    private javax.swing.JTextField idv;
    private javax.swing.JTextField imgPathv;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel labelProduct;
    private javax.swing.JTextField newQtyv;
    private javax.swing.JTextField orderQtyv;
    private javax.swing.JPanel pCCompleteOrder;
    private javax.swing.JPanel pCProductDetail;
    private javax.swing.JPanel pCSearchProduct;
    private javax.swing.JPanel pCWish;
    private javax.swing.JPanel pJoinFail;
    private javax.swing.JPanel pJoinMember;
    private javax.swing.JPanel pJoinSuccess;
    private javax.swing.JPanel pLogin;
    private javax.swing.JPanel pSAddProduct;
    private javax.swing.JPanel pSMain;
    private javax.swing.JPanel pSMember;
    private javax.swing.JPanel pSOrder;
    private javax.swing.JPanel pSProduct;
    private javax.swing.JPanel pSearchIdFail;
    private javax.swing.JPanel pSearchIdPwd;
    private javax.swing.JPanel pSearchIdSuccess;
    private javax.swing.JPanel pSearchPwdFail;
    private javax.swing.JPanel pSearchPwdSuccess;
    private javax.swing.JPanel pUpdateMember;
    private javax.swing.JPanel pp;
    private javax.swing.JTextField productNamev;
    private javax.swing.JTextField productv;
    private javax.swing.JTextField pwdv;
    private javax.swing.JButton pwsearchBtn;
    private javax.swing.JRadioButton radioHighPrice;
    private javax.swing.JRadioButton radioLowPrice;
    private javax.swing.JSpinner spinnerSelectQty;
    private javax.swing.JTable tableProductList1;
    private javax.swing.JTable tableSupervisorShowOrderList;
    private javax.swing.JTable tableWish;
    // End of variables declaration//GEN-END:variables
    // 찜 목록 출력을 위해 VO객체에 값을 넣어 DAO를 통해 DB에 접근한 후
    // ArrayList와 VO객체를 받아 테이블에 출력
    private void showWish() {
        MemberVO vo = new MemberVO();
        vo.setMemnum(memberNo);
        ArrayList<ProductVO> productList = dao.ProductDAO.getDao().wishProductSearch(vo);
        ArrayList<OrderVO> orderList = dao.OrderDAO.getDao().wishProductSearch(vo);
        String[] c_name = {"주문번호", "상품번호", "상품명", "브랜드", "용도", "가격", "주문수량"};
        String[][] data = new String[productList.size()][c_name.length];
        String[][] emptyData = new String[1][c_name.length];
        int i = 0;
        // 테이블에 넣을 값들을 data에 row단위로 column값을 넣어준다.
        for (OrderVO e : orderList) {
            data[i][0] = String.valueOf(e.getOrderno());
            data[i][6] = String.valueOf(e.getQuantity());
            i++;
        }
        i = 0;
        for (ProductVO e : productList) {
            data[i][1] = String.valueOf(e.getPdbun());
            data[i][2] = e.getPdname();
            data[i][3] = e.getPdbrand();
            data[i][4] = e.getPduse();
            data[i][5] = String.valueOf(e.getPdprice());
            i++;
        }
        // 모델을 통해 테이블에 값을 입력
        if (productList.size() == 0) {
            tableWish.setModel(new JTableModel(c_name, emptyData));
        } else {
            tableWish.setModel(new JTableModel(c_name, data));
        }
    }

    // 찜한 상품 주문 수량 수정을 위해 VO객체에 값을 넣고
    // DAO를 통해 DB에 접근하는 메서드.
    private void updateWishQty() {
        OrderVO vo = new OrderVO();
        try {
            vo.setOrderno(Integer.parseInt(tableWish.getValueAt(
                    tableWish.getSelectedRow(), 0).toString()));
            vo.setQuantity(Integer.parseInt(orderQtyv.getText()));
            if (Integer.parseInt(orderQtyv.getText()) != 0) {
                dao.OrderDAO.getDao().updateOrder(vo);
            } else {
                dao.OrderDAO.getDao().removeOrder(vo);
            }
            JOptionPane.showMessageDialog(null, "적용되었습니다.", "안내",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "숫자를 입력하세요.", "오류",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
