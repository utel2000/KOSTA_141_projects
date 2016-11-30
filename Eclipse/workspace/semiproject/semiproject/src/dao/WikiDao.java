package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.PagingVO;
import vo.WikiVO;

public class WikiDao {
	private static WikiDao dao;

	public static synchronized WikiDao getDao() {
		if (dao == null)
			dao = new WikiDao();
		return dao;
	} // ΩÃ±€≈Ê

	public List<WikiVO> getList(PagingVO pvo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<WikiVO> list = ss.selectList("wiki.list", pvo);
		ss.close();
		return list;
	}

	public WikiVO getDetail(int w_num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		WikiVO vo = ss.selectOne("wiki.detail", w_num);
		ss.close();
		return vo;
	}

	public int getTotal(PagingVO pvo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int total = ss.selectOne("wiki.total", pvo);
		ss.close();
		return total;
	}

	public void insertWiki(WikiVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.insert("wiki.insert", vo);
		ss.close();
	}

	public void deleteWiki(int w_num) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.delete("wiki.delete", w_num);
		ss.close();
	}

	public void updateWiki(WikiVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.update("wiki.update", vo);
		ss.close();
	}

}
