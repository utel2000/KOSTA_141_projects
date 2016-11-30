package ex1;

import java.util.Scanner;

public class Ex2_StringBuffer {

    public static void main(String[] args) {
        // 참고)-------------------------------------------------
        // java.lang에 있는 클래스들은 import할 필요가 없다.
        // 너무 자주 사용하니까 자바에서는 java.lang 패키지를
        // 기본 패키지로 사용하게 매핑. 즉 lang의 클래스는 자동 import!
        // 예) StringBuffer, String, Math
        // ------------------------------------------------------
        // Scanner로 사용자의 이름과 나이를 입력받아서
        // StringBuffer에 저장하고 출력.
        // 출력]
        // 아이디 : 박시내, 나이 : 20
        Scanner sc = new Scanner(System.in);
        // 문자열을 저장할 임시 공간!
        StringBuffer mdata = new StringBuffer();
        System.out.print("이름 : ");
        String nameStr = sc.nextLine();
        System.out.print("나이 : ");
        int ageNum = Integer.parseInt(sc.nextLine());
        // 사용자가 입력한 값 nameStr, ageNum을 StringBuffer에 저장해보자.
        mdata.append("이름 : ").append(nameStr);
        mdata.append(", 나이 : ").append(ageNum);
        // 사용할 수 있도록 문자열 객체로 반환. (toString() 메서드)
        // 하지만 println()은 자동으로 String으로 바꿔주니 지금은 불필요. 
        // String m = mdata.toString(); // 만약 쓰면 toString()이 2번 되는 것.(비효율적)
        System.out.println(mdata);
    }
}
