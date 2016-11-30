package action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.QuizDao;
import vo.QuizVO;

public class MemberQuizResult implements Action, Preparable, ModelDriven<QuizVO> {
	private QuizVO qvo;
	private List<QuizVO> list;
	
	@Override
	public String execute() throws Exception {
		list = QuizDao.getDao().getAns();
		return SUCCESS;
	}
	@Override
	public QuizVO getModel() {	
		return qvo;
	}
	@Override
	public void prepare() throws Exception {
		qvo = new QuizVO();
	}
	public List<QuizVO> getList() {
		return list;
	}
	public void setList(List<QuizVO> list) {
		this.list = list;
	}
}
