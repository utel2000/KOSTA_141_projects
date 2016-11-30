package action;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.Action;

public class MyProfileAction implements Action{
	private String msg, todate;
	@Override
	public String execute() throws Exception {
		msg = "나 배짱이야.";
		todate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		return SUCCESS;
	}
	public String getMsg() {
		return msg;
	}
	public String getTodate() {
		return todate;
	}

}
