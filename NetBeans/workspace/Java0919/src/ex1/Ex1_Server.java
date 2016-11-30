package ex1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex1_Server {

    private ServerSocket ss;
    private ArrayList<Ex1_ServerThread> clist;
    private String reip;

    public Ex1_Server(int port) {
        // 2. 생성자 초기화
        // 소켓 생성, ServerThread를 저장할 ArrayList 생성.
        try {
            ss = new ServerSocket(port);
            clist = new ArrayList<>();
            System.out.println("Start Server!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void execute() {
        // 4. 무한 반복하면서 Socket의 accept() 접속을 대기한다.
        while (true) {
            try {
                Socket s = ss.accept();
                String reip = s.getInetAddress().getHostAddress();
                System.out.println("Log Client IP : " + reip);
                // 6. 접속해온 클라이언트의 소켓을 ServerThread가 관리 하도록
                // 한 명이 접속해 올 때마다 생성 시켜두고
                // 이 것을 Generic으로 가지고 있는 ArrayList에 그 주소를
                // 넣어서 소켓의 주소를 메모리 영역을 참조하게 한다.
                // 스레드는 start() 한다.
                Ex1_ServerThread ct = new Ex1_ServerThread(s, this);
                clist.add(ct);
                ct.start();
                System.out.println("Current number of Client : " + clist.size());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    // 9. 결국 클라이언트의 프로토콜을 분석해서 접속한 모든 클라이언트에게 전송.
    public void sendMsg(ArrayList<String> al, String reip) {
        // str1/str2/str3/str4/str5
        // 서버를 제작할 때 각 조에 맞는 프로토콜을 설계하기 바람.
        StringBuffer sb = new StringBuffer();
        String str = "";
        if (al.get(0).equals("talk")) {
            sb.append(al.get(0)).append("/")
                    .append(reip).append("/")
                    .append(al.get(1)).append("/")
                    .append(al.get(2));
            str = sb.toString();
        } else if (al.get(0).equals("draw")) {
            // 이런식으로.. draw/color/x/y/drawScale/ 등을 보낼 수 있다.
            sb.append(al.get(0)).append("/")
                    .append(al.get(1)).append("/")
                    .append(al.get(2)).append("/")
                    .append(al.get(3)).append("/")
                    .append(al.get(4));
            str = sb.toString();
        } else {
                 sb.append(al.get(0)).append("/")
                    .append(al.get(1));
            str = sb.toString();
        }
        // 모든 유저에게 브로드캐스팅을 한다.
        // 모든 유저라 함은?
        // for문을 사용해서
        for (Ex1_ServerThread c : clist) {
            c.getPw().println(str);
        }
    }

    public static void main(String[] args) {
        // 1. 서버 시작을 위해서 port를 9999번으로 입력한 서버 객체를 생성한다.
        Ex1_Server es = new Ex1_Server(9999);
        // 3. 생성된 Ex1_Server 객체의 execute메서드를 호출한다.
        es.execute();
    }
}
