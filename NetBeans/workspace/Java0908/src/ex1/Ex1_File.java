package ex1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ex1_File {

    public void makePath(File path) { // ���丮 ����
        // path�� �߻�ȭ �� FileŬ������ ������ �� path�� �����ϴ��� �Ǵ�
        if (!path.exists()) {
            path.mkdirs();
            System.out.println("�ش� ��θ� ��������ϴ�.");
            System.out.println("Path : " + path.getAbsolutePath());
        }
    }

    public void makeFile(File path) throws IOException { // ���� ����
        for (int i = 0; i < 100; i++) { // test ���� 100�� ����.
            String path2 = path + "\\test" + i + ".txt";
            File f2 = new File(path2);
            if (!f2.exists()) {
                // ���������� touch ��ɾ�� 0byte¥�� ������ ����� �Ͱ� ����.
                f2.createNewFile();
            }
        }
        System.out.println("�ش� ��ο� ������ ��������ϴ�.");
    }

    public ArrayList<String> getFileList(File path) { // ���� ����Ʈ ��ȸ
        // 1. ���� ����� ����� ���ڿ� �迭�� ��ȯ
        String[] ars = path.list();
        // 2. ArrayList�� ����
        ArrayList<String> arlist = new ArrayList<>();
        // 3. �迭������ -> ArrayList �ѹ��� �����ϴ�.
        // ����) arlist.toArray() : ArrayList -> �迭
        Collections.addAll(arlist, ars); // API : �迭 -> ArrayList
        System.out.println("ListSize : " + arlist.size());
        return arlist;
    }

    public void deletePath(File path) { // ���� �� ���丮 ����
        if (path.exists()) {
            for (int i = 0; i < 100; i++) {
                String path2 = path + "\\test" + i + ".txt";
                File f2 = new File(path2);
                f2.delete();
                f2.getParentFile().delete();
            }
            System.out.println("�ش� ����� ���丮�� �����߽��ϴ�.");
            System.out.println("Path : " + path.getAbsolutePath());
        }
    }

    public void exe() throws IOException {
        String path = "C:\\kosta141\\mytest\\subtest";
        File f = new File(path);
        Scanner sc = new Scanner(System.in);
        exit:
        while (true) {
            System.out.print("[�޴�]\n1 - ��� ���� / 2 - ���� ���� "
                    + "/ 3 - ���� ����Ʈ / 4 - ���� ���� / 5 - ���� : ");
            String menu = sc.nextLine();
            switch (menu) {
                case "1":
                    makePath(f);
                    break;
                case "2":
                    makeFile(f);
                    break;
                case "3":
                    for (String e : getFileList(f)) {
                        System.out.println(e);
                    }
                    break;
                case "4":
                    deletePath(f);
                    break;
                case "5":
                    System.exit(0);
                    break exit;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Ex1_File ref = new Ex1_File();
        ref.exe();
    }
}
