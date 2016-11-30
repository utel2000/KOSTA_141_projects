package dao;
import org.apache.ibatis.session.SqlSession;
import service.FactoryService;
import vo.ForumVO;
public class ForumDao {
	private static ForumDao dao;
	public synchronized static ForumDao getDao() {
		if (dao == null) {
			dao = new ForumDao();
		}
		return dao;
	}
	// ���� �� ���� ���(select)
	public ForumVO forumDetail(int f_num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		ForumVO fvo = ss.selectOne("forum.forumDetail", f_num);
		ss.close();
		return fvo;
	}
}