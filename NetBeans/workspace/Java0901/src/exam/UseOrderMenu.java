package exam;
import java.util.Arrays;
import java.util.Scanner;
public class UseOrderMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴(kor, indo, china) : ");
        String menu = sc.nextLine();
        OrderMenu m = useMenu(menu);
        String cookMenu = sc.nextLine();
        String res = m.orderMenu(cookMenu);
        System.out.println(res);
        System.exit(0);
    }
    public static OrderMenu useMenu(String menu) {
        OrderMenu m;
        if (menu.equals("kor")) {
            System.out.println(Arrays.toString(OrderMenu.aType));
            m = new KorCook(); // 인터페이스도 다형성을 가질 수 있다.
        } else if (menu.equals("indo")) {
            System.out.println(Arrays.toString(OrderMenu.bType));
            m = new IndoCook(); // 인터페이스도 다형성을 가질 수 있다.
        } else if (menu.equals("china")) {
            System.out.println(Arrays.toString(OrderMenu.cType));
            m = new ChinaCook(); // 인터페이스도 다형성을 가질 수 있다.
        } else {
            System.out.println("준비중");
            m = null;
            System.exit(0);
        }
        return m;
    }
}
