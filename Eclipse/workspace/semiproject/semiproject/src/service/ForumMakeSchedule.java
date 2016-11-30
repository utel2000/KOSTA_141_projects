package service;
import java.util.Timer;
public class ForumMakeSchedule{
	// 최초 실행 시에만 동작하게 하기 위해서 static 사용
	private static boolean ForumRefreshScheduleFlag;
	public synchronized static void executeForumRefreshSchedule() {
		if(!ForumRefreshScheduleFlag) {
			ForumRefreshScheduleFlag = true;
			Timer t = new Timer(true);
			// scheduleAtFixedRate(작업내용, 시작할 시간, 실행주기)
			t.scheduleAtFixedRate(new ForumRefreshTimerTask(), 0, 5000);
		}
	}
}


