package ex3;
public class OrderCook implements OrderableCook {
	// DI될 객체를 선언.
//	private KorCook ic;
	private Cookable cAble;
	// setter를 사용해서 Spring에 의해서 DI될 메서드 정의
//	public void setKc(KorCook kc) {
//		this.kc = kc;
//	}
	public void setCAble(Cookable cAble) {
		this.cAble = cAble;
	}
	@Override
	public String orderMenu() {
		// orderMenu가 호출이 될 때는 이미 필요한 객체는 DI된 상태!
		return cAble.cookMenu();
	}
}
