package or.kosta.spring.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import or.kosta.spring.service.ServiceInter;
import or.kosta.vo.CustomerVO;
import or.kosta.vo.MemberVO;
@Controller
public class TxServiceController {
		@Autowired
		private ServiceInter service;
		@RequestMapping(value="txForm")
		public String viewForm(){
			return "txForm";
		}
		@RequestMapping(value="testTx", method=RequestMethod.POST)
		public ModelAndView insertAll(MemberVO memberVO, CustomerVO customerVO) throws Exception{
			ModelAndView mav = new ModelAndView("result");
			System.out.println("addr1: " + memberVO.getAddress());
			System.out.println("addr2: " + customerVO.getAddress());
			//DB�۾�
			service.insertAll(memberVO, customerVO);
			mav.addObject("msg","success");
			return mav;
		}
}
