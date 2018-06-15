package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import vo.MemberVO;

@Controller
public class MemberController {
	
	
	@RequestMapping("/member.do")
	public ModelAndView proc(MemberVO vo){
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("spirng",vo);
		
		mav.setViewName("memberView");
		return mav;
		
	}
}
