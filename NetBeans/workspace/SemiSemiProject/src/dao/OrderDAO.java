package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import vo.MemberVO;
import vo.OrderVO;

public class OrderDAO {

// �̱��� ���� ����ؼ� �ϳ��� �ּҸ��� Ȱ��.
    private static OrderDAO dao;
// ��ü�� �������� ���� ���� 1���� �����ϰ� �׻� ������ ��ü�� �ּҸ� ��ȯ.

    public static OrderDAO getDao() {
        if (dao == null) {
            dao = new OrderDAO();
        }
        return dao;
    }

// ��ü �ֹ����� ��ȸ(select)
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
// �ֹ� �߰�(��)

    public void insertOrder(OrderVO v) {

    }

    // �ֹ� ���� ����(update)
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

// �ֹ� ����(delete)
    public void removeOrder(OrderVO v) {
        try (Connection con = connectDB.Conn.getConn();
                PreparedStatement pstmt = con.prepareCall("delete from orderproduct where orderno = ?")) {
            pstmt.setInt(1, v.getOrderno());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

// �ֹ� �߰�(insert)
    public void addOrder(OrderVO v) {
        StringBuffer sql = new StringBuffer();
        sql.append("insert into orderproduct ")
                .append("values (seq_junum.nextval,?,?,1,default,'����غ���')");
        try (Connection con = connectDB.Conn.getConn();
                PreparedStatement pstmt = con.prepareCall(sql.toString())) {
            pstmt.setInt(1, v.getProductno());
            pstmt.setInt(2, v.getMemberno());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // ����ڰ� ���� ��� ��� - �ֹ�VO ��ȯ (select, ����)
    public ArrayList<OrderVO> wishProductSearch(MemberVO vo) {
        ArrayList<OrderVO> arlist = new ArrayList<OrderVO>();
        StringBuffer sql = new StringBuffer();
        sql.append("select o.orderno, o.quantity ")
                .append("from product p, orderproduct o ")
                .append("where p.pdbun = o.productno and o.memberno = ?");
        // DB�� ���� �� ������ �����Ͽ� ����� ResultSet�� ����.
        try (Connection con = connectDB.Conn.getConn();
                PreparedStatement pstmt = con.prepareCall(sql.toString())) {
            pstmt.setInt(1, vo.getMemnum());
            try (ResultSet rs = pstmt.executeQuery()) {
                // ArrayList�� �ֹ� Column�� �ش�Ǵ� ���� �־� ��ȯ.
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
