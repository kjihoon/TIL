package Jdbc;
import java.sql.*;
import java.util.*;
public class InputProduct  {

	public static void main(String[] args) throws Exception{
		
			while(true){
			String [] dataset=inputdata();
			for (int i=0;i<dataset.length;i++){
				dataset[i] = "'"+dataset[i]+"'";
			}
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:XE","jdbctest5","jdbctest");
				Statement stmt = conn.createStatement();
				stmt.executeUpdate("INSERT into product values "
						+ "("+dataset[0]+","+dataset[1]+","+dataset[2]+","+dataset[3]+","+dataset[4]+")");
				System.out.println("데이터 추가 성공");
				
				ResultSet rs = stmt.executeQuery("SELECT* FROM PRODUCT");
				while (rs.next()){
					System.out.print(rs.getString("id")+" ");
					System.out.print(rs.getString("classid")+" ");
					System.out.print(rs.getString("name")+" ");
					System.out.print(rs.getInt("balance")+" ");
					System.out.println(rs.getFloat("price")+" ");
				}
				break;
			}catch(SQLException e){
				System.out.println("오류발생:"+e);
				System.out.println("재입력");
			}
		}
	
	}
	static String [] inputdata(){
		String x [] = new String [5];
		Scanner sc = new Scanner (System.in);
		System.out.println("상품의 ID를 입력하세요 : ");
		x[0] = sc.nextLine();
		System.out.println("상품의 CLASSID를 입력하세요 : ");
		x[1] = sc.nextLine();
		System.out.println("상품의 NAME를 입력하세요 : ");
		x[2] = sc.nextLine();
		System.out.println("상품의 BALANCE을 입력하세요 : ");
		x[3] = sc.nextLine();
		System.out.println("상품의 PRICE을 입력하세요 : ");
		x[4] = sc.nextLine();
		return x;
	}
}
