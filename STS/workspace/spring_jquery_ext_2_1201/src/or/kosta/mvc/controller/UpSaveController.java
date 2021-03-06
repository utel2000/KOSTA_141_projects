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

	// @ModelAttribute 는 파라미터로 들어온 인자를 requestScope에 저장하여 view로 전달
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
		// Db로 들어갈 파일명으로 변경
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
		// applicationContext 객체를 request로 부터 얻어냄
		ServletContext context = request.getServletContext();
		// 업로드된 경로 얻음
		String path = session.getServletContext().getRealPath("/resources/img/") + fileName;
		// 그 경로로 파일객체를 생성
		File downloadFile = new File(path);
		// FileInputStream 스트림으로 읽어옴
		FileInputStream fi = new FileInputStream(downloadFile);
		// 요청객체로부터 연결될 브라우저의 마임타입을 얻어냄
		String mimeType = context.getMimeType(path);
		// 만약 마임타입값이 없으면 그냥 디폴트로 스트림으로 연결
		if (mimeType == null) {
			mimeType = "application/octet-stream";
		}
		// 지정된 마임타입 세팅
		response.setContentType(mimeType);
		// 다운로드될 파일의 길이 세팅
		response.setContentLength((int) downloadFile.length());
		// 다운로드 Type을 설정함
		String headerKey = "Content-Disposition";
		String headerValue = 
				String.format("attachment; filename=\"%s\"",
						downloadFile.getName());
		// 위의 다운로드 타입의 정보를 해더로 설정
		response.setHeader(headerKey, headerValue);
		// 브라우저로부터 스트림을 연결
		OutputStream outStream = response.getOutputStream();
		// 버퍼를 끼워서 빠르게 전달 목적
		byte[] buffer = new byte[BUFFER_SIZE];
		// 이제 브라우저로 보내고 , 자원 닫으면 끝
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
		// 뷰이름, 모델이름, 모델값주소
		return new ModelAndView("excelView", "listBooks", listBooks);
	}

}









