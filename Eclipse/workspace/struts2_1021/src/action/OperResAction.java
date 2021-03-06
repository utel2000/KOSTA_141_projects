package action;

import com.opensymphony.xwork2.Action;

// 비동기식으로 operRes 전송되어 올 때 응답할 Action
// num1, num2, cho
public class OperResAction implements Action{
	private int num1, num2;
	private String cho;
	private int res;
	@Override
	public String execute() throws Exception {
		if(cho.equals("0")){
			res = num1 + num2;
		} else if(cho.equals("1")){
			res = num1 - num2;
		} else if(cho.equals("2")){
			res = num1 * num2;
		} else if(cho.equals("3")){
			res = num1 / num2;
		}
		
		// log start
		StringBuffer log = new StringBuffer();
		System.out.println("<OperResAction> - public String execute()");
		log.append("[Log] num1 : ").append(num1).append("\n")
		.append("[Log] num2 : ").append(num2).append("\n")
		.append("[Log] cho : ").append(cho).append("\n")
		.append("[Log] res : ").append(res);
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		return SUCCESS;
	}
	public int getRes() {
		return res;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public void setCho(String cho) {
		this.cho = cho;
	}
}