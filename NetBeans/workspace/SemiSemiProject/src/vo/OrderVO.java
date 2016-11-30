package vo;

public class OrderVO {
    private int orderno; // 주문번호
    private int productno; // 제품번호
    private int memberno; // 회원번호
    private int quantity; // 주문수량
    private String orderdate; // 주문일
    private String orderstatus; // 배송상태

    public int getOrderno() {
        return orderno;
    }

    public void setOrderno(int orderno) {
        this.orderno = orderno;
    }

    public int getProductno() {
        return productno;
    }

    public void setProductno(int productno) {
        this.productno = productno;
    }

    public int getMemberno() {
        return memberno;
    }

    public void setMemberno(int memberno) {
        this.memberno = memberno;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }
}
