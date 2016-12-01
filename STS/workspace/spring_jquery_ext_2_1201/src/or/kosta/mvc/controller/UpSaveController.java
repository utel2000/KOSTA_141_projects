package or.kosta.mvc.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import or.kosta.mvc.dao.TboardDao;
import or.kosta.vo.TboardVO;

@Controller
public class UpSaveController {
	@Autowired
	private TboardDao tboardDao;

	@RequestMapping(value = "index")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "upform")
	public String upform() {
		return "upform";
	}

	// @ModelAttribute �� �Ķ���ͷ� ���� ���ڸ� requestScope�� �����Ͽ� view�� ����
	@RequestMapping(value = "upsave", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("vo") TboardVO vo, HttpSession session) {

		String path = session.getServletContext().getRealPath("/resources/img/");
		StringBuffer paths = new StringBuffer();
		paths.append(path);
		paths.append(vo.getUpfile().getOriginalFilename());
		File f = new File(paths.toString());

		try {
			vo.getUpfile().transferTo(f);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		// Db�� �� ���ϸ����� ����
		vo.setMfile(vo.getUpfile().getOriginalFilename());
		System.out.println("path :" + path);
		tboardDao.addTboard(vo);
		ModelAndView mav = new ModelAndView("redirect:uplist");
		return mav;
	}

	@RequestMapping(value = "uplist")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("uplist");
		List<TboardVO> list = tboardDao.listTboard();
		mav.addObject("list", list);
		return mav;
	}

	private static final int BUFFER_SIZE = 4096;

	@RequestMapping(value = "/fileDown")
	public void fileDown(@RequestParam("fileName") String fileName, HttpSession session, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// applicationContext ��ü�� request�� ���� ��
		ServletContext context = request.getServletContext();
		// ���ε�� ��� ����
		String path = session.getServletContext().getRealPath("/resources/img/") + fileName;
		// �� ��η� ���ϰ�ü�� ����
		File downloadFile = new File(path);
		// FileInputStream ��Ʈ������ �о��
		FileInputStream fi = new FileInputStream(downloadFile);
		// ��û��ü�κ��� ����� �������� ����Ÿ���� ��
		String mimeType = context.getMimeType(path);
		// ���� ����Ÿ�԰��� ������ �׳� ����Ʈ�� ��Ʈ������ ����
		if (mimeType == null) {
			mimeType = "application/octet-stream";
		}
		// ������ ����Ÿ�� ����
		response.setContentType(mimeType);
		// �ٿ�ε�� ������ ���� ����
		response.setContentLength((int) downloadFile.length());
		// �ٿ�ε� Type�� ������
		String headerKey = "Content-Disposition";
		String headerValue = 
				String.format("attachment; filename=\"%s\"",
						downloadFile.getName());
		// ���� �ٿ�ε� Ÿ���� ������ �ش��� ����
		response.setHeader(headerKey, headerValue);
		// �������κ��� ��Ʈ���� ����
		OutputStream outStream = response.getOutputStream();
		// ���۸� ������ ������ ���� ����
		byte[] buffer = new byte[BUFFER_SIZE];
		// ���� �������� ������ , �ڿ� ������ ��
		int bytesRead = -1;
		while ((bytesRead = fi.read(buffer)) != -1) {
			outStream.write(buffer, 0, bytesRead);
		}
		fi.close();
		outStream.close();

	}
	@RequestMapping(value = "/downloadExcel", 
			method = RequestMethod.GET)
	public ModelAndView downloadExcel() {
		List<TboardVO> listBooks = tboardDao.listTboard();
		// ���̸�, ���̸�, �𵨰��ּ�
		return new ModelAndView("excelView", "listBooks", listBooks);
	}

}








