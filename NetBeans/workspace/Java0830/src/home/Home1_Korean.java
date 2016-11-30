package home;

public class Home1_Korean {

    private String nation = "¥Î«—πŒ±π";
    private String name;
    private String ssn;

    public Home1_Korean(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }
    public String getKoreanName()
    {
        return this.name;
    }
    public String getKoreanSsn()
    {
        return this.ssn;
    }
}
