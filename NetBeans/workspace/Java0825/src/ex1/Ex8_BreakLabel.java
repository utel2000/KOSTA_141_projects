package ex1;

public class Ex8_BreakLabel {

    public static void main(String[] args) {
        // breaklabel: jdk 5버전부터 지원. break로 빠져나가기 위해 지정한 위치에 라벨을 지정한다.
        ex:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break ex;
                }
                System.out.println(i + ":" + j + " ");
            }
            System.out.println("--------------");
        }
        // Exam4_Menu.java의 소스 중에 종료를 break label문으로 수정.
    }
}
