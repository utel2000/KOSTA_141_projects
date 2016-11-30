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
            while(rs.next()){ //rs에 내용이 있을 때 까지 반복해서
                MemberVO mem = new MemberVO(); //MemberVO객체 mem을 생성해서
                mem.setMemname(rs.getString("memname"));
                mem.setMemid(rs.getString("memid"));
                mem.setMemtel(rs.getString("memtel"));
                mem.setMememail(rs.getString("mememail")); // resultset에 있는 memname~mememail 컬럼의 데이터를 mem에 저장
                mem.setMemadmin(rs.getString("memadmin"));
                mem.setMemage(rs.getInt("memage"));
                mem.setMemadr(rs.getString("memadr"));
                mem.setMemnum(rs.getInt("memnum"));
                mem.setMemgender(rs.getString("memgender"));
                mem.setMempwd(rs.getString("mempwd"));
                
                arlist.add(mem); //mem을 ArrayList에 저장
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return arlist;
    }
    
    
    public ArrayList<MemberVO> memberSearch(int index, String str){
            //cursor로 select된 row 하나당 vo에 담아서 저장할 ArrayList
            ArrayList<MemberVO> arlist= new ArrayList<MemberVO>();
            StringBuffer sql = new StringBuffer(); //sql문 담을 stringbuffer
            PreparedStatement pstmt = null;
            ResultSet rs = null; //결과 받아올 resultset
            Connection con = null;
        try {
            //커넥션 획득
            con = Conn.getConn();
            sql.append("select memnum, memname, memgender, memage, memadmin, memid, mempwd, memtel, mememail, memadr ");
            sql.append("from member ");
                switch (index) {
                    case 1:
                        // 이름 검색
                        sql.append("where memname like ?");
                        pstmt = con.prepareStatement(sql.toString());
                        pstmt.setString(1, str);
                        // sql에 like문을 써서 문자열이 포함된 모든 데이터 검색
                        break;
                    case 2:
                        // 아이디 검색
                        sql.append("where memid like ?");
                        pstmt = con.prepareStatement(sql.toString());
                        pstmt.setString(1, str);
                        break;
                    case 3:
                        // 전화번호 검색
                        sql.append("where memtel = ?");
                        pstmt = con.prepareStatement(sql.toString());
                        pstmt.setString(1, str); //이거 이렇게 가도 되나요????
                        break;
                    case 4: //비번검색
                        sql.append("where mempwd = ?");
                        pstmt = con.prepareStatement(sql.toString());
                        pstmt.setString(1, str);
                        break;
                    case 5: //이메일 검색
                        sql.append("where mememail = ?");
                        pstmt = con.prepareStatement(sql.toString());
                        pstmt.setString(1, str);
                        break;
                    default:
                        break;
                }
            rs = pstmt.executeQuery(); //pstmt문을 실행하고 결과를 ResultSet rs에 받아온다.
            while(rs.next()){ //rs에 내용이 있을 때 까지 반복해서
                MemberVO mem = new MemberVO(); //MemberVO객체 mem을 생성해서
                mem.setMemname(rs.getString("memname"));
                mem.setMemid(rs.getString("memid"));
                mem.setMemtel(rs.getString("memtel"));
                mem.setMememail(rs.getString("mememail")); // resultset에 있는 memname~mememail 컬럼의 데이터를 mem에 저장
                mem.setMemadmin(rs.getString("memadmin"));
                mem.setMemage(rs.getInt("memage"));
                mem.setMemadr(rs.getString("memadr"));
                mem.setMemnum(rs.getInt("memnum"));
                mem.setMemgender(rs.getString("memgender"));
                mem.setMempwd(rs.getString("mempwd"));
                
                arlist.add(mem); //mem을 ArrayList에 저장
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
                try {
                    if(con!=null) con.close(); // 열려있는건 닫아줘야쥬?
                    if(pstmt!=null) pstmt.close();
                    if(rs!=null) rs.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
        }
        return arlist; //ArrayList를 retrun해줍니당
    }
    
    public void memberInsert(MemberVO mem){
        PreparedStatement pstmt = null;
        Connection con = null;
        StringBuffer sql = new StringBuffer();
        try {
            con=Conn.getConn();
            sql.append("insert into member(memnum, memname, memgender, memage, memid, mempwd, memtel, memadmin, mememail, memadr) ");
            sql.append("values (mem_seq.nextVal, ?, ?, ?, ?, ?, ?, '0', ?, ?)"); //멤버 번호는 자동으로 증가하게 해야지, 관리자 번호는 자동으로 0번
            pstmt = con.prepareStatement(sql.toString());
            pstmt.setString(1, mem.getMemname()); // ? 자리에 멤버VO에 있던 해당하는 자리의 데이터들을 넣는다.
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
        //update 메소드  (접속해있는 멤버객체, 어떤 컬럼 업데이트 할지 버튼으로, 업데이트할 내용)
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
            sql.append("delete from member where memnum = ?"); //memberVO에 해당하는 memnum 삭제합시당
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
            System.out.println("이름: ");
            ArrayList<MemberVO> relist = MemberDAO.getDao().memberSearch(1, sc.nextLine());
            StringBuffer sb = new StringBuffer();
            for(MemberVO e : relist){
                sb.append(" 이름 :");
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
        yong.setMemadr("성남시");
        yong.setMemage(26);
        yong.setMememail("ㅇㄹㄷ퓨@naver.com");
        yong.setMemgender("남자");
        yong.setMemid("?ㅈㄷㅁㅎㄱ");
        yong.setMemname("김승용");
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
