package or.kosta.mvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ChatController {
	@RequestMapping(value={"/", "/chat"})
	public String viewChattingPage() {
		return "index2";
	}
}
