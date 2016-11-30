package ex1;

public class BuilderBType implements Buildable {
	private String msg;
	public BuilderBType() {
		this.msg = "BuilderBType ¿‘¥œ¥Ÿ.";
	}
	@Override
	public String getMsg() {
		return msg;
	}
}
