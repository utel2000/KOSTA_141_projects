package or.kosta.spring.dao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import or.kosta.vo.MemberVO;
@Repository
public class MemberDAO {
	@Autowired
	private SqlSessionTemplate sst;
	public void insertMember(MemberVO memberVO){
		sst.insert("member.insertMember", memberVO);
	}
}
