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
        // new FileWriter(path, true) : 문자, 1차 스트림
        // 생성자의 인자 중 두번째 인자 append값 (이어쓰기)
        // autoClose로 구현해보았다.(아직 autoClose를 현업에 쓰긴 시기상조?)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(msg); // 버퍼의 내용을 path로 작성
            bw.newLine(); // 줄바꿈
            bw.flush(); // 버퍼 비워주기
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    // res.txt에서 한 줄 단위(readLine())로 읽어와서
    // StringBuffer에 저장한 후 String으로 반환하는 메서드
    @Override
    public String getView() {
        StringBuffer sb = new StringBuffer();
        // autoClose구현. implements Closeable되어있는 것만 autoClose 구현 가능.
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String str = null; // 문자열의 끝은 null
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
        if(f.delete()){ // 삭제 후
            f.createNewFile(); // 비어있는 파일 만들기.
        }
    }
    public static void main(String[] args) throws IOException {
        Ex3_Message ef = new Ex3_FileWriter();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("[메뉴]\n1. 입력, 2. 출력, 3. 삭제, 4. 종료 : ");
            String menu = sc.nextLine();
            if(menu.equals("1")){
                System.out.println("MSG : ");
                String msg = sc.nextLine();
                ef.addWriter(msg); // 인터페이스의 추상메서드 호출
            }else if(menu.equals("2")){
                System.out.println(ef.getView());
            }else if(menu.equals("3")){
                ef.remove();
            }else{
                System.out.println("종료합니다.");
                break;
            }
        }
    }
}
