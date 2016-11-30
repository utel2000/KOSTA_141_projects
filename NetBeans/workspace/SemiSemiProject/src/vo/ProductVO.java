package vo;

public class ProductVO {
    private int pdbun; // 품번
    private String pdbrand; // 브랜드명
    private int pdprice; // 가격
    private int pdcount; // 수량
    private String pdname; // 상품명
    private String pduse; // 용도
    private String pddate; // 입고날짜

    public String getPddate() {
        return pddate;
    }

    public void setPddate(String pddate) {
        this.pddate = pddate;
    }
    
    public int getPdbun() {
        return pdbun;
    }

    public void setPdbun(int pdbun) {
        this.pdbun = pdbun;
    }

    public String getPdbrand() {
        return pdbrand;
    }

    public void setPdbrand(String pdbrand) {
        this.pdbrand = pdbrand;
    }

    public int getPdprice() {
        return pdprice;
    }

    public void setPdprice(int pdprice) {
        this.pdprice = pdprice;
    }

    public int getPdcount() {
        return pdcount;
    }

    public void setPdcount(int pdcount) {
        this.pdcount = pdcount;
    }

    public String getPdname() {
        return pdname;
    }

    public void setPdname(String pdname) {
        this.pdname = pdname;
    }

    public String getPduse() {
        return pduse;
    }

    public void setPduse(String pduse) {
        this.pduse = pduse;
    }

   
}
