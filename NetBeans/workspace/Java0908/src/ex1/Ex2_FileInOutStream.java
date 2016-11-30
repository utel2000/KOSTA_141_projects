package ex1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex2_FileInOutStream {

    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        // �о�� ������ ���
        String path1 = "C:\\Kosta141\\mytest\\resource\\test2.zip";
        // �о�� ������ �ű� ���
        String path2 = "C:\\Kosta141\\mytest\\target\\my2.zip";
        //������ �о� ���� ��Ʈ���� ���� �ۼ��ϴ� ��Ʈ���� �����ϱ� ���� ����
        // FileInOutStream�� ���Ͽ� ����Ǵ� 1�� ����Ʈ ��Ʈ��!
        FileInputStream fis = null;
        FileOutputStream fos = null;
        // �������� ���ؼ� �����ϴ� ��Ʈ�� : 2�� ��Ʈ��
        // ��ġ���� ���� ����� �� ����, �ݵ�� 1�� ��Ʈ���� ���ؼ� �����
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            // ��������� ����� ����
            fis = new FileInputStream(path1);
            fos = new FileOutputStream(path2);
            // ����Ʈ ��Ʈ���� ��� ������ ��(EOF) ��ȯ��(-1)
            int readv = -1; // EOF ��ȯ�� -1�� �ʱ�ȭ
            while ((readv = fis.read()) != -1) {
                fos.write(readv);
            }
            // flush()�� ������ �� ���, ���۸� ����ִ� �޼���.
            fos.flush();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(); // ���� ���
        } catch (IOException ex) { // fis.read()�� ��� �߻��� �� �ִ� ���� ó��
            ex.printStackTrace(); // ���� ���
        } finally {
            try {
                // ��Ʈ���� ���� ���� ��, �� ����� �� �ݵ�� �ڿ��� �����ؾ� ��!
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("�ɸ� �ð� : "+(end-start)+"��");
    }
}
