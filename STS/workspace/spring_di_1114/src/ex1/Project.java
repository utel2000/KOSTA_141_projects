package ex1;

public class Project {
	private Buildable builder;
	public Project(Buildable builder) {
		this.builder = builder;
	}
	public Buildable getBuilder() {
		return builder;
	}
	public void setBuilder(Buildable builder) {
		this.builder = builder;
	}
}
