package ex3;
public class OrderCook implements OrderableCook {
	// DI�� ��ü�� ����.
//	private KorCook ic;
	private Cookable cAble;
	// setter�� ����ؼ� Spring�� ���ؼ� DI�� �޼��� ����
//	public void setKc(KorCook kc) {
//		this.kc = kc;
//	}
	public void setCAble(Cookable cAble) {
		this.cAble = cAble;
	}
	@Override
	public String orderMenu() {
		// orderMenu�� ȣ���� �� ���� �̹� �ʿ��� ��ü�� DI�� ����!
		return cAble.cookMenu();
	}
}
