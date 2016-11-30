package home;
//11. public class Test {
//12. public static void main(String [] args) {
//13. int x =5;
//14. boolean b1 = true;
//15. boolean b2 = false;
//16.
//17. if((x==4) && !b2)
//18. System.out.print("1 ");
//19. System.out.print("2 ");
//20. if ((b2 = true) && b1)
//21. System.out.print("3 ");
//22. }
//23. }

//What is the result?
//A. 2
//B. 3
//C. 1 2
//D. 2 3  => 정답
//E. 1 2 3
//F. 컴파일 에러가 남.  
//G. 실행시 런타임 예외가 발생이 남.
public class Home10 {

    public static void main(String[] args) {
        int x = 5;
        boolean b1 = true;
        boolean b2 = false;

        if ((x == 4) && !b2) {
            System.out.print("1 ");
        }
        System.out.print("2 ");
        if ((b2 = true) && b1) {
            System.out.print("3 ");
        }
    }
}
