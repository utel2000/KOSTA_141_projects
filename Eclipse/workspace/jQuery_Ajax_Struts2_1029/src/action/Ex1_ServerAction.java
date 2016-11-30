package action;
import com.opensymphony.xwork2.Action;
public class Ex1_ServerAction implements Action {
	private String name; // setter만 필요
	private String orderNum; // setter만 필요
	private String status; // getter만 필요
	@Override
	public String execute() throws Exception {
		if(name.equals("김길동") && orderNum.equals("A001")) {
			status="주문하신 금괴가 지금 발송 중입니다.";
		} else if(name.equals("김길동") && orderNum.equals("A002")) {
			status="주문하신 자동차는 공장에서 주문생산 완료 되었습니다.";
		} else {
			status="이미 발송이 완료된 제품입니다.";
		}
		return SUCCESS;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getStatus() {
		return status;
	}
}
