package review0829;

import java.util.Scanner;

public class Review_Exam3_C {

    String msg;

    public void saveMsg(String m) {
        msg = m + "★";
    }

    public String returnMsg() {
        return msg;
    }

    public static void main(String[] args) {
        Review_Exam3_C ec = new Review_Exam3_C();
        Review_Exam3_C fc = new Review_Exam3_C();
        Scanner sc = new Scanner(System.in);
        System.out.print("메세지를 입력하세요 : ");
        ec.saveMsg(sc.nextLine());
        System.out.println(ec.returnMsg());
    }
}
