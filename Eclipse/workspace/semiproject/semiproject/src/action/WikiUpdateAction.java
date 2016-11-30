package action;

import java.io.File;
import java.util.StringTokenizer;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.WikiDao;
import service.FileService;
import vo.WikiVO;

public class WikiUpdateAction extends ActionSupport implements Preparable, ModelDriven<WikiVO> {
	private WikiVO wvo;
	private int num; // getter
	private int nowPage; // setter & getter
	private String basePath; // setter
	private File upload; // setter
	private String prevImg; // setter
	private String uploadFileName, uploadContentType, serverFullPath; // setter

	@Override
	public String execute() throws Exception {

		System.out.println("[check][WikiUpdateAction] fileName : " + uploadFileName);

		if(uploadFileName != null){ // ������ ������Ʈ �ϴ� ���
			String basePath = getText("file.path");
			System.out.println("[check][WikiUpdateAction] basePath : " + basePath);
			String oldpath = basePath + "/" + prevImg; // ���� �� �̹��� ���
			File f = new File(oldpath);
			if (f.exists()) {
				f.delete();
			} // ���� �� �̹��� ����
			
			StringBuffer fz = new StringBuffer(); // ���ϸ� 
			StringTokenizer fn = new StringTokenizer(uploadFileName, ".");
			String firstN = fn.nextToken(); // ���� �̸�
			String lastN = fn.nextToken(); // ���� Ȯ����
			fz.append(firstN).append(System.currentTimeMillis());
			fz.append(".").append(lastN); // ���ϸ� 
			wvo.setW_img(fz.toString()); // wvo�� ���ο� �̹��� �̸� set

			FileService service = new FileService();
			serverFullPath = service.saveFile(upload, basePath, fz.toString());
		}else{ // ���� ������Ʈ ���ϴ� ���
			wvo.setW_img(prevImg);
		}

		System.out.println("[check][WikiUpdateAction] w_num Ȯ�� : " + wvo.getW_num());
		System.out.println("[check][WikiUpdateAction] w_content Ȯ�� : " + wvo.getW_content());
		System.out.println("[check][WikiUpdateAction] w_update_mem Ȯ�� : " + wvo.getW_update_mem());
		System.out.println("[check][WikiUpdateAction] w_img Ȯ�� : " + wvo.getW_img());
		System.out.println("[check][WikiUpdateAction] w_src Ȯ�� : " + wvo.getW_src());
		System.out.println("[check][WikiUpdateAction] w_category Ȯ�� : " + wvo.getW_category());
		
		WikiDao.getDao().updateWiki(wvo);
		num = wvo.getW_num();
		return SUCCESS;
	}

	public int getNum() {
		return num;
	}

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}


	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}


	@Override
	public WikiVO getModel() {
		return wvo;
	}

	@Override
	public void prepare() throws Exception {
		wvo = new WikiVO();
	}

	public void setPrevImg(String prevImg) {
		this.prevImg = prevImg;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public void setServerFullPath(String serverFullPath) {
		this.serverFullPath = serverFullPath;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public String getServerFullPath() {
		return serverFullPath;
	}

	
}
