package dao;
import org.apache.ibatis.session.SqlSession;
import service.FactoryService;
import vo.ForumCommentsVoteVO;
public class ForumCommentsVoteDao {
	private static ForumCommentsVoteDao dao;
	public synchronized static ForumCommentsVoteDao getDao() {
		if (dao == null) {
			dao = new ForumCommentsVoteDao();
		}
		return dao;
	}
	// 투표 중복 체크(select)
	public int checkVoteDuplication(ForumCommentsVoteVO fcvvo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int check = ss.selectOne("forumCommentsVote.checkVoteDuplication", fcvvo);
		ss.close();
		return check;
	}
	// 투표 내역 기록(insert)
	public void addVote(ForumCommentsVoteVO fcvvo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.insert("forumCommentsVote.addVote", fcvvo);
		ss.close();
	}
}
