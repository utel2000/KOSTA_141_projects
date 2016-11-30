package ex1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ex1_File {

    public void makePath(File path) { // 디렉토리 생성
        // path를 추상화 한 File클래스를 생성한 후 path가 존재하는지 판단
        if (!path.exists()) {
            path.mkdirs();
            System.out.println("해당 경로를 만들었습니다.");
            System.out.println("Path : " + path.getAbsolutePath());
        }
    }

    public void makeFile(File path) throws IOException { // 파일 생성
        for (int i = 0; i < 100; i++) { // test 파일 100개 생성.
            String path2 = path + "\\test" + i + ".txt";
            File f2 = new File(path2);
            if (!f2.exists()) {
                // 리눅스에서 touch 명령어로 0byte짜리 파일을 만드는 것과 동일.
                f2.createNewFile();
            }
        }
        System.out.println("해당 경로에 파일을 만들었습니다.");
    }

    public ArrayList<String> getFileList(File path) { // 파일 리스트 조회
        // 1. 하위 경로의 목록을 문자열 배열로 반환
        String[] ars = path.list();
        // 2. ArrayList를 생성
        ArrayList<String> arlist = new ArrayList<>();
        // 3. 배열데이터 -> ArrayList 한번에 끝납니다.
        // 참고) arlist.toArray() : ArrayList -> 배열
        Collections.addAll(arlist, ars); // API : 배열 -> ArrayList
        System.out.println("ListSize : " + arlist.size());
        return arlist;
    }

    public void deletePath(File path) { // 파일 및 디렉토리 삭제
        if (path.exists()) {
            for (int i = 0; i < 100; i++) {
                String path2 = path + "\\test" + i + ".txt";
                File f2 = new File(path2);
                f2.delete();
                f2.getParentFile().delete();
            }
            System.out.println("해당 경로의 디렉토리를 삭제했습니다.");
            System.out.println("Path : " + path.getAbsolutePath());
        }
    }

    public void exe() throws IOException {
        String path = "C:\\kosta141\\mytest\\subtest";
        File f = new File(path);
        Scanner sc = new Scanner(System.in);
        exit:
        while (true) {
            System.out.print("[메뉴]\n1 - 경로 생성 / 2 - 파일 생성 "
                    + "/ 3 - 파일 리스트 / 4 - 파일 삭제 / 5 - 종료 : ");
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
