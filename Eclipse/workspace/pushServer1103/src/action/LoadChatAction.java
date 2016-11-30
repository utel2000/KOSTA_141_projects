package action;

import java.util.List;

import com.opensymphony.xwork2.Action;

import dao.ChatDAO;
import vo.ChatVO;

public class LoadChatAction implements Action {
	private String sendMsg;
	@Override
	public String execute() throws Exception {
		StringBuffer outs = new StringBuffer();
		List<ChatVO> list = ChatDAO.getDao().getList();
		// retry�� �ڹ��ڵ��.
		outs.append("retry: 1000\n")
		// data�� html�ڵ尡 �ȴ�.
		.append("data:");
		for (ChatVO e : list) {
			outs.append("[")
			.append(e.getU_id())
			.append("] : ")
			.append(e.getChat())
			.append("<br />");
		}
		outs.append("\n\n"); // flush�����̴�. �ݵ�� �ؾ��Ѵ� **********
		sendMsg = outs.toString();
		return SUCCESS;
	}
	public String getSendMsg() {
		return sendMsg;
	}
	
}
