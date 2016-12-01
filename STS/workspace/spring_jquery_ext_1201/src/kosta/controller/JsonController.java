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
	// Strinc code �� ���޵Ǿ� ���� �Ķ���͸� ���ڷ� ����
	// http://localhost/spring09_0525jquery/memberJson?code=d
	@RequestMapping(value="memberJson")
	public View testJson1(ModelMap map,String code){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("JsonView");
		// MyBatis Dao ���� ������
		List<TestVO> list = new ArrayList<>();
		List<TestJsonVO> list2 = new ArrayList<>();
		if(code.equals("g")) {
			list.add(new TestVO(1, "��浿1", "30", "����", "d1.PNG"));
			list.add(new TestVO(2, "��浿2", "30", "����2", "d2.PNG"));
			// RequestScope�� �����ϱ� ���� ��
			map.addAttribute("member", list);
		}else if(code.equals("d")) {
			list.add(new TestVO(3, "������", "20", "������", "g1.PNG"));
			list.add(new TestVO(4, "������", "10", "����", "g2.PNG"));
			list.add(new TestVO(5, "�ּ���", "30", "����", "g3.PNG"));
			// RequestScope�� �����ϱ� ���� ��
			map.addAttribute("member", list);
		}else {
			// RequestScope�� �����ϱ� ���� ��
			list2.add(new TestJsonVO("test1", "2016-06-01", "2016-06-02"));
			list2.add(new TestJsonVO("test2", "2016-06-11", "2016-06-12"));
		}
		return JsonView;
	}
}
