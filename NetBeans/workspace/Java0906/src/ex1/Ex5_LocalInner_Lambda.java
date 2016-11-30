package ex1;
// �ٽ�����Ʈ : �޼��� �ȿ��� ���Ǵ� ���������� �͸���Ŭ������ ���ٽĿ���
// �����Ϸ��� �� �� final Ư������ ����Ǿ �߰��� ���� �ٽ� ������ �� ����.
public class Ex5_LocalInner_Lambda {
    private int memNum = 18;
    public void innerMethod(int arg) {
        int localVar = 50;
        memNum = 200;
        MyInter1 myInter0 = new MyInter1() {
            @Override
            public void myMethod() {
                System.out.println(arg); // 19
                System.out.println(localVar); // 50
                System.out.println(memNum); // 200
            }
        };
        myInter0.myMethod();
        System.out.println("---------------------------");
        // [��������] ���� �͸���Ŭ������ ���ٽ����� ������ ���׽�Ʈ
        MyInter1 myInter02 = () -> {
            // local������ ���� �о� ���� - �߰��� �������� �ּ��� �����ϰ�
            // �����ϸ� ������ ��, ����� memNum�� �������.
            System.out.println(arg);
            System.out.println(localVar);
            System.out.println(memNum);
        };
        myInter02.myMethod();
        System.out.println("-----------------------------");
    }
    public static void main(String[] args) {
        Ex5_LocalInner_Lambda ell = new Ex5_LocalInner_Lambda();
        ell.innerMethod(19);
    }
}
