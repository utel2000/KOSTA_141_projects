package action;

import java.io.File;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.QuizDao;
import vo.QuizVO;


public class MemberJoinQuizAction implements Action, Preparable, ModelDriven<QuizVO> {
	private QuizVO qvo;
	private List<QuizVO> list;
	private String m_id, m_name, m_pwd, m_email, m_img, m_grade;
	private File upload;
	//List의 값이 jsp에서 출력되렴녀 반드시 getter가 필요하다.
	//Preparable과 ModelDriven의 경우는 Getter, Setter가 쓰기 위해 ValueStack에 올려놓는 작업정도이다.
	@Override
	public String execute() throws Exception {	
		list = QuizDao.getDao().getList();
		return SUCCESS;
	}	
	
	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
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
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pwd() {
		return m_pwd;
	}
	public void setM_pwd(String m_pwd) {
		this.m_pwd = m_pwd;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public String getM_img() {
		return m_img;
	}
	public void setM_img(String m_img) {
		this.m_img = m_img;
	}
	public String getM_grade() {
		return m_grade;
	}
	public void setM_grade(String m_grade) {
		this.m_grade = m_grade;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}	
	
}
