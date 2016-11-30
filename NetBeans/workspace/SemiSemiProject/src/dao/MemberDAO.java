package dao;

import connectDB.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import vo.MemberVO;

/* @author Administrator*/
public class MemberDAO {
    
    private static MemberDAO dao;

    public static MemberDAO getDao(){
        if(dao==null) dao = new MemberDAO();
        return dao;
    }
    public ArrayList<MemberVO> memberSearch_All(){
        ArrayList<MemberVO> arlist = new ArrayList<MemberVO>();
        Connection con = null;
        StringBuffer sql = new StringBuffer();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            con = Conn.getConn();
            sql.append("select * from member");
            pstmt=con.prepareStatement(sql.toString());
            rs = pstmt.executeQuery();
            while(rs.next()){ //rs�� ������ ���� �� ���� �ݺ��ؼ�
                MemberVO mem = new MemberVO(); //MemberVO��ü mem�� �����ؼ�
                mem.setMemname(rs.getString("memname"));
                mem.setMemid(rs.getString("memid"));
                mem.setMemtel(rs.getString("memtel"));
                mem.setMememail(rs.getString("mememail")); // resultset�� �ִ� memname~mememail �÷��� �����͸� mem�� ����
                mem.setMemadmin(rs.getString("memadmin"));
                mem.setMemage(rs.getInt("memage"));
                mem.setMemadr(rs.getString("memadr"));
                mem.setMemnum(rs.getInt("memnum"));
                mem.setMemgender(rs.getString("memgender"));
                mem.setMempwd(rs.getString("mempwd"));
                
                arlist.add(mem); //mem�� ArrayList�� ����
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return arlist;
    }
    
    
    public ArrayList<MemberVO> memberSearch(int index, String str){
            //cursor�� select�� row �ϳ��� vo�� ��Ƽ� ������ ArrayList
            ArrayList<MemberVO> arlist= new ArrayList<MemberVO>();
            StringBuffer sql = new StringBuffer(); //sql�� ���� stringbuffer
            PreparedStatement pstmt = null;
            ResultSet rs = null; //��� �޾ƿ� resultset
            Connection con = null;
        try {
            //Ŀ�ؼ� ȹ��
            con = Conn.getConn();
            sql.append("select memnum, memname, memgender, memage, memadmin, memid, mempwd, memtel, mememail, memadr ");
            sql.append("from member ");
                switch (index) {
                    case 1:
                        // �̸� �˻�
                        sql.append("where memname like ?");
                        pstmt = con.prepareStatement(sql.toString());
                        pstmt.setString(1, str);
                        // sql�� like���� �Ἥ ���ڿ��� ���Ե� ��� ������ �˻�
                        break;
                    case 2:
                        // ���̵� �˻�
                        sql.append("where memid like ?");
                        pstmt = con.prepareStatement(sql.toString());
                        pstmt.setString(1, str);
                        break;
                    case 3:
                        // ��ȭ��ȣ �˻�
                        sql.append("where memtel = ?");
                        pstmt = con.prepareStatement(sql.toString());
                        pstmt.setString(1, str); //�̰� �̷��� ���� �ǳ���????
                        break;
                    case 4: //����˻�
                        sql.append("where mempwd = ?");
                        pstmt = con.prepareStatement(sql.toString());
                        pstmt.setString(1, str);
                        break;
                    case 5: //�̸��� �˻�
                        sql.append("where mememail = ?");
                        pstmt = con.prepareStatement(sql.toString());
                        pstmt.setString(1, str);
                        break;
                    default:
                        break;
                }
            rs = pstmt.executeQuery(); //pstmt���� �����ϰ� ����� ResultSet rs�� �޾ƿ´�.
            while(rs.next()){ //rs�� ������ ���� �� ���� �ݺ��ؼ�
                MemberVO mem = new MemberVO(); //MemberVO��ü mem�� �����ؼ�
                mem.setMemname(rs.getString("memname"));
                mem.setMemid(rs.getString("memid"));
                mem.setMemtel(rs.getString("memtel"));
                mem.setMememail(rs.getString("mememail")); // resultset�� �ִ� memname~mememail �÷��� �����͸� mem�� ����
                mem.setMemadmin(rs.getString("memadmin"));
                mem.setMemage(rs.getInt("memage"));
                mem.setMemadr(rs.getString("memadr"));
                mem.setMemnum(rs.getInt("memnum"));
                mem.setMemgender(rs.getString("memgender"));
                mem.setMempwd(rs.getString("mempwd"));
                
                arlist.add(mem); //mem�� ArrayList�� ����
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
                try {
                    if(con!=null) con.close(); // �����ִ°� �ݾ������?
                    if(pstmt!=null) pstmt.close();
                    if(rs!=null) rs.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
        }
        return arlist; //ArrayList�� retrun���ݴϴ�
    }
    
    public void memberInsert(MemberVO mem){
        PreparedStatement pstmt = null;
        Connection con = null;
        StringBuffer sql = new StringBuffer();
        try {
            con=Conn.getConn();
            sql.append("insert into member(memnum, memname, memgender, memage, memid, mempwd, memtel, memadmin, mememail, memadr) ");
            sql.append("values (mem_seq.nextVal, ?, ?, ?, ?, ?, ?, '0', ?, ?)"); //��� ��ȣ�� �ڵ����� �����ϰ� �ؾ���, ������ ��ȣ�� �ڵ����� 0��
            pstmt = con.prepareStatement(sql.toString());
            pstmt.setString(1, mem.getMemname()); // ? �ڸ��� ���VO�� �ִ� �ش��ϴ� �ڸ��� �����͵��� �ִ´�.
            pstmt.setString(2, mem.getMemgender());
            pstmt.setInt(3, mem.getMemage());
            pstmt.setString(4, mem.getMemid());
            pstmt.setString(5, mem.getMempwd());
            pstmt.setString(6, mem.getMemtel());
            pstmt.setString(7, mem.getMememail());
            pstmt.setString(8, mem.getMemadr());
            pstmt.executeUpdate();
        } catch (SQLException ex) { 
            ex.printStackTrace();
        } finally{
            try {
                if(pstmt!=null) pstmt.close();
                if(con!=null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void memberUpdate(MemberVO mem, String btn, String upd){ 
        //update �޼ҵ�  (�������ִ� �����ü, � �÷� ������Ʈ ���� ��ư����, ������Ʈ�� ����)
        Connection con = null;
        PreparedStatement pstmt = null;
        StringBuffer sql = new StringBuffer();
        try {
            con = Conn.getConn();
            switch (btn) {
                case "pwd":
                    sql.append("update member set mempwd = ? where memnum = ?");
                    pstmt = con.prepareStatement(sql.toString());
                    pstmt.setString(1,upd);
                    pstmt.setInt(2,mem.getMemnum());
                    pstmt.execute();
                    break;
                case "adr":
                    sql.append("update member set memadr = ? where memnum = ?");
                    pstmt = con.prepareStatement(sql.toString());
                    pstmt.setString(1, upd);
                    pstmt.setInt(2, mem.getMemnum());
                    pstmt.execute();
                    break;
                case "tel":
                    sql.append("update member set memtel = ? where memnum = ?");
                    pstmt = con.prepareStatement(sql.toString());
                    pstmt.setString(1, upd);
                    pstmt.setInt(2, mem.getMemnum());
                    pstmt.execute();
                    break;
                case "email":
                    sql.append("update member set mememail = ? where memnum = ?");
                    pstmt = con.prepareStatement(sql.toString());
                    pstmt.setString(1, upd);
                    pstmt.setInt(2, mem.getMemnum());
                    pstmt.executeUpdate();
                    break;
                default:
                    break;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if(con!=null) con.close();
                if(pstmt!=null) pstmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void memberDelete(MemberVO mem){
        Connection con = null;
        PreparedStatement pstmt = null;
        StringBuffer sql = new StringBuffer();
        try {
            con = Conn.getConn();
            sql.append("delete from member where memnum = ?"); //memberVO�� �ش��ϴ� memnum �����սô�
            pstmt = con.prepareStatement(sql.toString());
            pstmt.setInt(1, mem.getMemnum());
            pstmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if(con!=null) con.close();
                if(pstmt!=null) pstmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
}
    
        private void menu() throws SQLException {
            Scanner sc = new Scanner(System.in);
            System.out.println("�̸�: ");
            ArrayList<MemberVO> relist = MemberDAO.getDao().memberSearch(1, sc.nextLine());
            StringBuffer sb = new StringBuffer();
            for(MemberVO e : relist){
                sb.append(" �̸� :");
                sb.append(e.getMemname()).append("\n");
                sb.append(" ID :");
                sb.append(e.getMemid()).append("\n");
                sb.append(" TEL :");
                sb.append(e.getMemtel()).append("\n");
                sb.append(" Email : ");
                sb.append(e.getMememail()).append("\n");
                sb.append("\n");
            }
        System.out.println(sb.toString());
    }
        
    public static void main(String[] args) throws SQLException {
        MemberVO yong = new MemberVO();
        yong.setMemadmin("0");
        yong.setMemadr("������");
        yong.setMemage(26);
        yong.setMememail("������ǻ@naver.com");
        yong.setMemgender("����");
        yong.setMemid("?����������");
        yong.setMemname("��¿�");
        yong.setMemnum(45);
        yong.setMempwd("yong");
        yong.setMemtel("01031622228");
        MemberDAO dao = new MemberDAO();
//        dao.menu();
//        dao.memberDelete(yong);
        getDao().memberInsert(yong);
//        getDao().memberUpdate(yong, "email", "fuckyou");
    }
}
