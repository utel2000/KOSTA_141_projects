package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.ChatDao;
import vo.ChatVO;

public class ChatAddAction implements Action, Preparable, ModelDriven<ChatVO>{
	private ChatVO cvo;

	@Override
	public ChatVO getModel() { 
		return cvo;
	}

	@Override
	public void prepare() throws Exception {
		cvo = new ChatVO();
	}

	@Override
	public String execute() throws Exception {
		
		System.out.println("[check][ChatAddAction] chat_usr : " + cvo.getChat_usr());
		System.out.println("[check][ChatAddAction] chat_cont : " + cvo.getChat_cont());
		ChatDao.getDao().chatAdd(cvo);
		
		return SUCCESS;
	}
}
