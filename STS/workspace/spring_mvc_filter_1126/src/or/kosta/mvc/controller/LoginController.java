package or.kosta.mvc.controller;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ex1.UserVO;
@Controller
public class LoginController {
	@RequestMapping(value="loginform")
	public String loginform(){
		return "login";
	}
	@RequestMapping(value="check", method=RequestMethod.POST)
	public String check(UserVO vo, HttpSession session){
		//member���̺��� id, pwd���� ��ȸ�Ͽ� ��ȯ�ϴ� Dao�� ����
		if(vo.getUserId().equals("javabook")
				|| vo.getUserId().equals("bigdaddy")){
			session.setAttribute("uid", vo.getUserId());
		}else{
			return "redirect:/exception";
		}
		return "index";
	}
	@RequestMapping(value="logout")
	public String logout(HttpSession session){
		session.removeAttribute("uid");
		return "index";
	}
}
