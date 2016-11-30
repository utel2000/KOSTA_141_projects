package action;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dao.ForumCommentsDao;
import vo.ForumCommentsVO;
public class ForumModifyCommentAction implements Action, Preparable, ModelDriven<ForumCommentsVO> {
	// ������ ����� �⺻Ű�� ������ ����.
	private ForumCommentsVO fcvo; // setter
	@Override
	public String execute() throws Exception {
		ForumCommentsDao.getDao().updateComment(fcvo);
		return SUCCESS;
	}
	@Override
	public ForumCommentsVO getModel() {
		return fcvo;
	}
	@Override
	public void prepare() throws Exception {
		fcvo = new ForumCommentsVO();
	}
}
