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
                // Ŭ���̾�Ʈ�� ������ ���ӽÿ� �����ϴ� �޼���
                Socket s = ss.accept();
                System.out.println("Client Connect : "
                        + s.getInetAddress().getHostAddress());
                // ������ ��û�� �޾Ƽ� Ŭ���̾�Ʈ���� ����
                // ����� ���Ͽ��� ��Ʈ���� �����ؼ� ���
                InputStream is = s.getInputStream();
                OutputStream os = s.getOutputStream();
                // 2�� ��Ʈ���� ����ؼ� ����
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                PrintWriter pw = new PrintWriter(new BufferedOutputStream(os), true);
                String msg = br.readLine(); // 2��. ������ ��û�� �ް�
                pw.println("��ȣ's ���� : " + msg); // 3��. ������ Ŭ���̾�Ʈ���� ����.
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Ex1_Server();
    }
}

