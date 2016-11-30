package ex2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Ex1_Client {
    public Ex1_Client(){
        try(Socket s = new Socket("localhost", 999)){
            // 서버는 요청을 받아서 클라이언트에게 응답
            // 연결된 소켓에서 스트림을 생성해서 사용
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            // 2차스트림을 사용해서 개선
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            PrintWriter pw = new PrintWriter(new BufferedOutputStream(os),true);
            String msg = "하이";
            pw.println("Client : "+msg); // 1번. 서버로 요청
            String svmsg = br.readLine(); // 4번. 서버로부터 응답 받음.
            System.out.println(svmsg);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Ex1_Client();
    }
}
