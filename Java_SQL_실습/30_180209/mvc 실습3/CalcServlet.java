package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		float num1=Integer.parseInt(request.getParameter("num1"));
		float num2=Integer.parseInt(request.getParameter("num2"));
		String calc=request.getParameter("calc1");
		float result = 0;
		if (calc.equals("/")&&num2==0){
			request.setAttribute("err", "나눗셈 연산시 두 번째 숫자는 0 일 수 없습니다.");
			request.getRequestDispatcher("/jspexam/errorResult.jsp").forward(request, response);
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
			request.setAttribute("rs",result);
			request.getRequestDispatcher("/jspexam/calcResult.jsp").forward(request, response);
		}
			
		
		
		
	}

}
