package ex3;

public class Ex1_ConsoleCook extends Ex1_CookAbstract {
    @Override
    public void korCook(String orderName) {
        System.out.println("한식 나왔습니다.");
    }
    @Override
    public void indoCook(String orderName) {
        System.out.println("인도식 나왔습니다.");
    }
    @Override
    public void jpCook(String orderName) {
        System.out.println("일식 나왔습니다.");
    }
}
