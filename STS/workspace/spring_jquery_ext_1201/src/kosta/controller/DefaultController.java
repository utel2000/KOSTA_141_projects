package kosta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

	@RequestMapping(value={"/","index"})
	public String indexView(){
		return "index";
	}
	@RequestMapping(value="jqueryMain")
	public String jQueryView(){
		return "jQuerymain";
	}
	//jqueryMain2
	@RequestMapping(value="jqueryMain2")
	public String jQueryView2(){
		return "jQuerymain2";
	}
}
