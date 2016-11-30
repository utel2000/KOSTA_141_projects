package study_exam;

public class Exam_StringToCharArray {
    public static void main(String[] args) {
        String str = "Hello world!";
        char[] ch = new char[12];
        int index = 0;
        for(char i : ch){
            ch[index] = str.charAt(index);
            System.out.print(ch[index]);
            index++;
        }
    }
}
