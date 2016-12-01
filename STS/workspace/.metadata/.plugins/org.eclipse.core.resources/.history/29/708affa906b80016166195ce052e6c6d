package or.kosta.mvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {
	// 요청을 하나 이상 분석 할 때 사용!
	@RequestMapping(value = {"/", "/index"})
	// ModelMap은 지정된 View에게 requestScope를 사용해서 전달할 값을 설정!
	public String viewIndex(ModelMap m) {
		m.addAttribute("msg", "hi");
		return "index";
	}
	@RequestMapping(value = "useJsonView")
	public String useJsonView() {
		return "useJson";
	}
}
