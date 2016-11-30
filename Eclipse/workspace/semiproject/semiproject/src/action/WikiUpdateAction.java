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

		if(uploadFileName != null){ // 사진을 업데이트 하는 경우
			String basePath = getText("file.path");
			System.out.println("[check][WikiUpdateAction] basePath : " + basePath);
			String oldpath = basePath + "/" + prevImg; // 수정 전 이미지 경로
			File f = new File(oldpath);
			if (f.exists()) {
				f.delete();
			} // 수정 전 이미지 삭제
			
			StringBuffer fz = new StringBuffer(); // 파일명 
			StringTokenizer fn = new StringTokenizer(uploadFileName, ".");
			String firstN = fn.nextToken(); // 파일 이름
			String lastN = fn.nextToken(); // 파일 확장자
			fz.append(firstN).append(System.currentTimeMillis());
			fz.append(".").append(lastN); // 파일명 
			wvo.setW_img(fz.toString()); // wvo에 새로운 이미지 이름 set

			FileService service = new FileService();
			serverFullPath = service.saveFile(upload, basePath, fz.toString());
		}else{ // 사진 업데이트 안하는 경우
			wvo.setW_img(prevImg);
		}

		System.out.println("[check][WikiUpdateAction] w_num 확인 : " + wvo.getW_num());
		System.out.println("[check][WikiUpdateAction] w_content 확인 : " + wvo.getW_content());
		System.out.println("[check][WikiUpdateAction] w_update_mem 확인 : " + wvo.getW_update_mem());
		System.out.println("[check][WikiUpdateAction] w_img 확인 : " + wvo.getW_img());
		System.out.println("[check][WikiUpdateAction] w_src 확인 : " + wvo.getW_src());
		System.out.println("[check][WikiUpdateAction] w_category 확인 : " + wvo.getW_category());
		
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
