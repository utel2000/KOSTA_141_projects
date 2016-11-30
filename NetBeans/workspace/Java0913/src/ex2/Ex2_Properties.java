package ex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Ex2_Properties {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        // 좀더 빠르게 읽어 오고 싶을 땐 개선할 수 있다.
        prop.load(new FileInputStream("src/ex2/Ex2_msg.properties"));
        // 서버가 클라이언트로부터 요청을 받았을 때를 잠시 테스트...
        Scanner sc = new Scanner(System.in);
        exit:
        while(true){
            System.out.println("Test Msg : ");
            String msg = sc.nextLine();
            System.out.println(prop.getProperty(msg, "아직 배우지 못했습니다."));
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
