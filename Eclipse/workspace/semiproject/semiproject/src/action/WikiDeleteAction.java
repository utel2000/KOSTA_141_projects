package action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

import dao.WikiDao;

public class WikiDeleteAction extends ActionSupport {
	private String basePath, fileName;
	private int w_num;

	@Override
	public String execute() throws Exception {
		WikiDao.getDao().deleteWiki(w_num);
		String basePath = getText("file.path");
		System.out.println(basePath);
		System.out.println(w_num);
		String path = basePath + "/" + fileName;

		File f = new File(path);
		if (f.exists()) {
			f.delete();
		}

		return SUCCESS;
	}

	public String getBasePath() {
		return basePath;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getW_num() {
		return w_num;
	}

	public void setW_num(int w_num) {
		this.w_num = w_num;
	}

}
