package or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	//struts에서 action에 해당하므로, Model부분이다.
	@RequestMapping(value={"/hello","/" },  method=RequestMethod.GET)
	public ModelAndView hello(){
		ModelAndView mav=new ModelAndView();
		//request.setAttribute와 동일한 내용
		//이동할 jsp파일 값
		mav.setViewName("myhello");
		//view에게 전달할 값 requestScope -> forward 방식
		mav.addObject("msg", "안녕하세요^^");
		return mav;
	}
}
