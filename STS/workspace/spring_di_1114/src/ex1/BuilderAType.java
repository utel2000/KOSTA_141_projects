package ex1;

public class BuilderAType implements Buildable {
	private String msg;
	public BuilderAType() {
		this.msg = "BuilderAType �Դϴ�.";
	}
	@Override
	public String getMsg() {
		return msg;
	}
}
