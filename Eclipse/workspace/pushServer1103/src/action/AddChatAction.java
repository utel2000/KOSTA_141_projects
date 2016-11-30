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
		vo.setU_id(u_id); // 채팅 사용자.
		vo.setChat(chat); // 채팅 메세지.
		// 아이피를 받아오기 위해서 struts2에서 request객체를 생성
		request = ServletActionContext.getRequest();
		// 아이피 출력 및 vo에 저장!
		System.out.println("받은 아이피 : " + request.getRemoteAddr());
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
