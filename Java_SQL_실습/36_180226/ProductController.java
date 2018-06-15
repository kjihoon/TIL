package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import vo.ProductVO;

@Controller
@SessionAttributes({"p"})
public class ProductController {

	@ModelAttribute("p")
	public ProductVO createVO(){
		ProductVO pvo = new ProductVO();
		return pvo;
	}
	
	@RequestMapping(value="/product.do")
	public String handle(@ModelAttribute("p")ProductVO vo){
		return "productview";
	}
	
	@RequestMapping(value="/buy.do")
	public String handle(SessionStatus status){
			
		status.setComplete();
		
		return "productview";
	}
}
