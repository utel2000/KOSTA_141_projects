package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.ChatVO;

public class ChatDAO {
	private static ChatDAO dao;
	public synchronized static ChatDAO getDao() {
		if(dao == null) {
			dao = new ChatDAO();
		}
		return dao;
	}
	public void insertChat(ChatVO v) {
		SqlSession ss = FactoryService.getFactory().openSession(true); // autoCommit;
		ss.insert("chatRoom.chatAdd", v);
		ss.close();
	}
	public List<ChatVO> getList() {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<ChatVO> list = ss.selectList("chatRoom.chatList");
		ss.close();
		return list;
	}
}
