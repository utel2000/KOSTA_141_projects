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

    private Socket socket; // �����κ��� ���ӹ��� ������ �ּ�
    private Ex1_Server server; // ������ �ּ�
    private BufferedReader in; // �������� ���� ����� �� ��Ʈ��
    private PrintWriter pw;
    private String reip;
    private ArrayList<String> al;

    // ������ ���� ��ü�� ������ ������ �ּҿ� ������ �ּҸ� �����ؼ� ����.
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

    // �����忡�� ��ų ���� ����..
    @Override
    public void run() {
        // �������� ���� Ŭ���̾�Ʈ�� �޼����� �޾Ƴ��� ���� ���ӹ޾���.
        while (true) {
            try {
                // 8. �������� �޼����� �޾Ƴ��� ���ŷ �޼���.
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

    // �޽����� �м��ϴ� �޼���
    private void transMsg(String msg) {
        // ex) talk/user/msg/null
        // draw/color/x/y/drawScale
        // '/'�������� ���� ������ Ŭ���̾�Ʈ���� ��� �Ծ� - protocol
        // ��� �ܵ��� Ex1_StringTokenizer�� ���� �����غ���.
        StringTokenizer stn = new StringTokenizer(msg, "/");
        // �����丵 ����^^ ����ҰԿ� -> ������� ���ƿ�..
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
