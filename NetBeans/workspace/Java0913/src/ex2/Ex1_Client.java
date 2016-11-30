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
            // ������ ��û�� �޾Ƽ� Ŭ���̾�Ʈ���� ����
            // ����� ���Ͽ��� ��Ʈ���� �����ؼ� ���
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            // 2����Ʈ���� ����ؼ� ����
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            PrintWriter pw = new PrintWriter(new BufferedOutputStream(os),true);
            String msg = "����";
            pw.println("Client : "+msg); // 1��. ������ ��û
            String svmsg = br.readLine(); // 4��. �����κ��� ���� ����.
            System.out.println(svmsg);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Ex1_Client();
    }
}
