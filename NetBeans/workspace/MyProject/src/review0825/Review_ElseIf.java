package review0825;

public class Review_ElseIf {
    public static void main(String[] args) {
        int scoreNum = 75;
        
        if(scoreNum>=90){ // ���ǽ� ���� ���� ����.
            System.out.println("������ 100-90 �Դϴ�.");
            System.out.println("����� A �Դϴ�.");
        }else if(scoreNum>=80){ // ���ǽ� ���� ���� ����.
            System.out.println("������ 80-89 �Դϴ�.");
            System.out.println("����� B �Դϴ�.");
        }else if(scoreNum>=70){ // ���ǽ� ���� ���� ����.
            System.out.println("������ 70-79 �Դϴ�.");
            System.out.println("����� C �Դϴ�.");
        }else{
            System.out.println("������ 70 �̸� �Դϴ�.");
            System.out.println("����� D �Դϴ�.");
        }
    }
}
