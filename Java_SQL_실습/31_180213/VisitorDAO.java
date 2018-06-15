package model.dao;

import java.sql.*;
import java.util.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.vo.VisitorVO;

public class VisitorDAO {  //DataAccessObject    

	
	
	
	
	
	public boolean insert(VisitorVO vo){    //데이터 삽입
		
		boolean result = true;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		
		try {
			
			Context context = new InitialContext();
			DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/oraDB");
			conn = ds.getConnection();
			
			pstmt = conn.prepareStatement("insert into visitor values (?,sysdate,?)");
			pstmt.setString(1, vo.getName());
	        pstmt.setString(2, vo.getMemo());
	        pstmt.executeUpdate();
	        
	        
		} catch (Exception e) {
			e.printStackTrace();
            result = false;
		}finally{
	          try{	
	              if(pstmt!=null) //객체가 대입되어이다면
	            	  pstmt.close();
	              
	              if(conn!=null)
	                  conn.close();
	              
	              }catch(SQLException e){
	            	   System.out.println("close 오류 발생");
	              }   
		     }
		
		return result;
		
	}
	
	
      public ArrayList<VisitorVO> listByName(String name){
		

    	  
    		ArrayList<VisitorVO> list = new ArrayList<>();
    		Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;
            

            
            
          
    		try {
    			
    			   Context context = new InitialContext();
    			   DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/oraDB");
    			   conn = ds.getConnection();
    			   stmt = conn.createStatement();
    		       rs = stmt.executeQuery("select * from visitor where name='"+ name+"'");
    		       VisitorVO vo = null;
    		       
    		       while(rs.next()){
    		    	vo = new VisitorVO(); 
    		    	vo.setName(rs.getString(1));
    		       	vo.setWriteDate(rs.getDate(2).toString());
    		       	vo.setMemo(rs.getString(3));
    		       	list.add(vo); 
    		       }
    	        
    		} catch (Exception e) {
    			e.printStackTrace();

    		}finally{
    	          try{	
    	              if(rs!=null) 
    	            	  rs.close();
    	              if(stmt!=null) 
    	            	  stmt.close();
    	              if(conn!=null) 
    	            	  conn.close();  //db서버와의 connection 끊는게 아니라 connection pool에 다시 반환한다
    	            
    	              }catch(SQLException e){
    	            	   System.out.println("close 오류 발생");
    	              }
    	     
    		     }
    		
    		return list;
    	}
    	
    	
		

	
	
	
	public ArrayList<VisitorVO> list(){   //리스트 추출 select
		
		ArrayList<VisitorVO> list = new ArrayList<>();
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        

        
        
      
		try {
			
			   Context context = new InitialContext();
			   DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/oraDB");
			   conn = ds.getConnection();
			   stmt = conn.createStatement();
		       rs = stmt.executeQuery("select name, writedate, memo from visitor");
		       VisitorVO vo = null;
		       
		       while(rs.next()){
		    	vo = new VisitorVO(); 
		       	vo.setName(rs.getString(1));
		       	vo.setWriteDate(rs.getDate(2).toString());
		       	vo.setMemo(rs.getString(3));
		       	list.add(vo);
		       }
	        
		} catch (Exception e) {
			e.printStackTrace();

		}finally{
	          try{	
	              if(rs!=null) 
	            	  rs.close();
	              if(stmt!=null) 
	            	  stmt.close();
	              if(conn!=null) 
	            	  conn.close();  //db서버와의 connection 끊는게 아니라 connection pool에 다시 반환한다
	            
	              }catch(SQLException e){
	            	   System.out.println("close 오류 발생");
	              }
	     
		     }
		
		return list;
	}
	
	
	
}
