package or.kosta.mvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {
	// ��û�� �ϳ� �̻� �м� �� �� ���!
	@RequestMapping(value = {"/", "/index"})
	// ModelMap�� ������ View���� requestScope�� ����ؼ� ������ ���� ����!
	public String viewIndex(ModelMap m) {
		m.addAttribute("msg", "hi");
		return "index";
	}
	@RequestMapping(value = "useJsonView")
	public String useJsonView() {
		return "useJson";
	}
}
