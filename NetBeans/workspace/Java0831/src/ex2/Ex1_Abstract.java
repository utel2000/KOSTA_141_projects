package ex2;
// <�߻�Ŭ����>
// 1. �߻�Ŭ���� : new�� ������ �� ����, ���� �ڽ�Ŭ������ ���ؼ� ������� ����.
// 2. �߻�޼���(��ü�� ����, �̱�����)�� ������ �ִ� Ŭ����. (������)
public abstract class Ex1_Abstract {
    // �߻�޼��� : �ݵ�� �ڽ�Ŭ������ ��� ������ ������ �ؾ� �ϴ� å���ִ�(����)
    // abstract��� Ű���带 �ٿ��� �Ѵ�.
    private String money;
    public Ex1_Abstract(){
        money="1000���";
    }
    // �θ��� �ڿ��� ������ �� �ֵ��� ����
    public String getMoney(){
        return money;
    }
    // �߻�޼��� (å��) : abstract
    public abstract void moveMountain();
}
