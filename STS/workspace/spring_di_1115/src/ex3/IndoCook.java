package ex3;

public class IndoCook implements Cookable {
	private String menu;
	public IndoCook() {
		menu = "ī��";
	}
	@Override
	public String cookMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}

}
