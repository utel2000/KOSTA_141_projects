package ex2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ex6_Exception {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("c:/www/a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                System.out.println("���� ó���ʹ� ������� ������!");
                fis.close(); // ������ �ؾ��Ѵ�!
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
