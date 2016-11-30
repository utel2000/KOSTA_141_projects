package ex1;

public class Ex1_Encapsulation {
    // 멤버 필드는 어지간해선 열어놓는 일이 없으므로 private가 대부분 사용된다.
    private int pay; // 자원의 정보은닉화
    public int checkTeam(String pwd, int pay) {
        // 사용자에게 비밀번호(test12)를 입력 받아서 맞으면 pay에 값을 저장.
        if (!pwd.equals("test12")) {
            System.out.println("당신은 접근할 수 없지롱!");
            System.exit(0); // 프로그램 종료
        } else { // 비밀번호를 정확하게 입력한 경우
            System.out.println("반갑습니다. A팀님!");
            this.pay = pay;
        }
        return this.pay;
    }
}
