package or.kosta.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import or.kosta.mvc.dao.BoardDao;
import or.kosta.vo.BoardVO;

@Controller
public class BoardController {
	@Autowired
	private BoardDao boardDao;

	// form ���� ���� ��ûó��
	@RequestMapping(value = "/bForm")
	public String bForm() {
		return "boardForm";
	}

	// �Է� �۾�
	// �������� ���ؼ� VO�� ���� ��Ƽ� ����(�Ķ���� �ڵ�)
	@RequestMapping(value = "/boardIn", method = RequestMethod.POST)
	public ModelAndView bInsert(BoardVO vo) {
		System.out.println("VO�� ����");
		System.out.println(vo.getSubject());
		System.out.println(vo.getWriter());
		ModelAndView mav = new ModelAndView("redirect:/bList");
		boardDao.addBoard(vo);
		return mav;
	}

	@RequestMapping(value = "/bList")
	public ModelAndView bList() {
		ModelAndView mav = new ModelAndView("boardList");
		List<BoardVO> list = boardDao.listBoard();
		mav.addObject("list", list);
		return mav;
	}

	@RequestMapping(value="/bDtail")
	public ModelAndView bDtail(int num){
		ModelAndView mav = new ModelAndView("bDtail");
		BoardVO bvo = boardDao.detailBoard(num);
		mav.addObject("bvo", bvo);
		return mav;	
	
	}
}
