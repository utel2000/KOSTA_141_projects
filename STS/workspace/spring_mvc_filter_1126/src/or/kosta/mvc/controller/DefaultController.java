package or.kosta.mvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DefaultController {
	@RequestMapping({"/", "index"})
	public String defaultView() {
		return "index";
	}
	@RequestMapping(value="myIndex")
	public String mydefaultView() {
		return "index";
	}
	@RequestMapping(value="error")
	public String mydefaultView1() {
		return "exception";
	}
}
