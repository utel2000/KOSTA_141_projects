package or.kosta.mvc.controller;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import or.kosta.mvc.dao.MJoinDao;
import vo.MJoinVO;
@Controller
public class LoginController {
	@Autowired
	private MJoinDao mJoinDao;
	@RequestMapping(value="/loginForm")
	public ModelAndView loginView(String loc) {
		ModelAndView mav = new ModelAndView("login");
		if(loc != null) {
			mav.addObject("loc", loc);
		}
		return mav;
	}
	// �α��� ó��
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public  ModelAndView login(MJoinVO vo, String loc, HttpSession session) { 
		ModelAndView mav = new ModelAndView("redirect:/index");
		int res = mJoinDao.loginProcess(vo);
		String msg = "";
		if(res > 0) {
			msg = "�α��� ����";
			// �α����� �������� �� ���������κ��� ���Թ��� Session���� ����.
			session.setAttribute("uid",  vo.getId());
			System.out.println("loc��? : " + loc);
			mav.setViewName("redirect:/" + loc);
		}else {
			msg = "�α��� ����";
		}
		System.out.println("Log Message: " + msg);
		return mav;
	}
	@RequestMapping(value="/logout")
	public ModelAndView logout(HttpSession session) {
		session.removeAttribute("uid");
		return new ModelAndView("redirect:/index");
	}
}