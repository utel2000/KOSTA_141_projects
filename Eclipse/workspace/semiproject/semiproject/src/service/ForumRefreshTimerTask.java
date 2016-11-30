package service;
import java.util.List;
import java.util.TimerTask;
import dao.ForumDao;
import vo.ForumVO;
public class ForumRefreshTimerTask extends TimerTask {
	@Override
	public void run() {
		// ���� ���� ������ �ʿ��� �׸��� �⺻Ű ȹ��(select)
		List<ForumVO> list = ForumDao.getDao().forumSearchNeedRefreshState();		
		for(ForumVO e : list) {
			// ȹ���� �⺻Ű�� �ش��ϴ� ���� ���� ����(update).
			ForumDao.getDao().forumRefreshState(e.getF_num());
		}
	}
}

