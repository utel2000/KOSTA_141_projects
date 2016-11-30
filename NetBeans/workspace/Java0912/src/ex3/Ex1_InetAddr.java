package ex3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex1_InetAddr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("도메인을 입력 : ");
        String host = sc.nextLine();
        try{
            // getByName(host) 입력값을 IntetAddress클래스로 생성.
            InetAddress[] ia = InetAddress.getAllByName(host);
            for(InetAddress e : ia){
            System.out.println("IP : " + e.getHostAddress());
            System.out.println("Host : "+e.getHostName());
            }
        }catch(UnknownHostException ex){
            ex.printStackTrace();
            System.out.println("알 수 없는 호스트 입니다!");
        }
    }
}
