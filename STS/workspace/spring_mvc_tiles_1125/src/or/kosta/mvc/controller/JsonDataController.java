package or.kosta.mvc.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import vo.TestVO;
@Controller
public class JsonDataController {
	// ServletView - JSP
	@Autowired
	private View JsonView;
	@RequestMapping(value="memberJson")
	public View testJson1(ModelMap map) {
		// MyBatis Dao 가상 데이터
		List<TestVO> list = new ArrayList<>();
		list.add(new TestVO(1, "김길동1", "10", "사장1"));
		list.add(new TestVO(2, "김길동2", "20", "사장2"));
		list.add(new TestVO(3, "김길동3", "30", "사장3"));
		list.add(new TestVO(4, "김길동4", "40", "사장4"));
		list.add(new TestVO(5, "김길동5", "50", "사장5"));
		// requestScope에 저장하기 위한 맵.
		map.addAttribute("member", list);
		return JsonView;
	}
}
