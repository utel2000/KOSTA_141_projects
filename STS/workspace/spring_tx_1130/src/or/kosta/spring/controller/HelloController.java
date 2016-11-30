package or.kosta.spring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController {
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ModelAndView hello(){
		ModelAndView mav = new ModelAndView("hello");
		mav.addObject("msg", "æ»≥Á«œººø‰");
		return mav;
	}	
}
