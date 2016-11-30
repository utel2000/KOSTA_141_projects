package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import vo.MemberDemoVO;

// ��������, memberForm.jsp���� �Ѿ���� �Ķ���͸�
public class MemberAddAction implements Action, Preparable, ModelDriven<MemberDemoVO> {
	private MemberDemoVO vo;
	@Override
	public String execute() throws Exception {
		// �����ϸ� ����� �ǵ��� �����غ��ÿ�.
		
		// log start
		StringBuffer log = new StringBuffer();
		log.append("----------\n")
		.append("<MemberAddAction.java> - public String execute()\n")
		.append("[Log] vo.getId() : ").append(vo.getId()).append("\n")
		.append("[Log] vo.getPwd() : ").append(vo.getPwd()).append("\n")
		.append("[Log] vo.getName() : ").append(vo.getName());
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		return SUCCESS;
	}
	@Override
	public MemberDemoVO getModel() {
		return vo;
	}
	@Override
	public void prepare() throws Exception {
		vo = new MemberDemoVO();
	}
}
