package kosta.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class jQueryExamCotroller {
	@RequestMapping(value="jqEx1")
	public String jqueryEx1(){
		return "jqEx1";
	}
	@RequestMapping(value="jqEx2")
	public String jqyeryEx2(){
		return "jqEx2_Css_interval";
	}
	@RequestMapping(value="jqEx3")
	public String jqyeryEx3(){
		return "jqEx3_selector";
	}
	@RequestMapping(value="jqEx4")
	public String jqyeryEx4(){
		return "jqEx4_addClass";
	}
	//jqEx5_clickEvent
	@RequestMapping(value="jqEx5")
	public String jqyeryEx5(){
		return "jqEx5_clickEvent";
	}
	//jqEx6_node.jsp
	@RequestMapping(value="jqEx6")
	public String jqyeryEx6(){
		return "jqEx6_node";
	}
	//jqExam6_node
	@RequestMapping(value="jqExam6")
	public String jqyeryExam6(){
		return "jqExam6_node";
	}
	//jqEx7_ltgt
	@RequestMapping(value="jqEx7")
	public String jqyeryExam7(){
		return "jqEx7_ltgt";
	}
	//jqEx8_Ajax
	@RequestMapping(value="jqEx8")
	public String jqyeryEx8(){
		return "jqEx8_Ajax";
	}
	@RequestMapping(value="jqEx9")
	public String jqyeryEx9(){
		return "jqEx9_checked";
	}
	
	//jqEx9_checkbox
	@RequestMapping(value="jqEx10")
	public String jqyeryEx10(){
		return "jqEx10_checkbox";
	}
	
	//jqEx9_checkbox
	@RequestMapping(value="jqEx11")
	public String jqyeryEx11(){
		return "jqEx11_load";
	}
	//jqEx12_checkbox
	@RequestMapping(value="jqEx12")
	public String jqyeryEx12(){
		return "jqEx12_listview";
	}
	// jqEx13_turnjs
	@RequestMapping(value="jqEx13")
	public String jqyeryEx13(){
		return "jqEx13_turnjs";
	}
	//jqEx14_attr
	@RequestMapping(value="jqEx14")
	public String jqyeryEx14(){
		return "jqEx14_attr";
	}
	@RequestMapping(value="testdata")
	public ModelAndView jquerEx11(){
		ModelAndView mav = new ModelAndView();
		//Dao로 부터 데이터를 가져옴 
		List<String> data = new ArrayList<>();
		for(int i=0; i<10; i++){
		data.add("나의 "+i+"번째 게시물 데이터!");
		}
		mav.addObject("list", data);
		mav.setViewName("testData");
		return mav;
	}
}











