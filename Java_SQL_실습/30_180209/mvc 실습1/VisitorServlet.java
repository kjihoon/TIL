package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/grade1")
public class VisitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("Name");
		int grade = Integer.parseInt(request.getParameter("Grade"));
		
		if (grade >=90){
			request.getRequestDispatcher("/jspexam/gradeA.jsp").forward(request, response);
		}else if (grade >=80&&grade<=89){
			request.getRequestDispatcher("/jspexam/gradeB.jsp").forward(request, response);
		}else if (grade >=70&&grade<=79){
			request.getRequestDispatcher("/jspexam/gradeC.jsp").forward(request, response);
		}else if (grade <=69){
			request.getRequestDispatcher("/jspexam/gradeD.jsp").forward(request, response);
		}

	}

}
