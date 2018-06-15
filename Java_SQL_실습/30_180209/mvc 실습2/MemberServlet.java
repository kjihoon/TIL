package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.vo.MemberVO;


@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("Name");
		String tel=request.getParameter("Tel");
		String acc=request.getParameter("Acc");
		String pass=request.getParameter("Pass");
		
		MemberVO vo = new MemberVO();
		vo.setInfo(name, tel, acc, pass);
	
		request.setAttribute("mb", vo);
		request.getRequestDispatcher("/jspexam/memberView.jsp").forward(request,response);;
	}
	
}
