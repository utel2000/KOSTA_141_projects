package home;
//11. public static void main(String[] args) {
//12. for (int i=0;i<= 10;i++){
//13. if( i>6) break;
//14. }
//15. System.out.println(i);
//16. }
//
//What is the result?
//A. 6
//B. 7
//C. 10
//D. 11
//E. Compilation fails.  => 정답

public class Home11 {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i > 6) {
                break;
            }
        }
        // System.out.println(i); // 있지도 않은 i를 찾아??
    }
}
