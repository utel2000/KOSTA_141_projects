package dao;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import service.FactoryService;
import vo.MiniVO;
import vo.PagingVO;
public class MiniDAO {
	private static MiniDAO dao;
	public synchronized static MiniDAO getDao() {
		if(dao == null) {
			dao = new MiniDAO();
		}
		return dao;
	}
	public void miniInsert(MiniVO vo) {
		// true : autocommit (default°¡ false)
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.insert("mini.add", vo);
		ss.close();
	}
	public List<MiniVO> getList(PagingVO paging) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<MiniVO> list = ss.selectList("mini.all", paging);
		ss.close();
		return list;
	}
	public int getTotal() {
		SqlSession ss = FactoryService.getFactory().openSession();
		int total = ss.selectOne("mini.total");
		ss.close();
		return total;
	}
}
