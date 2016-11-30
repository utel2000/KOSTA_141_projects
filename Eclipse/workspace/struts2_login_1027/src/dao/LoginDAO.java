package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import service.FactoryService;
import vo.Mems2VO;

public class LoginDAO {
	private static LoginDAO dao;
	public synchronized static LoginDAO getDao() {
		if(dao == null) {
			dao = new LoginDAO();
		}
		return dao;
	}
	public int loginProcess(Mems2VO mvo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int res = ss.selectOne("mems2.login", mvo);
		ss.close();
		return res;
	}
}
