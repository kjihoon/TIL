package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Visitor1")
public class VistiorServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		String userName = request.getParameter("Name");
		String text = request.getParameter("Text");
		
		SimpleDateFormat spd = new SimpleDateFormat("yyyy년MM월dd일");
		Date now = new Date();
		
		out.print("<div style='text-align:center'><h2>"+userName+"님이"+spd.format(now)+" 에 남긴 글입니다.</h2><br>");
		out.print("--------------------------------------------------<br>");
		out.print("<p>"+text+"</p></div>");
		out.close();
	}

}
