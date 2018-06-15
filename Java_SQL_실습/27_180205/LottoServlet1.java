package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/lotto1")
public class LottoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		//System.out.println(request.getParameter("num").getClass().toString());
		int number = Integer.parseInt(request.getParameter("num"));
		System.out.println("전달된 값:"+number);
		
		int randnum = (int) (Math.random()*10)+1;
		System.out.println("추출된 값: "+randnum);
			if (number==randnum){
				out.print("<h2>축하합니다.<br> 전달된 값: "+number+" 추출된 값"+randnum+"</h2>");
			}else{
				out.print("<h2>다음 기회에<br> 전달된 값: "+number+" 추출된 값"+randnum+"</h2>");
			}
			
		out.print("<br><a href='/edu/htmlexam/lotto.html'>로또 재응모</a>");
		out.close();		
	}

}
