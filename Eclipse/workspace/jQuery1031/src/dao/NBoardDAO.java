package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.NBoardVO;
import vo.NCommVO;
import vo.PagingVO;

public class NBoardDAO {
	private static NBoardDAO dao;
	public synchronized static NBoardDAO getDao() {
		if(dao == null) {
			dao = new NBoardDAO();
		}
		return dao;
	}
	public void addBoard(NBoardVO v) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.insert("nboard.add", v);
		ss.close();
	}
	public List<NBoardVO> getList(PagingVO pvo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<NBoardVO> list = ss.selectList("nboard.list", pvo);
		ss.close();
		return list;
	}
	public int getTotal() {
		SqlSession ss = FactoryService.getFactory().openSession();
		int num = ss.selectOne("nboard.total");
		ss.close();
		return num;
	}
	public NBoardVO getDetail(int num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		NBoardVO vo = ss.selectOne("nboard.detail", num);
		ss.close();
		return vo;
	}
	// ´ñ±Û ±¸Çö
	public void addNcomm(NCommVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.insert("nboard.commAdd", vo);
		ss.close();
	}
	public List<NCommVO> listNcomm(int code) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<NCommVO> list = ss.selectList("nboard.commList", code);
		ss.close();
		return list;
	}
	public List<NBoardVO> searchExampleList(PagingVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<NBoardVO> list = ss.selectList("nboard.searchExample", vo);
		ss.close();
		return list;
	}
}
