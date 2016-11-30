package ex2;
import java.util.ArrayList;
public class Ex3_MemArray {
    public static void main(String[] args) {
        // 회원의 데이터를 저장한 객체를 ArrayList에 저장한 후
        // 모두 한 번에 출력 해보자.
        // 1 회원의 데이터를 저장한 객체
        MemberVO v = new MemberVO();
        // 2. ArrayList에 저장.
        ArrayList<MemberVO> ar = new ArrayList<>();
        v.setId("xman");
        v.setPwd("12");
        v.setAge(10);
        ar.add(v); // 1명째 데이터 기억
        MemberVO v1 = new MemberVO();
        v1.setId("xman1");
        v1.setPwd("22");
        v1.setAge(20);
        ar.add(v1); // 2명째 데이터 기억
        MemberVO v2 = new MemberVO();
        v2.setId("xman2");
        v2.setPwd("32");
        v2.setAge(30);
        ar.add(v2); // 3명째 데이터 기억
        // 출력
        for(MemberVO i : ar){
            System.out.println("ID : " + i.getId());
            System.out.println("Pwd : " + i.getPwd());
            System.out.println("Age : " + i.getAge());
            System.out.println("-------------------");
        }
    }
}
