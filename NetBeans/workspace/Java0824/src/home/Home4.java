package home;

import java.util.Scanner;

public class Home4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�ֹι�ȣ �Է�(oooooo-ooooooo) : ");
        String str = sc.nextLine();
        char chkGender = str.charAt(7);
        if(chkGender=='1' || chkGender=='3'){
            System.out.println("���: �����Դϴ�.");
        }else if(chkGender=='2' || chkGender=='4'){
            System.out.println("���: �����Դϴ�.");
        }else{
            System.out.println("[�ȳ�] �ùٸ� �ֹε�Ϲ�ȣ�� ��Ŀ� ���� �Է����ּ���. oooooo-ooooooo");
        }
    }
}
