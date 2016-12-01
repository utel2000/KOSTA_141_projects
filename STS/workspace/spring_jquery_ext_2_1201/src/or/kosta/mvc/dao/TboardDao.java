package or.kosta.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import or.kosta.vo.TboardVO;
@Repository
public class TboardDao {
	@Autowired
	private SqlSessionTemplate ss;
	
	public void addTboard(TboardVO v){
		ss.insert("tboard.ins", v);
	}
	
	public List<TboardVO> listTboard(){
		return ss.selectList("tboard.listAll");
	}
}







