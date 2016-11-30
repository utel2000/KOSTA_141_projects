package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Exam_SearchArray {
    static int[] data = {1, 2, 8, 9, 3, 4, 5, 6, 7, 10};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 숫자를 입력하세요(1~10) : ");
        int numUser = Integer.parseInt(sc.nextLine());
        int indexLast = data.length;
        int numRes = 0;
        int numChk = 1;
        boolean flag = false;
        // 인덱스 찾기
        for (int i : data) {
            if (numUser == i) {
                flag = true;
                numRes = numChk;
            }
            numChk++;
        }
        Arrays.sort(data); // 오름차순 정열
        // 출력
        for (int i : data) {
            System.out.print(i + "\t");
        }
        System.out.println("검색할 데이터 : " + numUser);
        if (flag) {
            System.out.println("검색 결과 : " + numUser + "을(를) "
                    + numRes + "번 위치에서 발견했습니다.");
        }else{
            System.out.println("검색 결과 : 찾지 못했습니다.");
        }
    }
}
