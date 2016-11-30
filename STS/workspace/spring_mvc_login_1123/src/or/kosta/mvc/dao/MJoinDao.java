package or.kosta.mvc.dao;
import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vo.MJoinVO;
@Repository
public class MJoinDao {
	@Autowired
	private SqlSessionTemplate ss;
	public void addMember(MJoinVO vo) {
		ss.insert("mJoin.add", vo);
	}
	public int checkId(String id) {
		return ss.selectOne("mJoin.check", id);
	}
	public List<MJoinVO> getList() {
		return ss.selectList("mJoin.list");
	}
	// Login Ã³¸® (id, pwd)
	public int loginProcess(MJoinVO vo) {
		return ss.selectOne("mJoin.loginChk", vo);
	}
}
