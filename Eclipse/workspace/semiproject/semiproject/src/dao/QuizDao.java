package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.QuizVO;

public class QuizDao {
	private static QuizDao dao;
	public static synchronized QuizDao getDao(){
		if(dao==null){
			dao= new QuizDao();
		}
		return dao;
	}
	public List<QuizVO> getList(){
		SqlSession ss = FactoryService.getFactory().openSession();
		List<QuizVO> list = ss.selectList("member.quizlist");
		ss.close();
		return list;
	}
	public List<QuizVO> getAns(){
		SqlSession ss = FactoryService.getFactory().openSession();
		List<QuizVO> list = ss.selectList("member.quizAns");
		ss.close();
		return list;
	}
}
