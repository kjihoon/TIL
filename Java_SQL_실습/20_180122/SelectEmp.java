package Jdbc;

import java.sql.*;
import java.util.*;
public class SelectEmp {

	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver"); //DBMS와 연결
			Connection conn = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:XE","work","work");
		
			DatabaseMetaData meta = conn.getMetaData();			
			System.out.println("Username: "+meta.getUserName());
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT ename,to_char(sal,'9,999') as sal FROM emp");
			while (rs.next()){
				System.out.print(rs.getString("ename")+"직원은 월급이");
				System.out.println(rs.getString("sal")+"입니다.");
			}
			
		}catch(Exception ex){
			System.out.println(ex);
		}
		
		
		
	}

}
