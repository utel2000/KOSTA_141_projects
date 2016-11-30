package or.kosta.spring.dao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import or.kosta.vo.CustomerVO;
@Repository
public class CustomerDAO {
	@Autowired
	private SqlSessionTemplate sst;
	public void insertCustomer(CustomerVO customerVO){
		sst.insert("customer.insertCustomer", customerVO);
	}
}
