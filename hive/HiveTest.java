package hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HiveTest {

	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.hive.jdbc.HiveDriver");
		Connection conn = DriverManager.getConnection("jdbc:hive2://192.168.111.100:10000/"
				+ "default","root","111111");
		Statement stmt = conn.createStatement();
		// 2006�� �� �� �������, �������� ����� ���Ͻÿ�
//		ResultSet rs = stmt.executeQuery("SELECT * FROM airline_delay LIMIT 10");
		ResultSet rs = stmt.executeQuery("SELECT Year, Month, AVG(ArrDelay)"
				+ "AS avg_arrive_delay_time, AVG(DepDelay) AS avg_departure_delay_time"
				+ " FROM airline_delay "
				+ "WHERE delayYear=2006 "
				+ "AND ArrDelay > 0 "
				+ "GROUP BY Year, Month "
				+ "ORDER BY Year, Month");
		   while(rs.next()) {
		     System.out.println(rs.getInt(1) + " " 
		   +rs.getInt(2)+ " "
		   +rs.getDouble(3)+" "
		   + rs.getDouble(4));
		   }
		conn.close();
		System.out.println("Success....");
	}



}
