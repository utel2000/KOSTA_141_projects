package ex3;
// OrderCook이란 객체에게 DI될 대상객체!(재사용성을 기반으로 설계되는 객체)
// 이러한 종류가 여러개 있다면 다형성..!!
public class KorCook implements Cookable {
	private String menu;
	public KorCook() {
		// 요청에 따른 값을 초기화 할 수 있는 비즈니스 로직을 담는 영역
		menu = "된장찌개";
	}
	@Override
	public String cookMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
}
