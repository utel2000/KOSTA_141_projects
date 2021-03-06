package or.kosta.mvc.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import or.kosta.mvc.dao.VoteDao;
import vo.VoteVO;
@Controller
public class VoteController {
	@Autowired
	private VoteDao dao;
	@RequestMapping(value="voteForm")
	public String voteUI() {
		return "voteForm";
	}
	@RequestMapping(value="voteInsert", method=RequestMethod.POST)
	public ModelAndView voteInsert(VoteVO vvo) {
		dao.addVote(vvo);
		return new ModelAndView("redirect:/voteList");
	}
	@RequestMapping(value="voteList")
	public ModelAndView voteList() {
		List<VoteVO> list = dao.voteList();
		ModelAndView mav = new ModelAndView("voteList");
		mav.addObject("list", list);
		return mav;
	}
	@RequestMapping(value="voteDetail")
	public ModelAndView voteDetail(int num) {
		VoteVO vvo = dao.voteDetail(num);
		ModelAndView mav = new ModelAndView("voteDetail");
		mav.addObject("vvo", vvo);
		return mav;
	}
	@RequestMapping(value="voteUpdate", method=RequestMethod.POST)
	public ModelAndView voteUpdate(VoteVO vvo) {
		dao.VoteUpdate(vvo);
		return new ModelAndView("redirect:/voteList");
	}
	// voteRes View페이지에 설문의 결과를 설문의 결과를 출력!
	@RequestMapping(value="voteResult")
	public ModelAndView voteResult(int num) {
		VoteVO vvo = dao.VoteResult(num);
		ModelAndView mav = new ModelAndView("voteResult");
		mav.addObject("vvo", vvo);
		return mav;
	}
}
