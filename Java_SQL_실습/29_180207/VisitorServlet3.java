package core;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.VisitorDAO;
import model.VisitorVO;

@WebServlet("/visitor3")
public class VisitorServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();	
		
		
		String sch = request.getParameter("sch");	
		
		if (sch==null){
			ArrayList<VisitorVO> list = new VisitorDAO().list();
			for (VisitorVO vo : list){
				out.write(vo.getName());
				out.write(vo.getWriteDate());
				out.write(vo.getMemo()+"<br>");		
			}
		}else{
			ArrayList<VisitorVO> list2 = new VisitorDAO().listByName(sch);
			for (VisitorVO vo : list2){
				out.write(vo.getName());
				out.write(vo.getWriteDate());
				out.write(vo.getMemo()+"<br>");		
			}
		}		
			
		
		out.print("<a href = '/edu/htmlexam/visitor2.html'>방명록 작성하기</a>");
		
		out.print("<form method='get' action='/edu/visitor3'><input name='sch' type='search'><input type='submit' value='검색' /></from>");
		out.close();	
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("Name");
		String memo = request.getParameter("Text");
		
		VisitorVO vo = new VisitorVO();
		vo.setName(name);
		vo.setMemo(memo);
		
		boolean result = new VisitorDAO().insert(vo);
			
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		if(result){
			out.println("<h2>"+name+"님 글이 저장되었어용...</h2>");
		}else{
			out.println("<h2>"+name+"님!! 오류가 발생되었어용...</h2>");
		}
		
	
		out.print("<a href = '/edu/visitor3'>방명록 리스트 보기</a>");
		out.close();
	
	}
}




