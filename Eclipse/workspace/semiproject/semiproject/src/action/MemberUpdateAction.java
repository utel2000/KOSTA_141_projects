package action;

import java.io.File;
import java.util.StringTokenizer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import dao.MemberDao;
import service.FileService;
import vo.MemberVO;
/*회원 : 정보수정*/
public class MemberUpdateAction extends ActionSupport
	implements Preparable, ModelDriven<MemberVO>{
	
	private MemberVO vo;
	private String id;
	private File upload;
	private String uploadFileName, uploadContentType, serverFullPath; // setter
	private String basePath; // setter
	private String prevImg; // setter
	
	@Override
	public String execute() throws Exception {
		System.out.println("------------------------------------");
		System.out.println("[MemberUpdateAction]num : " +vo.getM_num());
		System.out.println("[MemberUpdateAction]reset_id : " + vo.getM_id());
		System.out.println("[MemberUpdateAction]reset_pwd : " +vo.getM_pwd());
		System.out.println("[MemberUpdateAction]reset_email : " +vo.getM_email());
		System.out.println("[MemberUpdateAction]reset_img : " + uploadFileName);
		System.out.println("------------------------------------");

		if (uploadFileName != null) { // 사진을 업데이트 하는 경우
			basePath = getText("file.path");
//			System.out.println("basePath : " + basePath);
//			String oldpath = basePath + "/" + prevImg;// 수정전 이미지 경로
//			File f = new File(oldpath);
//			if (f.exists()) {
//				f.delete();
//			} // 수정전 이미지 삭제

			StringBuffer fz = new StringBuffer();
			System.out.println("fileName:::::" + uploadFileName);
			StringTokenizer fn = new StringTokenizer(uploadFileName, ".");
			String firstN = fn.nextToken();
			String lastN = fn.nextToken();
			fz.append(firstN).append(System.currentTimeMillis());
			fz.append(".").append(lastN);

			vo.setM_img(fz.toString());
			System.out.println(basePath);
			System.out.println("setImg 확인 : "+vo.getM_img());
			FileService service = new FileService();
			serverFullPath = service.saveFile(upload, basePath, fz.toString());
		}

		MemberDao.getDao().memberupdate(vo);
		System.out.println("MemberUpdateAction : " + vo.getM_id());
		id = vo.getM_id();
		System.out.println("[MemberUpdateAcion]업데이트 확인");

		return SUCCESS;
	}
	
	public MemberVO getVo() {
		return vo;
	}

	public void setVo(MemberVO vo) {
		this.vo = vo;
	}

	@Override
	public void prepare() throws Exception {
		vo = new MemberVO();
		
	}
	@Override
	public MemberVO getModel() {
		return vo;
	}
	
	// getter, setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
