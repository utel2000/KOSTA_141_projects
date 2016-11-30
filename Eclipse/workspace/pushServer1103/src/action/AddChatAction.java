package action;

import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.ChatDAO;
import vo.ChatVO;

public class AddChatAction implements Action, Preparable, ModelDriven<ChatVO> {
	private ChatVO vo;
	private HttpServletRequest request;
	@Override
	public String execute() throws Exception {
		String u_id = URLDecoder.decode(vo.getU_id(),"utf-8");
		String chat = URLDecoder.decode(vo.getChat(),"utf-8");
		vo.setU_id(u_id); // ä�� �����.
		vo.setChat(chat); // ä�� �޼���.
		// �����Ǹ� �޾ƿ��� ���ؼ� struts2���� request��ü�� ����
		request = ServletActionContext.getRequest();
		// ������ ��� �� vo�� ����!
		System.out.println("���� ������ : " + request.getRemoteAddr());
		vo.setReip(request.getRemoteAddr());
		ChatDAO.getDao().insertChat(vo);
		return SUCCESS;
	}
	@Override
	public void prepare() throws Exception {
		vo = new ChatVO();
	}
	@Override
	public ChatVO getModel() {
		return vo;
	}
}
