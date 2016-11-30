package action;

import java.io.File;
import java.util.StringTokenizer;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.WikiDao;
import service.FileService;
import vo.WikiVO;

public class WikiAddAction extends ActionSupport implements Action, Preparable, ModelDriven<WikiVO> {
	private WikiVO vo;
	private File upload;
	private String uploadFileName, uploadContentType, serverFullPath;

	@Override
	public String execute() throws Exception {

		System.out.println("[check][WikiAddAction] fileName : " + uploadFileName);
		System.out.println("[check][WikiAddAction] w_img : " + vo.getW_img());
		System.out.println("[check][WikiAddAction] w_src : " + vo.getW_src());

		if (!vo.getW_src().equals("")) {
			String str1 = vo.getW_src();
			String str2 = vo.getW_src();
			int start = str1.indexOf("https://www.youtube.com/embed/");
			int end = str2.indexOf("\" frameborder");
			String str3 = vo.getW_src().substring(start, end);

			System.out.println(str3);
			vo.setW_src(str3);
		}

		if (uploadFileName != null) {
			StringBuffer fz = new StringBuffer();
			StringTokenizer fn = new StringTokenizer(uploadFileName, ".");
			String firstN = fn.nextToken(); // a
			String lastN = fn.nextToken(); // gif
			fz.append(firstN).append(System.currentTimeMillis());
			fz.append(".").append(lastN);
			vo.setW_img(fz.toString());
			String basePath = getText("file.path");
			FileService service = new FileService();
			serverFullPath = service.saveFile(upload, basePath, fz.toString());
		}else{
			vo.setW_img("noimg2.png");
		}

		vo.setW_update_mem(2); // 로그인한 멤버 넘버 set해줄 것
		WikiDao.getDao().insertWiki(vo);

		return SUCCESS;
	}

	@Override
	public WikiVO getModel() {
		return vo;
	}

	@Override
	public void prepare() throws Exception {
		vo = new WikiVO();
	}

	public WikiVO getVo() {
		return vo;
	}

	public void setVo(WikiVO vo) {
		this.vo = vo;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getServerFullPath() {
		return serverFullPath;
	}

	public void setServerFullPath(String serverFullPath) {
		this.serverFullPath = serverFullPath;
	}
}
