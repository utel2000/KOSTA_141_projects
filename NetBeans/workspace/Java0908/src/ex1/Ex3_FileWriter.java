package ex1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex3_FileWriter implements Ex3_Message {

    private String path;

    public Ex3_FileWriter() {
        path = "C:\\Kosta141\\mytest\\resource\\res.txt";
    }

    @Override
    public void addWriter(String msg) {
        // new FileWriter(path, true) : ����, 1�� ��Ʈ��
        // �������� ���� �� �ι�° ���� append�� (�̾��)
        // autoClose�� �����غ��Ҵ�.(���� autoClose�� ������ ���� �ñ����?)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(msg); // ������ ������ path�� �ۼ�
            bw.newLine(); // �ٹٲ�
            bw.flush(); // ���� ����ֱ�
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    // res.txt���� �� �� ����(readLine())�� �о�ͼ�
    // StringBuffer�� ������ �� String���� ��ȯ�ϴ� �޼���
    @Override
    public String getView() {
        StringBuffer sb = new StringBuffer();
        // autoClose����. implements Closeable�Ǿ��ִ� �͸� autoClose ���� ����.
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String str = null; // ���ڿ��� ���� null
            while((str = br.readLine())!=null){
                sb.append(str).append("\n");
            }
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return sb.toString();
    }

    @Override
    public void remove() throws IOException {
        File f = new File(path);
        if(f.delete()){ // ���� ��
            f.createNewFile(); // ����ִ� ���� �����.
        }
    }
    public static void main(String[] args) throws IOException {
        Ex3_Message ef = new Ex3_FileWriter();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("[�޴�]\n1. �Է�, 2. ���, 3. ����, 4. ���� : ");
            String menu = sc.nextLine();
            if(menu.equals("1")){
                System.out.println("MSG : ");
                String msg = sc.nextLine();
                ef.addWriter(msg); // �������̽��� �߻�޼��� ȣ��
            }else if(menu.equals("2")){
                System.out.println(ef.getView());
            }else if(menu.equals("3")){
                ef.remove();
            }else{
                System.out.println("�����մϴ�.");
                break;
            }
        }
    }
}
