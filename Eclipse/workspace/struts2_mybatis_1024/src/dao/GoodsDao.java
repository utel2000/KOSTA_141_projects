package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.GoodsVO;

public class GoodsDao {
	private static GoodsDao dao;
	public synchronized static GoodsDao getDao() {
		if(dao == null) {
			dao = new GoodsDao();
		}
		return dao;
	}
	public void insertGoods(GoodsVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		ss.insert("goods.goodsIn", vo);
		ss.commit();
		ss.close();
	}
	public List<GoodsVO> selectList() {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<GoodsVO> list = ss.selectList("goodsList");
		ss.close();
		return list;
	}
}
