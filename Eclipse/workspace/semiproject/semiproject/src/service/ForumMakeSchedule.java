package service;
import java.util.Timer;
public class ForumMakeSchedule{
	// ���� ���� �ÿ��� �����ϰ� �ϱ� ���ؼ� static ���
	private static boolean ForumRefreshScheduleFlag;
	public synchronized static void executeForumRefreshSchedule() {
		if(!ForumRefreshScheduleFlag) {
			ForumRefreshScheduleFlag = true;
			Timer t = new Timer(true);
			// scheduleAtFixedRate(�۾�����, ������ �ð�, �����ֱ�)
			t.scheduleAtFixedRate(new ForumRefreshTimerTask(), 0, 5000);
		}
	}
}


