package study_exam;
// 구구단을 향상된 for문과 2차원 배열을 사용해서 출력해보아랏!
public class Exam1_Gugudan {
    public static void main(String[] args) {
        int index = 0;
//        int[] num = new int[10];
//        for(int i : num){
//            num[index] = index;
//            System.out.println(num[index]);
//            index++;
//        }
        int[][] gugu = new int[9][9];
        int index2 = 1;
        for (int[] i : gugu) {
            index = 0;
            for (int j : i) {
                i[index] = index + 1;
//                System.out.println(i[index]); // 값 입력
                System.out.print(i[index] + " x " + index2 + " = " + (i[index]*index2) + "\t");
                index++;
            };
            index2++;
            System.out.println();
        }
        System.out.println("");
        index = 0;
        for (int[] i : gugu) {
            for (int j : i) {
                System.out.print(j + " x " + (index+1) + " = " + (j * (index+1)) + "\t");
            }
            index++;
            System.out.println();
        }
    }
}
