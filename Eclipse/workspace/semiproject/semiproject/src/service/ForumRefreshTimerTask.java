package service;
import java.util.List;
import java.util.TimerTask;
import dao.ForumDao;
import vo.ForumVO;
public class ForumRefreshTimerTask extends TimerTask {
	@Override
	public void run() {
		// 포럼 상태 갱신이 필요한 항목의 기본키 획득(select)
		List<ForumVO> list = ForumDao.getDao().forumSearchNeedRefreshState();		
		for(ForumVO e : list) {
			// 획득한 기본키에 해당하는 포럼 상태 갱신(update).
			ForumDao.getDao().forumRefreshState(e.getF_num());
		}
	}
}

