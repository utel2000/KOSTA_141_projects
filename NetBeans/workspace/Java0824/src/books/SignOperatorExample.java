package books;

public class SignOperatorExample {
// ������ �ҽ� �ڵ� p.69

    public static void main(String[] args) {
        int x = -100;
        int result1 = +x; // +��� ����(x�� +�� ���Ѵ�.)
        int result2 = -x; // -��� ����(x�� -�� ���Ѵ�.)
        System.out.println("result1= " + result1); // R: result1= -100
        System.out.println("result2= " + result2); // R: result2= 100

        short s = 100;
        //short result3 = -s // ������ ����: -����Ǹ� 4byte�� int���� �Ǿ ���� �߻�.
        int result3 = -s; // ���θ�ǿ� ���� result3�� int������ ����.
        System.out.println("result= " + result3); // R: result= -100
    }
}
