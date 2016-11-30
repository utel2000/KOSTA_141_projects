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
	// 모든 포럼 목록 수 출력(select)
	public int totalForumList() {
		SqlSession ss = FactoryService.getFactory().openSession();
		int total = ss.selectOne("forum.totalForumList");
		ss.close();
		return total;
		}
	// 모든 포럼 목록 출력(select)
	public List<ForumVO> forumList(PagingVO pvo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<ForumVO> list = ss.selectList("forum.forumList", pvo);
		ss.close();
		return list;
	}
	// 포럼 상세 내용 출력(select)
	public ForumVO forumDetail(int f_num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		ForumVO fvo = ss.selectOne("forum.forumDetail", f_num);
		ss.close();
		return fvo;
	}
	
	// 포럼 상태 갱신이 필요한 항목 출력(select)
	public List<ForumVO> forumSearchNeedRefreshState() {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<ForumVO> list = ss.selectList("forum.forumSearchNeedRefreshState");
		ss.close();
		return list;
	}
	
	// 포럼 상태 갱신(update)
	public void forumRefreshState(int f_num) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.update("forum.forumRefreshState", f_num);
		ss.close();
	}

	// 포럼 작성(insert)
	public void forumAdd(ForumVO fvo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		System.out.println("f_img name : " +fvo.getF_img());
		ss.insert("forum.forumAdd", fvo);
		ss.close();
	}
	
	
	// 포럼 검색 목록에 대한 total 집계 (select)
	public int totalForumSearchList(ForumSearchPagingVO fspvo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int total = ss.selectOne("forum.totalForumSearchList",fspvo);
		ss.close();
		return total;
	}
	
	// 포럼 검색 목록 출력(select)
	public List<ForumVO> forumSearchList(ForumSearchPagingVO fspvo) {
		SqlSession ss = FactoryService.getFactory().openSession();

		List<ForumVO> list = ss.selectList("forum.forumSearchList", fspvo);
		ss.close();
		return list;
	}
	
}
