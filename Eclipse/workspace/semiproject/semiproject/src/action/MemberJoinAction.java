package action;

import java.io.File;
import java.util.StringTokenizer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dao.MemberDao;
import service.FileService;
import vo.MemberVO;

/*ȸ������*/
public class MemberJoinAction extends ActionSupport
	implements Preparable, ModelDriven<MemberVO> {
	// input type"file" name="upload"�� ���
	// �⺻ �Ķ���Ͱ� �߰��� 2�� ���۵Ǿ� �´�. XXFileName, XXContentType
	private File upload;
	private String uploadFileName, uploadContentType, serverFullPath;
	// Form���� ���۵Ǿ�� �Ķ���͸� vo�� �ѹ��� ������ ���
	// �ݵ�� Preparable, ModelDriven<MemberVO> �������̽��� �����ؾ� �Ѵ�.
	// �׷��� �ش� ���ͼ��Ͱ� �ͼ� ó���� �ϰ� �ȴ�.
	private MemberVO vo;
	
	@Override
	public String execute() throws Exception {			
		System.out.println("[MemberJoinAction]id : " + vo.getM_id());	// ���� id
		System.out.println("------------------------------------");
		StringBuffer fz = new StringBuffer();
		System.out.println("[MemberJoinAction]fileName : " + uploadFileName);	// fileName
		StringTokenizer fn = new StringTokenizer(uploadFileName, ".");
		String firstN = fn.nextToken();
		String lastN = fn.nextToken();
		fz.append(firstN).append(System.currentTimeMillis());
		fz.append(".").append(lastN);
		// upload, uploadFileName���� �Ǿ� �ֱ� ������
		// �ڵ� ������ �ȵǴϱ� �Ʒ�ó�� �ҷ��� ���
		vo.setM_img(fz.toString());
		MemberDao.getDao().memberJoin(vo);
		
		// UploadAction.properties�� file.path�� �о� ���� ����
		// �޼���� getText( )�� ��ӹ��� ���̴�.
		// Action�� �����ϴ� ��� 3����
		// 1)����, 2)Action �������̽�, 3)ActionSupport�� ���(getText()�� ����ϱ� ���ؼ�)
		String basePath = getText("file.path");
		System.out.println("[MemberJoinAction]basePath : " + basePath);	// ���������� ���
		FileService service = new FileService();
		serverFullPath = service.saveFile(upload, basePath, fz.toString());
		return SUCCESS;
	}
	
	// �ڡڡ� vo����
	// 1. Preparable -> prepare()
	// 2. ModelDriven<GoodsVO> -> getModel()
	// 3. params -> vo�� setter�� ȣ���ؼ� ���� ����
	// 4. vo�� ������� �� ���� : ���������� ����.
	// 5. Preparable, ModelDriven<GoodsVO>, params ������ ���ͼ��Ͱ�
	// ó���� �ǰ�, �ϳ��� ���ͼ��Ͱ� ����� ������
	@Override
	public void prepare() throws Exception {
		vo = new MemberVO();

	}

	// ModelDriven�� vo�� ��ȯ
	@Override
	public MemberVO getModel() {
		return vo;
	}

	// getter, setter
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

	public MemberVO getVo() {
		return vo;
	}

	public void setVo(MemberVO vo) {
		this.vo = vo;
	}
}