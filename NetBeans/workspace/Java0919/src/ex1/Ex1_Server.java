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
        // 2. ������ �ʱ�ȭ
        // ���� ����, ServerThread�� ������ ArrayList ����.
        try {
            ss = new ServerSocket(port);
            clist = new ArrayList<>();
            System.out.println("Start Server!");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void execute() {
        // 4. ���� �ݺ��ϸ鼭 Socket�� accept() ������ ����Ѵ�.
        while (true) {
            try {
                Socket s = ss.accept();
                String reip = s.getInetAddress().getHostAddress();
                System.out.println("Log Client IP : " + reip);
                // 6. �����ؿ� Ŭ���̾�Ʈ�� ������ ServerThread�� ���� �ϵ���
                // �� ���� ������ �� ������ ���� ���ѵΰ�
                // �� ���� Generic���� ������ �ִ� ArrayList�� �� �ּҸ�
                // �־ ������ �ּҸ� �޸� ������ �����ϰ� �Ѵ�.
                // ������� start() �Ѵ�.
                Ex1_ServerThread ct = new Ex1_ServerThread(s, this);
                clist.add(ct);
                ct.start();
                System.out.println("Current number of Client : " + clist.size());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    // 9. �ᱹ Ŭ���̾�Ʈ�� ���������� �м��ؼ� ������ ��� Ŭ���̾�Ʈ���� ����.
    public void sendMsg(ArrayList<String> al, String reip) {
        // str1/str2/str3/str4/str5
        // ������ ������ �� �� ���� �´� ���������� �����ϱ� �ٶ�.
        StringBuffer sb = new StringBuffer();
        String str = "";
        if (al.get(0).equals("talk")) {
            sb.append(al.get(0)).append("/")
                    .append(reip).append("/")
                    .append(al.get(1)).append("/")
                    .append(al.get(2));
            str = sb.toString();
        } else if (al.get(0).equals("draw")) {
            // �̷�������.. draw/color/x/y/drawScale/ ���� ���� �� �ִ�.
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
        // ��� �������� ��ε�ĳ������ �Ѵ�.
        // ��� ������ ����?
        // for���� ����ؼ�
        for (Ex1_ServerThread c : clist) {
            c.getPw().println(str);
        }
    }

    public static void main(String[] args) {
        // 1. ���� ������ ���ؼ� port�� 9999������ �Է��� ���� ��ü�� �����Ѵ�.
        Ex1_Server es = new Ex1_Server(9999);
        // 3. ������ Ex1_Server ��ü�� execute�޼��带 ȣ���Ѵ�.
        es.execute();
    }
}
