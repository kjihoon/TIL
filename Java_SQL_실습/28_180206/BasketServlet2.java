package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/basket2")
public class BasketServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession(); 
		if (session.getAttribute("cnt")==null){
			session.setAttribute("cnt",new int [10]);
		}
		int session_v[] =(int [])session.getAttribute("cnt");
		
		String ProductID = request.getParameter("ProductID");
		
		
		String x [] = {"p001","p002","p003","p004","p005","p006","p007","p008","p009","p010"};
		
		
		if (ProductID.equals("del")){
			
			for (int j =0;j<x.length;j++){
				session_v[j]=0;
			}
			out.print("<h1>상품이 모두 제거되었습니다.</h1>");
			out.print("<a href='/edu/htmlexam/productlog.html'>상품선택화면</a>");
			
		}else{
			out.print("<h1>선택한 상품 리스트</h1>");
			out.print("<p1>--------------------------------</p1><ul>");
			
			for (int i =0;i<x.length;i++){
				if (ProductID.equals(x[i])){
					session_v[i]++;
				}
				if (session_v[i]>0){
					out.print("<li>"+x[i]+"상품"+session_v[i]+"개</li>");
				}
			}
			
			out.print("</ul>");
			out.print("<a href='/edu/htmlexam/productlog.html'>상품선택화면</a>");
			out.print("<br><a href='/edu/basket2?ProductID=del'>상품 비우기</a>");
		}
		
		out.close();
	}

}
