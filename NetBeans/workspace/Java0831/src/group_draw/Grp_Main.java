package group_draw;
// ����
public class Grp_Main {
    public static void main(String[] args) {
        // �θ��� ���հ�ü(�迭)
        // �������� ���� !
        // �ϳ��� ��ü(�ּ�) �ٸ� ��ü(�������� ��ü)�� ����, ���� �� �� �ִ� ��.
        Grp_Super[] gs = new Grp_Super[4];
        gs[0] = new Grp_Sub_Star();
        gs[1] = new Grp_Sub_Triangle();
        gs[2] = new Grp_Sub_Square();
        gs[3] = new Grp_Sub_Circle(); // ��Ӱ��谡 �ƴϸ� ���� ����.
        // ����
        for(Grp_Super g : gs){
            g.draw(); // �޴�
            // instanceof ���� : ��ü, ���� : Ÿ�� => DNA �˻�
            System.out.println(g instanceof Grp_Super);
        }
    }
}
