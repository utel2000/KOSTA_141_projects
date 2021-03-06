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
	// 1번째 인자는 CommonsMultipartResolver를 사용해서
	// 첨부파일의 데이터를 MultipartFile 객체로 전달해온다.
	// 2번째 인자는 RealPath를 지정하기 위해서 HttpServletRequest객체를 주입.
	@RequestMapping(value="/upSave", method=RequestMethod.POST)
	public ModelAndView save(@RequestParam("mfile") MultipartFile mfile, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		// 이미지가 저장될 절대 경로 지정
		HttpSession session = request.getSession();
		// pageContext에 해당, 실제 resources/img란 경로를 얻기 위함!
		String r_path = session.getServletContext().getRealPath("/");
		System.out.println("Root_RealPath: " + r_path);
		String img_path = "\\resources\\img\\";
		StringBuffer sb = new StringBuffer();
		sb.append(r_path).append(img_path);
		// upload된 파일 이름은 path에 설정
		String oriFn = mfile.getOriginalFilename();
		// 완성된 경로에 이미지 파일이름을 추가
		sb.append(oriFn);
		// 경로와 파일의 완성! -------------
		System.out.println("오리지널 파일: " + oriFn);
		System.out.println("확인용: "+sb.toString());
		// 파일 업로드 시킬 경로를 추상화해서 File객체로 생성
		File f = new File(sb.toString());
		// 추상화한 File객체를 Spring에 초간단 파일 업로드 시킴
		try {
			mfile.transferTo(f); // 파일 업로드 끝!
		} catch(IllegalStateException | IOException ex) {
			ex.printStackTrace();
		}
		mav.setViewName("uploadSuccess");
		mav.addObject("imgName", oriFn);
		return mav;
	}
}
