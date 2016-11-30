package dao;



import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.CategoryVO;
import vo.WikiVO;



public class CategoryDao {
	private static CategoryDao dao;
	public static synchronized CategoryDao getDao(){
		
		if(dao == null) dao = new CategoryDao();
		return dao;
	}
	
	public String getCategoryName(WikiVO v){
		SqlSession ss = FactoryService.getFactory().openSession();
		CategoryVO vo  = ss.selectOne("cat.list",v); 
		ss.close();
		return vo.getCat_name();
	}

}
