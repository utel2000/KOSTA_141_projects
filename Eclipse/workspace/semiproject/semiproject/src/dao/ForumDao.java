package dao;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import service.FactoryService;
import vo.ForumSearchPagingVO;
import vo.ForumVO;
import vo.PagingVO;
public class ForumDao {
	private static ForumDao dao;
	public synchronized static ForumDao getDao() {
		if (dao == null) {
			dao = new ForumDao();
		}
		return dao;
	}
	// ��� ���� ��� �� ���(select)
	public int totalForumList() {
		SqlSession ss = FactoryService.getFactory().openSession();
		int total = ss.selectOne("forum.totalForumList");
		ss.close();
		return total;
		}
	// ��� ���� ��� ���(select)
	public List<ForumVO> forumList(PagingVO pvo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<ForumVO> list = ss.selectList("forum.forumList", pvo);
		ss.close();
		return list;
	}
	// ���� �� ���� ���(select)
	public ForumVO forumDetail(int f_num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		ForumVO fvo = ss.selectOne("forum.forumDetail", f_num);
		ss.close();
		return fvo;
	}
	
	// ���� ���� ������ �ʿ��� �׸� ���(select)
	public List<ForumVO> forumSearchNeedRefreshState() {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<ForumVO> list = ss.selectList("forum.forumSearchNeedRefreshState");
		ss.close();
		return list;
	}
	
	// ���� ���� ����(update)
	public void forumRefreshState(int f_num) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.update("forum.forumRefreshState", f_num);
		ss.close();
	}

	// ���� �ۼ�(insert)
	public void forumAdd(ForumVO fvo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		System.out.println("f_img name : " +fvo.getF_img());
		ss.insert("forum.forumAdd", fvo);
		ss.close();
	}
	
	
	// ���� �˻� ��Ͽ� ���� total ���� (select)
	public int totalForumSearchList(ForumSearchPagingVO fspvo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int total = ss.selectOne("forum.totalForumSearchList",fspvo);
		ss.close();
		return total;
	}
	
	// ���� �˻� ��� ���(select)
	public List<ForumVO> forumSearchList(ForumSearchPagingVO fspvo) {
		SqlSession ss = FactoryService.getFactory().openSession();

		List<ForumVO> list = ss.selectList("forum.forumSearchList", fspvo);
		ss.close();
		return list;
	}
	
}
