package action;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

import dao.ChatDao;
import vo.ChatVO;

public class ChatListAction implements Action, SessionAware{
	private List<ChatVO> chlist;
	private String m_id;
	private String sendMsg;
	private Map<String, Object> session;
	
	@Override
	public String execute() throws Exception {
		m_id = session.get("m_id").toString();
		chlist = ChatDao.getDao().chatList();
		StringBuffer outs = new StringBuffer();	
		outs.append("retry:1500\n");
		outs.append("data:");
		outs.append("<div class='direct-chat-info clearfix'>");
		for(ChatVO e: chlist){
			outs.append("<span class='direct-chat-name pull-left'>");
			outs.append(e.getChat_usr()).append("</span></div><br/>");
			if(e.getChat_usr().equals(m_id)){
				outs.append("<div class='direct-chat-text' style='font-weight : bold;'>");
			}else{
				outs.append("<div class='direct-chat-text'>");
			}
			outs.append(e.getChat_cont()).append("</div>");
			outs.append("<div class='direct-chat-info clearfix'  style='text-align:right;'><span class='direct-chat-timestamp pull-right'>");
			outs.append(e.getChat_date()).append("</span></div><br/>");
		}
		outs.append("\n\n");
		
		sendMsg = outs.toString();
		System.out.println("[check][ChatList] sendMsg : "+sendMsg);

		return SUCCESS;
	}

	public String getSendMsg() {
		return sendMsg;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

	
}
