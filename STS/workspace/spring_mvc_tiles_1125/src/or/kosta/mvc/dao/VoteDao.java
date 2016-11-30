package or.kosta.mvc.dao;
import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vo.VoteVO;
// component-scan�� �� �� �ڵ����� ������ ����� �Ǿ �˻��� ��!
@Repository
public class VoteDao {
	@Autowired
	private SqlSessionTemplate ss;
	public void addVote(VoteVO vo) {
		ss.insert("vote.voteAdd", vo);
	}
	public List<VoteVO> voteList() {
		return ss.selectList("vote.voteList");
	}
	public VoteVO voteDetail(int num) {
		return ss.selectOne("vote.voteDetail", num);
	}
	public void VoteUpdate(VoteVO vo) {
		ss.update("vote.voteUpdate", vo);
	}
	public VoteVO VoteResult(int num) {
		return ss.selectOne("vote.voteResult", num);
	}
}