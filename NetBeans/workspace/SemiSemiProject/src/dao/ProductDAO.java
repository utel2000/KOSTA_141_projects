package dao;

import abcmart.ShoppingJFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import vo.MemberVO;
import vo.ProductVO;

public class ProductDAO {

    private static ProductDAO dao;

    // 싱글톤 - ProductDao 객체 주소 공유
    public static ProductDAO getDao() {
        if (dao == null) {
            dao = new ProductDAO();
        }
        return dao;
    }

    // 새로운 제품을 product table에 insert하는 메서드(insert)
    public boolean insertProduct(ProductVO v) {
        Connection con = null;
        PreparedStatement pstmt = null;
        boolean chkfail = false;
        if (check(v.getPdbun())) {
            String sql = "insert into product values(?,?,?,?,?,?,sysdate)";
            try {
                con = connectDB.Conn.getConn();
                pstmt = con.prepareStatement(sql);
                pstmt.setInt(1, v.getPdbun());
                pstmt.setString(2, v.getPdbrand());
                pstmt.setInt(3, v.getPdprice());
                pstmt.setInt(4, v.getPdcount());
                pstmt.setString(5, v.getPdname());
                pstmt.setString(6, v.getPduse());
                pstmt.execute();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (pstmt != null) {
                        pstmt.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } else {
            chkfail = true; // 여기 고칠 것
        }
        return chkfail;
    }

    // 품번 이용해서 product 테이블에서 해당 제품을 삭제하는 메서드(delete)
    public void deleteProduct(ProductVO v) {
        Connection con = null;
        PreparedStatement pstmt = null;
        StringBuffer sql = new StringBuffer();
        try {
            con = connectDB.Conn.getConn();
            sql.append("delete from product where pdbun = ?");
            pstmt = con.prepareStatement(sql.toString());
            pstmt.setInt(1, v.getPdbun());
            pstmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    // product table 삭제하는 메서드(drop)
    public void RemoveProduct() {
        Connection con = null;
        PreparedStatement pstmt = null;
        String sql = "drop table product CASCADE CONSTRAINTS"; // 원래 테이블 drop하는 쿼리문
        System.out.println(sql);
        try {
            con = connectDB.Conn.getConn();
            pstmt = con.prepareStatement(sql);
            pstmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    // product 테이블 생성하는 테이블(create)
    public void createProduct() {
        Connection con = null;
        PreparedStatement pstmt = null;
        StringBuffer sql = new StringBuffer(); // 새로운 product 테이블 생성
        sql.append("create table product (pdbun number(4) primary key,");
        sql.append("pdbrand varchar2(20),").append("pdprice number(20),");
        sql.append("pdcount number(4),").append("pdname varchar2(20),");
        sql.append("pduse varchar2(10),").append("pddate date)");
        System.out.println(sql);
        try {
            con = connectDB.Conn.getConn();
            pstmt = con.prepareStatement(sql.toString());
            pstmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    // 제품의 수량을 수정하는 메서드(update)
    public void updateProduct(ProductVO v, int count) {
        Connection con = null;
        PreparedStatement pstmt = null;
        StringBuffer sql = new StringBuffer();
        try {
            con = connectDB.Conn.getConn();
            sql.append("update product set pdcount = pdcount + ? where pdbun = ?");
            pstmt = con.prepareStatement(sql.toString());
            pstmt.setInt(1, count);
            pstmt.setInt(2, v.getPdbun());
            pstmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    // 모든 상품 출력을 위한 메서드(select)
    public ArrayList<ProductVO> productSearchAll() {
        ArrayList<ProductVO> arlist = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from product";
        try {
            con = connectDB.Conn.getConn();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                ProductVO v = new ProductVO();
                v.setPdbun(rs.getInt("pdbun"));
                v.setPdbrand(rs.getString("pdbrand"));
                v.setPdcount(rs.getInt("pdcount"));
                v.setPdname(rs.getString("pdname"));
                v.setPddate(rs.getString("pddate"));
                v.setPdprice(rs.getInt("pdprice"));
                v.setPduse(rs.getString("pduse"));
                arlist.add(v);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return arlist;
    }

    // 겹치는 품번이 있으면 false / 없으면 true
    private boolean check(int bun) {
        ArrayList<ProductVO> par = new ArrayList<ProductVO>();
        par = productSearchAll();
        boolean check = true;
        for (ProductVO d : par) {
            if (d.getPdbun() == bun) {
                check = false;
            }
        }
        return check;
    }

// 고객의 물품 검색(select)
    public ArrayList<ProductVO> productSearch(ProductVO pv, String chkSort) {
        ArrayList<ProductVO> arlist = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        StringBuffer sql = new StringBuffer();
        try {
            con = connectDB.Conn.getConn();
            // 사용자가 선택한 조건에 따라 SQL문 설정.(select, order by)
            if (pv.getPdbrand() == null && pv.getPduse() == null && pv.getPdname() == null) {
                switch (chkSort) {
                    case "low":
                        sql.append("select * from product order by pdprice");
                        break;
                    case "high":
                        sql.append("select * from product order by pdprice desc");
                        break;
                    default:
                        sql.append("select * from product");
                }
                pstmt = con.prepareStatement(sql.toString());
            } else if (pv.getPdbrand() != null && pv.getPduse() == null && pv.getPdname() == null) {
                switch (chkSort) {
                    case "low":
                        sql.append("select * from product where pdbrand = ? order by pdprice");
                        break;
                    case "high":
                        sql.append("select * from product where pdbrand = ? order by pdprice desc");
                        break;
                    default:
                        sql.append("select * from product where pdbrand = ?");
                }
                pstmt = con.prepareStatement(sql.toString());
                pstmt.setString(1, pv.getPdbrand());
            } else if (pv.getPdbrand() == null && pv.getPduse() != null && pv.getPdname() == null) {
                switch (chkSort) {
                    case "low":
                        sql.append("select * from product where pduse = ? order by pdprice");
                        break;
                    case "high":
                        sql.append("select * from product where pduse = ? order by pdprice desc");
                        break;
                    default:
                        sql.append("select * from product where pduse = ?");
                }
                pstmt = con.prepareStatement(sql.toString());
                pstmt.setString(1, pv.getPduse());
            } else if (pv.getPdbrand() == null && pv.getPduse() == null && pv.getPdname() != null) {
                switch (chkSort) {
                    case "low":
                        sql.append("select * from product where pdname like ? order by pdprice");
                        break;
                    case "high":
                        sql.append("select * from product where pdname like ? order by pdprice desc");
                        break;
                    default:
                        sql.append("select * from product where pdname like ?");
                }
                pstmt = con.prepareStatement(sql.toString());
                pstmt.setString(1, "%" + pv.getPdname() + "%");
            } else if (pv.getPdbrand() != null && pv.getPduse() != null && pv.getPdname() == null) {
                switch (chkSort) {
                    case "low":
                        sql.append("select * from product where pdbrand = ? and pduse = ? order by pdprice");
                        break;
                    case "high":
                        sql.append("select * from product where pdbrand = ? and pduse = ? order by pdprice desc");
                        break;
                    default:
                        sql.append("select * from product where pdbrand = ? and pduse = ?");
                }
                pstmt = con.prepareStatement(sql.toString());
                pstmt.setString(1, pv.getPdbrand());
                pstmt.setString(2, pv.getPduse());
            } else if (pv.getPdbrand() != null && pv.getPduse() == null && pv.getPdname() != null) {
                switch (chkSort) {
                    case "low":
                        sql.append("select * from product where pdbrand = ? and pdname like ? order by pdprice");
                        break;
                    case "high":
                        sql.append("select * from product where pdbrand = ? and pdname like ? order by pdprice desc");
                        break;
                    default:
                        sql.append("select * from product where pdbrand = ? and pdname like ?");
                }
                pstmt = con.prepareStatement(sql.toString());
                pstmt.setString(1, pv.getPdbrand());
                pstmt.setString(2, "%" + pv.getPdname() + "%");
            } else if (pv.getPdbrand() == null && pv.getPduse() != null && pv.getPdname() != null) {
                switch (chkSort) {
                    case "low":
                        sql.append("select * from product where pduse = ? and pdname like ? order by pdprice");
                        break;
                    case "high":
                        sql.append("select * from product where pduse = ? and pdname like ? order by pdprice desc");
                        break;
                    default:
                        sql.append("select * from product where pduse = ? and pdname like ?");
                }
            } else {
                switch (chkSort) {
                    case "low":
                        sql.append("select * from product where pduse = ? and pdbrand = ? and pdname like ? order by pdprice");
                        break;
                    case "high":
                        sql.append("select * from product where pduse = ? and pdbrand = ? and pdname like ? order by pdprice desc");
                        break;
                    default:
                        sql.append("select * from product where pduse = ? and pdbrand = ? and pdname like ?");
                }
            pstmt = con.prepareStatement(sql.toString());
            pstmt.setString(1, pv.getPduse());
            pstmt.setString(2, pv.getPdbrand());
            pstmt.setString(3, "%" + pv.getPdname() + "%");
        }
        rs = pstmt.executeQuery();
        // 하나의 row에 해당되는 각 column의 값을 VO객체에 넣고
        // row마다 ArrayList에 추가.
        while (rs.next()) {
            ProductVO v = new ProductVO();
            v.setPdbun(rs.getInt("pdbun"));
            v.setPdbrand(rs.getString("pdbrand"));
            v.setPdcount(rs.getInt("pdcount"));
            v.setPdname(rs.getString("pdname"));
            v.setPddate(rs.getString("pddate"));
            v.setPdprice(rs.getInt("pdprice"));
            v.setPduse(rs.getString("pduse"));

            arlist.add(v);
        }
    }
    catch (SQLException ex

    
        ) {
            ex.printStackTrace();
    }

    
        finally {
            try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    return arlist ;
}

// 사용자가 찜한 목록 출력 - 상품VO 반환 (select, 조인)
public ArrayList<ProductVO> wishProductSearch(MemberVO mv) {
        ArrayList<ProductVO> arlist = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        StringBuffer sql = new StringBuffer();
        try {
            // DB연결 후 쿼리 실행하여 ResultSet에 결과 저장.
            con = connectDB.Conn.getConn();
            sql.append("select p.pdbun, p.pdname, p.pdbrand, p.pduse, p.pdprice ")
                    .append("from product p, orderproduct o ")
                    .append("where p.pdbun=o.productno and o.memberno = ?");
            pstmt = con.prepareStatement(sql.toString());
            pstmt.setInt(1, mv.getMemnum());
            rs = pstmt.executeQuery();
            // ArrayList에 상품 Column에 해당되는 값을 넣어 반환.
            while (rs.next()) {
                ProductVO v = new ProductVO();
                v.setPdbun(rs.getInt("pdbun"));
                v.setPdname(rs.getString("pdname"));
                v.setPdbrand(rs.getString("pdbrand"));
                v.setPduse(rs.getString("pduse"));
                v.setPdprice(rs.getInt("pdprice"));
                arlist.add(v);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return arlist;
    }
}
