package home;

import java.util.Scanner;

public class Home2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ȣ����, ����, ��, �� �Է� : ");
        String strAnimal = sc.nextLine();
        if(strAnimal.equals("ȣ����")){
            System.out.println("ȣ���̴� ����! �ϰ� ��ϴ�.");
        }else if(strAnimal.equals("����")){
            System.out.println("����� �ƿ�~ �ϰ� ��ϴ�.");
        }else if(strAnimal.equals("��")){
            System.out.println("���� ����.. �ϰ� ��ϴ�.");
        }else if(strAnimal.equals("��")){
            System.out.println("���� �����! �ϰ� ��ϴ�.");
        }else{
            System.out.println("[�ȳ�] ���� �̸��� �ٸ��� �Է����ּ���.");
        }
    }
}
