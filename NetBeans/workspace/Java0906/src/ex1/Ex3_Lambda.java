package ex1;
public class Ex3_Lambda {
    public static void main(String[] args) {
        MyInter3 myInter3 = new MyInter3() {
            @Override
            public int myMethod(int x, int y) {
                return x * y;
            }
        };
        System.out.println(myInter3.myMethod(100, 2));
        // ���ٽ����� ǥ��
        MyInter3 myInter32 = (x, y) -> {
            int res = x * y;
            return res;
        };
        System.out.println(myInter32.myMethod(200, 10));
        // ���Ϲ��� ���� ���� �Ʒ�ó�� { }�� return���� ���� ����
        MyInter3 myInter33 = (x, y) -> x * y;
        System.out.println(myInter33.myMethod(200, 10));
    }
}
