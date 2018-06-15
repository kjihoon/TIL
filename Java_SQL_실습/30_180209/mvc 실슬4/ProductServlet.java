package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import model.vo.ProductVO;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid=request.getParameter("pid");
		
		System.out.println(pid);
		HttpSession session = request.getSession();	
		

		
		if (session.getAttribute("pvo")==null)		
			session.setAttribute("pvo", new ProductVO());
		
		
		ProductVO pvo = (ProductVO) session.getAttribute("pvo");
		
		
		if (pid.equals("p001")){
			pvo.setApple(1);			
		}else if(pid.equals("p002")){
			pvo.setBanana(1);			
		}else if(pid.equals("p003")){
			pvo.setHalabong(1);			
		}
		
		
		request.getRequestDispatcher("/jspexam/productview.jsp").forward(request, response);;
		
		
	}
}
