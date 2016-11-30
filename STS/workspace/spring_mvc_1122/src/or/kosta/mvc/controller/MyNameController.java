package or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyNameController {
	@RequestMapping(value="/myname", method=RequestMethod.GET)
	public ModelAndView myname(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("myname");
		mav.addObject("myname","±èÇü±Ù");
		
		return mav;
	}
}
