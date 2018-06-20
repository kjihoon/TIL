package hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HiveTest3_carrier_code {

	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.hive.jdbc.HiveDriver");
		Connection conn = DriverManager.getConnection("jdbc:hive2://192.168.111.100:10000/"
				+ "default","root","111111");
		Statement stmt = conn.createStatement();
		// 2006년 월 별 지연출발, 지연도착 평균을 구하시오
//		ResultSet rs = stmt.executeQuery("SELECT * FROM airline_delay LIMIT 10");
//		ResultSet rs = stmt.executeQuery("SELECT Year, Month, AVG(ArrDelay)"
//				+ "AS avg_arrive_delay_time, AVG(DepDelay) AS avg_departure_delay_time"
//				+ " FROM airline_delay "
//				+ "WHERE delayYear=2006 "
//				+ "AND ArrDelay > 0 "
//				+ "GROUP BY Year, Month "
//				+ "ORDER BY Year, Month");
		ResultSet rs = stmt.executeQuery("SELECT * FROM carrier_code limit 20");
		   while(rs.next()) {
		     System.out.println(rs.getString(1) + " " 
		   +rs.getString(2));
		   }
		conn.close();
		System.out.println("Success....");
	}



}
