package arrays;
public class Ex1_Array {
    // 배열은 모두 객체이다.
    // 배열은 생성할 때 크기가 결정되어야 한다.
    // 일반자료형, 참조 자료형
    // 일차원배열, 다차원배열
    // 고정길이, 가변길이 배열
    // 배열을 선언, 생성하고, 초기화 해야 한다.
    private int[] score = {75, 80, 90, 95, 100};
    public void execute(){
        // 배열의 길이
        System.out.println("배열의 길이 : " + score.length);
        // 배열을 for문으로 출력
        for(int i=0; i<score.length; i++){
                //i값에 대입 0~4 까지의 배열의 인덱스 값을 가져옴
                System.out.println("score[" + i + "] : " + score[i]);    
        }
    }
    public void execute2(){
        // 배열의 길이
        System.out.println("배열의 길이 : " + score.length);
        // 배열을 향상된 for문으로 출력
        // jdk 5부터는 배열, 컬렉션 등에는 향상된 for문을 권장.
        for(int i : score){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Ex1_Array ref = new Ex1_Array();
        ref.execute();
        ref.execute2();
    }
}
