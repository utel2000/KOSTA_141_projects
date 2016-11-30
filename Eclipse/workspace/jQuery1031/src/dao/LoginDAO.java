package dao;

import org.apache.ibatis.session.SqlSession;

import com.opensymphony.xwork2.inject.Factory;

import service.FactoryService;
import vo.MemberVO;

public class LoginDAO {
	private static LoginDAO dao;
	public synchronized static LoginDAO getDao() {
		if(dao == null) {
			dao = new LoginDAO();
		}
		return dao;
	}
	public int loginChk(MemberVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int res = ss.selectOne("login.loginChk", vo);
		return res;
	}
}
