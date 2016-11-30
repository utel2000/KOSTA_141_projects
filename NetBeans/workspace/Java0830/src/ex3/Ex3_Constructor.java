package ex3;

public class Ex3_Constructor {
    // 생성자 오버로딩은 생성을 할 수 있는 다양한 방법을 제공.
    private String name;
    private int num;
    public Ex3_Constructor(){
    }
    public Ex3_Constructor(String name){
        this.name = name;
    }
    public Ex3_Constructor(int num){
        this.num = num;
    }
    public Ex3_Constructor(String name, int num){
        this.name = name;
        this.num = num;
    }
    public Ex3_Constructor(int num, String name){
        this.num = num;
        this.name = name;
    }
    public static void main(String[] args) {
        Ex3_Constructor ec1 = new Ex3_Constructor();
        Ex3_Constructor ec2 = new Ex3_Constructor("이름");
        Ex3_Constructor ec3 = new Ex3_Constructor(5);
        Ex3_Constructor ec4 = new Ex3_Constructor("이름", 5);
        Ex3_Constructor ec5 = new Ex3_Constructor(5, "이름");
    }
}
