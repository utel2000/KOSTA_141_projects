package ex3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex1_InetAddr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�������� �Է� : ");
        String host = sc.nextLine();
        try{
            // getByName(host) �Է°��� IntetAddressŬ������ ����.
            InetAddress[] ia = InetAddress.getAllByName(host);
            for(InetAddress e : ia){
            System.out.println("IP : " + e.getHostAddress());
            System.out.println("Host : "+e.getHostName());
            }
        }catch(UnknownHostException ex){
            ex.printStackTrace();
            System.out.println("�� �� ���� ȣ��Ʈ �Դϴ�!");
        }
    }
}
