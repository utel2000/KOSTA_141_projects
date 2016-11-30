package action;

import java.io.File;
import java.util.StringTokenizer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dao.MemberDao;
import service.FileService;
import vo.MemberVO;

/*회원가입*/
public class MemberJoinAction extends ActionSupport
	implements Preparable, ModelDriven<MemberVO> {
	// input type"file" name="upload"일 경우
	// 기본 파라미터가 추가로 2개 전송되어 온다. XXFileName, XXContentType
	private File upload;
	private String uploadFileName, uploadContentType, serverFullPath;
	// Form에서 전송되어온 파라미터를 vo로 한번에 저장할 경우
	// 반드시 Preparable, ModelDriven<MemberVO> 인터페이스를 구현해야 한다.
	// 그러면 해당 인터셉터가 와서 처리를 하게 된다.
	private MemberVO vo;
	
	@Override
	public String execute() throws Exception {			
		System.out.println("[MemberJoinAction]id : " + vo.getM_id());	// 가입 id
		System.out.println("------------------------------------");
		StringBuffer fz = new StringBuffer();
		System.out.println("[MemberJoinAction]fileName : " + uploadFileName);	// fileName
		StringTokenizer fn = new StringTokenizer(uploadFileName, ".");
		String firstN = fn.nextToken();
		String lastN = fn.nextToken();
		fz.append(firstN).append(System.currentTimeMillis());
		fz.append(".").append(lastN);
		// upload, uploadFileName으로 되어 있기 때문에
		// 자동 매핑이 안되니까 아래처럼 불러서 사용
		vo.setM_img(fz.toString());
		MemberDao.getDao().memberJoin(vo);
		
		// UploadAction.properties에 file.path를 읽어 내기 위한
		// 메서드는 getText( )를 상속받은 것이다.
		// Action을 정의하는 방법 3가지
		// 1)생략, 2)Action 인터페이스, 3)ActionSupport를 상속(getText()를 사용하기 위해서)
		String basePath = getText("file.path");
		System.out.println("[MemberJoinAction]basePath : " + basePath);	// 파일저장경로 출력
		FileService service = new FileService();
		serverFullPath = service.saveFile(upload, basePath, fz.toString());
		return SUCCESS;
	}
	
	// ★★★ vo전용
	// 1. Preparable -> prepare()
	// 2. ModelDriven<GoodsVO> -> getModel()
	// 3. params -> vo의 setter를 호출해서 값을 저장
	// 4. vo를 사용했을 때 장점 : 유지보수가 쉽다.
	// 5. Preparable, ModelDriven<GoodsVO>, params 순으로 인터셉터가
	// 처리가 되고, 하나의 인터셉터가 실행될 때마다
	@Override
	public void prepare() throws Exception {
		vo = new MemberVO();

	}

	// ModelDriven은 vo를 반환
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