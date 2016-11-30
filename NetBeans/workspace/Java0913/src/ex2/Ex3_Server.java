package ex2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

public class Ex3_Server {
private ServerSocket ss;
private Properties prop;
    public Ex3_Server() {
        try {
            ss = new ServerSocket(9999);
            prop=new Properties();
            // 무한적으로 대기
            while (true) {
                Socket s = ss.accept();
                System.out.println("Server Start!");
                String ip = s.getInetAddress().getHostAddress();
                System.out.println("Server Log 1 : " + ip + "에서 접속.");
                while (true) {
                    InputStream is = s.getInputStream();
                    OutputStream os = s.getOutputStream();
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));
                    PrintWriter pw = new PrintWriter(new BufferedOutputStream(os), true);
                    String msg = br.readLine(); 
                    prop.load(new BufferedReader(new FileReader("src/ex2/Ex2_msg.properties")));
                    if(msg!=null){
                        System.out.println("Server Log 2 : " + msg);
                        StringBuffer sb = new StringBuffer();
                        sb.append("IP : ").append(ip).append(":");
                        sb.append(prop.getProperty(msg, "아직 배우지 못한 말입니다. ㅠㅠ"));
                        pw.println(sb.toString());
                    }
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Ex3_Server();
    }
}
