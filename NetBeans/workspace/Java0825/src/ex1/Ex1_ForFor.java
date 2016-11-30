package ex1;

public class Ex1_ForFor {
    // 학습 포인트 : 다중 for문을 이해한다.
    // 2 x 1 = 2, 3 x 1 = 3, ...... 9 x 1 = 9
    // ..
    // 2 x 9 = 18 .....

    public static void main(String[] args) {
        // 도전해보기 : 추가 요구사항은 단의 제목을 함께 출력
        // for문을 별도로 추가 시키지 않고, 현재 다중 for문 안에서
        // if, if else로 추가해서 적용.
        for (int i = 0; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                // \t : 탭 리터럴
                // 참고) If문에 {} 없을 경우는 하나의 실행문 ";" 종료까지를
                // If문이 실행할 구문으로 취급.
                if(i==0)
                   System.out.print("    " + j + "단\t\t");
                else
                    System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        // 5, 6, 7단만 출력.
        for (int i = 0; i <= 9; i++) {
            for (int j = 5; j <= 7; j++) {
                if(i==0)
                   System.out.print("    " + j + "단\t\t");
                else
                    System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.println("");
        }
        // 5단만
        for (int i = 0; i <= 9; i++) {
            for (int j = 5; j == 5; j++) {
                if(i==0)
                   System.out.print("    " + j + "단\t\t");
                else
                    System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.println("");
        }
        // 5, 6, 7, 8, 9단만 출력.
        for (int i = 0; i <= 9; i++) {
            for (int j = 5; j <= 9; j++) {
                if(i==0)
                   System.out.print("    " + j + "단\t\t");
                else
                    System.out.print(j + " x " + i + " = " + (j * i) + "\t");
            }
            System.out.println("");
        }
    }
}
