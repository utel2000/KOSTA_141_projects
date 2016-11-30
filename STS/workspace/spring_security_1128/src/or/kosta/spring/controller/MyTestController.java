package or.kosta.spring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyTestController {
	// User란 그룹의 사용자만 접근이 가능하도록 구현하시오.
	@RequestMapping(value = "/test")
	public String test() {
		System.out.println("Test!");
		return "test";
	}
}
