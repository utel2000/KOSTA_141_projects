package kosta.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import vo.TestJsonVO;
import vo.TestVO;

@Controller
public class JsonController {
	@Autowired
	private View JsonView;
	// Strinc code 로 전달되어 오는 파라미터를 인자로 정의
	// http://localhost/spring09_0525jquery/memberJson?code=d
	@RequestMapping(value="memberJson")
	public View testJson1(ModelMap map,String code){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("JsonView");
		// MyBatis Dao 가상 데이터
		List<TestVO> list = new ArrayList<>();
		List<TestJsonVO> list2 = new ArrayList<>();
		if(code.equals("g")) {
			list.add(new TestVO(1, "김길동1", "30", "사장", "d1.PNG"));
			list.add(new TestVO(2, "김길동2", "30", "사장2", "d2.PNG"));
			// RequestScope에 저장하기 위한 맵
			map.addAttribute("member", list);
		}else if(code.equals("d")) {
			list.add(new TestVO(3, "박지연", "20", "공장장", "g1.PNG"));
			list.add(new TestVO(4, "오현지", "10", "대장", "g2.PNG"));
			list.add(new TestVO(5, "최설아", "30", "부장", "g3.PNG"));
			// RequestScope에 저장하기 위한 맵
			map.addAttribute("member", list);
		}else {
			// RequestScope에 저장하기 위한 맵
			list2.add(new TestJsonVO("test1", "2016-06-01", "2016-06-02"));
			list2.add(new TestJsonVO("test2", "2016-06-11", "2016-06-12"));
		}
		return JsonView;
	}
}
