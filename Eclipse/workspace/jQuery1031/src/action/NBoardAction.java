package action;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dao.NBoardDAO;
import vo.NBoardVO;
public class NBoardAction implements Action, Preparable, ModelDriven<NBoardVO> {
	NBoardVO vo;
	@Override
	public String execute() throws Exception {
		NBoardDAO.getDao().addBoard(vo);
		return SUCCESS;
	}
	@Override
	public void prepare() throws Exception {
		vo = new NBoardVO();
	}
	@Override
	public NBoardVO getModel() {
		return vo;
	}
}
