package or.kosta.mvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value="/admin")
public class AdminController {
	@RequestMapping(value="/manage")
	public String manage(){
		return "/admin/index";
	}
	//mapping들이 존재할 수 있음....
	@RequestMapping(value="/apage")
	public String manage2(){
		return "/admin/myAdmin";
	}
}
