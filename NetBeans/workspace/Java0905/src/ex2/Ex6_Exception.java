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
                System.out.println("예외 처리와는 상관없이 무조건!");
                fis.close(); // 무조건 해야한다!
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
