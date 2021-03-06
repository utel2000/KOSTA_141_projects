package or.kosta.mvc.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import or.kosta.mvc.dao.MJoinDao;
import vo.MJoinVO;
@Controller
public class MJoinController {
	@Autowired
	private MJoinDao mJoinDao;
	@RequestMapping(value={"/index", "/"})
	public String viewIndex() {
		return "index";
	}
	@RequestMapping(value="/mForm")
	public String viewForm() {
		return "mJoinForm";
	}
	// 회원가입 데이터 처리
	@RequestMapping(value="/mJoinAdd", method=RequestMethod.POST)
	public ModelAndView addMem(MJoinVO vo) {
		mJoinDao.addMember(vo);
		return new ModelAndView("redirect:/index");
	}
	// 아이디 중복 확인
	@RequestMapping(value="/mJoinChk")
	public ModelAndView checkId(String id) {
		int res = mJoinDao.checkId(id);
		String m = "";
		if(res > 0) {
			m = "<p style='color: red;'>이미 존재하는 아이디입니다.</p>";
		}else {
			m = "<p style='color: blue;'>사용 가능한 아이디입니다.</p>";
		}
		ModelAndView mav = new ModelAndView("idChk");
		mav.addObject("res", m);
		return mav;
	}
	@RequestMapping(value="/mList")
	public ModelAndView listMem() {
		List<MJoinVO> list = mJoinDao.getList();
		ModelAndView mav = new ModelAndView("mJoinList");
		mav.addObject("list", list);
		return mav;
	}
}
