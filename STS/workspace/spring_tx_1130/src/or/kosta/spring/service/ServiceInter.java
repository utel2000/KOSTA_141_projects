package or.kosta.spring.service;
import or.kosta.vo.CustomerVO;
import or.kosta.vo.MemberVO;
public interface ServiceInter {
	// transaction�� ó���ϱ� ���� �߻� �޼���
	public void insertAll(MemberVO memberVO, CustomerVO customerVO) throws Exception;
}
