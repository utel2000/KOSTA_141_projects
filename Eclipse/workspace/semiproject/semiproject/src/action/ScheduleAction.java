
package action;
import com.opensymphony.xwork2.Action;
import service.ForumMakeSchedule;
public class ScheduleAction implements Action {
	@Override
	public String execute() throws Exception {
		// 포럼 상태를 갱신하는 스케줄러 실행.
		ForumMakeSchedule.executeForumRefreshSchedule();
		return SUCCESS;
	}
}

