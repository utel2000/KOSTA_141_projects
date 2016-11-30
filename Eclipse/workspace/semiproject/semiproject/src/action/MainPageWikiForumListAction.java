package action;

import java.util.List;


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.MainPageDao;
import vo.ForumVO;
import vo.WikiVO;

public class MainPageWikiForumListAction implements Action, Preparable, ModelDriven<ForumVO> {

	private ForumVO fvo;
	private List<ForumVO> ftop5list;
	private List<ForumVO> fcomp5list;
	private List<WikiVO> wlist;
	
	@Override
	public String execute() throws Exception {
		wlist=MainPageDao.getDao().getWikiList();
		ftop5list = MainPageDao.getDao().getForumList("진행");	
		fcomp5list = MainPageDao.getDao().getForumList("완료");	
		return SUCCESS;
	}
	@Override
	public ForumVO getModel() {
		return fvo;
	}
	@Override
	public void prepare() throws Exception {
		fvo = new ForumVO();
	}

	public List<WikiVO> getWlist() {
		return wlist;
	}
	public void setWlist(List<WikiVO> wlist) {
		this.wlist = wlist;
	}
	public List<ForumVO> getFtop5list() {
		return ftop5list;
	}
	public void setFtop5list(List<ForumVO> ftop5list) {
		this.ftop5list = ftop5list;
	}
	public List<ForumVO> getFcomp5list() {
		return fcomp5list;
	}
	public void setFcomp5list(List<ForumVO> fcomp5list) {
		this.fcomp5list = fcomp5list;
	}
			
}
