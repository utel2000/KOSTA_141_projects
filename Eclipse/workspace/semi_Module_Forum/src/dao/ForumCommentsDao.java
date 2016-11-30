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
	// ��� ����� �� ���(select)
	public int totalCommentsList(int f_num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int total = ss.selectOne("forumComments.totalCommentsList", f_num);
		ss.close();
		return total;
	}
	// ��� ��� ��� ���(select)
	public List<ForumCommentsVO> commentsList(PagingVO pvo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<ForumCommentsVO> list = ss.selectList("forumComments.commentsList", pvo);
		ss.close();
		return list;
	}
	// �ִ� ���ƿ� ��� ��ȸ(select)
	public List<ForumCommentsVO> goodComment(int f_num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<ForumCommentsVO> list = ss.selectList("forumComments.goodComment", f_num);
		ss.close();
		return list;
	}
	// �ִ� �Ⱦ�� ��� ��ȸ(select)
	public List<ForumCommentsVO> badComment(int f_num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<ForumCommentsVO> list = ss.selectList("forumComments.badComment", f_num);
		ss.close();
		return list;
	}
	// ��� �߰�(insert)
	public void addComment(ForumCommentsVO fcvo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.insert("forumComments.addComment", fcvo);
		ss.close();
	}
	// ��� ����(delete)
	public void deleteComment(int c_num) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.delete("forumComments.deleteComment", c_num);
		ss.close();
	}
	// ��� ���� �� ������ ��ȸ�� ��� ����(select)
	public String commentContent(int c_num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		String c_content = ss.selectOne("forumComments.commentContent", c_num);
		ss.close();
		return c_content;
	}
	// ��� ���� ����(update)
	public void updateComment(ForumCommentsVO fcvo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.update("forumComments.updateComment", fcvo);
		ss.close();
	}
	// ���ƿ�, �Ⱦ�� ��ǥ �� ��ġ ����.(update)
	public void UpdateGood(ForumCommentsVO fcvo) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.update("forumComments.updateVote", fcvo);
		ss.close();
	}
	// ���� ���ƿ� or �Ⱦ�� ��ȸ
	public int checkVote(ForumCommentsVO fcvo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int vote = ss.selectOne("forumComments.checkVote", fcvo);
		ss.close();
		return vote;
	}
}
