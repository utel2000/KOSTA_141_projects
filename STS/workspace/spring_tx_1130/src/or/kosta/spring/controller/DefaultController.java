package or.kosta.spring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DefaultController {
	@RequestMapping(value={"index","/"})
	public String defaultView(){
		return "index";
	}
	@RequestMapping(value="myIndex")
	public String myDefaultView(){
		System.out.println("ȣ!��!");
		return "index";
	}
	//������ �����Ϸ��� �Ѵٸ�?
	@RequestMapping(value="myTest")
	public String myDefaultView1(){
		return "index";
	}
}
