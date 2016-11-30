package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.ChatVO;

public class ChatDao {
	private static ChatDao dao;

	public static synchronized ChatDao getDao() {
		if(dao == null) dao = new ChatDao();
		return dao;
	}
	
	public List<ChatVO> chatList(){
		SqlSession ss = FactoryService.getFactory().openSession();
		List<ChatVO> list = ss.selectList("chat.chatList");
		ss.close();
		return list;
	}
	
	public void chatAdd(ChatVO vo){
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.insert("chat.chatAdd",vo);
		ss.close();
	}
}
