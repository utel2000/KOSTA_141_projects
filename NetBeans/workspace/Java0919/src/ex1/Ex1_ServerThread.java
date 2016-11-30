package ex1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex1_ServerThread extends Thread {

    private Socket socket; // 서보로부터 위임받을 소켓의 주소
    private Ex1_Server server; // 서버의 주소
    private BufferedReader in; // 소켓으로 부터 연결될 두 스트림
    private PrintWriter pw;
    private String reip;
    private ArrayList<String> al;

    // 서버가 현재 객체를 생성시 소켓의 주소와 서버의 주소를 주입해서 전달.
    public Ex1_ServerThread(Socket socket, Ex1_Server server) {
        this.socket = socket;
        this.server = server;
        reip = socket.getInetAddress().getHostAddress();
        try {
            pw = new PrintWriter(new BufferedOutputStream(socket.getOutputStream()), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // 스레드에게 시킬 일을 정의..
    @Override
    public void run() {
        // 소켓으로 부터 클라이언트의 메세지를 받아내는 일을 위임받았음.
        while (true) {
            try {
                // 8. 지속적인 메세지를 받아내는 블록킹 메서드.
                String msg = in.readLine();
                // talk/nickname/msg/null/null
                // draw/x/y/color/drawScale
                System.out.println("Server Log : [Client Message]" + msg);
                transMsg(msg);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    // 메시지를 분석하는 메서드
    private void transMsg(String msg) {
        // ex) talk/user/msg/null
        // draw/color/x/y/drawScale
        // '/'구분으로 만든 서버와 클라이언트간의 통신 규약 - protocol
        // 잠시 외도를 Ex1_StringTokenizer를 만들어서 연습해보자.
        StringTokenizer stn = new StringTokenizer(msg, "/");
        // 리펙토링 구간^^ 기대할게요 -> 기대하지 말아요..
        al = new ArrayList<>();
        while(stn.hasMoreTokens()) {
            al.add(stn.nextToken());
        }
        server.sendMsg(al, reip);
    }

    public PrintWriter getPw() {
        return pw;
    }
}
