package or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	//struts���� action�� �ش��ϹǷ�, Model�κ��̴�.
	@RequestMapping(value={"/hello","/" },  method=RequestMethod.GET)
	public ModelAndView hello(){
		ModelAndView mav=new ModelAndView();
		//request.setAttribute�� ������ ����
		//�̵��� jsp���� ��
		mav.setViewName("myhello");
		//view���� ������ �� requestScope -> forward ���
		mav.addObject("msg", "�ȳ��ϼ���^^");
		return mav;
	}
}
