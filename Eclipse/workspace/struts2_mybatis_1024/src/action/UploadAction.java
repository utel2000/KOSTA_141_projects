package action;

import java.io.File;
import java.util.StringTokenizer;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.GoodsDao;
import service.FileService;
import vo.GoodsVO;

public class UploadAction extends ActionSupport implements Preparable, ModelDriven<GoodsVO> {
	// input type="file" name="upload" �� ���
	// �⺻ �Ķ���Ͱ� �߰��� 2�� ���۵Ǿ� �´�. XXFileName, XXContentType
	private File upload;
	private String uploadFileName, uploadContentType;
	private String serverFullPath;
	// Form���� ���۵Ǿ�� �Ķ���͸� vo�� �� ���� ������ ���!
	// �ݵ�� Preparable, ModelDriven<GoodsVO> �������̽��� �����ؾ� �Ѵ�.
	// �׷��� �ش� ���ͼ��Ͱ� �ͼ� ó���� �ϰ� �ȴ�.
	private GoodsVO vo;
	// Preparable, ModelDriven, params ������ ���ͼ��Ͱ�
	// ó���ǰ� �ϳ��� ���ͼ��Ͱ� ����� �� ����
	// Preparable ~> prepare()
	// ModelDriven ~> getModel()
	// params�� vo�� setter�� ȣ���ؼ� ���� �����Ѵ�.
	public void prepare() {
		vo = new GoodsVO();
	}
	public GoodsVO getModel() {
		return vo;
	}
	@Override
	public String execute() throws Exception {		
		// log start
		StringBuffer log = new StringBuffer();
		log.append("----------\n")
		.append("<UploadAction.java> - public class UploadAction extends ActionSupport implements Preparable, ModelDriven<GoodsVO>\n")
		.append("[Log] vo.getGname() : ").append(vo.getGname()).append("\n")
		.append("[Log] vo.getContent() : ").append(vo.getContent()).append("\n")
		.append("[Log] uploadFileName : ").append(uploadFileName);
		System.out.println(log);
		log.delete(0, log.length());
		// log end
		
		StringBuffer fz = new StringBuffer();
		// a.gif ���
		StringTokenizer fn = new StringTokenizer(uploadFileName, ".");
		// firstN�� a��
		String firstN = fn.nextToken();
		// lastN�� gif��.
		String lastN = fn.nextToken();
		fz.append(firstN).append(System.currentTimeMillis())
		.append(".").append(lastN);
		// upload, uploadFileName���� �Ǿ� �ֱ� ������
		// �ڵ� ������ �ȵǴϱ� �Ʒ�ó�� �ҷ��� ���.
		vo.setImg(fz.toString());
		GoodsDao.getDao().insertGoods(vo);
		
		// Action�� �����ϴ� ����� 3����
		// 1. ����, 2. Action �������̽�, 3. ActionSupport�� ���.
		// UploadAction.properties�� file.path�� �о� ���� ����
		// �޼���� getText()�� ����ϱ� ���ؼ� �츮��
		// ActionSupport�� ��ӹ��� ���̴�.
		String basePath = getText("file.path");
		FileService service = new FileService();
		serverFullPath = service.saveFile(upload,  basePath,  fz.toString());
		return SUCCESS;
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