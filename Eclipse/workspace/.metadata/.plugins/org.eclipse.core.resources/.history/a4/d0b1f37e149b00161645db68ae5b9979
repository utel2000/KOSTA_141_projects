package action;

import java.io.File;

import com.opensymphony.xwork2.Action;

import dao.GoodsDao;

public class DeleteAction implements Action{
	private String FileName, basePath;
	private int FileNo;
	@Override
	public String execute() throws Exception {
		GoodsDao.getDao().deleteGoods(FileNo);		
		String path = basePath + "/" + FileName;
		File f = new File(path);
		if(f.exists()) {
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
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	public int getFileNo() {
		return FileNo;
	}
	public void setFileNo(int fileNo) {
		FileNo = fileNo;
	}
}
