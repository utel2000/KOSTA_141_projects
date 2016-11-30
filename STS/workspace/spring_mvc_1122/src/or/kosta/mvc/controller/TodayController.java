package or.kosta.mvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodayController {
	// struts에서 action에 해당하므로, Model부분이다.
	@RequestMapping(value = "/today", method = RequestMethod.GET) //url에 해당
	public ModelAndView todate() {
		ModelAndView mav = new ModelAndView();
		// request.setAttribute와 동일한 내용
		// 이동할 jsp파일 값
		mav.setViewName("today");
		// view에게 전달할 값 requestScope -> forward 방식
		mav.addObject("todate", new SimpleDateFormat().format(new Date()));
		return mav;
	}
}
