
package action;
import com.opensymphony.xwork2.Action;
import service.ForumMakeSchedule;
public class ScheduleAction implements Action {
	@Override
	public String execute() throws Exception {
		// ���� ���¸� �����ϴ� �����ٷ� ����.
		ForumMakeSchedule.executeForumRefreshSchedule();
		return SUCCESS;
	}
}

