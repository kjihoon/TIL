package controller;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EduController {
		
	
	@RequestMapping("/grade.do")
	public ModelAndView proc(HttpServletRequest request){
		
		ModelAndView mav = new ModelAndView();		
		int grade = Integer.parseInt(request.getParameter("Grade"));	
		
		String viewName="";
		if (grade >=90){
			viewName="gradeA";
		}else if (grade >=80){
			viewName="gradeB";
		}else if (grade >=70){
			viewName="gradeC";
		}else if (grade <=69){
			viewName="gradeD";
		}	
		
		mav.setViewName(viewName);
		return mav;
	}
	
}
