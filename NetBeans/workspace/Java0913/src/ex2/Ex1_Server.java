package ex2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex1_Server {

    public Ex1_Server(){
        try (ServerSocket ss = new ServerSocket(999)) {
            System.out.println("Server Start!");
            while (true) {
                // 클라이언트가 서버에 접속시에 동작하는 메서드
                Socket s = ss.accept();
                System.out.println("Client Connect : "
                        + s.getInetAddress().getHostAddress());
                // 서버는 요청을 받아서 클라이언트에게 응답
                // 연결된 소켓에서 스트림을 생성해서 사용
                InputStream is = s.getInputStream();
                OutputStream os = s.getOutputStream();
                // 2차 스트림을 사용해서 개선
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                PrintWriter pw = new PrintWriter(new BufferedOutputStream(os), true);
                String msg = br.readLine(); // 2번. 서버가 요청을 받고
                pw.println("성호's 서버 : " + msg); // 3번. 서버가 클라이언트에게 응답.
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Ex1_Server();
    }
}

