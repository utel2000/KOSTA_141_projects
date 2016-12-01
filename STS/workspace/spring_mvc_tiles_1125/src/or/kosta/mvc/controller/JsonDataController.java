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
		// MyBatis Dao ���� ������
		List<TestVO> list = new ArrayList<>();
		list.add(new TestVO(1, "��浿1", "10", "����1"));
		list.add(new TestVO(2, "��浿2", "20", "����2"));
		list.add(new TestVO(3, "��浿3", "30", "����3"));
		list.add(new TestVO(4, "��浿4", "40", "����4"));
		list.add(new TestVO(5, "��浿5", "50", "����5"));
		// requestScope�� �����ϱ� ���� ��.
		map.addAttribute("member", list);
		return JsonView;
	}
}
