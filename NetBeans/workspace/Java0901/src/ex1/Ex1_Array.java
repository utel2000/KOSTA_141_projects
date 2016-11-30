package ex1;

public class Ex1_Array {
    public static void main(String[] args) {
        String[] str = new String[3]; // 100번지 생성! 배열!
        str[0] = "Test"; // 200번지 생성. 묵시적 객체 생성 방법.
        str[1] = new String("Test"); // 300번지 생성. 명시적 객체 생성 방법.(new)
        // 상수(C) 풀에서 값을 비교한 후 같은 값을 가지는 200번지 주소 값을 넘겨줌.
        str[2] = "Test"; 
        // ==로 주소 비교 결과 [0]과 [2]가 같은 주소를 가리킨다.            
        System.out.println(str[0] == str[2]); 
    }
}
