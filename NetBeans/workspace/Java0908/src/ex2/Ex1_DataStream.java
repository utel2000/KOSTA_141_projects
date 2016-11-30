package ex2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

public class Ex1_DataStream {
    private static String path = "C:\\Kosta141\\mytest\\resource\\data.txt";
    public static void outputTest(){
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(path))){
            dos.writeBoolean(true);
            dos.writeInt(2000);
            dos.writeChar('A');
            dos.writeDouble(39.9);
            dos.writeUTF("My Test!");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void inputTest(){
        try(DataInputStream dis = new DataInputStream(new FileInputStream(path))){
            // Point : 읽어들일 때 작성한 자료형의 순서대로 해야만 함.
            System.out.println(dis.readBoolean());
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        outputTest();
//        inputTest();
    }
}
