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
	// 로그인 처리
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public  ModelAndView login(MJoinVO vo, String loc, HttpSession session) { 
		ModelAndView mav = new ModelAndView("redirect:/index");
		int res = mJoinDao.loginProcess(vo);
		String msg = "";
		if(res > 0) {
			msg = "로그인 성공";
			// 로그인이 성공했을 때 스프링으로부터 주입받은 Session값을 저장.
			session.setAttribute("uid",  vo.getId());
			System.out.println("loc는? : " + loc);
			mav.setViewName("redirect:/" + loc);
		}else {
			msg = "로그인 실패";
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
