package action;
import com.opensymphony.xwork2.Action;
public class HelloAction implements Action{
	private String msg; // Value Stack
	@Override
	public String execute() throws Exception {
		msg = "³ªÀÇ Ã¹¹øÂ° ½ºÆ®·µÃ÷2 °í°í ¾Å¾Å! wow!";
		return SUCCESS;
	}
	public String getMsg() {
		return msg;
	}
}
