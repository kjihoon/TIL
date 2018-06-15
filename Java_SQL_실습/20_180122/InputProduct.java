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
				System.out.println("������ �߰� ����");
				
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
				System.out.println("�����߻�:"+e);
				System.out.println("���Է�");
			}
		}
	
	}
	static String [] inputdata(){
		String x [] = new String [5];
		Scanner sc = new Scanner (System.in);
		System.out.println("��ǰ�� ID�� �Է��ϼ��� : ");
		x[0] = sc.nextLine();
		System.out.println("��ǰ�� CLASSID�� �Է��ϼ��� : ");
		x[1] = sc.nextLine();
		System.out.println("��ǰ�� NAME�� �Է��ϼ��� : ");
		x[2] = sc.nextLine();
		System.out.println("��ǰ�� BALANCE�� �Է��ϼ��� : ");
		x[3] = sc.nextLine();
		System.out.println("��ǰ�� PRICE�� �Է��ϼ��� : ");
		x[4] = sc.nextLine();
		return x;
	}
}
