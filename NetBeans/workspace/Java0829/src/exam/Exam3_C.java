package exam;

import java.util.Scanner;

public class Exam3_C {
    // 멤버필드 문자열
    // Exam3_C r = new Exam3_C();
    // r.멤버변수 = "eodl" 에는 접근 못한다고 가정하고
    // 메서드를 사용해서 간단하게 값을 입력하게 하고
    // 또 다른 메서드를 사용해서 값을 반환 받아서 사용하도록
    // 제공 해보자.
    // String msg;
    // public void saveMsg(String msg) { }
    // public String returnMsg(){ return msg; }
    // ---------------------------
    // main메서드 만들어서 Exam3_C r = new Exam3_C();
    // saveMsg를 호출해서 Exam3의 멤버 필드에게 값을 저장
    // returnMsg()를 호출해서 String 값을 돌려받아서 출력.
    String msg;
    public void saveMsg(String m){
        msg = m + "★";
    }
    public String returnMsg(){
        return msg;
    }
    public static void main(String[] args) {
        Exam3_C ec = new Exam3_C();
        Exam3_C fc = new Exam3_C();
        Scanner sc = new Scanner(System.in);
        System.out.print("메세지를 입력하세요 : ");
        ec.saveMsg(sc.nextLine());
        System.out.println(ec.returnMsg());        
    }
}
