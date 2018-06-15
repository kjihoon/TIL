package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import vo.CalcVO;

@Controller
public class CalcController {
	@RequestMapping("/calc.do")
	public ModelAndView proc(CalcVO vo){
		float num1=vo.getNum1();
		float num2=vo.getNum2();
		String calc=vo.getCalc1();
		float result = 0;
		String err="";
		if (calc.equals("/")&&num2==0){
			err="err";			
		}else{
			if (calc.equals("+")){
				result=num1+num2;
			}else if (calc.equals("+")){
				result=num1-num2;
			}else if (calc.equals("*")){
				result=num1*num2;	
			}else if (calc.equals("/")){				
				result=num1/num2;
			}
		}
		
		
		ModelAndView mav = new ModelAndView();
		if (err.equals("err")){
			mav.addObject("err","두번째 숫자가 0일 수 없다.");	
			mav.setViewName("errorResult");
		}else{
			mav.addObject("result",result);	
			mav.setViewName("calcResult");
		}
			
		
		return mav;
	}
}
