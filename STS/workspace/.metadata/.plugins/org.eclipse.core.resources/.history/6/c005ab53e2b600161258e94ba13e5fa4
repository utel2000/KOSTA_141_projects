package or.kosta.spring.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import or.kosta.spring.dao.CustomerDAO;
import or.kosta.spring.dao.MemberDAO;
import or.kosta.vo.CustomerVO;
import or.kosta.vo.MemberVO;
// @Transactional(propagation=Propagation.REQUIRED, noRollbackFor=Exception.class, readOnly = true)
@Transactional
@Service
public class ServiceImple implements ServiceInter {
	@Autowired
	private MemberDAO memberDAO;
	@Autowired
	private CustomerDAO customerDAO;
	@Override
	public void insertAll(MemberVO memberVO, CustomerVO customerVO) throws Exception {
		memberDAO.insertMember(memberVO); // 정상일 경우 commit
		customerDAO.insertCustomer(customerVO); // 비정상이니까 데이터가 commit이 못됨
	}
}
