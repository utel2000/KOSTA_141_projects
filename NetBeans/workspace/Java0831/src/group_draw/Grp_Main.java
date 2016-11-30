package group_draw;
// 메인
public class Grp_Main {
    public static void main(String[] args) {
        // 부모의 집합객체(배열)
        // 다형성의 개념 !
        // 하나의 객체(주소) 다른 객체(여러개의 객체)를 생성, 참조 할 수 있는 것.
        Grp_Super[] gs = new Grp_Super[4];
        gs[0] = new Grp_Sub_Star();
        gs[1] = new Grp_Sub_Triangle();
        gs[2] = new Grp_Sub_Square();
        gs[3] = new Grp_Sub_Circle(); // 상속관계가 아니면 참여 못함.
        // 실행
        for(Grp_Super g : gs){
            g.draw(); // 메뉴
            // instanceof 좌항 : 객체, 우항 : 타입 => DNA 검사
            System.out.println(g instanceof Grp_Super);
        }
    }
}
