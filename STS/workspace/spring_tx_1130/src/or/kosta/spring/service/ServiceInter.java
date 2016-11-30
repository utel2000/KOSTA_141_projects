package or.kosta.spring.service;
import or.kosta.vo.CustomerVO;
import or.kosta.vo.MemberVO;
public interface ServiceInter {
	// transaction을 처리하기 위한 추상 메서드
	public void insertAll(MemberVO memberVO, CustomerVO customerVO) throws Exception;
}
