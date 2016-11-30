package ex1;

public class BuilderCType implements Buildable{
	private String msg;

	public BuilderCType() {
		this.msg = "BuilderCType ¿‘¥œ¥Ÿ.";
	}
	@Override
	public String getMsg() {
		return msg;
	}
}
