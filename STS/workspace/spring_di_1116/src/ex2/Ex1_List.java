package ex2;

import java.util.List;

public class Ex1_List {
	// DI받을 멤버를 선언!
	private List<String> items;
	private List<Float> items2;
	public void setItems(List<String> items) {
		this.items = items;
	}
	public List<String> getItems() {
		return items;
	}
	public List<Float> getItems2() {
		return items2;
	}
	public void setItems2(List<Float> items2) {
		this.items2 = items2;
	}
}
