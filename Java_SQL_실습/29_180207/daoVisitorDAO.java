package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.*;
import javax.sql.DataSource;


public class daoVisitorDAO { //Data Access Object 
	
	public boolean insert(VisitorVO vo){
		boolean result = true;
		ConnectDB obj = new ConnectDB();
		Connection conn = obj.getConnect();
		PreparedStatement pstmt =null;
		
		try{
			pstmt = conn.prepareStatement("insert into visitor values(?,sysdate,?)");
			pstmt.setString(1,vo.getName());
			pstmt.setString(2,vo.getMemo());
			pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
			result=false;
		}finally{
			try{
				if (pstmt!=null) 
					pstmt.close();
				if (conn!=null) 
					conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			obj.close();
		}
		return result;
	}
	
	
	
	public ArrayList <VisitorVO> list(){
		
		ArrayList<VisitorVO> list = new ArrayList<>();
		
		ConnectDB obj = new ConnectDB();
		Connection conn = obj.getConnect();
		Statement stmt =null;
		ResultSet rs = null;
		try{					
			stmt = conn.createStatement();			
			rs = stmt.executeQuery("select name,writedate,memo from visitor");
			VisitorVO vo = null;
			while(rs.next()){
				vo = new VisitorVO();				
				vo.setName(rs.getString(1));
				vo.setWriteDate(rs.getString(2));
				vo.setMemo(rs.getString(3));
				list.add(vo);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if (rs!=null)
					rs.close();
				if (stmt!=null) 
					stmt.close();
				if (conn!=null) 
					conn.close();
			}catch(SQLException e){
				System.out.println("close 오류 발생");
			}
			obj.close();
		}
		return list;
	}
	
}
