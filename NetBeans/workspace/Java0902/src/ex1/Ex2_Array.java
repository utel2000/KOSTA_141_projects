package ex1;
public class Ex2_Array {
    // 가변길이 배열
    // 다차원 배열에 저장되는 각 1차원 배열들의 길이를
    // 가변적으로 지정하면서 배열이 생성되는 것을 의미한다.
    // int[][] test; // 다차원배열 선언
    // test = new int[저장될 1차원 배열의 수][]
    // 예) tes = new int[2][];
    // 1차원 배열들의 길이를 지정하지 않으므로
    // 다차원 배열이 가지는 1차원 배열들의 길이는
    // 서로 달라도 상관 없게 됨.
    public static void main(String[] args) {
        // 1차원 배열을
        int[] t1 = {1, 100};
        int[] t2 = {20, 200, 2000, 20000};
        // 다차원 배열
        int[][] test = new int[2][];
        test[0] = t1; // 1차원 배열의 주소 값을 대입!
        test[1] = t2;
        // 코드 완성한 후 메모리 구조로 그려보기
        for (int[] e : test) // 2차원 배열
        {
            for (int f : e) {
                System.out.println(f);
            }
        }
    }
}
