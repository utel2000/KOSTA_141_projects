package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.MiniDAO;
import vo.MiniVO;

public class MiniInsertAction implements Action, Preparable, ModelDriven<MiniVO> {
	private MiniVO mvo;
	@Override
	public String execute() throws Exception {
		// log start
		StringBuffer log = new StringBuffer();
		log.append("<MiniInsertAction.java> - public String execute()\n")
		.append("[Log] mvo.getId() : ").append(mvo.getId()).append("\n")
		.append("[Log] mvo.getPwd() : ").append(mvo.getPwd()).append("\n")
		.append("[Log] mvo.getIcon() : ").append(mvo.getIcon()).append("\n")
		.append("[Log] mvo.getCont() : ").append(mvo.getCont()).append("\n")
		.append("[Log] mvo.getEmail() : ").append(mvo.getEmail());
		System.out.println(log);
		log.delete(0, log.length());
		// log end

		MiniDAO.getDao().miniInsert(mvo);
		return SUCCESS;
	}
	@Override
	public MiniVO getModel() {
		return mvo;
	}
	@Override
	public void prepare() throws Exception {
		mvo = new MiniVO();
	}

	
}
