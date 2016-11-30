package review0913_extends;
public class Review_Restaurant implements Review_InterKor{
    @Override
    public void cookKor() {
        System.out.println("ºñºö¹ä ³ª¿Ô½À´Ï´Ù.");
    }
    @Override
    public void cookJpn() {
        System.out.println("ÃÊ¹ä ³ª¿Ô½À´Ï´Ù.");
    }
    @Override
    public void cookChn() {
        System.out.println("ÅÁ¼öÀ° ³ª¿Ô½À´Ï´Ù.");
    }
}
