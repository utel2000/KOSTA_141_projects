package dao;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import service.FactoryService;
import vo.ForumCommentsVO;
import vo.PagingVO;
public class ForumCommentsDao {
	private static ForumCommentsDao dao;
	public synchronized static ForumCommentsDao getDao() {
		if (dao == null) {
			dao = new ForumCommentsDao();
		}
		return dao;
	}
	// 모든 댓글의 수 출력(select)
	public int totalCommentsList(int f_num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int total = ss.selectOne("forumComments.totalCommentsList", f_num);
		ss.close();
		return total;
	}
	// 모든 댓글 목록 출력(select)
	public List<ForumCommentsVO> commentsList(PagingVO pvo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<ForumCommentsVO> list = ss.selectList("forumComments.commentsList", pvo);
		ss.close();
		return list;
	}
	// 최다 좋아요 댓글 조회(select)
	public List<ForumCommentsVO> goodComment(int f_num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<ForumCommentsVO> list = ss.selectList("forumComments.goodComment", f_num);
		ss.close();
		return list;
	}
	// 최다 싫어요 댓글 조회(select)
	public List<ForumCommentsVO> badComment(int f_num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<ForumCommentsVO> list = ss.selectList("forumComments.badComment", f_num);
		ss.close();
		return list;
	}
	// 댓글 추가(insert)
	public void addComment(ForumCommentsVO fcvo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.insert("forumComments.addComment", fcvo);
		ss.close();
	}
	// 댓글 삭제(delete)
	public void deleteComment(int c_num) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.delete("forumComments.deleteComment", c_num);
		ss.close();
	}
	// 댓글 수정 폼 제공시 조회할 댓글 내용(select)
	public String commentContent(int c_num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		String c_content = ss.selectOne("forumComments.commentContent", c_num);
		ss.close();
		return c_content;
	}
	// 댓글 내용 수정(update)
	public void updateComment(ForumCommentsVO fcvo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.update("forumComments.updateComment", fcvo);
		ss.close();
	}
	// 좋아요, 싫어요 투표 시 수치 갱신.(update)
	public void UpdateGood(ForumCommentsVO fcvo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.update("forumComments.updateVote", fcvo);
		ss.close();
	}
	// 현재 좋아요 or 싫어요 조회
	public int checkVote(ForumCommentsVO fcvo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int vote = ss.selectOne("forumComments.checkVote", fcvo);
		ss.close();
		return vote;
	}
}
