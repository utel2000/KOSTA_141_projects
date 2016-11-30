package or.kosta.mvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodayController {
	// struts���� action�� �ش��ϹǷ�, Model�κ��̴�.
	@RequestMapping(value = "/today", method = RequestMethod.GET) //url�� �ش�
	public ModelAndView todate() {
		ModelAndView mav = new ModelAndView();
		// request.setAttribute�� ������ ����
		// �̵��� jsp���� ��
		mav.setViewName("today");
		// view���� ������ �� requestScope -> forward ���
		mav.addObject("todate", new SimpleDateFormat().format(new Date()));
		return mav;
	}
}
