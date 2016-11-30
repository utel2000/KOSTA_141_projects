package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.ForumVO;
import vo.WikiVO;

public class MainPageDao {
	private static MainPageDao dao;
	public static synchronized MainPageDao getDao(){
		if(dao==null){
			dao=new MainPageDao();
		}
		return dao;
	}
	public List<WikiVO> getWikiList(){
		SqlSession ss = FactoryService.getFactory().openSession();
		List<WikiVO> list = ss.selectList("mainpage.wikitop5");
		ss.close();
		return list;
	}
	public List<ForumVO> getForumList(String cont){
		SqlSession ss = FactoryService.getFactory().openSession();
		List<ForumVO> list = ss.selectList("mainpage.forumtop5", cont);
		ss.close();
		return list;
	}
}
