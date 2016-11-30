package ex1;

public class Ex3_Break {
    public static void main(String[] args) {
        // break문 : 반복문, switch문에서 특정 조건을 만족하면 그 영역을 빠져나오는 제어문.
        for(int i=0; i<=10; i++){ // 0 부터 10까지 출력
            // if(i == 5) break; // 여기서 종료
            System.out.println(i); // 5를 출력하지 않고
            if (i == 5) break; // 여기서는 i가 5를 출력한 상태.
        }
        
        // 한 번 해보기 Exam1_WhileBreak.java
        // 1부터 100까지 출력하는 프로그램을 만들고  while
        // 사용자가 입력한 숫자에서 break로 작성해서 출력하기.
    }
}
