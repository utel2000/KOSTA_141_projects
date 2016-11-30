package or.kosta.mvc.controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController {
	@RequestMapping(value={"/hello", "/"}, method = RequestMethod.GET)
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("myhello");
		// requestScope�� �̿��ؼ� view�� ������ ��. - forward���.
		mav.addObject("msg", "�ȳ��ϼ���");
		return mav;
	}
	
}
