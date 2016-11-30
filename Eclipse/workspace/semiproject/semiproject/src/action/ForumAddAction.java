package action;

import java.io.File;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.ForumDao;
import service.FileService;
import vo.ForumVO;

public class ForumAddAction extends ActionSupport implements Preparable, ModelDriven<ForumVO> {
	private ForumVO fvo;
	private int m_num;
	private File fileName;
	private String fileNameFileName, fileNameContentType, serverFullPath;

	@Override
	public String execute() throws Exception {

		// m_id를 m_num으로 select 하여 ForumVO 의 f_writer에 값 셋팅
		System.out.println("ForumAddAction Log");
		System.out.println("------------------------------");
		System.out.println("f_Subject : "+fvo.getF_subject());
		System.out.println("f_Content : "+fvo.getF_content());
		System.out.println("f_Category : "+fvo.getF_category());
		System.out.println("fileName : " + fileNameFileName);
		System.out.println(m_num);
		fvo.setF_writer(m_num);
		StringBuffer fz = new StringBuffer();
		// vo.setF_content(vo.getF_content().replace("\n", "<br />"));
		
		if(fvo.getF_subject().isEmpty()){
			JOptionPane.showMessageDialog(null, "제목을 입력해 주세요.");
			return "INPUT";
		} else if (fvo.getF_content().isEmpty()){
			JOptionPane.showMessageDialog(null, "내용을 입력해 주세요.");
			return "INPUT";
		} else if (fvo.getF_category() == 0){
			JOptionPane.showMessageDialog(null, "카테고리를 입력해 주세요.");
			return "INPUT";
		}
		
		if(fileNameFileName != null){
			
			StringTokenizer fn = new StringTokenizer(fileNameFileName, ".");
			String firstN = fn.nextToken(); // a
			String lastN = fn.nextToken(); // gif
			fz.append(firstN).append(System.currentTimeMillis());
			fz.append(".").append(lastN);
			System.out.println(fz.toString());
			fvo.setF_img(fz.toString());
		}
				
		ForumDao.getDao().forumAdd(fvo);
		String basePath = getText("file.path");
		FileService service = new FileService();
		serverFullPath = service.saveFile(fileName, basePath, fz.toString());
		System.out.println("success 실행 직전");
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
	
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public File getFileName() {
		return fileName;
	}
	public void setFileName(File fileName) {
		this.fileName = fileName;
	}
	public String getFileNameFileName() {
		return fileNameFileName;
	}
	public void setFileNameFileName(String fileNameFileName) {
		this.fileNameFileName = fileNameFileName;
	}
	public String getFileNameContentType() {
		return fileNameContentType;
	}
	public void setFileNameContentType(String fileNameContentType) {
		this.fileNameContentType = fileNameContentType;
	}
	public String getServerFullPath() {
		return serverFullPath;
	}
	public void setServerFullPath(String serverFullPath) {
		this.serverFullPath = serverFullPath;
	}
}
