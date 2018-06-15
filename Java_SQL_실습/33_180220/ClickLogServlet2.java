package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet("/click")
public class ClickLogServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String name =request.getParameter("item");
		
		String loggerName = "case3";
		Logger log = LogManager.getLogger(loggerName);
		
		log.info(name);

		request.getRequestDispatcher("/jspexam/logView.jsp").forward(request, response);

	}

}
