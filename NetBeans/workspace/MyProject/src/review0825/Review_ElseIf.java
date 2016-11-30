package review0825;

public class Review_ElseIf {
    public static void main(String[] args) {
        int scoreNum = 75;
        
        if(scoreNum>=90){ // 조건식 내용 순서 주의.
            System.out.println("점수가 100-90 입니다.");
            System.out.println("등급은 A 입니다.");
        }else if(scoreNum>=80){ // 조건식 내용 순서 주의.
            System.out.println("점수가 80-89 입니다.");
            System.out.println("등급은 B 입니다.");
        }else if(scoreNum>=70){ // 조건식 내용 순서 주의.
            System.out.println("점수가 70-79 입니다.");
            System.out.println("등급은 C 입니다.");
        }else{
            System.out.println("점수가 70 미만 입니다.");
            System.out.println("등급은 D 입니다.");
        }
    }
}
