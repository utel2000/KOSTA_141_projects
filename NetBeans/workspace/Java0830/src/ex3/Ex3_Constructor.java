package ex3;

public class Ex3_Constructor {
    // ������ �����ε��� ������ �� �� �ִ� �پ��� ����� ����.
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
        Ex3_Constructor ec2 = new Ex3_Constructor("�̸�");
        Ex3_Constructor ec3 = new Ex3_Constructor(5);
        Ex3_Constructor ec4 = new Ex3_Constructor("�̸�", 5);
        Ex3_Constructor ec5 = new Ex3_Constructor(5, "�̸�");
    }
}
