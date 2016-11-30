package ex1;
public class Ex1_Array {
    public static void main(String[] args) {
        int[][] test;
        // test = new int[1차원배열의수][각 1차원 배열의 크기]
        test = new int[2][3];
        test[0][0] = 100;
        test[0][1] = 200;
        test[0][2] = 300;
        // -- 첫번째 주소를 가진 일차원 배열의 값은 모두
        test[1][0] = 500;
        test[1][1] = 600;
        test[1][2] = 700;
        // int[][] test = int[2] 반복 : 바깥 for문의 반복
        for (int i = 0; i < test.length; i++) {
            // int[][] test = int[][3] : 바깥 for문의 인덱스에 해당하는
            // 일차원 배열의 길이 반복
            for (int j = 0; j < test[i].length; j++) {
                System.out.println(test[i][j]);
            }
            System.out.println("-----------------");
        }
        // 한 번 해보기. 위의 코드를 개선된 for문으로 변경합니다.
        for (int[] i : test) { // 2차원 배열
            for(int j : i){ // 1차원 배열
                System.out.println(j);
            }
        }
    }
}
