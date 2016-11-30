package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import vo.MemberVO;
import vo.OrderVO;

public class OrderDAO {

// 싱글톤 패턴 사용해서 하나의 주소만을 활용.
    private static OrderDAO dao;
// 객체가 생성되지 않은 최초 1번만 생성하고 항상 생성된 객체의 주소를 반환.

    public static OrderDAO getDao() {
        if (dao == null) {
            dao = new OrderDAO();
        }
        return dao;
    }

// 전체 주문내역 조회(select)
    public ArrayList<OrderVO> orderSearchAll() {
        ArrayList<OrderVO> arlist = new ArrayList<OrderVO>();
        try (Connection con = connectDB.Conn.getConn();
                PreparedStatement pstmt = con.prepareCall("select * from orderproduct")) {
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    OrderVO v = new OrderVO();
                    v.setOrderno(rs.getInt("orderno"));
                    v.setProductno(rs.getInt("productno"));
                    v.setMemberno(rs.getInt("memberno"));
                    v.setQuantity(rs.getInt("quantity"));
                    v.setOrderdate(rs.getString("orderdate"));
                    v.setOrderstatus(rs.getString("orderstatus"));
                    arlist.add(v);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return arlist;
    }
// 주문 추가(찜)

    public void insertOrder(OrderVO v) {

    }

    // 주문 수량 수정(update)
    public void updateOrder(OrderVO v) {
        try (Connection con = connectDB.Conn.getConn();
                PreparedStatement pstmt = con.prepareCall(
                        "update orderproduct set quantity = ? where orderno = ?")) {
            pstmt.setInt(1, v.getQuantity());
            pstmt.setInt(2, v.getOrderno());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

// 주문 삭제(delete)
    public void removeOrder(OrderVO v) {
        try (Connection con = connectDB.Conn.getConn();
                PreparedStatement pstmt = con.prepareCall("delete from orderproduct where orderno = ?")) {
            pstmt.setInt(1, v.getOrderno());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

// 주문 추가(insert)
    public void addOrder(OrderVO v) {
        StringBuffer sql = new StringBuffer();
        sql.append("insert into orderproduct ")
                .append("values (seq_junum.nextval,?,?,1,default,'배송준비중')");
        try (Connection con = connectDB.Conn.getConn();
                PreparedStatement pstmt = con.prepareCall(sql.toString())) {
            pstmt.setInt(1, v.getProductno());
            pstmt.setInt(2, v.getMemberno());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // 사용자가 찜한 목록 출력 - 주문VO 반환 (select, 조인)
    public ArrayList<OrderVO> wishProductSearch(MemberVO vo) {
        ArrayList<OrderVO> arlist = new ArrayList<OrderVO>();
        StringBuffer sql = new StringBuffer();
        sql.append("select o.orderno, o.quantity ")
                .append("from product p, orderproduct o ")
                .append("where p.pdbun = o.productno and o.memberno = ?");
        // DB에 연결 후 쿼리를 실행하여 결과를 ResultSet에 저장.
        try (Connection con = connectDB.Conn.getConn();
                PreparedStatement pstmt = con.prepareCall(sql.toString())) {
            pstmt.setInt(1, vo.getMemnum());
            try (ResultSet rs = pstmt.executeQuery()) {
                // ArrayList에 주문 Column에 해당되는 값을 넣어 반환.
                while (rs.next()) {
                    OrderVO v = new OrderVO();
                    v.setOrderno(rs.getInt("orderno"));
                    v.setQuantity(rs.getInt("quantity"));
                    arlist.add(v);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return arlist;
    }
}
