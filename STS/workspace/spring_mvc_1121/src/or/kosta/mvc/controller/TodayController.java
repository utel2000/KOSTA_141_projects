package or.kosta.mvc.controller;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class TodayController {
	@RequestMapping(value="/todate", method = RequestMethod.GET)
	public ModelAndView todate() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("today");
		mav.addObject("todate", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		return mav;
	}
}
