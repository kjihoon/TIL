package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String result = "";
		String name = request.getParameter("name");
		name = new String(name.getBytes("8859_1"),"utf-8");
		if(id.equals("qq")&&pwd.equals("11")&&pwd.equals("지훈")) {
			result="정상";
		}else {
			result="비정상";
		}
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		out.print(result);
		out.close();
		//System.out.println(result);
		
	}

}
