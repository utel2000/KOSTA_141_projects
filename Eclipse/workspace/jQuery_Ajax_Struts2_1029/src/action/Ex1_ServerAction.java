package action;
import com.opensymphony.xwork2.Action;
public class Ex1_ServerAction implements Action {
	private String name; // setter�� �ʿ�
	private String orderNum; // setter�� �ʿ�
	private String status; // getter�� �ʿ�
	@Override
	public String execute() throws Exception {
		if(name.equals("��浿") && orderNum.equals("A001")) {
			status="�ֹ��Ͻ� �ݱ��� ���� �߼� ���Դϴ�.";
		} else if(name.equals("��浿") && orderNum.equals("A002")) {
			status="�ֹ��Ͻ� �ڵ����� ���忡�� �ֹ����� �Ϸ� �Ǿ����ϴ�.";
		} else {
			status="�̹� �߼��� �Ϸ�� ��ǰ�Դϴ�.";
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
