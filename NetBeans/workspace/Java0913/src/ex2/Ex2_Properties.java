package ex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Ex2_Properties {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        // ���� ������ �о� ���� ���� �� ������ �� �ִ�.
        prop.load(new FileInputStream("src/ex2/Ex2_msg.properties"));
        // ������ Ŭ���̾�Ʈ�κ��� ��û�� �޾��� ���� ��� �׽�Ʈ...
        Scanner sc = new Scanner(System.in);
        exit:
        while(true){
            System.out.println("Test Msg : ");
            String msg = sc.nextLine();
            System.out.println(prop.getProperty(msg, "���� ����� ���߽��ϴ�."));
            switch(msg){
                case "exit":
                    System.exit(0);
                    break exit;
                case "quit":
                    System.exit(0);
                    break exit;
                }
        }
        
    }
}
