package ex3;
// OrderCook�̶� ��ü���� DI�� ���ü!(���뼺�� ������� ����Ǵ� ��ü)
// �̷��� ������ ������ �ִٸ� ������..!!
public class KorCook implements Cookable {
	private String menu;
	public KorCook() {
		// ��û�� ���� ���� �ʱ�ȭ �� �� �ִ� ����Ͻ� ������ ��� ����
		menu = "�����";
	}
	@Override
	public String cookMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
}
