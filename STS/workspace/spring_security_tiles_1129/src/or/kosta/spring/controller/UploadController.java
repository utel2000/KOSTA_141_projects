package or.kosta.spring.controller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class UploadController {
	// ckeditor ���̾�α� â���� Ajax�� �̹����� ���ε��� �޼���
	@RequestMapping(value = "/imageUpload", method = RequestMethod.POST)
	public void commUpload(HttpServletRequest request, HttpServletResponse response, @RequestParam MultipartFile upload) {
		System.out.println("upload: " + upload);
		OutputStream out = null;
		PrintWriter printWriter = null;
		response.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=EUC-KR");
		try{
			String fileName = upload.getOriginalFilename();
			byte[] bytes = upload.getBytes();
			String path = request.getServletContext().getRealPath("/resources/upload");
			String uploadPath = path + "\\" + fileName; // ������
			System.out.println("uploadPath: " + uploadPath);
			out = new FileOutputStream(new File(uploadPath));
			out.write(bytes);
			String callback = request.getParameter("CKEditorFuncNum");
			printWriter = response.getWriter();
			String fileUrl = "resources/upload/" + fileName; // url���
			// ���� ���ε带 �񵿱������ ������ �� Callback�� �����Ѵ�.
			// printWriter.println("data: ");
			printWriter.println("<script type='text/javascript'>"
			+ "window.parent.CKEDITOR.tools.callFunction(" + callback
			+ ",'" + fileUrl + "', '�̹����� ���ε� �Ͽ����ϴ�.'" + ")</script>");
			printWriter.flush();
		}catch(IOException ex) {
			ex.printStackTrace();
		}finally {
			try{
				if(out != null) {
					out.close();
				}
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}
		return;
	}
}