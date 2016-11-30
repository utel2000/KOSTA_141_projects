package or.kosta.mvc.controller;
import java.io.File;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class upSaveController {
	@RequestMapping(value="/upForm")
	public String upForm() {
		return "upForm";
	}
	// 1��° ���ڴ� CommonsMultipartResolver�� ����ؼ�
	// ÷�������� �����͸� MultipartFile ��ü�� �����ؿ´�.
	// 2��° ���ڴ� RealPath�� �����ϱ� ���ؼ� HttpServletRequest��ü�� ����.
	@RequestMapping(value="/upSave", method=RequestMethod.POST)
	public ModelAndView save(@RequestParam("mfile") MultipartFile mfile, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		// �̹����� ����� ���� ��� ����
		HttpSession session = request.getSession();
		// pageContext�� �ش�, ���� resources/img�� ��θ� ��� ����!
		String r_path = session.getServletContext().getRealPath("/");
		System.out.println("Root_RealPath: " + r_path);
		String img_path = "\\resources\\img\\";
		StringBuffer sb = new StringBuffer();
		sb.append(r_path).append(img_path);
		// upload�� ���� �̸��� path�� ����
		String oriFn = mfile.getOriginalFilename();
		// �ϼ��� ��ο� �̹��� �����̸��� �߰�
		sb.append(oriFn);
		// ��ο� ������ �ϼ�! -------------
		System.out.println("�������� ����: " + oriFn);
		System.out.println("Ȯ�ο�: "+sb.toString());
		// ���� ���ε� ��ų ��θ� �߻�ȭ�ؼ� File��ü�� ����
		File f = new File(sb.toString());
		// �߻�ȭ�� File��ü�� Spring�� �ʰ��� ���� ���ε� ��Ŵ
		try {
			mfile.transferTo(f); // ���� ���ε� ��!
		} catch(IllegalStateException | IOException ex) {
			ex.printStackTrace();
		}
		mav.setViewName("uploadSuccess");
		mav.addObject("imgName", oriFn);
		return mav;
	}
}